package ch02.ex01;

import java.util.List;

import ch02.domain.User;

public interface Map {
	List<User> selectUsers(); //매핑된 개체 n개 받아오려면 List를 쓴다.
}

//list가 리턴된다. 1가지경우만있음.