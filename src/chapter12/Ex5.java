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
//		// 업캐스팅 / 형변환 연산자 생략 가능
//		car = (car) null;
//		// 다운캐스팅 / 형변환 연산자 생략 불가능
//		FireEngine fe1 = new FireEngine();
//		FireEngine fe2 = null;
////     car.water();
//        car = (Car) fe1;
//        fe2 = water();
	}

}
