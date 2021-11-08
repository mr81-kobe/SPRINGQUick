package com.springbook.view.controller;

public class ViewResolver {
	String prefix ; 
	String suffix; 
	
	
	
	public ViewResolver() {
		// TODO Auto-generated constructor stub
	
	
	}



	public String getPrefix() {
		return prefix;
	}



	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}



	public String getSuffix() {
		return suffix;
	}



	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}  
	
	public String getView(String viewName){
		return prefix+ viewName +suffix;
	}
	
	

}
