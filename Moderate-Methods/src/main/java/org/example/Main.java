package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 1};
        int secondLargestNumber = secondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargestNumber);

        int[] numbersWithDuplicates = {9, 2, 3, 2, 4, 1, 5, 7, 1, 7, 7, 8, 9, 2, 9, 3};
        int[] uniqueNumbers = removeDuplicates(numbersWithDuplicates);
        System.out.println("Array with duplicates removed: " + java.util.Arrays.toString(uniqueNumbers));

        bubbleSort(uniqueNumbers);
        System.out.println("Array sorted: " + java.util.Arrays.toString(uniqueNumbers));

        String sentence = "This is a test";
        System.out.println("Reversed words: " + reverseWords(sentence));
        System.out.println("Is strong password: " + isStrongPassword("MyPassword123!"));
        System.out.println("Compressed string: " + compressString("aabcccccaaa"));

    }

    // Write a function that takes an array of integers and returns the second largest number in the array.
    public static int secondLargest(int[] arr) {
        return -99;
    }

    // Write a function that takes an array of integers and returns a new array with all duplicates removed.
    public static int[] removeDuplicates(int[] arr) {
        return null;
    }

    // Write a function that takes an array of integers and returns a HashMap
    // where the keys are the unique integers in the array and
    // the values are the number of occurrences of each integer.
    public static HashMap<Integer, Integer> countOccurrences(int[] arr) {
        return null;
    }

    // Write a function that takes an array of integers and returns the missing number in the array.
    public static int findMissingNumber(int[] arr) {
        return -99;
    }

    // Write a function that takes a string and returns the first unique character in the string.
    public static char firstUniqueCharacter(String str) {
        return '\0'; // Return null character if no unique character is found
    }

    // Write a function that takes two strings and
    // returns true if they are anagrams of each other, and false otherwise.
    public static boolean isAnagram(String str1, String str2) {
        return true; // All counts matched
    }

    // Write a function that takes an array of integers and
    // sorts it in ascending order using the bubble sort algorithm.
    public static void bubbleSort(int[] arr) {
    }

    // Write a function that takes a string and
    // returns the string with the words reversed.
    public static String reverseWords(String str) {
        return null;
    }

    // Write a function that takes a string and
    // returns true if it is a strong password, false otherwise.
    // Use the following criteria for a strong password:
    // - At least 8 characters long
    // - Contains at least one uppercase letter
    // - Contains at least one lowercase letter
    // - Contains at least one digit
    // - Contains at least one special character (e.g., !, @, #,
    public static boolean isStrongPassword(String password) {
        return false;
    }

    public static String compressString(String str) {
        return null;
    }
}