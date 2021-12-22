package com.my.toy.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.toy.member.service.memberServiceImpl;
import com.my.toy.vo.EmployeeVo;


@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private memberServiceImpl memberService;
	
	@RequestMapping("joinEmp.do")
	public String joinEmpPage() {
		
		return "/member/joinEmp";
		
	}
	@RequestMapping("joinEmpProcess.do")
	public String JoinEmpProcess(EmployeeVo vo) {
		
		memberService.emp_reg(vo);
		
		return "/member/joinEmpProcess";
	}
	
	
}
