package com.bz.basic_core_function;
import java.util.Scanner;
public class PrimeFactor {
	public static void main(String[] args) {
		int num, temp, i = 2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();

		temp = num;
		System.out.println("Prime Factor of Number :");
		while (temp > 1) {
			if (temp % i == 0) {
				System.out.println(i + ",");
				temp = temp / i;
			} else {
				i++;
			}
		}

	}

}
