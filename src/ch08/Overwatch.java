package ch08;



public class Overwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zarya z = new Zarya();
		z.forward();
		z.backward();
		z.attack();
		z.specialskill();
		
		DvaClass d = new DvaClass();
		d.left();
		d.attack();
		
		System.out.println("인터페이스의 다중상속시 다형성");
		Movement vm = null;
		Attack va = null;
		
		
		vm = z;
		
		vm.left();
		vm.right();
		// 공격은 attck 인터페이스의 멤버이므로 오류가 발생함
		// vm.attack();
		
		Character ch = null;
		ch = (Character) new Sombra();
		ch.attack();

	}

}


