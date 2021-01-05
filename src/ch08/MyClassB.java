package ch08;

// 우리 회사의 클래스
// A처럼 안꼬이도록 기능을 추가하려면...
// 1. 다른 인터페이스를 생성하여 다중 상속을 사용
// 2. 기존 인터페이스에 디폴트 메서드를 추가하여 기능 추가
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB의 method1 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB의 method2 실행");
	}
}
