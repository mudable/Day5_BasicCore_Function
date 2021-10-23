package com.bz.basic_core_function;

import java.util.Scanner;

public class Array {
	Scanner sc = new Scanner(System.in);

	public void integerArray() {
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns");
		int column = sc.nextInt();
		int[][] array = new int[row][column];
		int i, j, k, l;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.println("Enter the  array elements of row " + i + " and column " + j);
				array[i][j] = sc.nextInt();
			}
		}
		for (k = 0; k < array.length; k++) {
			for (l = 0; l < array[k].length; l++) {
				System.out.print(array[k][l] + " ");
			}
			System.out.println();
		}
	}

	public void booleanArray() {
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns");
		int column = sc.nextInt();

		Boolean[][] array = new Boolean[row][column];
		int i, j, k, l;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.println("Enter the  array elements of row " + i + " and column " + j);
				array[i][j] = sc.nextBoolean();
			}
		}

		for (k = 0; k < array.length; k++) {
			for (l = 0; l < array[k].length; l++) {
				System.out.print(array[k][l] + " ");
			}
			System.out.println();
		}
	}

	public void doubleArray() {

		System.out.println("Enter the number of rows");

		int row = sc.nextInt();
		System.out.println("Enter the number of columns");
		int column = sc.nextInt();
		double[][] array = new double[row][column];
		int i, j, k, l;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.println("Enter the  array elements of row " + i + " and column " + j);
				array[i][j] = sc.nextDouble();
			}
		}

		for (k = 0; k < array.length; k++) {
			for (l = 0; l < array[k].length; l++) {
				System.out.print(array[k][l] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Array obj = new Array();
		obj.integerArray();
		obj.booleanArray();
		obj.doubleArray();
	}

}
