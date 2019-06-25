package com.spring.biz.user;

import java.util.List;

public interface UserService {
	//회원조회
	
	void insertUser(UserVO vo);

	UserVO getUser(UserVO vo);

}
