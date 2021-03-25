package chapter11;

public class Tv {
	String color;
	boolean power;
	int channel;
	int volumn;
	
	void power() {
		power = !power;
		
		if(power) {
			System.out.println("전원을 켰습니다");
		} else {
			System.out.println("전원을 껐습니다");
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
		System.out.println("현재 채널번호는" + channel + "없습니다");
	}
	

		
		

	}

}
