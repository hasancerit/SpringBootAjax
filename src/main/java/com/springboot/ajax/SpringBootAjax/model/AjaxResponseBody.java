package com.springboot.ajax.SpringBootAjax.model;

import java.util.List;

public class AjaxResponseBody {
private String msg;
private List<Kullanici> list;
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public List<Kullanici> getList() {
	return list;
}
public void setList(List<Kullanici> list) {
	this.list = list;
}
}
