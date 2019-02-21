package com.regnant;

import java.text.DecimalFormat;

class ArrayPrograms {
	public static void PrintArrayElements(int[] arr) {
		for(int i : arr)
			System.out.print(i+" ");
	}
	public static void EvenNum(int[] arr) {
		for(int i=0; i<arr.length; i++)
			if(arr[i] % 2 ==0)
				System.out.print(arr[i]+" ");
	}
	public static void OddNum(int[] arr) {
		for(int i=0; i<arr.length; i++)
			if(arr[i] % 2 !=0)
				System.out.print(arr[i]+" ");
	}
	public static void EvenIndexElement(int[] arr) {
		for(int i=0; i<arr.length; i++)
			if(i % 2 ==0)
				System.out.println("Element Index: "+i+"	Element Value: "+arr[i]+" ");
	}
	public static void OddIndexElement(int[] arr) {
		for(int i=0; i<arr.length; i++)
			if(i % 2 !=0)
				System.out.println("Element Index: "+i+"	Element Value: "+arr[i]+" ");
	}
	public static void AlterElement(int ari, int[] arr) {
		for(int i=ari; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			++i;
		}
	}
	public static int ArraySum(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i ;
		return sum;
	}
	public static double ArrayAvg(int[] arr) {
		double sum = 0;
		for(int i : arr)
			sum += i;
		int len = arr.length;
		double avg = sum/len;
		return avg;
	}
	
}

public class ArrayProgramsTest {

	public static void main(String[] args) {
		int[] arr = { 15, 18, 43, 48, 45, 54, 81, 99, 62 };
		int ari = 1;
		ArrayPrograms.PrintArrayElements(arr);
		System.out.print("\nEven Numbers in the Given Array: ");
		ArrayPrograms.EvenNum(arr);
		System.out.print("\nOdd Numbers in the Given Array: ");
		ArrayPrograms.OddNum(arr);
		System.out.println("\n\nEven Index Elements in given Array: ");
		ArrayPrograms.EvenIndexElement(arr);
		System.out.println("\nOdd Index Elements in given Array: ");
		ArrayPrograms.OddIndexElement(arr);
		System.out.print("\nAlternate Elements in given Arry: ");
		ArrayPrograms.AlterElement(ari, arr);
		int arsum = ArrayPrograms.ArraySum(arr);
		System.out.print("\nSum of Array Elements: "+arsum);
		double aravg = ArrayPrograms.ArrayAvg(arr);
		DecimalFormat dec = new DecimalFormat("#0.00");
		System.out.print("\nAverage of Array Elements: "+dec.format(aravg));
	}
}
