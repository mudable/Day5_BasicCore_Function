package com.bz.basic_core_function;
import java.util.Scanner;
public class VowelOrConsonant {
	public static void main(String[] args) {
		char ch;
		System.out.println("enter character:");
		Scanner scan=new Scanner(System.in);
		ch=scan.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("character is vowel");
		}
			else {
				System.out.println("character is consonant");
			}
	}
}