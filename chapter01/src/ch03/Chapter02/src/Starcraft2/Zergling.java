package Starcraft2;

public class Zergling {
	private String name;
	private int hp;
	private int power;

	public Zergling(String name) {
		this.name = name;
		this.hp = 3;
		this.hp = 50;
	}

	// getter 메서드 만들기
	public int getPower() {
		return this.power;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	// 저글링이 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이" + zealot.getName() + "을 공격합니다.");
		// 여기서 저글링의 공격력은 3
		zealot.beAttacked(this.power);
	}

	// 저글링이 마린을 공격합니다.
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이" + marine.getName() + "을 공격합니다.");

	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		if(this.hp <= 0) {
			System.out.println(this.name+"이 사망하였습니다.");
			return;		//리턴 키워드는 값을 반환할 때 사용할 수 있고, 실행의 종료를 시킬 수도 있다.
		}
		System.out.println(this.name + "이 공격을 당합니다.");
		this.hp -= power;
		
	}

	public void showInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
