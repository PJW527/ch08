package ch08;
// 다른 회사의 클래스  / 수정이 불가능함
public class MyClassA implements MyInterface {


	
	@Override
	public void method1() {
		System.out.println("MyClassA의 Method1 실행");

	}
	
	// 여기는 메소드1을 빼면 구현해놓은 추상메서드가 없음. 기능추가하면 오류생김

}
