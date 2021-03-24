package chapter10;

//Ex1 클래스는 매서드를 만들고
//만든 매서드를 실행할 클래스
//매서드를 만든다 -> 매서드를 정의한다 / 선언한다
public class Ex1 {
	void simple1() { 
		System.out.println("Hello World~!");
	}

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		
		
		// simple1 매서드 호출
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		
		
		
		
	}

}
