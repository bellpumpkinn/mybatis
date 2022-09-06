package ch02.ex03;

import java.time.LocalDate;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		//mapper.insertUser(new User(11, "abel", LocalDate.now()));
		/*
		if(mapper.insertUser(new User(11, "abel", LocalDate.now())) > 0)
			System.out.println("성공 11");
		//11번 유저가 이미 들어가있는데 다시 insert하니까 오류가 났음.
		//sql developer에서 11번을 삭제하고 다시 실행하면 오류가 안남.
		
		if(mapper.insertUser(new User(12, null, null)) > 0)
			System.out.println("성공 12"); //null값이 성공하려면 sqlMap에서 jdbcType을 설정해줘야한다.
		
		
		if(mapper.insertUser2(13, "kianu", LocalDate.of(2022, 8, 15)) > 0)
			System.out.println("성공 13");
		*/
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0)
			System.out.println("성공 14");
	}
}
