package com.bridgelabz.junits;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("Enter the number to compute sqrt");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sqrt(num);
	}

	static void sqrt(int num) {
		double epsilon = 1E-15;
		double t = num;
		while (Math.abs(t - num / t) > epsilon * t)
			t = (num / t + t) / 2;
		 System.out.println(t);

	}
}
