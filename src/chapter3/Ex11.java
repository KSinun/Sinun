package chapter3;

public class Ex11 {

	public static void main(String[] args) {
		int book = 13;
		book = book / 10;
		
		if(book >= 0)	 {
			switch(book) {
			case 0:
				System.out.println("���� ���");
				break;
			case 1:
				System.out.println("å �д� ���� ���� ���̽ó׿�!");
				break;
			case 2:
				System.out.println("å�� ����ϴ� ���̽ó׿�!");
				break;
				default:
					System.out.println("�ϰ� ¯�̾�");
					
				
			} // end switch
		} // end if

	}

}
