package chapter11;

public class SimpleType {
	/*
	 *  public : ��� Ŭ�������� ��� ����
	 * default : ���� ��Ű�� �� Ŭ���������� ��� ����
	 *  protected : ���� ��Ű�� �Ǵ� �ڽ� Ŭ������ ��� ����
	 *  private : ���� �ڽŸ� ��� ����
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

