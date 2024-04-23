package com.example;

/**
 * Create an instance of the NumberRange class
 * Define an array of integers
 * Call the generateRangeList method with the array of integers
 * Print the result
 */

public class Main {

    /**
     * The main method displayed below demonstrats the functionality of the generateRangeList of the NumberRange.
     */

    public static void main(String[] args) {
        
        NumberRange numberRange = new NumberRange();
        
        int[] numbers = {1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31};

        String result = generateRangeList(numberRange, numbers);

        System.out.println(result);
    }

    /**
     * The following function generates a comma-delimited list of numbers using the NumberRange class.
     * 
     * @param numberRange the NumberRange instance used to generate the range list
     * @param numbers is the array if the integers representing the input numbers
     * @return this is the comma-delimited string representing the ranges of the consecutive numbers
     */
    
    private static String generateRangeList(NumberRange numberRange, int[] numbers) {
        return numberRange.generateRangeList(numbers);
    }
}