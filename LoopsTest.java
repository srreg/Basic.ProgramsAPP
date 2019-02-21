package com.regnant;

class Loops {
	public static void NumbersinAscOrder(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}

	public static void NumbersinDscOrder(int num) {
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

	public static void EvenNum(int num) {
		System.out.println();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}

	public static void OddNum(int num) {
		System.out.println();
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
	}

	public static boolean PrimeNumCheck(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void PrimeNumbers(int num) {
		for (int i = 1; i <= num; i++) {
			int fact = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					fact++;
			}
			if (fact == 2)
				System.out.print(i + " ");
		}
	}
	public static void AlterNumbers(int j, int num) {
		
		for(int i=j; i<=num; i++ ) {
			System.out.print(i+++" ");
		}
	}
	public static void Divisableby7(int rngfrom, int rngto) {
		for(int i=rngfrom; i<=rngto; i++) {
			if(i % 7 == 0)
			System.out.print(i+" ");
		}
	}
}

public class LoopsTest {

	public static void main(String[] args) {
		int num = 10;
		int j = 3;
		int rngfrom = 1;
		int rngto = 99;
		Loops.NumbersinAscOrder(num);
		System.out.println();
		Loops.NumbersinDscOrder(num);
		Loops.EvenNum(num);
		Loops.OddNum(num);
		boolean prcheck = Loops.PrimeNumCheck(num);
		if(Loops.PrimeNumCheck(num))
			System.out.println("Prime Number: "+num);
		else
			System.out.println("\nNon Prime Number: "+num);
		System.out.println(prcheck);
		System.out.print("Prime Numbers are: ");
		Loops.PrimeNumbers(num);
		System.out.print("\nAlternative Numbers are: ");
		Loops.AlterNumbers(j, num);
		System.out.print("\nNumbers which are divisable by 7 between "+rngfrom+" to "+rngto+" are: ");
		Loops.Divisableby7(rngfrom, rngto);
	}

}
