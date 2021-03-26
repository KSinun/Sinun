package chapter12;

public class Ex4 {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		CaptionTV captionTv = new CaptionTV();
		
		// 다형성 - aaa2 라는 객체는 AAA 타입의 객체이면서
		//				 AAA 클래스의 자식 클래스인 CaptionTV 타입의 객체도 된다.
		AAA aaa2 = new CaptionTV();
		
		// 단, 자식 타입의 객체가 부모 타입의 인스턴스를 가리킬 수는 없음
		// CaptionTV captionTV2 = New AAA();
		
	}

}
