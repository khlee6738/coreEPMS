package com.newlecture.web.dto;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class NoticeDto {	
	private int ID;
	private String TITLE;
	private String CONTENT;
	private Date REGDATE;
	private int HIT;
	private int PUBYN;
	private int DELYN;
	private String MEMBER_ID;
	private String FILES;	
}
