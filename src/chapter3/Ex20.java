package chapter3;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// �Ʒ��� ���� �� ���� �Է� �޾� ��(*)�� ����ϼ���.
		
		/*
		 * �� �� : (�Է�) 3			�ټ� : 5			�� �� : 7
		 * 
		 *  *									*						*
		 *  **									**						**
		 *  ***								***					***
		 * 	 									****					****
		 * 										*****				*****
		 * 																******
		 * 																*******
		 */

		Scanner scanf = new Scanner(System.in);
		
		System.out.println("�� �� : ");
		int row = scanf.nextInt();
		
			//�� ���� �����ϴ� for��
		for(int i=1; i<=row; i++) {
			// n��° �ٿ��� ����ؾ��� ���� ������ �����ϴ� for��
			for(int j=1; j<=i; j++) {
				System.out.println("*");
			}
			
			System.out.println();
		} // end for i
		
	}

}
