package chapter2;

import java.util.Arrays;

public class Ex19 {

	public static void main(String[] args) {
		int num1 = 10;
		
		int[] arr1 =  new int[2];
		arr1[0] =  num1;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));

		num1++;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		Student student = new Student();
		student.name = "��ö��";
		
		Student[] studentList = new Student[2];
		studentList[0] = student;
		
		System.out.println(student.name);
		System.out.println(studentList[0].name);
		
		student.name = "������";
		
		System.out.println(student.name);
		System.out.println(studentList[0].name);
	}

}
