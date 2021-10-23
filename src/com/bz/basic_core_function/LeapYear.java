package com.bz.basic_core_function;

public class LeapYear {
	public static void main(String[] args) {
		int year=2021;
		if(year%4==0 || year%400==0 && year%100!=0) {
			System.out.println("year is a leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
