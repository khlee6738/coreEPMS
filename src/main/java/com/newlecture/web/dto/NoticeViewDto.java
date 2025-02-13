package com.newlecture.web.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class NoticeViewDto extends NoticeDto {
	private String MEMBER_NAME;
	private int COUNT_CMD;
	
}
