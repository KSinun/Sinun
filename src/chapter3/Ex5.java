package chapter3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in)
		System.out.println("2021_3 ��¥ = ");
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % Ex3.WEEK;
		
		System.out.println("2021_3��" + dayOfMonth + "����");
		
		if(dayOfWeek == 0) {
			System.out.println("�Ͽ���");
		} else if(dayOfWeek == 1) {
			System.out.println("������");
		} else if(dayOfWeek == 2) {
			System.out.println("ȭ����");
		} else if(dayOfWeek == 3) {
			System.out.println("������");
		} else if(dayOfWeek == 4) {
			System.out.println("�����");
		} else if(dayOfWeek == 5) {
			System.out.println("�ݿ���");
		} else {
			System.out.println("�����");
		} 
			System.out.println("�Դϴ�.");
			
		}

	}

}
