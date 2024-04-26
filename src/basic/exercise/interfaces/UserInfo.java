package basic.exercise.interfaces;

// DTO 개념으로 바라볼 수 있다.
public class UserInfo {
	
	public static int SERIAL_NUM = 0;
	private int id; // 식별자 PK -> 홍길동, 나이 == 1, 2, 3
	private String userName;
	private String pw;
	
	public UserInfo(String userName, String pw) {
		this.userName = userName;
		this.pw = pw;
	}
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPW() {
		return pw;
	}
	
	@Override
	public String toString() {
		return userName + ", " + id + ", " + pw;
	}
}
