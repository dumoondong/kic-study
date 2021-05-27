package com.exam.day_0311;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrs1 = {{10,20,30},{40,50},{60}};
		System.out.println(Arrays.toString(arrs1));
		
		int[][] arrs2 = new int[3][];
		arrs2[0] = new int[] {10,20,30};
		arrs2[1] = new int[] {40,50};
		arrs2[1] = new int[] {60};
	}

}
