package chapter12;

// ����� ������ �θ� Ŭ������ �ִ� ��κ��� �ɹ� ������ �ɹ� �޼��带 ����� �� �ִ�.
// �θ� Ŭ������ ���ǵǾ��ִ� �����ڴ� ��� ���� �� ����.
// pirvate ���� �����ڷ� �Ǿ��ִ� ��� ����, �޼��� ����� �ޱ�� ������
// �ڽ� Ŭ������ ������ �� ���� ����� ���·� ����� �޴´�.
public class B extends A {

		public void showNum1() {
			System.out.println(this.num1);
			
			System.out.println(getNum2());
			
			setNum2(10);
		}
	
}
