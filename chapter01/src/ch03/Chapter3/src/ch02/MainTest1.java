package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		Television television = new Television();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyCar toyCar = new ToyCar();
		robot.name = "로봇";

		// 다형성
		RemoteControler controller1 = television;
		RemoteControler controller2 = refrigerator;
		RemoteControler controller3 = robot;
		RemoteControler controller4 = toyCar;

		// 다형성 + 배열
		RemoteControler[] remoteControllers = new RemoteControler[4];

		remoteControllers[0] = television;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = toyCar;

		// 문제 1.
		// for 문을 활용해서 전원을 전부 켜주세요

		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn();			// 컴파일 시점 (turnOn, turnOff)
		}

		// 문제 2.
		// index 값이 3번째 녀석이면 자신의 타입을 화면에 출력 해주세요.

		for (int i = 0; i < remoteControllers.length; i++) {
			if(i == 3) {
				System.out.println("3번째 인덱스인 녀석은" +remoteControllers[i].getClass()+"입니다.");
				System.out.println("3번째 인덱스인 녀석은 ToyCar입니다.");
			}
		}
		
		// 문제3.
		// 만약 데이터 toyRobot이면 멤버 변수 name 값을 출력 해주세요.
		
		for (int i = 0; i < remoteControllers.length; i++) {
			if(remoteControllers[i] == robot) {
				System.out.println(robot.name); 
			}
		}
		for (int i = 0; i < remoteControllers.length; i++) {
			if(remoteControllers[i] instanceof ToyRobot ) {
				//업캐스팅 된 상태이기 때문에
				// 자식 타입으로 바라보기 위해서는 다운 캐스팅 개념을 알고 있어야 한다.
				//System.out.println((ToyRobot)remoteControllers[i]).name);
				System.out.println(robot.name);
			}
		}
		
		// 문제 4.
		// 장난감 로봇의 소리 기능을 추가해달라고 요청했다.
		// 냉장고에도 소리나는 기능을 추가해달라고 요청했다.
		// 소리라는 기능을 인터페이스로 설계하고 구현
		// 냉장고 -> 띠리리링~~~
		// 장난감 -> 뚜두두 뚜두 ~~ 쌔삥~
		
		// 사운드 인터페이스 하나 더 만들어서 사운드 메서드 만들고
		// 냉장고랑 장난감 로봇에만 콤마(,)로 사운드 인터페이스 넣어주고
		// 냉장고 클래스랑 장난감 로봇 클래스에 사운드 메서드 넣어주면 된다.
		

	}// end of main

}// end of class
