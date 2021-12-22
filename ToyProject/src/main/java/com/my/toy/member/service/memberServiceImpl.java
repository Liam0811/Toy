package com.my.toy.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.toy.member.mapper.MemberSQLMapper;
import com.my.toy.vo.EmployeeVo;

@Service
public class memberServiceImpl {

	@Autowired
	private MemberSQLMapper memberSQLMapper;
	
	public void emp_reg(EmployeeVo vo) {
		memberSQLMapper.register(vo);
	}
}
