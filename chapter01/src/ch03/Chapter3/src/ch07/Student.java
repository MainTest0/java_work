package ch07;

public class Student {

	// 학번과 이름 정의

	// toString 메서드와 equals 메서드를 재정의 해주세요
	// equals 메서드는 이름이 같다면 동명이인입니다. 라고 출력 해주세요.
	// 생성자 정의
	// 실행은 MainTest3에 스스로 검증하면서 테스트 해주세요
	// toString 메서드는 학번과 이름이 화면에 출력할 수 있도록 설계

	private int stdId;
	private String name;

	public Student(String string, int i) {
		this.stdId = stdId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "학생아이디" +this.stdId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stdName = (Student) obj;
			if(this.name == stdName.name) {
				System.out.println("이름이 같아요");
				return true;
			}
		
		}
		return false;
		
	}

}
