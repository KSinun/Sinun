package chapter11;

public class Tv {
	String color;
	boolean power;
	int channel;
	int volumn;
	
	void power() {
		power = !power;
		
		if(power) {
			System.out.println("������ �׽��ϴ�");
		} else {
			System.out.println("������ �����ϴ�");
		}
	}
	
	void channelup() {
		channel++;
		
		showChannel();
	}
	void channeldown() {
		channel--;
		
		showChannel();
	}
	void channelup() {
		System.out.println("���� ä�ι�ȣ��" + channel + "�����ϴ�");
	}
	

		
		

	}

}
