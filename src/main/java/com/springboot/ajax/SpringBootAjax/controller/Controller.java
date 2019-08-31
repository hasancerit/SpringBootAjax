package com.springboot.ajax.SpringBootAjax.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.ajax.SpringBootAjax.model.AjaxResponseBody;
import com.springboot.ajax.SpringBootAjax.model.Kullanici;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/form")
	public String formGonder(){
		return "giris";
	}
	
	@PostMapping("/ajaxcall")
	@ResponseBody
	public ResponseEntity<?> ajax(@Valid @RequestBody Kullanici kulanici){
		System.out.println("AJAX CALL GELDI:" + kulanici.toString());
		AjaxResponseBody resp = new AjaxResponseBody();
		
		List<Kullanici> list = new ArrayList<Kullanici>();
		list.add(kulanici);
		
		resp.setList(list);
		resp.setMsg("Basarili");
		
		return ResponseEntity.ok(resp);
	}
	
}
