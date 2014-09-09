package com.passionpeople.krtt_was.vo;

public class CompanyLiked {
	private static final long serialVersionUID = -7667147479819193393L;
	private String cpId;
	private String userEmail;

	public CompanyLiked(String cpId, String userEmail) {
		this.cpId = cpId;
		this.userEmail = userEmail;
	}

	public String getCpId() {
		return cpId;
	}

	public void setCpId(String cpId) {
		this.cpId = cpId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
