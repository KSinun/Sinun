package chapter12;

public class Ex5 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		System.out.println(Fe instanceof Fireengine);
		System.out.println(Fe instanceof Car);
		System.out.println(Fe instanceof Object);
		
		Car car = new Car();
		System.out.println(car instanceof FireEngine);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Onject);
		
		
//		Car car = new Car();;
//		FireEngine fe1 = (FireEngine) car;
//		FireEngine fe2 = (FireEngine) car;
//		// ��ĳ���� / ����ȯ ������ ���� ����
//		car = (car) null;
//		// �ٿ�ĳ���� / ����ȯ ������ ���� �Ұ���
//		FireEngine fe1 = new FireEngine();
//		FireEngine fe2 = null;
////     car.water();
//        car = (Car) fe1;
//        fe2 = water();
	}

}
