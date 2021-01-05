package ch08;

public abstract class ImplClass implements inter {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("aaaaa");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("bbbbb");
	}

	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
	// inter에서 상속받은 추상메서드 method3을 구현하지 않을경우 추상메서드가 됨
//	public void method3() {
//		// TODO Auto-generated method stub
//		System.out.println("aaaaa");
//	}

}
