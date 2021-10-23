package com.bz.basic_core_function;

import java.util.Scanner;

public class CalculateDistance {
	 double x;
	 double y;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values:");
		double x = scan.nextInt();

		double y = scan.nextInt();

		double result = Math.sqrt(x * x + y * y);
		System.out.println("Disten is:" + result);
	}

}
