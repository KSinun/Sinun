package chapter11;

public class SimpleType {
	/*
	 *  public : 모든 클래스에서 사용 가능
	 * default : 같은 패키지 내 클래스에서만 사용 가능
	 *  protected : 같은 패키지 또는 자식 클래스만 사용 가능
	 *  private : 오직 자신만 사용 가능
	 */
	public int num1;
	int num2;
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	void func2() {
		System.out.println("func2");
	}
	private void func3() {
		System.out.println("func3");
	}
}

