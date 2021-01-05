package ch08;

public interface InterDefault {
	
	// 인터페이스는 객체 생성이 불가능한데 인터페이스의 기능을 확장하는 디폴트 메서드는 객체생성후 사용됨
	// 인터페이스의 다형성을 이용 자식타입의 객체를 대입후 사용
	// 아니면 인터페이스의 정적 메소드를 쓰던가. 추상 메서드를 쓰거나
	// 디폴트 메소드는 모든 구현 객체가 가지고 있는 일반 메소드로 사용. 오버라이딩 가능
	// 이부분 조금 어렵다... 인터페이스 디폴트 메소드로 검색해서 좀더 공부해보자

	
	
	// 추상 메서드
	public void method1();
	public void method2();
	
	// 디폴트 메서드
	public default void defaultMethod() {
		System.out.println("InterDefault 인터페이스의 디폴트 메서드");
	}
}
