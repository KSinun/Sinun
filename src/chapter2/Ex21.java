package chapter2;

public class Ex21 {

	public static void main(String[] args) {
		double pi = 3.141592;
		
		System.out.println((int) pi);
		
		// �Ҽ��� 3° �ڸ����� ���
		double pi_1 = pi * 1000;
		System.out.println(pi_1);
		
		int pi_2 = (int) (pi * 1000);
		System.out.println(pi_2);
		
	//	double pi_3 = (int) (pi * 1000.0);
	//	System.out.println(pi_3);
		
		double pi_3 = (pi * 100) + 0.5;
		System.out.println(pi_3);
		
		// �Ҽ��� 3° �ڸ����� �ݿø� �� ���
		
		
		char ch = 'a';
		
		boolean result = '0' <= ch && ch <= '9';
		
		System.out.println(result);
		
		

	}

}
