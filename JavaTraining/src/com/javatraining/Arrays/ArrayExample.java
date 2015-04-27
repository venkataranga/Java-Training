package com.javatraining.Arrays;

public class ArrayExample {
	public static void main(String args[]) {
		int[] marks = new int[4];
		marks[0] = 40;
		marks[1] = 0;
		marks[2] = 50;
		marks[3] = 90;
		System.out.println(marks[3]);
		int[] mark = { 20, 40, 85, 99 };
		System.out.println(mark[3]);
		String[] s = new String[2];
		s[0] = "luv";
		s[1] = "Sri";
		System.out.println(s[0] + s[1]);

		int[][] mar = new int[1][3];
		mar[0] = new int[10];

		mar[0][0] = 10;
		mar[0][1] = 20;
		mar[0][2] = 30;
		// mar[0][3]= 40;
		System.out.println(mar[0][1] + " " + mar[0][3]);
		int[][] ma = { { 1, 2, 3 }, { 4, 5, 6 }};
		System.out.println(ma[1][1]);
		int rows = 1;
		int columns = 3;
		int i, j;
		// how to print whole array using below login
		System.out.println("Printing MAR Array");
		for (i = 0; i <ma.length; i++) {
			for (j = 0; j < ma[i].length; j++) {
				System.out.println("ma["+i+"]["+j+"]: "+ma[i][j] + "");
			}
			System.out.println("");
		}
	}

}
