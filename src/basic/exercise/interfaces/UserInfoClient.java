package basic.exercise.interfaces;

public class UserInfoClient {
	//main (메인 쓰레드 : 메인 작업자 )
	public static void main(String[] args) {
	
		// 사용자에게 정보를 입력하세요. --> Scanner 활용
		String inputUserName = "길동홍";
		String inputUserPW = "asd123";
		
		// DTO : 데이터들을 받아서(취합해서) 전달하는 역할을 가지고 있는 인스턴스를 말한다.
		UserInfo info1 = new UserInfo(inputUserName, inputUserPW);		
		// 데이터를 받아서 IUserInfoDao 를 구현한 구현 클래스에게 전달하고자 한다.
		// UserInfoMySqlDaoImpl, UserInfoOracleDaoImpl 
//		IUserInfoDao iUserInfoDao = new UserInfoMySqlDaoImpl();
		IUserInfoDao iUserInfoDao = new UserInfoOrcleDaoImpl();
		
		iUserInfoDao.insertUserInfo(info1);
		iUserInfoDao.updateUserInfo(info1);
		iUserInfoDao.deleteUserInfo(info1.getId());
		iUserInfoDao.selectUserInfo();
		
	} // end of main
	
} // end of class
