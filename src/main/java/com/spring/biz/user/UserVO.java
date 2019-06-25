package com.spring.biz.user;

public class UserVO {
	private String user_id; // 잉 이거만 소문자 형태로 바꾸니까 연결이 되네 // 아마도 투스트링 형태로 대소문자는 구분이 안되고 값의 형태만 맞으면 되는거 같다
	private String user_password;
    private String dept;
    private String birth;
    private String job_id;
    private int user_number;
    private String user_name;
    private String user_position;
    
    
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getUser_number() {
		return user_number;
	}
	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_position() {
		return user_position;
	}
	public void setUser_position(String user_position) {
		this.user_position = user_position;
	}
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_password=" + user_password + ", dept=" + dept + ", birth=" + birth
				+ ", job_id=" + job_id + ", user_number=" + user_number + ", user_name=" + user_name
				+ ", user_position=" + user_position + "]";
	}

    
    
    
    

	
	
}
