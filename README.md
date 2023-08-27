# Index
- [Case types](#case-types)
- [Python](#python)
    - [Discord Bot](#discord-bot)
        - [Functions needed](#functions-needed)
        - [os](#os)
    - [Programming \& DSA using Python](#programming--dsa-using-python)
- [C](#c)
    - [notes.txt -](#notestxt--)
    - [Programs](#programs)
- [C++](#c-1)
- [Java](#java)
    - [DSA BootCamp: **Assignment-02**](#dsa-bootcamp-assignment-02)
    - [DSA BootCamp: **Assignment-03**](#dsa-bootcamp-assignment-03)
        - [Easy](#easy)
        - [Intermediate](#intermediate)
    - [DSA BootCamp: **Assignment-04**](#dsa-bootcamp-assignment-04)
    - [DSA BootCamp: **Assignment-05**](#dsa-bootcamp-assignment-05)
    - [DSA BootCamp: **Assignment-06**](#dsa-bootcamp-assignment-06)
        - [Easy](#easy-1)
        - [Medium](#medium)
- [Kotlin](#kotlin)
- [HTML](#html)
    - [./**Coffee-Junkie**: Company webpage](#coffee-junkie-company-webpage)
- [CSS](#css)
- [JavaScript](#javascript)
    - [./React.js](#reactjs)
- [Shell](#shell)
- [Android](#android)
    - [1\_ActivityLifecycle](#1_activitylifecycle)
    - [2\_Module3Project](#2_module3project)
    - [3\_Bookhub](#3_bookhub)
- [Swift](#swift)
- [Platforms](#platforms)
    - [Exercism](#exercism)
        - [Java](#java-1)
        - [Kotlin](#kotlin-1)
        - [JavaScript](#javascript-1)
    - [GeeksForGeeks](#geeksforgeeks)
    - [LeetCode](#leetcode)
- [Blogs](#blogs)
    - [Hashnode](#hashnode)

## Case types
camelCase | variables, methods
PascalCase | Classes


## Python
notes.txt - 
1.py Print output of division as integer (A//B).

### Discord Bot
local.py: Local bot.
remote.py: Remote bot.
announcement.py: Broadcasts announcements & system status.
run_remote.py: Keeps the remote bot online.
test.py: Test bot.

example.py: Help.
#### Functions needed
Line #: Functionality

(Universal > Discord)
#13: Defines a client event.
#18: Runs once the bot is ready.
#32: Send a message to a specific text channel as soon as the bot is ready.
#19: Change bot status (online, idle, dnd)
#72: Make the bot reply only to the users, not to other bots or itself.
#33: Welcome a new user.
> time
#45: Create a function that keeps running after specific intervals of time.

#56: Reply to a specific message.
#60-#70: Reply with another string - 
#67: Ignore messages sent by bots.
#60: If a message matches a string.
#64: If a message starts with a string.
#68: If a message contains a string.
> os
#80: Run a command on the system & return the output.

#81: Reply to the sender.
#83: Reply to the sender but don't mention.
#88: Send messages to a specific channel.
#94: Delete the last x messages with a specific bot command.
#### os
#Last line: Specify the bot token.
1. Prints 'Hello world!'.
2. HackerRank program.
3. Functions for:
   - Convert a string to lowercase, uppercase & title case. Split a string into n parts using a separator. 
   - Variations of the print() function.
   - Variations of the for loop.
4. Basic operation on 1-D & 2-D lists.
   - Finding list length.
   - Sort the list in ascending & descending (reverse) order.
5. Error detection using try-except.
6. Create a dictionary, print values.
7. Print a single element multiple times.
8. Taking variables as input.
9. Print the data types of the variables.
10. Multi-line strings.
11. Printing characters at a specific index in a string.
12. Formatting Strings
13. String methods.
14. Print 'Eligible for Loan' if the applicant has high income and cood credit.
15. Weight Convertor.
16. While loop
17. Guessing game, if the user guesses the correct number, he wins.
18. Car Game!
19. For loops
20. Printing the alphabet 'F' & 'L' using for loop.
21. Find the largest element in a list
22. Linear Search
23. Binary Search
24. 2D lists
25. Operations on lists
26. Insert only those numbers in the 2nd list, whiare not present in the 1st list.
27. Tuples in Python
28. Dictionary
29. Input a number, return the numbers in words.
30. Keyword parameters in functions.
31. Unit Convertor. Functions:
    - Temperature <br>

32. Return statement
33. Emoji convertor using function.
34. Exception handling.
35. Classes
36. Create a class 'Person':
    - Attribute: name
    - Method: `talk()`
37. Inheritance & pass keyword.
38. Contains:
    - `find_max() & find_min()`
    - Both these methods take a list as input, and return the largest & smallest integer respectively.
39.py: Import '38.py' and print the largest & smallest number in a list.

### Programming & DSA using Python
1. A program to implement Greatest Common Divisor (GCD).
2. Optimising 1.py
3. GCD v3
4. GCD v4
5. Find the position of an element in a list (using functions).
6. Binary Search using Recursion.
7. Selection Sort.
8. Insertion Sort.
9. NPTEL Week 2 Assignment:
   - A positive integer m can be partitioned as primes if it can be written as p + q where p > 0, q > 0 and both p and q are prime numbers. Write a Python function primepartition(m) that takes an integer m as input and returns True if m can be partitioned as primes and False otherwise. (If m is not positive, your function should return False).
   -  Write a function matched(s) that takes as input a string s and checks if the brackets "(" and ")" in s are matched: that is, every "(" has a matching ")" after it and every ")" has a matching "(" before it. Your function should ignore all other symbols that appear in s. Your function should return True if s has matched brackets and False if it does not.
   - A list rotation consists of taking the first element and moving it to the end. For instance, if we rotate the list [1,2,3,4,5], we get [2,3,4,5,1]. If we rotate it again, we get [3,4,5,1,2]. Write a Python function rotatelist(l,k) that takes a list l and a positive integer k and returns the list l after k rotations. If k is not positive, your function should return l unchanged. Note that your function should not change l itself, and should return the rotated list.

10. NPTEL Week 3 Assignment:
    - Define a Python function remdup(l) that takes a nonempty list of integers l and removes all duplicates in l, keeping only the last occurrence of each number.
      ```python
      remdup([3,1,3,5])
      # Output: [1, 3, 5]
      ```
    - Write a Python function splitsum(l) that takes a nonempty list of integers and returns a list [pos,neg], where pos is the sum of squares all the positive numbers in l and neg is the sum of cubes of all the negative numbers in l.
      ```python
      splitsum([1,3,-5])
      # Output: [10, -125]
      ```

    - A two dimensional matrix can be represented in Python row-wise, as a list of lists: each inner list represents one row of the matrix.
      ```python
      # Example Matrix: 
      #   1  2  3
      #   4  5  6 
      #   7  8  9
      # ... would be represented as:
      [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
      ```
      A horizonatal flip reflects each row. For instance, if we flip the previous matrix horizontally, we get
      ```python
      #   3  2  1
      #   6  5  4 
      #   9  8  7
      #   ...which would be represented as:
      [[3, 2, 1], [6, 5, 4], [9, 8, 7]].
      ```

      A vertical flip reflects each column. For instance, if we flip the previous matrix that has already been flipped horizontally, we get

      ```python
      #  9  8  7
      #  6  5  4 
      #  3  2  1
      #  ...which would be represented as:
      [[9, 8, 7], [6, 5, 4], [3, 2, 1]].
      ```
      Write a Python function matrixflip(m,d) that takes as input a two dimensional matrix m and a direction d, where d is either 'h' or 'v'. If d == 'h', the function should return the matrix flipped horizontally. If d == 'v', the function should retun the matrix flipped vertically. For any other value of d, the function should return m unchanged.
11. Tuples in Python
12. NPTEL Week 4 Assignment:
    - We have a list of annual rainfall recordings of cities. Each element in the list is of the form (c,r) where c is the city and r is the annual rainfall for a particular year. The list may have multiple entries for the same city, corresponding to rainfall recordings in different years. Write a Python function rainaverage(l) that takes as input a list of rainfall recordings and computes the avarage rainfall for each city. The output should be a list of pairs (c,ar) where c is the city and ar is the average rainfall for this city among the recordings in the input list. Note that ar should be of type float. The output should be sorted in dictionary order with respect to the city name.
    - A list in Python can contain nested lists. The degree of nesting need not be uniform. For instance [1,2,[3,4,[5,6]]] is a valid Python list. Write a Python function flatten(l) that takes a nonempty list of lists and returns a simple list of all the elements in the nested lists, flattened out. You can make use of the following function that returns True if its input is of type list.
        ```python
        def listtype(l):
          return(type(l) == type([]))
        ```        
      Here are some examples to show how flatten(l) should work.
      ```python
      flatten([1,2,[3],[4,[5,6]]])
      # Output: [1, 2, 3, 4, 5, 6]

      flatten([1,2,3,(4,5,6)])
      # Output: [1, 2, 3, (4, 5, 6)]
      ```

13. Merge Sort
14. List Difference using Merge Sort.
15. List comprehension in Python.
16. Exception handling in Python.
17. Arguments for the print() statement.
18. File Handling in Python.
19. pass & del
20. 8-Queens
21. Next Permutation
22. Classes and objects
23. Linked List
24. Binary Search Tree (PENDING)
25. Dynamic Programming (Fibonacci)

## C
### notes.txt - 
1. Format Specifiers (for use in scanf and printf)
2. How to scale float/double to n decimel spaces

### Programs
1. Sorts the numbers in ascending order.
2. Performs basic calculator operations `- +,-,*,/,%`.
3. Concatenates 2 strings.
4. Checks whether a character is a consonant.
5. null
6. Prints "Hello world".
7.  Interchange the position of largest & smallest number in an integer array.
8.  Print the transpose of a 3x3 matrix.
9.  Take 2 arrays as input & merge them.
10. Check whether the number entered is a palindrome number.
    - If a number is the same as it's reverse, it's called a palindrome number.
11. Prints the pattern -
    ```
    *
    **
    ***
    ****
    *****
    ```
12. Prints the pattern:
    ```
    *****
    ****
    ***
    **
    *
    ```

13. Print the character entered in reverse case.
14. Print the number in reverse.
15. Removes duplicate elements from an integer array.
16. Takes 'n' as input, prints the result of the series - `1/1! + 2/2! + 3/3! + ... +n/n!`
17. Prints the position of the smallest integer in an array.
18. Prints the details of the student with highest marks(using structure).
19. Take 2 numbers as input, subtract the smaller number from the larger one.
20. Print the sum of 2 numbers.
21. Prints the trace of a matrix.
    - The trace of a square matrix is defined as the sum of the principle diagonal elements of a matrix.
22. Checks whether the character entered is a vowel.
23. Takes 3 numbers as input, returns the largest number.
24. Find the number of `(-)ve numbers, (+)ve numbers & 0` in a matrix.
25. Finds whether a number is a prime number or not.
26. A menu driven program to perform various kinds of operation on an integer array of size 'n'.
    - Functions -
      - `Display(int A[], int n)`:  Displays 'n' elements of the array 'A'.
      - `CountOdd(int A[], int n)`: Returns the no. of odd numbers in the array 'A' of size 'n'.
      - `FindSmallest(int A[], int n)`: Returns the smallest number in the array A of size 'n'.
      - `Reverse(int A[], int n)` - Print the array 'A' of size 'n' in reverse.
      - `PrintFrequency(int A[], int n)`: Print the frequency of each element of the array 'A' of size 'n'.
      - `Replace(int A[], int n, int x, int y)`: Replaces all the 'x' elements in the array 'A' of size 'n' with 'y'.
      - `SearchPrime(int A[], int n)`: Returns the position of the first occurence of a prime number in the array 'A' of size 'n'.
27. Write a program that sorts an integer array in ascending or descending order, depending on user input.
28. Program on Inheritance.
29. Program to demonstrate pointers.
30. Program to increase the value of a variable by 20, using pointers (in 3 separate lines).

## C++
1. Initialising a pointer.
2. Pointers and arrays.
3. Dereferencing once and twice.
4. Swapping 2 numbers using call by reference.

## Java
```bash
javac file.java         # Compile
java file //file.class  # Execute
```

1. A program to print 'Hello World!'.
2. A program to demonstrate single inheritance.
3. Take variables as input using Scanner class.
4. Data types.
5. Type Casting
6. Calculate the number of occurences of a digit in a number.
7. Reverse a number.
8. Calculator program, takes user input till user enters 'x' or 'X'.
9. String functions - `equals(),equalsIgnoreCase()`
10. Switch statement `Old`
11. Switch statement `New`
12. Nested Switch case.
13. Functions in java.
14. Enhanced for loop, printing array without for loop.
15. Take 2D array as input, print it using enhanced for loop.
16. 1D & 2D ArrayLists in Java (when number of array elements isn't known).
17. Reverse the array.
18. Input elements to an ArrayList.
19. Linear Search.
20. Search for a character in a String.
21. Find the maximum and minimum number.
22. Find the minimum and maximum number of each array in a 2D array.
23. [LeetCode > 1295. Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/)
24. Calculating number of digits using Math.log().
25. Binary Search.

### DSA BootCamp: **Assignment-02**
26. Write a program to print whether a number is even or odd, also take input from the user.
27. Take name as input and print a greeting message for that particular name.
28. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
29. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
30. Take 2 numbers as input and print the largest number.
31. Input currency in rupees and output in USD.
32. To calculate Fibonacci Series up to n numbers.
33. To find out whether the given String is Palindrome or not.
34. To find Armstrong Number between two given numbers.

### DSA BootCamp: **Assignment-03**
#### Easy
35. Area Of Circle Java Program
36. Area Of Triangle
37. Area Of Rectangle Program
38. Area Of Isosceles Triangle
39. Area Of Parallelogram
40. Area Of Rhombus
41. Area Of Equilateral Triangle
42. Perimeter Of Circle
43. Perimeter Of Equilateral Triangle
44. Perimeter Of Parallelogram
45. Perimeter Of Rectangle
46. Perimeter Of Square
47. Perimeter Of Rhombus
48. Volume Of Cone Java Program
49. Volume Of Prism
50. Volume Of Cylinder
51. Volume Of Sphere
52. Volume Of Pyramid
53. Curved Surface Area Of Cylinder
54. Total Surface Area Of Cube
55. Fibonacci Series In Java Programs
56. Subtract the Product and Sum of Digits of an Integer
57. Input a number and print all the factors of that number (use loops).
58. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
59. Take integer inputs till the user enters 0 and print the largest number from all.
60. Addition Of Two Numbers 
#### Intermediate
61. Factorial Program In Java
62. Calculate Electricity Bill
63. Calculate Average Of N Numbers
64. Calculate Discount Of Product
65. Calculate Distance Between Two Points
66. Calculate Commission Percentage
67. Power In Java
68. Calculate Depreciation of Value
69. Calculate Batting Average
70. Calculate CGPA Java Program
71. Compound Interest Java Program
72. Calculate Average Marks
73. Sum Of N Numbers
74. Armstrong Number In Java
75. Find Ncr & Npr
76. Reverse A String In Java
77. Find if a number is palindrome or not
78. Future Investment Value
79. HCF Of Two Numbers Program
80. LCM Of Two Numbers
81. Java Program Vowel Or Consonant
82. Perfect Number In Java
83. Check Leap Year Or Not
84. Sum Of A Digits Of Number
85. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
86. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
87. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
88. Define a program to find out whether a given number is even or odd.
89. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
90. Write a program to print the sum of two numbers entered by user by defining your own method.
91. Define a method that returns the product of two numbers entered by user.
92. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
93. Define a method to find out if a number is prime or not.
94. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: 
    ```
    Marks  Grade
    91-100  AA 
    81-90   AB 
    71-80   BB 
    61-70   BC 
    51-60   CD 
    41-50   DD
    ```
### DSA BootCamp: **Assignment-04**
1. Write a program to print the factorial of a number by defining a method named ‘Factorial’.
2. Write a function to find if a number is a palindrome or not. Take number as parameter.
3. Convert the programs in flow of program, first java, conditionals & loops assignments into functions.
4. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
5. Write a function that returns all prime numbers between two given numbers.
6.  Write a function that returns the sum of first n natural numbers.

### DSA BootCamp: **Assignment-05**
101. Build Array from Permutation
102. Concatenation of Array
103. Running Sum of 1d Array
104. Richest Customer Wealth
105. Shuffle the Array
106. Kids With the Greatest Number of Candies
107. Number of Good Pairs
108. How Many Numbers Are Smaller Than the Current Number
109. Create Target Array in the Given Order
110. Check if the Sentence Is Pangram
111. Count Items Matching a Rule
112. Find the Highest Altitude
113. Flipping an Image
114. Cells with Odd Values in a Matrix
115. Matrix Diagonal Sum
116. Find Numbers with Even Number of Digits
117. Transpose Matrix
118. Add to Array-Form of Integer
119. Maximum Population Year
120. Determine Whether Matrix Can Be Obtained By Rotation
121. Two Sum
122. Find N Unique Integers Sum up to Zero
123. Lucky Number In a Matrix
124. Maximum Subarray
125. Reshape the Matrix
126. Plus One
127. Remove Duplicates from Sorted Array
128. Minimum Cost to Move Chips to The Same Position 

### DSA BootCamp: **Assignment-06**
#### Easy
129. Square Root
130. Guess Number Higher or Lower
131. First Bad Version
132. Two Sum II - Input array is sorted
133. Valid Perfect Square
134. Arranging Coins(Easy)
135. Find Smallest Letter Greater Than Target
136. Kth Missing Positive Number
137. Search Insert Position
138. Peak Index in a Mountain Array
139. Count Negative Numbers in a Sorted Matrix
140. Intersection of Two Arrays
141. Intersection of Two Arrays II
142. Fair Candy Swap
143. Check If N and Its Double Exist
144. Special Array With X Elements Greater Than or Equal X
145. Binary Search
#### Medium
146. Find First and Last Position of Element in Sorted Array
147. Single Element in a Sorted Array
148. Search in Rotated Sorted Array
149. Search in Rotated Sorted Array II
150. Find Minimum in Rotated Sorted Array
151. Find Peak Element
152. Find Right Interval
153. Reach a Number
154. Maximum Value at a Given Index in a Bounded Array
155. Koko Eating Bananas
156. Minimum Absolute Sum Difference
157. Search a 2D Matrix
158. Find a Peak Element II
159. Frequency of the Most Frequent Element
160. Find the Duplicate Number
161. Capacity To Ship Packages Within D Days
162. 4 Sum 
163. Binary Search in 2D Arrays
164. Binary Search in 2D array, where both the rows & columns are sorted.
      ```
      [[10,20,30,40],
      [15,25,35,45],
      [28,29,37,49],
      [33,34,38,50]]
      ```
165. Binary Search in a strictly sorted 2D Array. //Check once.
      ```
      [[1,2,3,4],
        [7,8,9,10],
        [21,22,23,24],
        [54,55,56,57]]
      ```
166.   Bubble Sort
167.   Linked List functions:
      - Adding an element at the beginning.
      - Adding an element in the end.
      - Find the size of the linked list.
      - Print the linked list.
      - Search for an element.
      - Delete the first element.
      - Delete the last element.
168.   Linked List, using Collections Framework (java.util.LinkedList). `# Not Done`
169. Make a Linked List & add the following elements to it : `(1, 5, 7, 3 , 8, 2, 3)`. Search for the number `7` & display its index.
170. Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25. // Optimise
171. `Arrays.setAll(array,generator)`: Setting the elements of an array from:
      - User input
      - Predefined values, for eg `[1-10]`.
172. Recursive Pre-order, In-order, Post-order tree traversal.
173. Iterative Pre-order, In-order, Post-order, Level-order tree traversal.
174. Selection Sort
175. Insertion Sort
176. Single program to demonstrate different sorting techniques.
      - Bubble Sort
      - Selection Sort
      - Insertion Sort
177. Lowest Common Ancestor of a Binary Tree.
178. Recursion in Java.
179. Find 'n'th Fibonacci number using Recursion.
180. Binary Search using Recursion.
181. Merge Sort using Recursion.
182. Quick Sort using Recursion.
183. Ceiling of a number, in an array.
184. Floor of a number, in an array.
185. Floor of a number, in an unsorted array.
186. Problem: Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not. 
We consider the letters `"A","E","I","O","U","Y"` to be vowels for this problem.
Input Format: The first line contains a string of length 9. The format is `"DDXDDD-DD"`, where D stands for a digit (non zero) and X is an uppercase english letter.
Output Format: Print `"valid"` (without quotes) if the tag is valid, print `"invalid"` otherwise (without quotes)

## Kotlin
```bash
kotlinc file.kt   # Compile
kotlin file.class # Execute, Method 1
# OR
kotlin file       # Execute, Method 2
```
1. Hello, World!
2. Theory:
    - Types of variables
    - Printing variables 
    - Function declaration
    - Shorthand functions
3. Functions:
    - Overloaded functions
    - Functions with parameters with default value
4. Variables & Lists:
    - Initialising variables for use later (kinda like int a; ... a = 12; in Java)
    - Creating mutable & non-mutable lists.
    - Working on lists - finding length, printing each element.
5. Implementing OOP Concepts in Kotlin.
    - Creating a class
    - Creating an object of a class
6. Extending classes
7. Implementing interfaces in classes.
8. Functions 'timesTwo()' and 'timesThree()'.
9. The multiple ways of inserting an element in an Array/ArrayList/List.
10. String functions.
11. Array functions.
12. List functions.
13. Divide a by b, check if b is 0 before dividing.
14. Declare 2 integers, tell which one of them is a greater number.
15. 'When' expression, similar to 'switch' in Java.
16. Use 'when' expression to print if a number is negative, positive, or zero.
17. Use 'when' expression to print if a number is between 1-10,11-20, or outside the range.
18. For, while and do-while loop.
19. Operate using [+,-,*,/] on 2 numbers, using 'function' and 'when' expression.
20. Try catch Exception handling in Kotlin.
21. Using Elvis operator to print something else if the value we're trying to print, is null.
22. Using the 'filterNotNull()' function to print a list.
23. Creating Classes & Objects (without constructor).
24. Creating Classes & Objects (with constructor).
25. Creating Classes & Objects, removing all boiler-plate code.
26. Primary & Secondary constructors.
27. Data classes.
28. Creating a mutable list of 'class' data type, and storing the values of the objects in it.
29. Inheritance in Kotlin. Keywords: `open,override`
30. Interfaces in Kotlin

## HTML

1. Basic HTML page structure, headings, paragraphs and line breaks.
2. White space Collapsing.
3. Working with images.
4. IDs, external, internal, empty links.
5. Superscript, subscript, strong (bold), emphasis (italics) elements, special characters.
6. Unordered & ordered list.
7. Table.
8. Forms & select box
9. Using CSS Scripts in HTML
10. <-> 1.css - Defining classes for use in CSS.
11. <-> 2.css (Absolute & Relative) Positioning in CSS:
> Absolute & Relative
> Fixed
> Sticky
12. <-> 3.css, 29.js - Basic JavaScript funcitonality demonstration.
13. <-> 4.css, 30.js - Counter page.
14. <-> 5.css, 31.js - Removing elements from the counter page.
15. <-> 6.css, 32.js - Counter page, setting CSS styles from within JavaScript.

### ./**Coffee-Junkie**: Company webpage
- index.html - Main page
-numbers.html - Stats
- contact.html - Contact form
- about.html - About page

## CSS
1. <-> 10.html
    - Basic CSS Syntax.
    - Defining properties for tags and classes.
    - Using FlexBox.

## JavaScript
1. In-line & Multi-line comments.
2. Data types, assigning & declaring variables, console.log().
3. Camel case.
4. Working with numbers.
5. Compound assignment & augmented addition.
6. Using escape character in a string.
7. Escape sequences.
8. Appending variables to string & finding it's length.
9. String immutability (individual characters cannot be changed).
10. Arrays
11. Array functions: push(),pop(),shift(),unshift().
12. Example of a nested array: Shopping List.
13. Functions, local and global variables.
14. Simulating a queue & JSON Stringify (a way to convert arrays to strings).
15. If condition.
16. Strict equality & strict inequality operator. (===)
17. Switch case
18. Returning boolean values from functions i.e. using return instead of if else.
19. Returning undefined for invalid inputs.
20. Counting cards.
21. Objects in JavaScript.
27. Objects are called by reference, primitive values are called by value.
22. Variables in JavaScript, typeof
23. a to the power of b (a^b)
24. Working with boolean values.
25. Binary Search
26. Linear Search
28. Local variable is prioritised over global variable, if both have the same variable name.
29. Information about how JavaScript works with HTML. `# HTML`
    - Iterating a single item
    - Iterating a list of items
    - Using for loop to change values of elements.
    - `querySelector()`, `querySelectorAll()`
    - `getElementById()`
    - `var.innerText`
    - `addEventListener()`
30. ES6 (ECMA Script v6), array destructuring
31. Arrow Functions in ES6
32. Using arrow function to return if a number is even or odd.
33. Array functions
34. Multi-line strings in ES6.
35. Using Array functions & Arrow functions to filter out the even and odd numbers in an array.
36. <-> `data.json` - Fetch API and Promise object
37. Create an object, change the value of 1 of it's members.
38. 'this' keyword in JavaScript.
39. bind() method in JavaScript.

### ./React.js
- Port for Development: `3510`
- A complete list of commands is provided in the 'tutorials & fixes' file. In short,
  ```bash
  cd app_name
  npm start
  # Go to: http://0.0.0.0:3510
  # ./playground: React.js runs here.
  ```

## Shell
1. `$var vs var`, where to use which.
2. Switch Case in Shell.

## Android
### 1_ActivityLifecycle
- activity_main.xml: Linear Layout
- activity_main_relative_layout.xml: Relative Layout
- scrollview_example.xml: Scroll View
1. AvengersActivity1.kt <-> avengers_login.xml: Avengers Login Page
    - Check the username and password of the user, log the user in if they match
    - Display a toast if the password is incorrect.
    - Start another activity (& switch to it) if the credentials are correct (Intent).
2. MainActivity.kt:
    - Send a string to another activity (ScrollViewActivity.kt) using intents.
    - Use Shared Preferences to save the user's credentials.
3. ScrollViewActivity.kt <-> scrollview_example.xml: The Activity displayed after login.

### 2_Module3Project
### 3_Bookhub
1. menu_drawer.xml: Menu icons for the drawer.
2. Create icons for the menu bar items: [./drawable] New > Image Asset > Action Bar & Tab Icons.
3. drawer_header.xml: Top part of the drawer.
4. Create a DrawerLayout in activity_main.xml, to combine the 2 views together.
5. Remove the default toolbar (NoActionBar)
6. Add a new toolbar in activity_main.xml.
7. Create the home icon in MainActivity.kt, using setSupportActionBar(toolbar) and supportActionBar?.setHomeButtonEnabled(true).
8. Add functionality to the icon, ie add a click listener to the action bar.
9. Add click listeners for the menu bar items.
10. Add Fragments for all menu items.
11. Setup the Fragment Transactions (open the fragments when the menu items are clicked).
12. Check the app's connectivity to the Internet.
13. Create an alert dialog -> DashboardFragment.kt

## Swift
```bash
swift test # Test
swift file.swift # Run
```
1. Swift Basics
    - Variables & Constants
    - Functions

## Platforms
### Exercism
#### Java
```bash
# Install:
curl -s "https://get.sdkman.io"
sdk install gradle
gradle test # Test
```

#### Kotlin
```bash
# Install:
curl -s "https://get.sdkman.io"
sdk install gradle
gradle test # Test
```

#### JavaScript
```bash
pacman -S npm # Install
npm test # Test
```

### GeeksForGeeks
1. Given a string S, check if it is palindrome or not. Return 1 if it is, otherwise return 0.
    [Question](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)
    
2. Longest K unique characters substring
    [Question](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)

3. Reverse a String
    [Question](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)
4. Multiply two strings
    [Question](https://practice.geeksforgeeks.org/problems/multiply-two-strings/1)    

### LeetCode
1. Given two non-negative integers low and high, return the count of odd numbers between low and high (inclusive).
    [Q.1523](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)

2. You are given an array of unique integers salary where salary[i] is the salary of the ith employee. Return the average salary of employees excluding the minimum and maximum salary.
    [Q. 1491](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)

3. Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
    [Q. 191](https://leetcode.com/problems/number-of-1-bits/)

4. Given an integer number n, return the difference between the product of its digits and the sum of its digits.
    [Q. 1281](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

5. Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
    [Q. 976](https://leetcode.com/problems/largest-perimeter-triangle/)

6. You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location. Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1. <br>
    `The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).`
    [Q. 1779](https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/)

7. There is a function `signFunc(x)` that returns:
    ```
    1, if x is positive.
    -1, if x is negative.
    0, if x is equal to 0.
    ```
    You are given an integer array nums. Let product be the product of all values in the array nums. Return `signFunc(product)`.
    [Q. 1822](https://leetcode.com/problems/sign-of-the-product-of-an-array/)

8. A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same. Given an array of numbers `arr`, return `true` if the array can be rearranged to form an arithmetic progression. Otherwise, return `false`.
    [Q: 1502](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)

9. Given an array nums of integers, return how many of them contain an even number of digits.
    [Q: 1295](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

10. You are given an `m x n` integer grid accounts where `accounts[i][j]` is the amount of money the `i​​​​​​​​​​​th​​​​ customer` has in the `j​​​​​​​​​​​th​​​​ bank`. Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
    [Q: 1672](https://leetcode.com/problems/richest-customer-wealth/)

11. Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
    [Q: 1.](https://leetcode.com/problems/two-sum/)

12. Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.
    [Q: 9](https://leetcode.com/problems/palindrome-number/)

13. Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums. <br>
    Consider the number of unique elements of nums to be `k`, to get accepted, you need to do the following things: Change the array nums such that the first `k` elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums. Return k.
    [Q: 26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

14. You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return `true` if `n` new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and `false` otherwise.
    [Q: 605](https://leetcode.com/problems/can-place-flowers/)

15. Given a string s containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is valid.
    An input string is valid if:
    ```
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
    ```
    [Q: 20](https://leetcode.com/problems/valid-parentheses/)

16. You are given the heads of two sorted linked lists list1 and list2. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
    [Q: 21](https://leetcode.com/problems/merge-two-sorted-lists/)

17. You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters. Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
    [Q: 744](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

18. Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If target is not found in the array, return `[-1, -1]`. You must write an algorithm with `O(log n)` runtime complexity.
    [Q: 34](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

19. You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively. Merge `nums1` and `nums2` into a single array sorted in non-decreasing order. <br>
    The final sorted array should not be returned by the function, but instead be stored inside the array `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.
    [Q: 88](https://leetcode.com/problems/merge-sorted-array/)

20. Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`. <br>
    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`. The remaining elements of `nums` are not important as well as the size of `nums`. Return `k`.
    [Q: 27](https://leetcode.com/problems/remove-element/)

21. Given two strings `needle` and `haystack`, return the `index` of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.
    [Q: 26](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

22. Given a string `s` consisting of `words` and `spaces`, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.
    [Q: 58](https://leetcode.com/problems/length-of-last-word/)

23. Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
    [Q: 14](https://leetcode.com/problems/longest-common-prefix/)

24. You are given a large integer represented as an integer array digits, where each `digits[i]` is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.
    [Q: 66](https://leetcode.com/problems/plus-one/)

25. Given an array nums of size `n`, return the majority element. The majority element is the element that appears more than `⌊n / 2⌋ times`. You may assume that the majority element always exists in the array.
    [Q: 169](https://leetcode.com/problems/majority-element/)

26. Write a function that reverses a string. The input string is given as an array of characters `s`. You must do this by modifying the input array in-place with O(1) extra memory.
    [Q. 344](https://leetcode.com/problems/reverse-string/)

27. Given the root of a binary tree, return the inorder traversal of its nodes' values.
    [Q. 94](https://leetcode.com/problems/binary-tree-inorder-traversal/)

28. Given the head of a singly linked list, reverse the list, and return the reversed list.
    [Q. 206](https://leetcode.com/problems/reverse-linked-list/)


## Blogs
### Hashnode
1. 'Listen' to books on your Kindle!
2. Linux Basics: The Command Line!
3. GNU/Linux: The Good, The Bad & The Ugly!
4. Systemd guide: Create your own service!