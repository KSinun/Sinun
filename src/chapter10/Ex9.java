package chapter10;

public class Ex9 {
	// �� add �ż���� �̸��� ������ �Ű������� �ٸ��Ƿ�
	// �����ε��� �ż����̴�.
	
	// �� ���� +
	int add(int num1, int num2) {
		return num1 + num2;
	}
	// �� �Ǽ� +
	double add(double fnum1, double fnum2) {
	return fnum1 + fnum2;	
	}
	// ���� + �Ǽ�
	double add(int fnum1, double fnum2) {
		return fnum1 + fnum2;	
	}
	// �Ǽ� + ����
	double add(double fnum1, int fnum2) {
		return fnum1 + fnum2;	
	}
	
	int num1;
	
	static int num2;
	
	
	void intstanceMemberMethod() {
		System.out.println("�ν��Ͻ� �ɹ� �޼���");
	}
	static void classMemberMethod() {
		System.out.println("Ŭ���� �ɹ� �޼���");
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
