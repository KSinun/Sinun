package chapter12;

public class Ex1 {

	public static void main(String[] args) {
//		Point point = new Point();
//		
//		System.out.println(point.getLocation());
		
		Point3D point3D = new Point3D();
		System.out.println(point3D.getLocation());
		
		// 오버로딩 (상속과 관계 x)
		// 한 클래스 내 도일한 이름을 사용하면서 매개변수가 서로 다른 메서드
		
		// 오버라이딩 (상속과 관계 o)
		// 부모 클래스에게 상속 받은 멤버 메서드를 재정의 - 이름, 매개변수, 반환타입이 같아야함
		
		
		// A - 최상위 부모 클래스
		// B - A 클래스의 자식 클래스
		// C - A 클래스의 자식클래스, D 클래스의 부모 클래스
		// D - C 클래스의 자식 클래스
		
		A a = new A();
		
		B b = new B();
		
		C c = new C();
		
		D d = new D();
		
	}

}
