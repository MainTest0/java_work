package ch06;

import java.util.Scanner;


public class ExUserInfoClientTest {

static String dbName = "MYSQL";

	public static void main(String[] args) {
		// UserInfoOracleDao 만들어 주세요
		// 스캐너를 통해서 사용자 이름, 사용자 비번을 입력 받기
		
		Scanner sc = new Scanner(System.in);
		
		String userId;
		String userPw = null;
		
		System.out.print("ID 입력 : ");
		userId = sc.nextLine();
		System.out.print("PW 입력 : ");
		userId = sc.nextLine();

		// 흐름 만들기
		// 1. 저장기능
		// 2. 수정기능
		// 결론은 dbName을 변경해가면서 코드 동작 확인 해주세요
		
		UserInfo UI = new UserInfo(userId, userPw);
		
		IUserInfoDao dao;
		if(ExUserInfoClientTest.dbName.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		} else if(ExUserInfoClientTest.dbName.equals("MSSQL")) {
			dao = new UserInfoMsSqlDao();
		}else {
			dao = new UserInfoOracleDao();
		}

		dao.insertUserInfo(UI);
		dao.updateUserInfo(UI);
		
	}

}
