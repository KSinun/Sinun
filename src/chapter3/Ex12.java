package chapter3;

public class Ex12 {

	public static void main(String[] args) {
		int number = 11;
		
		switch(number % 2) {
		case 0:
			System.out.println("¦��");
			break;
		default:
			System.out.println("Ȧ��");
		}
			// 2021�� 3���� Ư�� ��¥�� �ش��ϴ� ������ ȭ�鿡 ����ϼ���
		int dayOfMonth = 26;
		int dayOfWeek = dayOfMonth % 7;
		
		switch(dayOfWeek) {
		case 1:
			System.out.println("������"); break;
		case 2:
			System.out.println("ȭ����"); break;
		case 3:
			System.out.println("������"); break;
		case 4:
			System.out.println("�����"); break;
		case 5:
			System.out.println("�ݿ���"); break;
		case 6:
			System.out.println("�����"); break;
		default: 
			System.out.println("�Ͽ���"); break;
		
			
		}
		
		
		
		

	}

}
