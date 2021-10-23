package com.bz.basic_core_function;

import java.util.Scanner;

public class HarmonicNum {

	public static void main(String[] args) {

		double harmoninum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			harmoninum = harmoninum + (1.0 / i);
			System.out.println("Harmonic value is:" + harmoninum);
		}
	}

}
