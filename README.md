TDD Calculator

Simple calculator program created using TDD.

Features 
- add(int a, int b)
- subtract(int a, int b)
- multiply(int a, int b)
- divide(int a, int b)
- add(String numbers) → returns the sum of numbers in the string
- add(int[] numbers) → returns the sum of numbers in the array

Git Log (git log --oneline command)
dc3b28c – Overloaded the add method to take an array of numbers as input and return their sum  
ceb4c0d – Added a new test for the add method that can take an array of numbers as input and return their sum  
9837af1 – Added a new test for the add method that can take a String as input and return the sum of comma-separated numbers  
e23a027 – Added a new test for the add method that can take a String as input and return the sum of the numbers in the String  
7b32295 – Created branch featureAddString and made changes to the add method by overloading it to take a String input  
a657a5f – Tests driven and methods implemented one by one in Calculator class with addition, subtraction, multiplication and division  
56cf527 – CalculatorTest class added  
808d064 – Dependencies added to pom.xml file  
273081c – TDD package created and Calculator class added  
