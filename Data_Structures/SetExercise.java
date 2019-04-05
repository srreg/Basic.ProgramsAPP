package com.colect.builtin;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise {

	Set<String> name = new HashSet<>();
	Set<Integer> tname = new TreeSet<>();

	void addHashSet() {

		name.add("Arya");
		name.add("Sansa");
		name.add("Kalesi");
		name.add("Cersei");
		name.add("Tyrion");
		name.add("Riddik");
	}

	void addTreeSet() {

		tname.add(68);
		tname.add(15);
		tname.add(9);
		tname.add(81);
		tname.add(36);
		tname.add(18);
		tname.add(89);
	}

	void displaySet() {

		addHashSet();
		addTreeSet();

		Iterator<String> it = name.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.print(name + "\t");
		}

		System.out.println("\n-----------------------------------------------");
		for (String names : name) {
			System.out.print(names + "\t");
		}

		System.out.println("\n---------------------------------------------------");
		for (Integer num : tname) {
			System.out.print(num + "\t");
		}
	}
}
