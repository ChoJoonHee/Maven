package day01.ex02.setter;

import org.springframework.context.support.GenericXmlApplicationContext;

import day01.ex01.construct.Restaurant;

public class DatabaseDev {
	
	private String url;
	private String uid;
	private String upw;
	
	//alt+shift+s
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	

	
	
}
