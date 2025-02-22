package com.TwoDimensionalArray;

import java.util.Arrays;

public class SpiralPattern {

	public static void main(String[] args) {
		int[][] a = spiral(5);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println();
		}
//		for (int[] temp : a) {
//			for (int n : temp) {
//				System.out.print(n + "\t");
//			}
//			System.out.println();
//			
//		}
	}

	static int[][] spiral(int size) {
		int[][] a = new int[size][size];
		int row = 0;
		int column = -1;
		char dir = 'r';
		for (int i = 0; i < size * size; i++) {
			switch (dir) {
			case 'r':
				column++;
				a[row][column] = i + 1;
				if (column == size - 1 || a[row][column + 1] != 0)
					dir = 'd';
				break;
			case 'd':
				row++;
				a[row][column] = i + 1;
				if (row == size - 1 || a[row + 1][column] != 0)
					dir = 'l';
				break;
			case 'l':
				column--;
				a[row][column] = i + 1;
				if (column == 0 || a[row][column - 1] != 0)
					dir = 'u';
				break;
			case 'u':
				row--;
				a[row][column] = i + 1;
				if (a[row - 1][column] != 0)
					dir = 'r';
				break;
			}
		}
		return a;
	}
}
