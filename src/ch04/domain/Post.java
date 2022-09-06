package ch04.domain;

public class Post {
	private String title;
	private String content;
	
	//생성자 , 세터 안해도 마이바티스가 알아서 다함.
	
	@Override
	public String toString() {
		return String.format("%s %s", title, content);
	}
}
