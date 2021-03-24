package chapter10;

public class Ex81 {
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	int div(int num1, int num2) {
		return num1 % num2;
	}
	
	int stackAdd(int n) {
		if(n < 0 || n > 100) {
			System.out.println("asdfsdfgdfg100±îÁö");
			
			return -1;
		}
		
		int add = 0;
		
		for(int i=1; i<=n; i++) {
			add = add + n;
			
		}
		return add;
	}
	
	
	
	public static void main(String[] args) {
		Ex81 ex81 = new Ex81();
		
		int result = ex81.add(1, 1);
		System.out.println(result);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
