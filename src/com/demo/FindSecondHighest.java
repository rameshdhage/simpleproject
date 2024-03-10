package com.demo;

import java.util.Arrays;

public class FindSecondHighest {
	
	public static void main(String[] args) {
        // Sample array
        int[] array = {1, 6, 2, 8, 3, 9, 5};

        // Find the second highest element
        int secondHighest = findSecondHighest(array);

        // Print the second highest element
        System.out.println("Second highest element: " + secondHighest);
    }

    public static int findSecondHighest(int[] array) {
        // Sort the array in ascending order
        Arrays.sort(array);

        // Get the second last element (second highest)
        return array[array.length - 2];
    }
	

}
