package chapter10;

public class Ex8 {

	public static void main(String[] args) {
		Ex8 ex8 = new Ex8();
		simpletype1 type = new simpletype1();
		type.num1 = 10;
		
		System.out.println("before : " +type.num1);
		
		ex8.change(type);
		System.out.println("after : " + type.num1);	
		
		int[] arr = {1, 2, 3};
		
		System.out.println("before : " + arr[0]);
		ex8.change(arr);
		System.out.println("after : " + arr[0]);
 	}
	void change(int num1) {
		num1 = num1 * 10;
		System.out.println("change(int) : " + num1);	
	}
	
		void change(simpletype1 type) {
			type.num1 = type.num1 * 10;
			
			System.out.println("change(simpletype1) : " + type.num1);
			
			
			
	}
void change(int[] arr) {
	arr[0] = arr[0] * 10;
	System.out.println("change(int[]) : " + arr[0]);
	}
}
