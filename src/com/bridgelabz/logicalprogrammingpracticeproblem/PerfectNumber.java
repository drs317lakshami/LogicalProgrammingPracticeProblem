package com.bridgelabz.logicalprogrammingpracticeproblem;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.print("Number is not perfect");
        } else {
            for (int i = 1; i < n; i++) {
                int result = checkPerfectNumber(i);
                if (i == result) {
                    System.out.println(i + "Number is perfect");
                }

            }
        }
    }

    public static int checkPerfectNumber(int n){
        int sum = 0;
        int i = 1;
        while(i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        return sum;

    }
}