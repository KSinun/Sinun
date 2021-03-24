package chapter10;

public class Ex9 {
	// 세 add 매서드는 이름은 같지만 매개변수가 다르므로
	// 오버로딩된 매서드이다.
	
	// 두 정수 +
	int add(int num1, int num2) {
		return num1 + num2;
	}
	// 두 실수 +
	double add(double fnum1, double fnum2) {
	return fnum1 + fnum2;	
	}
	// 정수 + 실수
	double add(int fnum1, double fnum2) {
		return fnum1 + fnum2;	
	}
	// 실수 + 정수
	double add(double fnum1, int fnum2) {
		return fnum1 + fnum2;	
	}
	
	int num1;
	
	static int num2;
	
	
	void intstanceMemberMethod() {
		System.out.println("인스턴스 맴버 메서드");
	}
	static void classMemberMethod() {
		System.out.println("클래스 맴버 메서드");
	}
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		
		ex9.intstanceMemberMethod();
		
		Ex9.classMemberMethod();
		
		ex9.add(1, 1);
		
		ex9.add(1, 0.1);
		
		ex9.add(0.1, 0.1);
		
		ex9.add(0.1, 1);
	}

}
