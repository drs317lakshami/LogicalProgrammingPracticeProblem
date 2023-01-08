package com.bridgelabz.logicalprogrammingpracticeproblem;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scanner.nextInt();
		System.out.println("Reverse Number is: " + checkReverseNumber(num));
	}

	public static int checkReverseNumber(int num) {
		int rev = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		return rev;
	}
}