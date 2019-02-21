package com.regnant;

import java.util.Arrays;

public class arraypractice1 {
	public static void method1() {
		int[] ar = { 1, 5, 45, 43, 89, 12, 27, 18 };
		int len = ar.length / 2;
		int len1 = ar.length;
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar) + "   sorted" + "\n");

		if (ar.length % 2 == 0) {
			int[] ar1 = Arrays.copyOfRange(ar ,len, len1);
			for(int i : ar1) {
				System.out.println(i);
			}
			
			System.out.println("\n" + "*****************"+"\n");
			int[] ar2 = Arrays.copyOf(ar, len);
			for(int i : ar2) {
				System.out.println(i);
			}

		} else {
			int[] ar1 = Arrays.copyOfRange(ar, len+1, len1);
			for(int i : ar1) {
				System.out.println(i);
			}
			System.out.println("\n" + "*****************");
			System.out.println("Middle value: " + ar[len]);
			System.out.println("*****************"+"\n");
			int[] ar2 = Arrays.copyOf(ar, len);
			for(int i : ar2) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		method1();
		System.out.println();

	}

}
