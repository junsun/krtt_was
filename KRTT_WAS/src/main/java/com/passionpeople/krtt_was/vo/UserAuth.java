package com.passionpeople.krtt_was.vo;

import java.io.Serializable;

public class UserAuth implements Serializable {
    private static final long serialVersionUID = -7667147479819193393L;
    private long id;
    private String email;
    private int authId;
    
    public UserAuth(String email, int authId){
    	this.email = email;
    	this.authId = authId;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
}