package com.regnant;

import java.util.Arrays;

class StringPrograms {
	public static int countWords(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static String RemoveWhitespaces(String str) {
		String s = str.replace(" ", "");
		return s;
	}

	public static char FirstRepeatedElement(String str) {
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int val = 0;
		aa: for (int i = 0; i < str.length(); i++) {
			 for (int j = i + 1; j < str.length(); j++) {
				if ((ch[i] == ch[j]) && (i != j)) {
					val = i;
				break aa;
				}
				
			}
			
		}
		return ch[val];
	}

	public static int StringtoInt(String strint) {
		int i = Integer.parseInt(strint);
		return i;
	}

	public static String InttoString(int num) {
		String str = Integer.toString(num);
		return str;
	}

	public static int[] vowelsnconsonants(String str) {
		String vow = "aeiou";
		int countvow = 0;
		char[] vow1 = vow.toCharArray();
		char[] str1 = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vow.length(); j++) {

				if (str1[i] == vow1[j]) {
					countvow++;
				}
			}
		}

		int conscount = (str1.length - countvow);
		int[] count = new int[2];
		count[0] = countvow;
		count[1] = conscount;
		return count;
	}

	public static String LowtoUpper(String str) {
		String str1 = str.toUpperCase();
		return str1;
	}

	public static String UppertoLow(String lowtoupcase) {
		String str = lowtoupcase.toLowerCase();
		return str;
	}

	public static String ReverseStr(String str) {
		String Reverse = new StringBuilder(str).reverse().toString();
		return Reverse;
	}

	public static String[] swap(String sw1, String sw2) {
		sw1 = sw1 + sw2;
		sw2 = sw1.substring(0, (sw1.length() - sw2.length()));
		sw1 = sw1.substring(sw2.length());
		String[] swap = new String[2];
		swap[0] = sw1;
		swap[1] = sw2;
		return swap;
	}
	public static void PalindromCheck(String str) {
		String Reverse = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(Reverse)) {
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not a Pallindrome");
	}
	public static void DupliChar(String str) {
		int count; char ch;
		str = str.toLowerCase();
		for(ch ='a'; ch<='z'; ch++) {
			count = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == ch)
					count++;
			}
				if(count>1)
					System.out.println("Number of Occurence of Character "+ch+" : "+count);
		}
	}
	
}

public class StringProgramsTest {
	public static void main(String[] args) {
		int num = 45;
		String str = "Welcome to java world";
		String strpalin = "satltas";
		String strint = "99";
		String sw1 = "Welcome";
		String sw2 = "Baleno";

		int cwords = StringPrograms.countWords(str);
		System.out.print("Number of words in the String: " + cwords);
		String removewhtspace = StringPrograms.RemoveWhitespaces(str);
		System.out.println("\nString removed white spaces: " + removewhtspace);
		char cntdupli = StringPrograms.FirstRepeatedElement(str);
		System.out.println("First Repeated Element in the String: " + cntdupli);
		int strtoint = StringPrograms.StringtoInt(strint);
		System.out.println("Converted value of String to Int: " + strtoint);
		String inttostr = StringPrograms.InttoString(num);
		System.out.println("Converted String from Int to String: " + inttostr);
		int[] vowelncons = StringPrograms.vowelsnconsonants(str);
		System.out.println(Arrays.toString(vowelncons));
		String lowtoupcase = StringPrograms.LowtoUpper(str);
		System.out.println("Converted Upper Case Letters are: " + lowtoupcase);
		String uppertolowcase = StringPrograms.UppertoLow(lowtoupcase);
		System.out.println("Converted Lower Case Letters are: " + uppertolowcase);
		String revstr = StringPrograms.ReverseStr(str);
		System.out.println(revstr);
		String[] sw = StringPrograms.swap(sw1, sw2);
		System.out.println("Before Swapping Elements: [" + sw1 + ", " + sw2 + "]");
		System.out.println("After Swapping Elements: " + Arrays.toString(sw));
		StringPrograms.PalindromCheck(strpalin);
		StringPrograms.DupliChar(str);
	}
}
