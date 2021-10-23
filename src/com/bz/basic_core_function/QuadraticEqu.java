package com.bz.basic_core_function;

import java.util.Scanner;

public class QuadraticEqu {
	double a;
	double b;
	double c;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values:");
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();

		double disc = Math.pow(b, 2) - 4 * a * c;
		if (disc >= 0) {
			double x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			double y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

			System.out.println("Root 1 of x :" + x);
			System.out.println("Root 2 of x:" + y);
		} else
			System.out.println("not a real root");
	}
}