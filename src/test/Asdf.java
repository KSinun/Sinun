package test;

public class Asdf {

	public static void main(String[] args) {
		TV LG_TV = new TV();
		LG_TV.setColor("red");
		
		// ��ü���� ���α׷����� ����� �߽����� ���α׷��� �����ϴ� ���
		//��ü�� ����ϴ� �ʿ����� ��ü�� �����ϴ� ��ɸ��� ����ؾ��Ѵ�.
		
		// ������ ���� �� ���� ä�� ��ȣ�� �˷��ְ� ���� ����?
		// 1. ������ Ű��
		LG_TV.power();
		
		// 2. ä�� ��ȣ�� �˷��ش�.
		// getter
		System.out.println("���� ä�� ��ȣ�� " + LG_TV.getChannel() + "�� �Դϴ�.");
		
	}
}
