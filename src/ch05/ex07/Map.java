package ch05.ex07;

import java.util.List;

import ch05.domain.User;

public interface Map {
	List<User> selectUsers(int[] userIds);
	List<User> selectUsers2(List<String> userNames);
}

// 파라미터네임 짓는법
//도메인의 멤버변수이름
//param 어노테이션