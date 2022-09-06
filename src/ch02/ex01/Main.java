package ch02.ex01;

import java.util.List;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class); //겟매퍼호출시 오픈세션이 호출됨.
		
		List<User> users = mapper.selectUsers();
		users.forEach(System.out::println);
	}
}

//셀렉트는 오어 매핑된거 리턴받음
//인서트 업데이트 딜리트는 dml성공한 로우 리턴받음