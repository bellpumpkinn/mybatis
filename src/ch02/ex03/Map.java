package ch02.ex03;

import java.time.LocalDate;

import org.apache.ibatis.annotations.Param;

import ch02.domain.User;

public interface Map {
	int insertUser(User user);  //보내줄게 3개이상이면 도메인으로 보내주는게 낫다. 
	
	int insertUser2(@Param("userId") int userId, 
					@Param("userName")String userName,
					@Param("regDate")LocalDate regDate);  //도메인말고 따로따로 해주는경우.
		
	int insertUser3(int userId, String userName, LocalDate regDate);
}
