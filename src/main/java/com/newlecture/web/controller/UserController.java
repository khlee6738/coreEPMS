package com.newlecture.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.newlecture.web.dto.UserViewDto;
import com.newlecture.web.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/users/")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("login")
	public String login() {
		return "users/login";
	}
	
	@PostMapping("login")
	public String login(@RequestParam("user_id") String user_id, @RequestParam("user_pw") String user_pw, HttpSession session, RedirectAttributes reAttr ) {
		String s_Path = "redirect:login";
		String s_status = "F";
		UserViewDto userDto = service.getUser(user_id);
		
		if(userDto != null) {
			if(s_status.equals(userDto.getUSER_STATUS())) {
				// 입력 아이디가 사용중지일 경우
				reAttr.addFlashAttribute("msg", "사용중지된 아이디 입니다.");
				s_Path = "redirect:login";
			}else {
				//입력 아이디가 사용가능일 경우
				if(userDto.getUSER_PW().equals(user_pw)){
					//아이디와 비밀번호가 일치하는 경우
					session.setAttribute("ssUserId", userDto.getUSER_ID());
					session.setAttribute("ssUserPw", userDto.getUSER_PW());							//로그인 사용자 암호
					session.setAttribute("ssUserName", userDto.getUSER_NAME());						//로그인 사용자 이름
					session.setAttribute("ssUserCorpCd", userDto.getUSER_CORP());					//로그인 사용자 소속회사 Code
					session.setAttribute("ssUserRole", userDto.getUSER_ROLE());						//로그인 사용자 화면권한(user:협력(공급)업체, admin:코어플러스)
					session.setAttribute("ssUserAuth", userDto.getUSER_AUTH());						//로그인 사용자 사용권한(general:일반사용자, approval:승인권자)					
					session.setMaxInactiveInterval(3600);
					s_Path = "redirect:/customer/notice/list";
				}else {
					//비밀번호가 틀린 경우
					reAttr.addFlashAttribute("msg","비밀번호가 일치하지 않습니다.");
					reAttr.addFlashAttribute("user_id", userDto.getUSER_ID());
					s_Path = "redirect:login";
				}
			}
		}else {
			reAttr.addFlashAttribute("msg","존재하지 않는 아이디입니다.");
			s_Path = "redirect:login";
		} 
		
		return s_Path;
	}
}
