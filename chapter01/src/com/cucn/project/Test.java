package com.cucn.project;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Random random=new Random();
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()<10) {
			int a=random.nextInt(100)+100;
			set.add(a);
		}
		for(Integer items:set) {
			System.out.println(items+" ");
		}
	}

}
