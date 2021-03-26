package chapter12;

public class Child extends parent {
	//부모 클래스로부터 상속 받은 정수를 저장하는 x
	public int x;
	public int y;
	
	public Child() {
		this(0, 0);
		
		System.out.println("매개변수가 없는 생성자");
	}
	
	
	// 자식 클래스의 인스턴스가 만들어질 때
	// 부모 클래스의 멤버들을 같이 생성하므로
	// 자식 클래스의 생성자를 만든다면
	// 자식 클래스의 생성자의 맨 처음에 부모 클래스의 생성자를 호출해야한다.
	
	// 상속 관계에서는 자식 클래스의 기본 생성자는
	// 매개변수는 없고 부모클래스의 기본 생성자를 호출한다.
	public Child(int x, int y) {
		System.out.println("매개변수가 있는 생성자");
		
		this.x = x;
		this.y = y;
		
		// 기본 생성자를 직접 추가했고
		// 부모 클래스의 기본 생성자를 호출하는 코드를
		// 작성하지 않았다.
	}

	


	public void method() {
	
	
	}

	public static void main(String[] args) {
		Child child = new Child(1, 1);
	}

}
