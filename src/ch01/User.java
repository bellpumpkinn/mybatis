package ch01;

import java.sql.Date;

public class User {
	private int userId;
	private String userName;
	private Date regDate;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}
	
}




/*

db의 테이블이 자바에선 클래스
DB의 로우는 자바의 
db의 넘버는 자바에서 int



*/