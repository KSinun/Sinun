package chapter12;

public class Child extends parent {
	//�θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� x
	public int x;
	public int y;
	
	public Child() {
		this(0, 0);
		
		System.out.println("�Ű������� ���� ������");
	}
	
	
	// �ڽ� Ŭ������ �ν��Ͻ��� ������� ��
	// �θ� Ŭ������ ������� ���� �����ϹǷ�
	// �ڽ� Ŭ������ �����ڸ� ����ٸ�
	// �ڽ� Ŭ������ �������� �� ó���� �θ� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�.
	
	// ��� ���迡���� �ڽ� Ŭ������ �⺻ �����ڴ�
	// �Ű������� ���� �θ�Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�.
	public Child(int x, int y) {
		System.out.println("�Ű������� �ִ� ������");
		
		this.x = x;
		this.y = y;
		
		// �⺻ �����ڸ� ���� �߰��߰�
		// �θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� �ڵ带
		// �ۼ����� �ʾҴ�.
	}

	


	public void method() {
	
	
	}

	public static void main(String[] args) {
		Child child = new Child(1, 1);
	}

}
