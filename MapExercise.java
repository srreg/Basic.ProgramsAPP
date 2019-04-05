package com.colect.builtin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExercise {

	Map<Integer, String> maplist = new HashMap<>();
	Map<Integer, String> treemap = new TreeMap<>();

	void addmaplist() {

		maplist.put(1, "GOT");
		maplist.put(2, "Vampire Diaries");
		maplist.put(3, "VKings");
		maplist.put(4, "Originals");
		maplist.put(5, "Legacy");
		maplist.put(6, "Arrows");
	}

	void addTreemap() {
		treemap.put(3, "VKings");
		treemap.put(6, "Arrows");
		treemap.put(1, "GOT");
		treemap.put(2, "Vampire Diaries");
		treemap.put(4, "Originals");
		treemap.put(5, "Legacy");
	}

	void displayMap() {

		addmaplist();
		addTreemap();

		for (Map.Entry<Integer, String> map : maplist.entrySet()) {
			System.out.print(map + "\t");
		}
		System.out
				.println("\n-----------------------------------------------------------------------------------------");

		Set<Integer> kset = maplist.keySet();
		for (Integer id : kset) {
			String series = maplist.get(id);
			System.out.print(id + ": " + series + "\t");
		}
		System.out
				.println("\n-----------------------------------------------------------------------------------------");

		Iterator<Integer> num = kset.iterator();
		while (num.hasNext()) {
			Integer i = num.next();
			System.out.print(i + ": " + maplist.get(i) + "\t");
		}

		System.out.println(
				"\n\nTreemap-----------------------------------------------------------------------------------");
		for (Map.Entry<Integer, String> tree : treemap.entrySet()) {
			System.out.print(tree + "\t");
		}
	}
}
