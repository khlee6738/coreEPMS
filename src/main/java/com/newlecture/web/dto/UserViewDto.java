package com.newlecture.web.dto;

import java.util.Date;

public class UserViewDto {
	
	private String USER_ID;
	private String USER_PW;
	private Date CREATED_DT;
	private String CREATED_BY;
	private Date UPDATED_DT;
	private String UPDATED_BY;
	private String USER_CORP;
	private String USER_NAME;
	private String USER_EMAIL1;
	private String USER_EMAIL2;
	private String USER_MOBILE;
	private String USER_TEL;
	private String USER_ROLE;
	private String USER_AUTH;
	private String USER_STATUS;
	private String USER_DELFLAG;
	private Date USER_INDAY;
	private Date USER_OUTDAY;
	
	public UserViewDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserViewDto(String uSER_ID, String uSER_PW, Date cREATED_DT, String cREATED_BY, Date uPDATED_DT,
			String uPDATED_BY, String uSER_CORP, String uSER_NAME, String uSER_EMAIL1, String uSER_EMAIL2,
			String uSER_MOBILE, String uSER_TEL, String uSER_ROLE, String uSER_AUTH, String uSER_STATUS,
			String uSER_DELFLAG, Date uSER_INDAY, Date uSER_OUTDAY) {
		super();
		USER_ID = uSER_ID;
		USER_PW = uSER_PW;
		CREATED_DT = cREATED_DT;
		CREATED_BY = cREATED_BY;
		UPDATED_DT = uPDATED_DT;
		UPDATED_BY = uPDATED_BY;
		USER_CORP = uSER_CORP;
		USER_NAME = uSER_NAME;
		USER_EMAIL1 = uSER_EMAIL1;
		USER_EMAIL2 = uSER_EMAIL2;
		USER_MOBILE = uSER_MOBILE;
		USER_TEL = uSER_TEL;
		USER_ROLE = uSER_ROLE;
		USER_AUTH = uSER_AUTH;
		USER_STATUS = uSER_STATUS;
		USER_DELFLAG = uSER_DELFLAG;
		USER_INDAY = uSER_INDAY;
		USER_OUTDAY = uSER_OUTDAY;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getUSER_PW() {
		return USER_PW;
	}

	public void setUSER_PW(String uSER_PW) {
		USER_PW = uSER_PW;
	}

	public Date getCREATED_DT() {
		return CREATED_DT;
	}

	public void setCREATED_DT(Date cREATED_DT) {
		CREATED_DT = cREATED_DT;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public Date getUPDATED_DT() {
		return UPDATED_DT;
	}

	public void setUPDATED_DT(Date uPDATED_DT) {
		UPDATED_DT = uPDATED_DT;
	}

	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	public void setUPDATED_BY(String uPDATED_BY) {
		UPDATED_BY = uPDATED_BY;
	}

	public String getUSER_CORP() {
		return USER_CORP;
	}

	public void setUSER_CORP(String uSER_CORP) {
		USER_CORP = uSER_CORP;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	public String getUSER_EMAIL1() {
		return USER_EMAIL1;
	}

	public void setUSER_EMAIL1(String uSER_EMAIL1) {
		USER_EMAIL1 = uSER_EMAIL1;
	}

	public String getUSER_EMAIL2() {
		return USER_EMAIL2;
	}

	public void setUSER_EMAIL2(String uSER_EMAIL2) {
		USER_EMAIL2 = uSER_EMAIL2;
	}

	public String getUSER_MOBILE() {
		return USER_MOBILE;
	}

	public void setUSER_MOBILE(String uSER_MOBILE) {
		USER_MOBILE = uSER_MOBILE;
	}

	public String getUSER_TEL() {
		return USER_TEL;
	}

	public void setUSER_TEL(String uSER_TEL) {
		USER_TEL = uSER_TEL;
	}

	public String getUSER_ROLE() {
		return USER_ROLE;
	}

	public void setUSER_ROLE(String uSER_ROLE) {
		USER_ROLE = uSER_ROLE;
	}

	public String getUSER_AUTH() {
		return USER_AUTH;
	}

	public void setUSER_AUTH(String uSER_AUTH) {
		USER_AUTH = uSER_AUTH;
	}

	public String getUSER_STATUS() {
		return USER_STATUS;
	}

	public void setUSER_STATUS(String uSER_STATUS) {
		USER_STATUS = uSER_STATUS;
	}

	public String getUSER_DELFLAG() {
		return USER_DELFLAG;
	}

	public void setUSER_DELFLAG(String uSER_DELFLAG) {
		USER_DELFLAG = uSER_DELFLAG;
	}

	public Date getUSER_INDAY() {
		return USER_INDAY;
	}

	public void setUSER_INDAY(Date uSER_INDAY) {
		USER_INDAY = uSER_INDAY;
	}

	public Date getUSER_OUTDAY() {
		return USER_OUTDAY;
	}

	public void setUSER_OUTDAY(Date uSER_OUTDAY) {
		USER_OUTDAY = uSER_OUTDAY;
	}

	@Override
	public String toString() {
		return "UserViewDto [USER_ID=" + USER_ID + ", USER_PW=" + USER_PW + ", CREATED_DT=" + CREATED_DT
				+ ", CREATED_BY=" + CREATED_BY + ", UPDATED_DT=" + UPDATED_DT + ", UPDATED_BY=" + UPDATED_BY
				+ ", USER_CORP=" + USER_CORP + ", USER_NAME=" + USER_NAME + ", USER_EMAIL1=" + USER_EMAIL1
				+ ", USER_EMAIL2=" + USER_EMAIL2 + ", USER_MOBILE=" + USER_MOBILE + ", USER_TEL=" + USER_TEL
				+ ", USER_ROLE=" + USER_ROLE + ", USER_AUTH=" + USER_AUTH + ", USER_STATUS=" + USER_STATUS
				+ ", USER_DELFLAG=" + USER_DELFLAG + ", USER_INDAY=" + USER_INDAY + ", USER_OUTDAY=" + USER_OUTDAY
				+ "]";
	}
	
}
