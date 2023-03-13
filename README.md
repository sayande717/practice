Case types:
camelCase | variables, methods
PascalCase | Classes


[Python]
notes.txt - 
1. Print output of division as integer (A//B).

[/Discord Bot]
local.py: Local bot.
remote.py: Remote bot.
announcement.py: Broadcasts announcements & system status.
run_remote.py: Keeps the remote bot online.
test.py: Test bot.

example.py: Help.
> functions needed
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
> os
#Last line: Specify the bot token.

1.py: Prints 'Hello world!'.
2.py: HackerRank program.
3.py: Functions for:
a. Convert a string to lowercase, uppercase & title case. Split a string into n parts using a separator.
b. Variations of the print() function.
c. Variations of the for loop.
4.py: Basic operation on 1-D & 2-D lists.
a. Finding list length.
b. Sort the list in ascending & descending (reverse) order.
5.py: Error detection using try-except.
6.py: Create a dictionary, print values.
7.py: Print a single element multiple times.
8.py: Taking variables as input.
9.py: Print the data types of the variables.
10.py: Multi-line strings.
11.py: Printing characters at a specific index in a string.
12.py: Formatting Strings
13.py: String methods.
14.py: Print 'Eligible for Loan' if the applicant has high income and cood credit.
15.py: Weight Convertor.
16.py: While loop
17.py: Guessing game, if the user guesses the correct number, he wins.
18.py: Car Game!
19.py: For loops
20.py: Printing the alphabet 'F' & 'L' using for loop.
21.py: Find the largest element in a list
22.py: Linear Search
23.py: Binary Search
24.py: 2D lists
25.py: Operations on lists
26.py: Insert only those numbers in the 2nd list, which are not present in the 1st list.
27.py: Tuples in Python
28.py: Dictionary
29.py: Input a number, return the numbers in words.
30.py: Keyword parameters in functions.
31.py: Unit Convertor. Functions:
> Temperature
32.py: Return statement
33.py: Emoji convertor using function.
34.py: Exception handling.
35.py: Classes
36.py: Create a class 'Person':
> Attribute: name
> Method: talk()
37.py: Inheritance & pass keyword.
38.py: Contains:
> find_max()
> find_min()
Both these methods take a list as input, and return the largest & smallest integer respectively.
39.py: Import '38.py' and print the largest & smallest number in a list.

[Programming & DSA using Python]:
1.py: A program to implement Greatest Common Divisor (GCD).
2.py: Optimising 1.py
3.py: GCD v3
4.py: GCD v4
5.py: Find the position of an element in a list (using functions).
6.py: Binary Search using Recursion.
7.py: Selection Sort.
8.py: Insertion Sort.
9.py: NPTEL Week 2 Assignment:
> A positive integer m can be partitioned as primes if it can be written as p + q where p > 0, q > 0 and both p and q are prime numbers. Write a Python function primepartition(m) that takes an integer m as input and returns True if m can be partitioned as primes and False otherwise. (If m is not positive, your function should return False).
> Write a function matched(s) that takes as input a string s and checks if the brackets "(" and ")" in s are matched: that is, every "(" has a matching ")" after it and every ")" has a matching "(" before it. Your function should ignore all other symbols that appear in s. Your function should return True if s has matched brackets and False if it does not.
> A list rotation consists of taking the first element and moving it to the end. For instance, if we rotate the list [1,2,3,4,5], we get [2,3,4,5,1]. If we rotate it again, we get [3,4,5,1,2]. Write a Python function rotatelist(l,k) that takes a list l and a positive integer k and returns the list l after k rotations. If k is not positive, your function should return l unchanged. Note that your function should not change l itself, and should return the rotated list.

10.py: NPTEL Week 3 Assignment:
> 1. Define a Python function remdup(l) that takes a nonempty list of integers l and removes all duplicates in l, keeping only the last occurrence of each number.
>>> remdup([3,1,3,5])
[1, 3, 5]

> 2. Write a Python function splitsum(l) that takes a nonempty list of integers and returns a list [pos,neg], where pos is the sum of squares all the positive numbers in l and neg is the sum of cubes of all the negative numbers in l.
>>> splitsum([1,3,-5])
[10, -125]

> 3. A two dimensional matrix can be represented in Python row-wise, as a list of lists: each inner list represents one row of the matrix.
>>> For example, the matrix,
1  2  3
4  5  6 
7  8  9
... would be represented as [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

>>> A horizonatal flip reflects each row. For instance, if we flip the previous matrix horizontally, we get

3  2  1
6  5  4 
9  8  7

...which would be represented as [[3, 2, 1], [6, 5, 4], [9, 8, 7]].

>>> A vertical flip reflects each column. For instance, if we flip the previous matrix that has already been flipped horizontally, we get
9  8  7
6  5  4 
3  2  1

...which would be represented as [[9, 8, 7], [6, 5, 4], [3, 2, 1]].

Write a Python function matrixflip(m,d) that takes as input a two dimensional matrix m and a direction d, where d is either 'h' or 'v'. If d == 'h', the function should return the matrix flipped horizontally. If d == 'v', the function should retun the matrix flipped vertically. For any other value of d, the function should return m unchanged.

11.py: Tuples in Python
12.py: NPTEL Week 4 Assignment:
> 1. We have a list of annual rainfall recordings of cities. Each element in the list is of the form (c,r) where c is the city and r is the annual rainfall for a particular year. The list may have multiple entries for the same city, corresponding to rainfall recordings in different years. Write a Python function rainaverage(l) that takes as input a list of rainfall recordings and computes the avarage rainfall for each city. The output should be a list of pairs (c,ar) where c is the city and ar is the average rainfall for this city among the recordings in the input list. Note that ar should be of type float. The output should be sorted in dictionary order with respect to the city name.
> 2. A list in Python can contain nested lists. The degree of nesting need not be uniform. For instance [1,2,[3,4,[5,6]]] is a valid Python list. Write a Python function flatten(l) that takes a nonempty list of lists and returns a simple list of all the elements in the nested lists, flattened out. You can make use of the following function that returns True if its input is of type list.

def listtype(l):
  return(type(l) == type([]))

Here are some examples to show how flatten(l) should work.
>>> flatten([1,2,[3],[4,[5,6]]])
[1, 2, 3, 4, 5, 6]

>>> flatten([1,2,3,(4,5,6)])
[1, 2, 3, (4, 5, 6)]

13.py: Merge Sort
14.py: List Difference using Merge Sort.
15.py: List comprehension in Python.
16.py: Exception handling in Python.
17.py: Arguments for the print() statement.
18.py: File Handling in Python.

[C] -
notes.txt - 
1. Format Specifiers (for use in scanf and printf)
2. How to scale float/double to n decimel spaces

1.c - Sorts the numbers in ascending order.
2.c - Performs basic calculator operations - +,-,*,/,%.
3.c - Concatenates 2 strings.
4.c - Checks whether a character is a consonant.
5.c - null
6.c - Prints "Hello world".
7.c - Interchange the position of largest & smallest number in an integer array.
8.c - Print the transpose of a 3x3 matrix.
9.c - Take 2 arrays as input & merge them.
10.c - Check whether the number entered is a palindrome number.
Note - If a number is the same as it's reverse, it's called a palindrome number.
11.c - Prints the pattern -
*
**
***
****
*****
12.c - Prints the pattern -
*****
****
***
**
*
13.c - Print the character entered in reverse case.
14.c - Print the number in reverse.
15.c - Removes duplicate elements from an integer array.
16.c - Takes 'n' as input, prints the result of the series - 1/1! + 2/2! + 3/3! + ... +n/n!
17.c - Prints the position of the smallest integer in an array.
18.c - Prints the details of the student with highest marks(using structure).
19.c - Take 2 numbers as input, subtract the smaller number from the larger one.
20.c - Print the sum of 2 numbers.
21.c - Prints the trace of a matrix.
Note - The trace of a square matrix is defined as the sum of the principle diagonal elements of a matrix.
22.c - Checks whether the character entered is a vowel.
23.c - Takes 3 numbers as input, returns the largest number.
24.c - Find the number of (-)ve numbers, (+)ve numbers & 0 in a matrix.
25.c - Finds whether a number is a prime number or not.
26.c - A menu driven program to perform various kinds of operation on an integer array of size 'n'. Functions -
Display(int A[], int n) - Displays 'n' elements of the array 'A'.
CountOdd(int A[], int n) - Returns the no. of odd numbers in the array 'A' of size 'n'.
FindSmallest(int A[], int n) - Returns the smallest number in the array A of size 'n'.
Reverse(int A[], int n) - Print the array 'A' of size 'n' in reverse.
PrintFrequency(int A[], int n) - Print the frequency of each element of the array 'A' of size 'n'.
Replace(int A[], int n, int x, int y) - Replaces all the 'x' elements in the array 'A' of size 'n' with 'y'.
SearchPrime(int A[], int n) - Returns the position of the first occurence of a prime number in the array 'A' of size 'n'.
27.c - Write a program that sorts an integer array in ascending or descending order, depending on user input.
28.cpp - Program on Inheritance.
29.c - Program to demonstrate pointers.
30.c - Program to increase the value of a variable by 20, using pointers.
(in 3 separate lines).

[C++]:
1.cpp - Initialising a pointer.
2.cpp - Pointers and arrays.
3.cpp - Dereferencing once and twice.
4.cpp - Swapping 2 numbers using call by reference.


[Java]
[Run the code]:
$ javac file.java
$ java file //file.class

1.java - A program to print 'Hello World!'.
2.java - A program to demonstrate single inheritance.
3.java - Take variables as input using Scanner class.
4.java - Data types.
5.java - Type Casting
6.java - Calculate the number of occurences of a digit in a number.
7.java - Reverse a number.
8.java - Calculator program, takes user input till user enters 'x' or 'X'.
9.java - String functions - 
equals(),equalsIgnoreCase()
10.java - Switch statement (old).
11.java - Switch statement (new).
12.java - Nested Switch case.
13.java - Functions in java.
14.java - Enhanced for loop, printing array without for loop.
15.java - Take 2D array as input, print it using enhanced for loop.
16.java - 1D & 2D ArrayLists in Java (when number of array elements isn't known).
17.java - Reverse the array.
18.java - Input elements to an ArrayList.
19.java - Linear Search.
20.java - Search for a character in a String.
21.java - Find the maximum and minimum number.
22.java - Find the minimum and maximum number of each array in a 2D array.
23.java - LeetCode [1295. Find Numbers with Even Number of Digits] [https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/]
24.java - Calculating number of digits using Math.log().
25.java - Binary Search.

[DSA BootCamp: Assignment-02]
26.java - Write a program to print whether a number is even or odd, also take input from the user.
27.java - Take name as input and print a greeting message for that particular name.
28.java - Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
29.java - Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
30.java - Take 2 numbers as input and print the largest number.
31.java - Input currency in rupees and output in USD.
32.java - To calculate Fibonacci Series up to n numbers.
33.java - To find out whether the given String is Palindrome or not.
34.java - To find Armstrong Number between two given numbers.

[DSA BootCamp: Assignment-03]
[Easy]
35.java - Area Of Circle Java Program
36.java - Area Of Triangle
37.java - Area Of Rectangle Program
38.java - Area Of Isosceles Triangle
39.java - Area Of Parallelogram
40.java - Area Of Rhombus
41.java - Area Of Equilateral Triangle
42.java - Perimeter Of Circle
43.java - Perimeter Of Equilateral Triangle
44.java - Perimeter Of Parallelogram
45.java - Perimeter Of Rectangle
46.java - Perimeter Of Square
47.java - Perimeter Of Rhombus
48.java - Volume Of Cone Java Program
49.java - Volume Of Prism
50.java - Volume Of Cylinder
51.java - Volume Of Sphere
52.java - Volume Of Pyramid
53.java - Curved Surface Area Of Cylinder
54.java - Total Surface Area Of Cube
55.java - Fibonacci Series In Java Programs
56.java - Subtract the Product and Sum of Digits of an Integer
57.java - Input a number and print all the factors of that number (use loops).
58.java - Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
59.java - Take integer inputs till the user enters 0 and print the largest number from all.
60.java - Addition Of Two Numbers 
[Intermediate]
61.java - Factorial Program In Java
62.java - Calculate Electricity Bill
63.java - Calculate Average Of N Numbers
64.java - Calculate Discount Of Product
65.java - Calculate Distance Between Two Points
66.java - Calculate Commission Percentage
67.java - Power In Java
68.java - Calculate Depreciation of Value
69.java - Calculate Batting Average
70.java - Calculate CGPA Java Program
71.java - Compound Interest Java Program
72.java - Calculate Average Marks
73.java - Sum Of N Numbers
74.java - Armstrong Number In Java
75.java - Find Ncr & Npr
76.java - Reverse A String In Java
77.java - Find if a number is palindrome or not
78.java - Future Investment Value
79.java - HCF Of Two Numbers Program
80.java - LCM Of Two Numbers
81.java - Java Program Vowel Or Consonant
82.java - Perfect Number In Java
83.java - Check Leap Year Or Not
84.java - Sum Of A Digits Of Number
85.java - Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
86.java - Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

[DSA BootCamp: Assignment-03]
87.java - Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
88.java - Define a program to find out whether a given number is even or odd.
89.java - A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
90.java - Write a program to print the sum of two numbers entered by user by defining your own method.
91.java - Define a method that returns the product of two numbers entered by user.
92.java - Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
93.java - Define a method to find out if a number is prime or not.
94.java - Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below: 
Marks  Grade
91-100  AA 
81-90   AB 
71-80   BB 
61-70   BC 
51-60   CD 
41-50   DD

[DSA BootCamp: Assignment-04]
95.java - Write a program to print the factorial of a number by defining a method named ‘Factorial’.
96.java - Write a function to find if a number is a palindrome or not. Take number as parameter.
97.java - Convert the programs in flow of program, first java, conditionals & loops assignments into functions.
98.java - Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
99.java - Write a function that returns all prime numbers between two given numbers.
100.java - Write a function that returns the sum of first n natural numbers.

[DSA BootCamp: Assignment-05]
101.java - Build Array from Permutation
102.java - Concatenation of Array
103.java - Running Sum of 1d Array
104.java - Richest Customer Wealth
105.java - Shuffle the Array
106.java - Kids With the Greatest Number of Candies
107.java - Number of Good Pairs
108.java - How Many Numbers Are Smaller Than the Current Number
109.java - Create Target Array in the Given Order
110.java - Check if the Sentence Is Pangram
111.java - Count Items Matching a Rule
112.java - Find the Highest Altitude
113.java - Flipping an Image
114.java - Cells with Odd Values in a Matrix
115.java - Matrix Diagonal Sum
116.java - Find Numbers with Even Number of Digits
117.java - Transpose Matrix
118.java - Add to Array-Form of Integer
119.java - Maximum Population Year
120.java - Determine Whether Matrix Can Be Obtained By Rotation
121.java - Two Sum
122.java - Find N Unique Integers Sum up to Zero
123.java - Lucky Number In a Matrix
124.java - Maximum Subarray
125.java - Reshape the Matrix
126.java - Plus One
127.java - Remove Duplicates from Sorted Array
128.java - Minimum Cost to Move Chips to The Same Position 

[DSA BootCamp: Assignment-06]
[Easy]
129.java - Square Root
130.java - Guess Number Higher or Lower
131.java - First Bad Version
132.java - Two Sum II - Input array is sorted
133.java - Valid Perfect Square
134.java - Arranging Coins(Easy)
135.java - Find Smallest Letter Greater Than Target
136.java - Kth Missing Positive Number
137.java - Search Insert Position
138.java - Peak Index in a Mountain Array
139.java - Count Negative Numbers in a Sorted Matrix
140.java - Intersection of Two Arrays
141.java - Intersection of Two Arrays II
142.java - Fair Candy Swap
143.java - Check If N and Its Double Exist
144.java - Special Array With X Elements Greater Than or Equal X
145.java - Binary Search
[Medium]
146.java - Find First and Last Position of Element in Sorted Array
147.java - Single Element in a Sorted Array
148.java - Search in Rotated Sorted Array
149.java - Search in Rotated Sorted Array II
150.java - Find Minimum in Rotated Sorted Array
151.java - Find Peak Element
152.java - Find Right Interval
153.java - Reach a Number
154.java - Maximum Value at a Given Index in a Bounded Array
155.java - Koko Eating Bananas
156.java - Minimum Absolute Sum Difference
157.java - Search a 2D Matrix
158.java - Find a Peak Element II
159.java - Frequency of the Most Frequent Element
160.java - Find the Duplicate Number
161.java - Capacity To Ship Packages Within D Days
162.java - 4 Sum 
163.java - Binary Search in 2D Arrays
164.java - Binary Search in 2D array, where both the rows & columns are sorted.
[[10,20,30,40],
 [15,25,35,45],
 [28,29,37,49],
 [33,34,38,50]]
 165.java - Binary Search in a strictly sorted 2D Array. //Check once.
 Ex.
 [[1,2,3,4],
  [7,8,9,10],
  [21,22,23,24],
  [54,55,56,57]]
166.java - Bubble Sort
167.java - Linked List functions:
> Adding an element at the beginning.
> Adding an element in the end.
> Find the size of the linked list.
> Print the linked list.
> Search for an element.
> Delete the first element.
> Delete the last element.

168.java - Linked List, using Collections Framework (java.util.LinkedList).
<Not Done>
169.java - Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
170.java - Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25. // Optimise
171.java - Arrays.setAll(array,generator): Setting the elements of an array from:
a. User input
b. Predefined values, for eg [1-10].
172.java - Recursive Pre-order, In-order, Post-order tree traversal.
173.java - Iterative Pre-order, In-order, Post-order, Level-order tree traversal.
174.java - Selection Sort
175.java - Insertion Sort
176.java - Single program to demonstrate different sorting techniques.
> Bubble Sort
> Selection Sort
> Insertion Sort
177.java - Lowest Common Ancestor of a Binary Tree.
[Recursion Theory] 178-180.java
178.java - Recursion in Java.
179.java - Find 'n'th Fibonacci number using Recursion.
180.java - Binary Search using Recursion.
181.java - Merge Sort using Recursion.
182.java - Quick Sort using Recursion.

[Kotlin]
[Run the code]:
$ kotlinc file.kt
$ kotlin file.class //file.class
OR
$ kotlin file //file.class

1.kt - Hello, World!
2.kt - 
> Types of variables
> Printing variables 
> Function declaration
> Shorthand functions
3.kt -
> Overloaded functions
> Functions with parameters with default value
4.kt -
> Initialising variables for use later (kinda like int a; ... a = 12; in Java)
> Creating mutable & non-mutable lists.
> Working on lists - finding length, printing each element.
5.kt - Implementing OOP Concepts in Kotlin.
> Creating a class
> Creating an object of a class
6.kt - Extending classes
7.kt - Implementing interfaces in classes.
8.kt - Functions 'timesTwo()' and 'timesThree()'.
9.kt - The multiple ways of inserting an element in an Array/ArrayList/List.
10.kt - String functions.
11.kt - Array functions.
12.kt - List functions.
13.kt - Divide a by b, check if b is 0 before dividing.
14.kt - Declare 2 integers, tell which one of them is a greater number.
15.kt - 'When' expression, similar to 'switch' in Java.
16.kt - Use 'when' expression to print if a number is negative, positive, or zero.
17.kt - Use 'when' expression to print if a number is between 1-10,11-20, or outside the range.
18.kt - For, while and do-while loop.
19.kt - Operate using [+,-,*,/] on 2 numbers, using 'function' and 'when' expression.
20.kt - Try catch Exception handling in Kotlin.
21.kt - Using Elvis operator to print something else if the value we're trying to print, is null.
22.kt - Using the 'filterNotNull()' function to print a list.
23.kt - Creating Classes & Objects (without constructor).
24.kt - Creating Classes & Objects (with constructor).
25.kt - Creating Classes & Objects, removing all boiler-plate code.
26.kt - Primary & Secondary constructors.
27.kt - Data classes.
28.kt - Creating a mutable list of 'class' data type, and storing the values of the objects in it.
29.kt - Inheritance in Kotlin
> Keywords: open,override
30.kt - Interfaces in Kotlin
Project 1 - Internshala Module 2 Assignment, more info in README.pdf


[HTML] - 
info.html
1.html - Basic HTML page structure, headings, paragraphs and line breaks.
2.html - White space Collapsing.
3.html - Working with images.
4.html - IDs, external, internal, empty links.
5.html - Superscript, subscript, strong (bold), emphasis (italics) elements, special characters.
6.html - Unordered & ordered list.
7.html - Table.
8.html - Forms & select box
9.html - Using CSS Scripts in HTML
10.html <-> 1.css - Defining classes for use in CSS.
11.html <-> 2.css (Absolute & Relative) Positioning in CSS:
> Absolute & Relative
> Fixed
> Sticky
12.html <-> 3.css, 29.js - Basic JavaScript funcitonality demonstration.
13.html <-> 4.css, 30.js - Counter page.
14.html <-> 5.css, 31.js - Removing elements from the counter page.
15.html <-> 6.css, 32.js - Counter page, setting CSS styles from within JavaScript.
[./Unit-Convertor]
index.html - Main page
style.css
script.js

[./Coffee-Junkie]- Company webpage
index.html - Main page
numbers.html - Stats
contact.html - Contact form
about.html - About page

[./Search-Engine] - Search Engine
index.html - Main page
about.html - About page
style.css - CSS StyleSheet

[CSS] - 
1.css -> 10.html
> Basic CSS Syntax.
> Defining properties for tags and classes.
> Using FlexBox.

[Tailwind CSS]
Run: npx tailwindcss -i ./src/input.css -o ./public/output.css
Files:
input.css [Optional] - Source input file for Tailwind. 
index.html - Main HTML page
[./playground] - Tailwind CSS build runs here.
[./1] - 
> Buttons, Alerts, Cards
> Adding properties in input.css and using them.
[./2] - Create an 'About Me' card.

[JavaScript] - 
1.js - In-line & Multi-line comments.
2.js - Data types, assigning & declaring variables, console.log().
3.js - Camel case.
4.js - Working with numbers.
5.js - Compound assignment & augmented addition.
6.js - Using escape character in a string.
7.js - Escape sequences.
8.js - Appending variables to string & finding it's length.
9.js - String immutability (individual characters cannot be changed).
10.js - Arrays
11.js - Array functions: push(),pop(),shift(),unshift().
12.js - Example of a nested array: Shopping List.
13.js - Functions, local and global variables.
14.js - Simulating a queue & JSON Stringify (a way to convert arrays to strings).
15.js - If condition.
16.js - Strict equality & strict inequality operator. (===)
17.js - Switch case
18.js - Returning boolean values from functions i.e. using return instead of if else.
19.js - Returning undefined for invalid inputs.
20.js - Counting cards.
21.js - Objects in JavaScript.
27.js - Objects are called by reference, primitive values are called by value.
22.js - Variables in JavaScript, typeof
23.js - a to the power of b (a^b)
24.js - Working with boolean values.
25.js - Binary Search
26.js - Linear Search
28.js - Local variable is prioritised over global variable, if both have the same variable name.
29.js - [HTML] Information about how JavaScript works with HTML.
> Iterating a single item
> Iterating a list of items
> using for loop to change values of elements.
> querySelector(), querySelectorAll()
> getElementById()
> var.innerText
> addEventListener()
33.js - ES6 (ECMA Script v6), array destructuring
34.js - Arrow Functions in ES6
35.js - Using arrow function to return if a number is even or odd.
36.js - Array functions
37.js - Multi-line strings in ES6.
38.js - Using Array functions & Arrow functions to filter out the even and odd numbers in an array.
39.js <-> data.json - Fetch API and Promise object
[JavaScript ES6]
40.js - Create an object, change the value of 1 of it's members.
41.js - 'this' keyword in JavaScript.
42.js - bind() method in JavaScript.

[./bot]
> Discord
./src/test-bot.js - Test bot
readme.js - Tells you what all that jargon means.

[React.js]
Port for Development: 3510
A complete list of commands is provided in the 'tutorials & fixes' file.
In short,
> $ cd app_name
> $ npm start
> Go to: http://0.0.0.0:3510
[./playground] - React.js runs here.
Current: Apna Cart (shopping cart)

[Shell] - 
1.sh - $var vs var, where to use which.
2.sh - Switch Case in Shell.

[Android] - 
1_ActivityLifecycle -
activity_main.xml: Linear Layout
activity_main_relative_layout.xml: Relative Layout
scrollview_example.xml: Scroll View
AvengersActivity1.kt <-> avengers_login.xml: Avengers Login Page
> Check the username and password of the user, log the user in if they match
> Display a toast if the password is incorrect.
> Start another activity (& switch to it) if the credentials are correct (Intent).
MainActivity.kt:
> Send a string to another activity (ScrollViewActivity.kt) using intents.
> Use Shared Preferences to save the user's credentials.
ScrollViewActivity.kt <-> scrollview_example.xml: The Activity displayed after login.
2_Module3Project:

3_Bookhub:
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

[Swift] - 
Test: swift test
Run: swift file.swift
1.swift - Swift Basics
> Variables & Constants
> Functions

[Exercism]
[./java] 
Prerequisites:
$ curl -s "https://get.sdkman.io"
$ sdk install gradle
Test: $ gradle test

[./javascript] 
Prerequisites:
$ pacman -S npm
Test: $ npm test

[./kotlin]
Prerequisites:
$ curl -s "https://get.sdkman.io"
$ sdk install gradle
Test: $ gradle test
