package com.lobao.java;

import java.util.Scanner;

public class EP4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nFunc, nH;
		double valorH, salFunc;
		
		System.out.print("Enter employee number: ");
		nFunc = sc.nextInt();
		System.out.print("Enter the number of hours worked: ");
		nH = sc.nextInt();
		System.out.print("Enter the hourly rate: ");
		valorH = sc.nextDouble();
		
		salFunc = nH * valorH;
		
		System.out.print("\nNumber = " + nFunc);
		System.out.println("\nSalary = U$ " + salFunc);
		
		sc.close();

	}

}
