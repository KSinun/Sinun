package chapter2;

public class Ex15 {

	public static void main(String[] args) {
		simpleType1 type1 = new simpleType1();
		type1.num1 = 10;
		simpleType1.num2 = 11;
		
		simpleType1 type2 = new simpleType1();
		type2.num1 = 20;
		simpleType1.num2 = 21;
		System.out.println(type1.num1);
		System.out.println(type2.num1);
		
		System.out.println(simpleType1.num1);
		System.out.println(simpleType1.num2);
		
		
		
	}

}
