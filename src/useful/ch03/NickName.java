package useful.ch03;

public class NickName {
	
	private String nick;
	
	public String getNick() {
		return nick;
	}
	public void setNick(String Ni) throws NickNameException{
	
		
		if(Ni == null) {
			throw new NickNameException("빈 칸은 입력 못함.");
		}
		
		boolean NiResult = Ni.matches("^[a-zA-Z0-9]{3,10}$");
			System.out.println(NiResult ? "확인 완료" : "닉네임은 알파벳 대소문자(3~10)와 숫자 입력");
		
		if(Ni.length() < 3) {
			throw new NickNameException("닉네임은 3글자 이상");
		}
	 
	}
	
	
}

//if(Ni.matches("^[가-힣]*$")) {
//	throw new NickNameException("알파벳 대소문자(3글자에서 10글자)에 숫자 포함 입력이 가능합니다.(한글 불가)");}