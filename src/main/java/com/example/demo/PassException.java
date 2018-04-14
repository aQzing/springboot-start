package com.example.demo;

public class PassException extends RuntimeException{
	private String code;
	private String status;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String satus) {
		this.status = satus;
	}
	public PassException(String code, String satus) {
		super();
		this.code = code;
		this.status = satus;
	}
	
}
