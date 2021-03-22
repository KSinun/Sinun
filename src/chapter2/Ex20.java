package chapter2;

public class Ex20 {
	public static void main(String[] args) {
//		System.out.println(12 / 0);
		
//		System.out.println(12.0 / 0.0);
		
//		short a = 32_767;
//		short b = 1;
//		
//		int c = a + b;
//		System.out.println(c);
		
		Numbers numbers = new Numbers();
		// 1,000,000
		numbers.num1 = 1000000;
		numbers.num2 = numbers.num1;
		
		//1백만 * 1백만 = 1,000,000,000,000
		int var = numbers.num1 * numbers.num2;
		System.out.println(var);
		
		
	}

}
