package chapter2;

public class Ex21 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		System.out.println((int) pi);
		
		// 소수점 3째 자리까지 출력
		double pi_1 = pi * 1000;
		System.out.println(pi_1);
		
		int pi_2 = (int) (pi * 1000);
		System.out.println(pi_2);
		
	//	double pi_3 = (int) (pi * 1000.0);
	//	System.out.println(pi_3);
		
		double pi_3 = (pi * 100) + 0.5;
		System.out.println(pi_3);
		
		// 소수점 3째 자리에서 반올림 후 출력
		
		
		char ch = 'a';
		
		boolean result = '0' <= ch && ch <= '9';
		
		System.out.println(result);
		
		

	}

}
