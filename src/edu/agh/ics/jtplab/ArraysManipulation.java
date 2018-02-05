package edu.agh.ics.jtplab;

import java.util.Arrays;
import java.util.Random;

public class ArraysManipulation {
	
	private static final int MAX = 100;
	
	private int[] array;

	public ArraysManipulation(int n) {
		Random random = new Random();
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(MAX);
		}
	}
	
	public ArraysManipulation(int... array) {
		this.array = array;
	}
	
	public int getMax(){
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return "ArraysManipulation [array=" + Arrays.toString(array) + "]";
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: <max-int>");
			System.exit(-2);
		}
		Integer max = null;
		try {
			max = Integer.parseInt(args[0]);
		} catch (NumberFormatException ex) {
			System.err.println("Invalid argument: " + args[0]);
			System.exit(-3);
		}
		ArraysManipulation am = new ArraysManipulation(max);
		System.out.println(am);
		System.out.println(am.getMax());
		
		ArraysManipulation bm = new ArraysManipulation(10,12,5,8,19,15,20);
		System.out.println(bm);
		System.out.println(bm.getMax());
		
	}

}
