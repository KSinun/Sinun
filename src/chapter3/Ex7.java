package chapter3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String a = "+";
		// next 매서드 -> 사용자가 입력한 값을 문자열로 가져옴
		String b = scanf.next();
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		if(a.equals(b)) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("a와 b가 다릅니다.");
			
			
			
		}

	}

}
