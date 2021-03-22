package chapter3;

public class Ex11 {

	public static void main(String[] args) {
		int book = 13;
		book = book / 10;
		
		if(book >= 0)	 {
			switch(book) {
			case 0:
				System.out.println("좀더 노력");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이시네요!");
				break;
			case 2:
				System.out.println("책을 사랑하는 분이시네요!");
				break;
				default:
					System.out.println("니가 짱이야");
					
				
			} // end switch
		} // end if

	}

}
