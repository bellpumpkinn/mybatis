package ch02.ex03;

import java.time.LocalDate;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		//mapper.insertUser(new User(11, "abel", LocalDate.now()));
		/*
		if(mapper.insertUser(new User(11, "abel", LocalDate.now())) > 0)
			System.out.println("���� 11");
		//11�� ������ �̹� ���ִµ� �ٽ� insert�ϴϱ� ������ ����.
		//sql developer���� 11���� �����ϰ� �ٽ� �����ϸ� ������ �ȳ�.
		
		if(mapper.insertUser(new User(12, null, null)) > 0)
			System.out.println("���� 12"); //null���� �����Ϸ��� sqlMap���� jdbcType�� ����������Ѵ�.
		
		
		if(mapper.insertUser2(13, "kianu", LocalDate.of(2022, 8, 15)) > 0)
			System.out.println("���� 13");
		*/
		if(mapper.insertUser3(14, "neo", LocalDate.now()) > 0)
			System.out.println("���� 14");
	}
}
