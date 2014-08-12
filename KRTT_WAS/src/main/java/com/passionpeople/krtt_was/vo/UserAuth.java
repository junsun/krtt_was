package com.passionpeople.krtt_was.vo;

import java.io.Serializable;
import java.util.Date;

public class UserAuth implements Serializable {
    private static final long serialVersionUID = -7667147479819193393L;
    private String email;
    private int authId;
    private Date rgstYmdt;
    
    public UserAuth(String email, int authId){
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
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public Date getRgstYmdt() {
		return rgstYmdt;
	}
	public void setRgstYmdt(Date rgstYmdt) {
		this.rgstYmdt = rgstYmdt;
	}
	
}