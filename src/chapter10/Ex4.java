package chapter10;

public class Ex4 {

	void simple1(int val) {
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello world~!");
	}
	void simple3(String message) {
		System.out.println(message);
	}
	// simple4 �ż���� ���� �ΰ��� �ʿ��� �ż���
	void simple4(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	// simple5 �ż���� ���� ������ ���� �ϳ��� �ʿ��� �ż���
	void simple5(int var1, int var2,char var3) {
		if(var3 == '+') {
			System.out.println(var1 + var2);
		} else if(var3 == '-') {
			System.out.println(var1 - var2);
			// ...
		}
	}
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		
		ex4.simple1(1);
		
		ex4.simple2("Hello World~!");
		ex4.simple3("�ȳ��ϼ���");
		
		ex4.simple5(1, 1, '+');
		
	}

}
