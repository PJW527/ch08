package ch08;

public class interImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ImplClass impl = new ImplClass();
//		impl.method1();
//		impl.method2();
		
		ImplClassChild implChild = new ImplClassChild();
		
		implChild.method1();
		implChild.method2();
		implChild.method3();
		
		}
//		인터페이스 변수 = new 인터페이스() {
//	// 인터페이스에 선언된 추상 메소드의 실제 메소드 선언
//
//	};

}
