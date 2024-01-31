package com.demo;

import java.util.Scanner;

public class User {
	static int[] arr = new int[3];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter a number");

			int num = scanner.nextInt();
			arr[i] = num;

		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
