package chapter3;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// ���ڿ��� �Է� �޾� ���ڿ� �� ���ԵǾ� �ִ� ������ �����ϰ� ����ϼ���.
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String input = scanf.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			// input ���ڿ� �� ���鹮�ڸ� �����ϰ� ����ϴ� �ڵ�
			char monja = input.charAt(i);
			
			if(monja != '	') {
				System.out.println(monja);
				
			} // end if
		} // end for

	}

}
