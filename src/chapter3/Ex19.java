package chapter3;

public class Ex19 {
	public static void main(String[] args) {
		// �ʱ�� �ڸ��� ������ ������ for �������� ����� �� �ִ�.
		// ���� ���� : �ʱ�� -> ���ǽ� -> ������ -> ���ǽ� -> ������ -> ���ǽ� -> ...
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
		
		
		//factorial - ��������
		// 1! = 1
		//n! = n * (n-1)!
		//3! = 3 * 2 * 1!
		//5! = 5 * 4 * 3 * 3 * 2 * 1
		
		//n!�� �ݺ����� ����ؼ� ���ϼ���.
		
		int n = 10;
		int sum = 1;
		for(int i=n; i>=1; i--) {
			sum = sum * i;
			
			System.out.println("������ ��� = " + sum);
		}
		
		// 1���� 10���� �����ϴ� �ϳ��� for������ Ȧ��, ¦���� ���� ���ϼ���.
		
		int sum1 = 1;
		int sum2 = 1;
		for(int i=1; i>=10; i++) {
			if(sum1 % 2 == 0) {
				sum2 += i;
			} else {
				sum1 += i;
			}
		}	//end for i
		
		System.out.println("Ȧ���� �� = " + sum1);
		System.out.println("¦���� �� = " + sum2);
		
	}
}
