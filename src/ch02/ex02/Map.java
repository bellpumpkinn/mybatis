package ch02.ex02;

import java.time.LocalDate;

import ch02.domain.User;

public interface Map {
	User selectUser(int userId); 
	User selectUser2(String userName);
	User selectUser3(LocalDate regDate);
}

//파라미터가 하나라서 sqlMap파일에서 #{} {}안에 아무거나써도됨.