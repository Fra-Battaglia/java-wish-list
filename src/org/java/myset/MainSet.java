package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Set<Integer> rdmNums = new HashSet<>();
		Random rdm = new Random();
		
		while(rdmNums.size() < 5) {
			int value = rdm.nextInt(2, 12);
			rdmNums.add(value);
		}
		
		System.out.println(rdmNums);
	}
}
