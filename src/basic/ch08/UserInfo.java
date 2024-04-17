package basic.ch08;

public class UserInfo {

	public String userID;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	// 생성자 오버로딩이란
	// 생성자의 갯수가 여러개 있다
	
	// 기본 생성자 형태
	public UserInfo() {
		
	}
	
	public UserInfo(String id) {
		userID = id;
	}
	
	public UserInfo(String id, String name) {
		userID = id;
		userName = name;
	}
	
	// 연습 문제
	// 1 - 매개변수 3개를 받는 생성자를 만들어
	
	public UserInfo(String id, String name, String pwd) {
		userID = id;
		userName = name;
		userPassword = pwd;
	}
	
	
	// 2 - 매개변수 4개를 받는 생성자를 만들어
	public UserInfo(String id, String name, String pwd, String Address) {
		userID = id;
		userName = name;
		userPassword = pwd;
		userAddress = Address;
		
	}
	// 3 - 매개변수 5개를 받는 생성자를 만들어
	public UserInfo(String id, String name, String pwd, String Address, String pn) {
		userID = id;
		userName = name;
		userPassword = pwd;
		userAddress = Address;
		phoneNumber = pn;
		
	}
}// end of class
