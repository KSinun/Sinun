package chapter3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// while���� "�ַ�" ���� �ݺ��� (���� ��Ȯ���� ����) �� ����
		Scanner scanf = new Scanner(System.in);
		// ������ �� ��� �ٽ� ������� ����
		char repeat;
		
		while(true) { 
			
			System.out.println("������ ����մϴ�.");
			int number = 1;
			while(number <= 10); {
			System.out.println(number + "�� Ʈ�� ���");
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			if(repeat == 'y') {
				number = 1;
				continue;
			}
			number = number + 1;
		}	
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
			
		}// end while
	}// main end
}// class
