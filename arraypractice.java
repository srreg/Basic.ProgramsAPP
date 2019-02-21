package com.regnant;

import java.util.Arrays;

public class arraypractice {
	public static void method1(int[] ar) {
		
		int len = ar.length / 2;
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar) + "   sorted" + "\n");

		if (ar.length % 2 == 0) {
			for (int i = len; i < ar.length; i++) {
				int ar1 = ar[i];
				System.out.println(ar1);
			}
			
			System.out.println("\n" + "*****************"+"\n");
			for (int i = 0; i < len; i++) {
				int ar2 = ar[i];
				System.out.println(ar2);
			}

		} else {
			for (int i = len + 1; i < ar.length; i++) {
				int ar1 = ar[i];
				System.out.println(ar1);
			}
			System.out.println("\n" + "*****************");
			System.out.println("Middle value: " + ar[len]);
			System.out.println("*****************"+"\n");

			for (int i = 0; i < len; i++) {
				int ar2 = ar[i];
				System.out.println(ar2);
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = { 1, 5, 45, 43, 89, 12 };
		method1(ar);
		System.out.println();

	}

}
