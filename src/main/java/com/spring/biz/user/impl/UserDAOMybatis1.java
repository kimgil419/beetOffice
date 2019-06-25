package com.spring.biz.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.biz.user.UserVO;

@Repository("UserDAOMybatis1")
public class UserDAOMybatis1 extends SqlSessionDaoSupport {
    
	@Autowired
	public void setSqlSessionFactory (SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public UserDAOMybatis1() {
		System.out.println(">> uBoardDAOMybastis1 객체 생성");
	}

	// 글 상세 조회
	public UserVO getUser(UserVO vo) {
		System.out.println("===> uMybatis2로 getUser() 실행");
		return getSqlSession().selectOne("UserDAO.user_get", vo);
	}

	// 글 상세 조회
	public void insertUser(UserVO vo) {
		System.out.println("===> uMybatis2로 insertUser() 실행");
		super.getSqlSession().insert("UserDAO.user_insert", vo);
	}


}
