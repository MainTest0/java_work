package ch07;

public class MainTest3 {

	public static void main(String[] args) {

		Student std1 = new Student("홍길동", 1);
		Student std2 = new Student("홍길동", 2);
		Student std3 = new Student("티모", 3);
		
		// 자식 객체에 존재하는 각각의 equals 메서드 호출이다.	
		std1.equals(std2);
		
		boolean result1 = std1 == std2;
		System.out.println(result1);

	}

}
