package ch08;

public class InterDefaultMain {

	// 인터디폴트 문제. 첫번째것부터 찬찬히 봐야됨
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터디폴트 안에 있는 애를 실행
		InterDefaultImpl idi = new InterDefaultImpl();
		idi.method1();
		idi.method2();
		idi.defaultMethod();
	}

}
