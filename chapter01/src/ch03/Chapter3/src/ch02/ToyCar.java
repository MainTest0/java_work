package ch02;

public class ToyCar implements RemoteControler {

	@Override
	public void turnOn() {
		System.out.println("장난감 자동차의 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("장난감 자동차의 전원을 끕니다.");

	}

}
