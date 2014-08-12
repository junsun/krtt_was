package com.passionpeople.krtt_was.vo;

import java.io.Serializable;
import java.util.Date;

public class UserAuth implements Serializable {
    private static final long serialVersionUID = -7667147479819193393L;
    private String email;
    private String authId;
    private Date rgstYmdt;
    
    public UserAuth(String email, String authId){
    	this.email = email;
    	this.authId = authId;
    	this.rgstYmdt = new Date();
    }
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public Date getRgstYmdt() {
		return rgstYmdt;
	}
	public void setRgstYmdt(Date rgstYmdt) {
		this.rgstYmdt = rgstYmdt;
	}
	
}