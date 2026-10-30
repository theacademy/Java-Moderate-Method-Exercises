### Assignment Status: ![Build status](https://github.com/theacademy/Java-Moderate-Method-Exercises/actions/workflows/moderate.yaml/badge.svg?branch=main)

# Java Interview Practice Moderate-Methods Lab

## Overview

These practice problems are designed to mirror the types of coding exercises candidates commonly encounter during junior Java developer, backend developer, support engineer, and QA automation interviews.

---

### Find the Second Largest Number

**Difficulty:** **Moderate**

**Problem:** Return the second-largest value in an array.

**Method signature:**

```java
public static int secondLargest(int[] nums)
```

**Example:**

```text
Input:  [10, 5, 8, 20]
Output: 10
```

**Skills tested:**
- Array traversal
- Tracking multiple values

---

### Remove Duplicates from an Array

**Difficulty:** **Moderate**

**Problem:** Return an array containing only unique values.

**Method signature:**

```java
public static int[] removeDuplicates(int[] nums)
```

**Example:**

```text
Input:  [1, 1, 2, 2, 3, 4]
Output: [1, 2, 3, 4]
```

**Skills tested:**
- Arrays
- HashSet

---

### Find the Frequency of Each Element

**Difficulty:** **Moderate**

**Problem:** Count how many times each value occurs.

**Method signature:**

```java
public static HashMap<Integer, Integer> frequencyCount(int[] nums)
```

**Example:**

```text
Input: [1, 1, 2, 3, 3, 3]

Output:
1 -> 2
2 -> 1
3 -> 3
```

**Skills tested:**
- HashMap
- Counting algorithms

---

### Find the Missing Number

**Difficulty:** **Moderate**

**Problem:** One number is missing from a sequence.

**Method signature:**

```java
public static int findMissing(int[] nums)
```

**Example:**

```text
Input:  [1, 2, 3, 5]
Output: 4
```

**Skills tested:**
- Mathematical formulas
- Array logic

---

### First Non-Repeated Character

**Difficulty:** **Moderate**

**Problem:** Return the first character that appears only once.

**Method signature:**

```java
public static char firstUniqueChar(String str)
```

**Example:**

```text
Input:  "swiss"
Output: 'w'
```

**Skills tested:**
- HashMap
- String analysis

---

### Anagram Checker

**Difficulty:** **Moderate**

**Problem:** Determine if two strings contain the same letters in a different order.

**Method signature:**

```java
public static boolean isAnagram(String s1, String s2)
```

**Example:**

```text
Input:  ("listen", "silent")
Output: true
```

**Skills tested:**
- Arrays
- Sorting
- Frequency counting

---

### Bubble Sort

**Difficulty:** **Moderate**

**Problem:** Sort an array using the Bubble Sort algorithm.

**Method signature:**

```java
public static void bubbleSort(int[] nums)
```

**Example:**

```text
Input:  [5, 3, 8, 1]
Output: [1, 3, 5, 8]
```

**Skills tested:**
- Nested loops
- Sorting algorithms

---

### Reverse Words in a Sentence

**Difficulty:** **Moderate**

**Problem:** Reverse the order of words in a sentence.

**Method signature:**

```java
public static String reverseWords(String sentence)
```

**Example:**

```text
Input:  "Java is fun"
Output: "fun is Java"
```

**Skills tested:**
- String splitting
- Arrays
- StringBuilder

---

### Validate Password Strength

**Difficulty:** **Moderate**

**Problem:** Determine whether a password meets strength requirements.

**Method signature:**

```java
public static boolean isStrongPassword(String password)
```

**Requirements:**
- At least 8 characters
- One uppercase letter
- One lowercase letter
- One digit
- One special character

**Skills tested:**
- Character validation
- Regular expressions
- Conditional logic

---

### Compress a String

**Difficulty:** **Moderate**

**Problem:** Compress consecutive characters using character counts.

**Method signature:**

```java
public static String compress(String str)
```

**Example:**

```text
Input:  aaabbcccc
Output: a3b2c4
```

**Skills tested:**
- String traversal
- Counting logic
- StringBuilder

---

## Recommended Lab Structure

For each method, you should:

### Step 1: Implement the Method

Write a working solution that satisfies the requirements.

### Step 2: Create Test Cases

Check the tests written and add if you need. Write tests that validate:
- Normal input
- Edge cases
- Invalid input (if applicable)
- Empty values
- Boundary conditions

### Step 3: Identify Edge Cases

Examples include:
- Empty strings
- Null values
- Single-element arrays
- Duplicate values
- Large datasets

### Step 4: Analyze Time Complexity

Document:

```text
Time Complexity: O(?)
Space Complexity: O(?)
```

### Step 5: Refactor the Solution

Improve:
- Readability
- Variable naming
- Method organization
- Efficiency

### Step 6: Discuss Alternative Approaches

Examples:
- Loop-based vs. recursive solutions
- Arrays vs. HashMaps
- Brute force vs. optimized algorithms

## Interview Discussion Questions

After solving each problem, ask yourself:

- How does your solution work?
- What is the time complexity?
- What is the space complexity?
- What edge cases did you consider?
- How would you optimize your solution?
- Could this be solved using a different data structure?
- How would your solution perform with one million records?

These follow-up questions closely match what candidates encounter during technical interviews and coding assessments.
