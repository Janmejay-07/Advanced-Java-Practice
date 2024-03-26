package com.constructor.referance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		Test t = new Test();
		A a = t::hi;
		a.m1();
		
		System.out.println("====================");
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		l.add(10);
		
		Stream<Integer> s =l.stream();
		Object [] arr = s.collect(Collectors.toList()).toArray();
		for(int i = 0; i< arr.length;i++) {
			int j = (int) arr[i];
			System.out.println(j);
		}
	}

}
