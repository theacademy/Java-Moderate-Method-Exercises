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
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    // Write a function that takes an array of integers and returns a new array with all duplicates removed.
    public static int[] removeDuplicates(int[] arr) {
        return java.util.Arrays.stream(arr).distinct().toArray();
    }

    // Write a function that takes an array of integers and returns a HashMap
    // where the keys are the unique integers in the array and
    // the values are the number of occurrences of each integer.
    public static HashMap<Integer, Integer> countOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int num : arr) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        return occurrences;
    }

    // Write a function that takes an array of integers and returns the missing number in the array.
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The missing number
    }

    // Write a function that takes a string and returns the first unique character in the string.
    public static char firstUniqueCharacter(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // Return null character if no unique character is found
    }

    // Write a function that takes two strings and
    // returns true if they are anagrams of each other, and false otherwise.
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character in the first string
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrease the count based on the second string
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Character not found in first string
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) < 0) {
                return false; // More occurrences in second string than in first
            }
        }

        return true; // All counts matched
    }

    // Write a function that takes an array of integers and
    // sorts it in ascending order using the bubble sort algorithm.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Write a function that takes a string and
    // returns the string with the words reversed.
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
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
        if (password.length() < 8) {
            return false; // Password must be at least 8 characters long
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static String compressString(String str) {
        if (str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }
}