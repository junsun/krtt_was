package com.passionpeople.krtt_was.vo;

import java.io.Serializable;

public class Company implements Serializable {
    private static final long serialVersionUID = -7667147479819193393L;
    private String cpNm;
    private String url;
    private String imgUrl;
    
    public Company(String cpNm, String url, String imgUrl){
    	this.cpNm = cpNm;
    	this.url = url;
    	this.imgUrl = imgUrl;
    }

	public String getCpNm() {
		return cpNm;
	}

	public void setCpNm(String cpNm) {
		this.cpNm = cpNm;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
    
    
}