package com.spring.biz.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.user.UserService;
import com.spring.biz.user.UserVO;

//(실습)어노테이션 설정으로 userService 이름을 갖는 객체 생성
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	//(실습) 어노테이션 설정으로 UserDAO 타입의 객체 주입
	private UserDAOMybatis1 userDAO;
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
		
	}







}
