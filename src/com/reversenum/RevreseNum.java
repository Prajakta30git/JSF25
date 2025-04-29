package com.reversenum;

import java.util.Scanner;

public class RevreseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number here: ");
		int n = sc.nextInt();
		int rev = 0;
		while (n > 0) {
			// logic of reverse number
			rev = (rev * 10) + n % 10;
			n = n / 10;

		}
		System.out.println("The reverse of given number is: " + rev);
	}
}