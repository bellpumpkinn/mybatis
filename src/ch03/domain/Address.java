package ch03.domain;

public class Address {
	private String address; //userId는 users에 존재. 그래서 address만 만들었음.
	
	@Override
	public String toString() {
		return address;
	}
}
