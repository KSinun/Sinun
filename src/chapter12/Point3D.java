package chapter12;

// 3������ �� ���� ǥ���ϱ� ���� Ŭ����
public class Point3D extends Point{
	private int z;
	
	public int getZ() {
		return z;
	}
	// �������̵� : �θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��
	
	// this�� ���������� super ������ �ʰ� �޼��带 ȣ��
	
	@Override 
	public String getLocation() {
		// TODO Auto-generated method stub
		return getLocation() + ", z : " + z;
	}
	
}
