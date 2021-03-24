package chapter3;

public class Ex19 {
	public static void main(String[] args) {
		// 초기식 자리에 선언한 변수는 for 문에서만 사용할 수 있다.
		// 실행 순서 : 초기식 -> 조건식 -> 증강식 -> 조건식 -> 증강식 -> 조건식 -> ...
//		for (int i=1;  i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		int i = 27;
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += 1;
//		}
//		
//		System.out.println(sum);
//		
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			int su = i % 2;
//			
//			if(su == 1) sum += 1;
//			
//			System.out.println(sum);						
//		}
		
//		int sum = 0;
//		for(int i=2; i<=10; i = i + 2) {
//			sum += i;
//			System.out.println(sum);
//		
//		}
		
		
		//factorial - 순차곱셈
		// 1! = 1
		//n! = n * (n-1)!
		//3! = 3 * 2 * 1!
		//5! = 5 * 4 * 3 * 3 * 2 * 1
		
		//n!을 반복문을 사용해서 구하세요.
		
		int n = 10;
		int sum = 1;
		for(int i=n; i>=1; i--) {
			sum = sum * i;
			
			System.out.println("순차곱 결과 = " + sum);
		}
		
		// 1부터 10까지 증가하는 하나의 for문에서 홀수, 짝수의 합을 구하세요.
		
		int sum1 = 1;
		int sum2 = 1;
		for(int i=1; i>=10; i++) {
			if(sum1 % 2 == 0) {
				sum2 += i;
			} else {
				sum1 += i;
			}
		}	//end for i
		
		System.out.println("홀수의 합 = " + sum1);
		System.out.println("짝수의 합 = " + sum2);
		
	}
}
