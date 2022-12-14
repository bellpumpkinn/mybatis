package ch03.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

@Alias("myUser")
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	//과제] users와 addresses사이의 relationship을 디자인하라.
	private Address address;
	//user has an address
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}