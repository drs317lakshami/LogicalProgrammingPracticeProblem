package com.bridgelabz.junits;

import java.util.Scanner;

public class FahrenheitAndCelsiusConversion {

	public static void main(String arg[]) {
		double f, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1:
			 System.out.println("Enter  Fahrenheit temperature");
			f = scanner.nextDouble();
			c = (f - 32) * 5 / 9;
			System.out.println("Celsius temperature is = " + c);
			break;
		case 2:
			System.out.println("Enter  Celsius temperature");
			c = scanner.nextDouble();
			f = ((9 * c) / 5) + 32;
			System.out.println("Fahrenheit temperature is = " + f);
			break;
		default:
			System.out.println("please choose valid choice");
		}
	}
}
