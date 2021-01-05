package ch08;

public class MyDefaultMethodMain {

	/// my인터페이스 - my클래스 A/B - my디폴트메소드메인 순서임
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();			// 원래는 없다시피한 MyInterface 부분을 불러왔으나 오류는 없음
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();

//		
//		
//		디폴트 메소드가 있는 인터페이스의 상속
//		
//		부모 메소드의 디폴트 메소드를 자식에서 쓰는 방법
//		
//		디폴트 메소드를 단순히 상속만 받음(일반메서드)
//		디폴트 메소드를 재정의(오버라이드)하여 실행 내용을 변경
//		디폴트 메소드를 추상 메소드로 재선언 - 해당 클래스를 상속받는 자손메소드가 오버라이딩하여 사용해야함
	}

}

// 예외

// 일반 컴파일 체크 예외는 심각도가 낮은데
// 실행예외 (런타임 오류)는 심각도가 많이 높음

// NullPointerException
// 객체 참조가 없는, 비어있는 곳을 참조했을때
// ArrayIndexOutOfBoundsException
// 배열에서 인덱스 범위 초과하여 사용할 경우 발생
// ClassCastException
// 타입 변환이 되지 않을경우 발생

// 예외처리 코드 (try-catch-finally)