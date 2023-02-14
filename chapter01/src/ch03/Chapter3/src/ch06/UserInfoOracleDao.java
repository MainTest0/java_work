package ch06;

public class UserInfoOracleDao implements IUserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("아이디");
		System.out.println(userInfo.getUserName());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("비번");
		System.out.println(userInfo.getPw());

		
	}

	@Override
	public void deleteUserInfo(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecteUserInfo(String userName) {
		// TODO Auto-generated method stub
		
	}
	
}