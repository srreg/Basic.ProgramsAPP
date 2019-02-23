package com.regnant;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class ArrayMediumPrograms {
	public static boolean PrimeNumCheck(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static int[] ReverseElements(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = arr.length - 1, j = 0; (i >= 0) && j < arr.length; i--, j++) {
			arr1[i] = arr[j];
		}
		return arr1;
	}

	public static void CopyElements(int[] arr) {
		int[] arr1 = arr.clone();
		System.out.println(Arrays.toString(arr1));
	}

	public static int Repetations(int[] arr, int check) {
		int rptcount = 0;
		for (int i : arr)
			if (i == check)
				rptcount++;
		return rptcount;
	}

	public static Object[] DelElement(int[] arr, int eleindex) {
		List<Integer> duparr = new ArrayList<Integer>();
		for (int i : arr)
			duparr.add(Integer.valueOf(i));
		duparr.remove(eleindex);
		Object[] arr1 = duparr.toArray();
		return arr1;
	}

	public static int LargeNumber(int[] arr) {
		/*
		 * int max = arr[0]; for(int i =1; i<arr.length; i++) if(arr[i] > max) max =
		 * arr[i]; return max;
		 */
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		return max;
	}

	public static int SecondLrgNumber(int[] arr) {
		/*
		 * int max = arr[0]; int smax = arr[0]; for(int i = 1; i<arr.length; i++){
		 * if(arr[i] > max) { smax = max; max = arr[i]; } else if(arr[i] > smax) smax =
		 * arr[i]; } return smax;
		 */
		Arrays.sort(arr);
		int smax = arr[arr.length - 2];
		return smax;
	}

	public static int NMax(int[] nmaxarr, int n) {
		List<Integer> nMax = new ArrayList<Integer>();
		int current = nmaxarr[0];
		boolean found = false;

		for (int i = 0; i < nmaxarr.length; i++) {
			if (current == nmaxarr[i] && !found) {
				found = true;
			} else if (current != nmaxarr[i]) {
				nMax.add(current);
				current = nmaxarr[i];
				found = false;
			}
		}
		Collections.sort(nMax);
		int len = nMax.size();
		int nmax = nMax.get(len - (n - 1));
		return nmax;
	}

	public static void InserElementSpecified(int[] arr, int pos, int element) {
		int[] arra = Arrays.copyOf(arr, arr.length + 1);
		for (int i = (arra.length); i > pos; i--) {
			arra[i - 1] = arr[i - 2];
		}
		arra[pos - 1] = element;
		for (int updt : arra)
			System.out.print(updt + " ");
	}

	public static void SortAsc(int[] arra) {
		Arrays.sort(arra);
		for (int i : arra)
			System.out.print(i + " ");
	}

	public static void SortDsc(int[] arra) {
		Arrays.sort(arra);
		for (int i = arra.length - 1; i >= 0; i--)
			System.out.print(arra[i] + " ");
	}

	public static void SortAscString(String[] str) {
		Arrays.sort(str);
		for (String names : str)
			System.out.print(names + " ");
	}

	public static void AlterPositNegit(int[] array) {
		List<Object> PositiveNumbers = new ArrayList<Object>();
		List<Object> NegativeNumbers = new ArrayList<Object>();
		List<Object> Alternatearry = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0)
				PositiveNumbers.add(array[i]);
			else if (array[i] < 0)
				NegativeNumbers.add(array[i]);
		}

		Object[] PositiveNumbers1 = PositiveNumbers.toArray();
		Object[] NegativeNumbers1 = NegativeNumbers.toArray();

		Arrays.sort(PositiveNumbers1);
		Arrays.sort(NegativeNumbers1);
		System.out.println("\n" + Arrays.toString(PositiveNumbers1));
		System.out.println(Arrays.toString(NegativeNumbers1));
		for (int i = 0; i < array.length/2; i++) {

			Alternatearry.addAll(Arrays.asList(NegativeNumbers1[i], PositiveNumbers1[i]));

		}
		System.out.println(Alternatearry);
	}
}

public class ArrayMediumProgramsTest {

	public static void main(String[] args) {
		int[] arr = { 15, 7, 43, 89, 18, 87, 54, 99, 45 };
		int[] arra = { 15, 7, 43, 89, 18, 87, 54, 99, 45 };
		int[] array = { 12, -22, 43, 545, -4, -55, 15, 369, -99, -87 };
		String[] str = { "Sateesh", "Sandeep", "Rohit", "Sudarshan", "Karthik", "Sharma", "Vishnu", "Pooja" };
		int check = 45;
		int eleindex = 8;
		int n = 3;
		int pos = 4;
		int element = 48;
		System.out.print("Prime Numbers in Given Array: ");
		for (int i : arr)
			if (ArrayMediumPrograms.PrimeNumCheck(i)) {
				System.out.print(i + " ");
			}
		int[] arr1 = ArrayMediumPrograms.ReverseElements(arr);
		System.out.print("\nReverse Elements in an Array: " + Arrays.toString(arr1));
		System.out.print("\nCopied Elements from another Array: ");
		ArrayMediumPrograms.CopyElements(arr);
		int count = ArrayMediumPrograms.Repetations(arr, check);
		System.out.println("Count of Repetations of an Element " + check + ": " + count);
		Object[] updArray = ArrayMediumPrograms.DelElement(arr, eleindex);
		System.out.println("Updated Array: " + Arrays.toString(updArray));
		int large = ArrayMediumPrograms.LargeNumber(arr);
		System.out.println("Large Element in Array: " + large);
		int secondlarge = ArrayMediumPrograms.SecondLrgNumber(arr);
		System.out.println("Second Large Element in Array: " + secondlarge);
		int nlarge = ArrayMediumPrograms.NMax(arr, n);
		System.out.print(n + "th Large Element in Array: " + nlarge);
		System.out.print("\nAfter Inserting Specified Element: ");
		ArrayMediumPrograms.InserElementSpecified(arr, pos, element);
		System.out.print("\nSorted Array in Asc Order: ");
		ArrayMediumPrograms.SortAsc(arra);
		System.out.print("\nSorted Array in Dsc Order: ");
		ArrayMediumPrograms.SortDsc(arra);
		System.out.print("\nSorted Names in Alphabetical Order: ");
		ArrayMediumPrograms.SortAscString(str);
		ArrayMediumPrograms.AlterPositNegit(array);

	}

}
