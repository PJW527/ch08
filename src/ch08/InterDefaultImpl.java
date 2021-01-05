package ch08;

public class InterDefaultImpl implements InterDefault {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("오버라이딩되어 인터디폴트 인터페이스에 정의만 해뒀던걸 불러온 메소드1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("오버라이딩된 메소드2");

	}

	
	// 인터페이스의 디폴트메소드는 일반적인 메소드이기 때문에 인터페이스를 상속받았을경우 디폴트 메서드를 오버라이딩할 필요가 없음 
	// 부모의 메서드이기 때문에 오버라이딩해서 사용할수 있음
	// 오버라이딩하여 추상 메서드로 변환할수 있음 (중간에 abstract 붙이고)
	// 대신 클래스도 추상 클래스로 바꿔줘야함
//	@Override
//	public void defaultMethod() {
//		// System.out.println("뭐 여기(InterDefaultImpl) 클래스에서 오버라이딩을 해도 상관없는데 내용이 안나오네?");
//	}
}
