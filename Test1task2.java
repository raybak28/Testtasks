package by.epam.cdptr.main;

import java.util.Scanner;

class Test1task2 {

	public static void main(String[] args) {

        double x = 0, y = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите x :");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		System.out.println("Введите y :");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}

		definePaintedField(x, y);
	}

	public static void definePaintedField(double x, double y) {
		
		if (((x >= -2)&&(x <= 2)&&(y >= 0)&&(y <= 5))||((x >= -6)&&(x <= 6)&&(y <=0)&&(y >= -3)))     {
			System.out.println("True");
		} else {
			System.out.println("False");
		
		}
	
	}
}


