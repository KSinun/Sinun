package chapter3;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 문자열 내 포함되어 있는 공백을 제거하고 출력하세요.
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String input = scanf.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			// input 문자열 내 공백문자를 제거하고 출력하는 코드
			char monja = input.charAt(i);
			
			if(monja != '	') {
				System.out.println(monja);
				
			} // end if
		} // end for

	}

}
