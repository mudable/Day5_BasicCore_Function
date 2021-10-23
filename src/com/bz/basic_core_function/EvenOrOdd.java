package com.bz.basic_core_function;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("enter num:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
