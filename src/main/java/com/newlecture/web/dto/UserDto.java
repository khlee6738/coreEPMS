package com.newlecture.web.dto;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter	//getter 함수 만들기
@Setter	//setter 함수 만들기
@NoArgsConstructor(access=AccessLevel.PUBLIC)	//기본생성자 만들기, 접근권한은 public
@ToString	//toString 함수 만들기, @ToString(exclude = "name")으로 특정필드를 자동생성에서 제외가능
public class UserDto {
    private String user_id;			//사용자 아이디
    private String user_pw;			//사용자 암호
    private Date created_dt;		//생성일
    private String created_by;		//생성자 아이디
    private Date updated_dt;		//최종수정일
    private String updated_by;		//최종수정자 아이디
    private String user_corp;		//소속 회사code
    private String user_name;		//사용자 이름
    private String user_email1;		//사용자 email1
    private String user_email2;		//사용자 email2
    private String user_mobile;		//사용자 핸드폰
    private String user_tel;		//사용자 일반전화
    private String user_role;		//화면권한 (user:협력(공급)업체, admin:코어플러스)
    private String user_auth;		//사용권한 (general:일반사용자, approval:승인권자)
    private String user_status;		//상태 (A:사용중, F:사용중지)
    private String user_delflag;	//삭제 flag : 삭제(Y)
    private Date user_inday;		//사용시작일
    private Date user_outday;		//사용중지일
}
