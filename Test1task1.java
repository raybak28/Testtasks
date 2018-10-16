package by.epam.cdptr.main;

import java.util.Scanner;

public class Test1task1 {

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

		countFormula(x, y);
	}
		
		public static void countFormula(double x, double y) {
			double Fx = 0, den = 0, mod = 0;
			mod = x - (2*x / (1 + x*x*y*y));
			den = 2 + Math.abs(mod);
			
			Fx = (1 + Math.sin(x + y)* Math.sin(x + y)) / den + x;
			System.out.println("При x = " + x + " , " + " y = " + y + " , " + "Значение функции Fx = " + Fx);
		}
		
	

}
