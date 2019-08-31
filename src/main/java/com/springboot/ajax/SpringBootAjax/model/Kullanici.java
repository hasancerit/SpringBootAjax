package com.springboot.ajax.SpringBootAjax.model;

public class Kullanici {
	private String kullaniciAdi;
	private String sifre;
	
	public Kullanici(String ka,String sifre) {
		this.setKullaniciAdi(ka);
		this.setSifre(sifre);
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
}
