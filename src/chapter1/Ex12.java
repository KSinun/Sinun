package chapter1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		* �� ������ : ����(true, false)�� �����ϱ� ���� ������
		* && : �� �� ��� true �� �� ����� true
		* || : �� �� �� �ϳ��� true�� ����� true
		* ! : true�� false��, false�� true�� ���� �ݴ�� ������ִ� ������
		*/
//		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
//		
		System.out.println("���� ���� : ");
		// Scanner ��� �ٷ��� : �Է��� ���� �������� ����� ���� ����
		// ��� �ٷ��̸� ����Ϸ��� ��üȭ�� ���Ѿ���
		Scanner scanf = new Scanner(System.in);
		// nextint ��ü�� �����ϴ� ��� -> �ż���
		// nextint �ż��� : �Է��� ���� ������ �������� ���
		
		
		int kor = scanf.nextInt();
		System.out.println("kor = " + kor);
		
		System.out.println(kor >= 0);
		System.out.println(kor <= 100);
		
		boolean right = kor >= 0 && kor <= 100;
		
		System.out.println(right);
		
		
		
	}

}
