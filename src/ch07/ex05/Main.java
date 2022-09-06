package ch07.ex05;

import java.time.LocalDate;

import ch07.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		System.out.println(mapper.deleteUser(11));
	}
}
