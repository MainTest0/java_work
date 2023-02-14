package ch06;

import java.util.Scanner;

public class UserInfoClient {
	
	static String dbName = "Oracle";
	
	// main --> 실행하는 코드 작성 (사용 쪽 코드) 
	public static void main(String[] args) {

		// UserInfoOracleDao 만들어 주세요
		// 스캐너를 통해서 사용자 이름, 사용자 비번을 입력 받기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String inputUserName = sc.nextLine();
		System.out.print("비번 입력 : ");
		String inputUserPw = sc.nextLine();
		// 흐름 만들기
		// 1. 저장기능
		// 2. 수정기능
		// 결론은 dbName을 변경해가면서 코드 동작 확인 해주세요
		
		
		
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		
		IUserInfoDao dao;
		if(UserInfoClient.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		}else if (UserInfoClient.dbName.equals("MSSQL")){
			dao = new UserInfoMsSqlDao();
		}else {
			dao = new UserInfoOracleDao();
		}
		
		// 저장 기능
		dao.insertUserInfo(userInfo);
		// 수정 기능
		dao.updateUserInfo(userInfo);
		
	}
}