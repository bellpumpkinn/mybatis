package ch04.domain;

public class Post {
	private String title;
	private String content;
	
	//������ , ���� ���ص� ���̹�Ƽ���� �˾Ƽ� ����.
	
	@Override
	public String toString() {
		return String.format("%s %s", title, content);
	}
}
