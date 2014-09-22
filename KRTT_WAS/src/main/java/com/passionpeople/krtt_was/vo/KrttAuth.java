package com.passionpeople.krtt_was.vo;

import java.io.Serializable;
import java.util.Date;

public class KrttAuth implements Serializable {
    private static final long serialVersionUID = -7667147479819193393L;
    private String email;
    private Date rgstYmdt;
    
    public KrttAuth(String email){
    	this.email = email;
    	this.rgstYmdt = new Date();
    }
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRgstYmdt() {
		return rgstYmdt;
	}
	public void setRgstYmdt(Date rgstYmdt) {
		this.rgstYmdt = rgstYmdt;
	}
	
}