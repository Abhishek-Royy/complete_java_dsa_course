# Java DSA Practice

A structured collection of **Data Structures and Algorithms (DSA) practice problems implemented in Java**.

This repository is primarily focused on building strong problem-solving skills, understanding common DSA patterns, and improving Java programming fundamentals through hands-on practice.

## 📌 Repository Overview

The repository contains Java implementations of various:

* Arrays
* Strings
* Searching algorithms
* Sorting algorithms
* Two-pointer techniques
* Sliding window techniques
* Recursion
* Linked Lists
* Stacks
* Queues
* Hashing
* Trees
* Graphs
* Dynamic Programming
* Common coding interview problems
* LeetCode-style problems

The code is written with a focus on **understanding the logic and approach**, rather than simply providing the shortest possible solution.

---



> The actual directory structure may evolve as more DSA topics and problems are added.

---

## 💡 Multiple Solutions in a Single File

Some Java files contain **multiple approaches or solutions to the same problem**.

For learning and comparison purposes, previously implemented approaches may remain commented out.

For example:

```java
// Approach 1
/*
static void reverseArray(int[] arr) {
    ...
}
*/

// Approach 2
static void reverseArray(int[] arr) {
    ...
}
```

This is intentional.

The commented code represents an **alternative implementation, previous approach, or practice solution**.

### How to use it

1. Open the required `.java` file.
2. Identify the approach you want to execute.
3. Uncomment that method/code block.
4. Comment out another implementation if it creates duplicate method/class definitions.
5. Call the required method from `main()`.
6. Compile and run the program.

This approach allows different solutions to remain available for **comparison and revision** without maintaining a separate file for every small variation.

---

## 🧠 Learning Approach

The goal of this repository is not only to solve problems but also to understand:

* How the algorithm works
* Why a particular approach works
* Time complexity
* Space complexity
* Edge cases
* Alternative approaches
* Common DSA patterns
* Java-specific implementation details

For many problems, multiple approaches may be implemented and compared.

For example:

```text
Brute Force
    ↓
Better Approach
    ↓
Optimal Approach
```

The preferred solution is generally the one that provides the best practical time and space complexity while keeping the implementation understandable.

---

## 🔥 DSA Patterns

Special attention is given to commonly used problem-solving patterns.

### Two Pointers

Used for problems involving:

* Reversing arrays
* Palindromes
* Pair problems
* Sorted arrays
* In-place modifications

Example:

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
}
```

### Sliding Window

Useful for:

* Subarray problems
* Substring problems
* Maximum/minimum window problems
* Fixed-size and variable-size windows

### Hashing

Used for:

* Frequency counting
* Duplicate detection
* Two Sum
* Fast lookup problems

### Recursion

Used to understand:

* Base cases
* Recursive calls
* Backtracking
* Tree traversal
* Divide and conquer

---

## ⏱️ Complexity Analysis

Where applicable, solutions include analysis of:

### Time Complexity

Examples:

```text
O(1)       Constant
O(log n)   Logarithmic
O(n)       Linear
O(n log n) Linearithmic
O(n²)      Quadratic
```

### Space Complexity

Extra memory used by the algorithm is also considered.

The goal is to gradually recognize when an `O(n²)` solution can be improved to `O(n)` or better.

---

## 💻 Java Version

The solutions are implemented using **Java** and primarily use standard Java features and collections.

Commonly used classes include:

```java
ArrayList
HashMap
HashSet
Queue
Stack
Deque
Arrays
Collections
```

---

## 🧪 Running the Code

Make sure Java is installed on your system.

Check your Java version:

```bash
java -version
```

Compile a Java file:

```bash
javac arrayManipulationProblem.java
```

Run it:

```bash
java arrayManipulationProblem
```

Alternatively, the code can be executed using an IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java support.

---

## 📝 Problem-Solving Workflow

For each problem, the preferred workflow is:

```text
1. Understand the problem
        ↓
2. Identify constraints
        ↓
3. Think of a brute-force solution
        ↓
4. Analyze time and space complexity
        ↓
5. Look for a better pattern
        ↓
6. Implement the optimized solution
        ↓
7. Test edge cases
        ↓
8. Compare approaches
```

This workflow helps develop problem-solving skills instead of relying only on memorized solutions.

---

## 🎯 Goals

The main goals of this repository are:

* Build strong DSA fundamentals
* Improve Java programming skills
* Practice coding consistently
* Understand algorithmic patterns
* Learn to optimize solutions
* Prepare for coding interviews
* Practice LeetCode-style problems
* Maintain a personal DSA reference for revision

---

## ⚠️ Code Organization Note

Because this repository is also used as a **learning and experimentation workspace**, some files may contain:

* Commented-out previous solutions
* Multiple approaches to the same problem
* Alternative implementations
* Test code inside `main()`
* Experimental code

This is intentional and reflects the learning process.

When running a particular solution, **uncomment the required code and ensure that only the intended implementation is active**.

As the repository grows, frequently used solutions may be separated into individual files for better organization.

---

## 📈 Progress

The repository will continuously evolve as new concepts and problems are practiced.

```text
Arrays
  ✓ Basic traversal
  ✓ Reverse array
  ✓ Array shifting
  ✓ Two-pointer basics
  → More problems

Strings
  ✓ Basic manipulation
  ✓ Longest Common Prefix
  → More problems

Searching
  → Linear Search
  → Binary Search

Sorting
  → Bubble Sort
  → Selection Sort
  → Insertion Sort
  → Merge Sort
  → Quick Sort

Linked List
  → Implementation
  → Traversal
  → Insertion
  → Deletion
  → Two-pointer problems

Trees
  → Coming soon

Graphs
  → Coming soon

Dynamic Programming
  → Coming soon
```

---

## 🚀 Long-Term Objective

The long-term objective is to build a strong foundation in **Data Structures and Algorithms using Java** by solving problems consistently and understanding the reasoning behind each solution.

> **Don't just memorize the solution. Understand the pattern, analyze the complexity, and learn why the solution works.**

---

## 📚 Practice Sources

Problems may be inspired by common DSA practice platforms and coding interview questions, including LeetCode and other programming resources.

The implementations in this repository are primarily written for **learning, practice, and revision**.

---

## 👨‍💻 Repository Status

**Status:** 🚧 Actively Learning & Updating

New problems, approaches, optimizations, and DSA concepts will be added regularly.
