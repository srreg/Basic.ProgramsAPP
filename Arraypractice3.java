package com.regnant;

import java.util.Arrays;

public class Arraypractice3 {
	public static String method1(int[] ar) {
		int len = ar.length / 2;
		int len1 = ar.length;
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

		int[] ar1 = Arrays.copyOfRange(ar, len + 1, len1);
		String ob1 = Arrays.toString(ar1);

		int md = ar[len];
		String ob3 = Integer.toString(md);

		int[] ar2 = Arrays.copyOf(ar, len);
		String ob2 = Arrays.toString(ar2);

		String[] al = new String[3];
		al[0] = ob2;
		al[1] = ob3;
		al[2] = ob1;
		String ret = Arrays.toString(al);
		return ret;
	}

	public static String method2(int[] ar) {
		int len = ar.length / 2;
		int len1 = ar.length;
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

		int[] ar1 = Arrays.copyOfRange(ar, len, len1);
		String ob1 = Arrays.toString(ar1);

		int[] ar2 = Arrays.copyOf(ar, len);
		String ob2 = Arrays.toString(ar2);

		String[] al = new String[2];
		al[0] = ob2;
		al[1] = ob1;
		String ret = Arrays.toString(al);
		return ret;
	}

	public static void main(String[] args) {

		int[] ar = { 12, 15, 18, 45, 43, 81, 55, 9 };
		if (ar.length % 2 == 0) {
			String xy = method2(ar);
			System.out.println(xy);
		} else {
			String xy = method1(ar);
			System.out.println(xy);
		}

	}

}
