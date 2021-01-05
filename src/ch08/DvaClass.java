package ch08;

public class DvaClass extends AttackClass {
	
//	MovementClass - AttackClass - DvaClass로 연계됨. 결과는 String args[]가 있는 Overwatch에서 
	
	@Override
	public void left() {
		System.out.println("할아버지 클래스로부터 물려받은 왼쪽이동");
	}
	
	@Override
	public void attack() {
		System.out.println("아버지 클래스로부터 물려받은 공격");
	}
	

}
