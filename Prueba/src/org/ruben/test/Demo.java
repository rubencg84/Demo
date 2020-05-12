package org.ruben.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data {
	
	private String name;

	public Data(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
}

public class Demo {

	public static void main(String[] args) {
	
		List<Data> list = new ArrayList<>();
		
		list.add(new Data("Koko"));
		list.add(new Data("Kiko"));
		list.add(new Data("Lolo"));
		list.add(new Data("Miku"));
		list.add(new Data("Kako"));
		
		// Classic Comparator Functional Interface implementation of compare method
		
		/*
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) { return
		 * o1.getName().compareTo(o2.getName()); }
		 * 
		 * });
		 */
		
		// Use of Lambda Expression 
		Collections.sort(list, (Data o1, Data o2)->o1.getName().compareTo(o2.getName()));
		
		for (Data data: list) {
			System.out.println(data.getName());
		}
		

	}

}
