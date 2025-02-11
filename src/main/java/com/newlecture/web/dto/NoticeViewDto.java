package com.newlecture.web.dto;

import java.util.Date;

public class NoticeViewDto {
	private int ID;
	private String TITLE;
	private String CONTENT;
	private Date REGDATE;
	private int HIT;
	private int PUBYN;
	private int DELYN;
	private String MEMBER_ID;
	private String FILES;
	
	public NoticeViewDto() {
		// TODO Auto-generated constructor stub
	}

	public NoticeViewDto(int iD, String tITLE, String cONTENT, Date rEGDATE, int hIT, int pUBYN, int dELYN,
			String mEMBER_ID, String fILES) {
		super();
		ID = iD;
		TITLE = tITLE;
		CONTENT = cONTENT;
		REGDATE = rEGDATE;
		HIT = hIT;
		PUBYN = pUBYN;
		DELYN = dELYN;
		MEMBER_ID = mEMBER_ID;
		FILES = fILES;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

	public Date getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(Date rEGDATE) {
		REGDATE = rEGDATE;
	}

	public int getHIT() {
		return HIT;
	}

	public void setHIT(int hIT) {
		HIT = hIT;
	}

	public int getPUBYN() {
		return PUBYN;
	}

	public void setPUBYN(int pUBYN) {
		PUBYN = pUBYN;
	}

	public int getDELYN() {
		return DELYN;
	}

	public void setDELYN(int dELYN) {
		DELYN = dELYN;
	}

	public String getMEMBER_ID() {
		return MEMBER_ID;
	}

	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}

	public String getFILES() {
		return FILES;
	}

	public void setFILES(String fILES) {
		FILES = fILES;
	}

	@Override
	public String toString() {
		return "NoticeViewDto [ID=" + ID + ", TITLE=" + TITLE + ", CONTENT=" + CONTENT + ", REGDATE=" + REGDATE
				+ ", HIT=" + HIT + ", PUBYN=" + PUBYN + ", DELYN=" + DELYN + ", MEMBER_ID=" + MEMBER_ID + ", FILES="
				+ FILES + "]";
	}
	
	
	
	
}
