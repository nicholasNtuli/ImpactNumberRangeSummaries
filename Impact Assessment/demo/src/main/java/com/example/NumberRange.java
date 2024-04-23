package com.example;

/**
 * Return an empty string if the input array is null or empty
 * Extend the current range
 * Append the current range to the result
 * Start a new range
 * Append the last range or single number to the result
 * Append comma if not the first range
 */

 /**
  * This class provides functionality to generate a comma-delimited list of numbers, grouping consecutive numbers into ranges.
  */

 public class NumberRange {
 
     /**
      * The funtion displayed below generates a comma-delimited list of numbers, grouping consecutive numbers into ranges.
      *
      * @param numbers is an array of integers representing the input numbers
      * @return is a comma-delimited string representing the ranges of consecutive numbers
      */

     public String generateRangeList(int[] numbers) {
         if (numbers == null || numbers.length == 0) {
             return "";
         }
 
         StringBuilder resultBuilder = new StringBuilder();
         int start = numbers[0];
         int end = start;
 
         for (int i = 1; i < numbers.length; i++) {
             if (isConsecutive(numbers[i], end)) {
                 end = numbers[i]; 
             } else {
                 appendRange(resultBuilder, start, end);
                 start = end = numbers[i];
             }
         }

         appendRange(resultBuilder, start, end);
 
         return resultBuilder.toString();
     }
 
     /**
      * The function displayed below appends the range (or single number) to the StringBuilder.
      *
      * @param resultBuilder this is the StringBuilder to which the range will be appended to
      * @param start the start of the range
      * @param end the end of the range
      */

     private void appendRange(StringBuilder resultBuilder, int start, int end) {
         if (resultBuilder.length() > 0) {
             resultBuilder.append(", ");
         }
         if (start == end) {
             resultBuilder.append(start);
         } else {
             resultBuilder.append(start).append("-").append(end);
         }
     }
 
     /**
      * The function displayed below validates whether or not the current number is consecutive to the previous number.
      *
      * @param current is the current number
      * @param previous is the previous number
      * @return true if the current number is consecutive to the previous number, false otherwise
      */
     private boolean isConsecutive(int current, int previous) {
         return current == previous + 1;
     }
 }
 