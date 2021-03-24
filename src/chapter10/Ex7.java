package chapter10;

public class Ex7 {

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		
		int num1 = 10;
		
		System.out.println("before : " + num1);
		ex5.change(num1);
		System.out.println("after : " + num1);
		System.out.println();
		
		simpletype1 type = new simpletype1();
		type.num1 = 10;
		
		System.out.println("before : " +type.num1);
		
		ex5.change(type);
		System.out.println("after : " + type.num1);
	}
		
	void change(int num1) {
		num1 = num1 * 10;
		
		System.out.println("change(int) : " + num1);
	}
	
	void change(simpletype1 type) {
		type.num1 = type.num1 * 10;
		
		System.out.println("change(simpletype1) : " + type.num1);
	}
}
