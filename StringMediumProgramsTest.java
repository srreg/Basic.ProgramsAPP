package com.regnant;

import java.util.Arrays;

class StringMediumPrograms{
	public static int OccurrencesOfCharacter(String str, String s) {
		int count = ((str.length()) - (str.replace(s, "").length()));
		return count;
	}
	public static void Anagram(String str, String stra) {
		char[] ch1 = str.toCharArray();
		char[] ch2 = stra.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s1 = String.copyValueOf(ch1);
		String s2 = String.copyValueOf(ch2);
		if(s1.length() != s2.length())
			System.out.println("Not applicable words to check Anagram Condition");
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Given are Anagram Words");
		else
			System.out.println("Given are not Anagram words");
		
	}
}

public class StringMediumProgramsTest {

	public static void main(String[] args) {
		String str = "Welcome To Java World";
		String s = "o";
		String stra = "listen";
		String stra1 = "silent";
		int count = StringMediumPrograms.OccurrencesOfCharacter(str, s);
		System.out.println("Occurrences Of Character "+s+" : "+count);
		StringMediumPrograms.Anagram(stra1, stra);
	}

}
