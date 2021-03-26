package chapter13;

public class Animal {
	private String name;
	// ����� ����(0: �ſ�����, 10: �ſ� ��θ�)
	private
	public Animal() {
		this("animal");
	}
	
	public Animal(Stirng name) {
		this.name = name;
	}
	
	public String getMyName() {
		return name;
	}
	
	public abstract void run();
	public abstract void findFood();	
	public abstract void eatFood();	
	
	// �������� ����� �� ������ ã�Ƽ� �����Ƿ�
	// eat �ż��带 ����ؼ� ������ٸ� ( if(hungry <= 5) )
	// ������ ã�� �Ե��� �����Ͽ���.
	// �̶�, ������ ���� ������ ã�� ����� �� �ٸ��Ƿ� findFood �޼���� �߻�޼����
	// ������ ���� ������ �Դ� ����� �� �ٸ��Ƿ� eatfood �޼���� �߻�޼���� �����Ͽ���
	public void eat() {
		if(hungry <= 5) {
			//������ ã�´�
			findFood();
			// ������ �Դ´�
			eatFood();
		}
	}
 	
}
