$(document).ready(function () {

    $("#formId").submit(function (event) {
        //Form submit'i durdur
        event.preventDefault();
        
        //Ajax'i baslat
        ajaxReq();
    });
});


function ajaxReq() {
	
	//Gonderecegimiz datayı olusturduk ve doldurduk
    var dataS = {}
    dataS["kullaniciAdi"] = $("#kullaniciadi").val();
    dataS["sifre"] = $("#sifre").val();

    //Buton görünmez
    $("#gonder").prop("disabled", true);

    console.log("Gonderilen"+JSON.stringify(dataS))
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/ajaxcall",
        data: JSON.stringify(dataS),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
        	//Sonucu bas
            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#sonuc').html(json);
            
            console.log("SUCCESS : ", data);
            $("#gonder").prop("disabled", false);//Buton Görünür
        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#sonuc').html(json);

            console.log("ERROR : ", e);
            $("#gonder").prop("disabled", false);

        }
    });

}