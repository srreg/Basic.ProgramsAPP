package com.colect.builtin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExercise {

	List<String> arlist = new ArrayList<>();
	List<Integer> linlist = new LinkedList<>();

	void arrlist() {
		arlist.add("Matt");
		arlist.add("Lark");
		arlist.add("Enzo");
		arlist.add("Taylor");
		arlist.add("Mark");
		arlist.add("Sherif");
		arlist.remove(4);
	}

	void linkedlist() {
		linlist.add(15);
		linlist.add(18);
		linlist.add(9);
		linlist.add(89);
		linlist.add(36);
		linlist.add(56);
		linlist.add(77);
		linlist.remove(6);
	}

	void arrlistdisplay() {

		arrlist();
		linkedlist();

		System.out.print("ArrayList Using Iterator: ");
		Iterator<String> it = arlist.iterator();
		String name1;
		while (it.hasNext()) {
			name1 = it.next();
			System.out.print(name1 + "\t");
		}

		System.out.println("\n");
		System.out.print("ArrayList Using List Iterator: ");
		ListIterator<String> lit = arlist.listIterator(5);
		while (lit.hasPrevious()) {
			name1 = lit.previous();
			System.out.print(name1 + "\t");
		}

		System.out.println("\n");
		System.out.print("ArrayList Using For enhancement: ");
		for (String name : arlist) {
			System.out.print(name + "\t");
		}

		System.out.println("\n");
		System.out.print("LinkedList Using Iterator: ");
		Iterator<Integer> iti = linlist.iterator();
		while (iti.hasNext()) {
			Integer num = iti.next();
			System.out.print(num + "\t");
		}

		System.out.println("\n");
		System.out.print("LinkedList Using For Enhancement: ");
		for (Integer num : linlist) {
			System.out.print(num + "\t");
		}

		Collections.sort(arlist);
		System.out.println("\n\n" + arlist);

		Collections.sort(linlist);
		System.out.println("\n\n" + linlist);
	}
}