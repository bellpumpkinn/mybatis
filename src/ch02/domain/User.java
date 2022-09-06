package ch02.domain;

import java.time.LocalDate;

// 과제] users relation테이블과 mapping 할 User object클래스를 디자인하라.
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	
	public User(int userId, String userName, LocalDate regDate) {
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
	} //칼럼의 필드값을 읽어서 멤버변수에 집어넣음
	
	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}
}
