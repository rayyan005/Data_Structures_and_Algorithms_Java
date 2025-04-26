# Stack Implementation & Polish Notation Calculator

## Overview
This project demonstrates fundamental data structures and algorithms concepts implemented in Java. It features a custom Stack implementation, string array reversal algorithm, and a Polish notation calculator.

## 🚀 Features

### Stack Implementation
- Custom Stack ADT implementation with push, pop, top operations
- Exception handling for empty/full stack scenarios
- Configurable capacity with default and custom sizing options

### String Array Reversal
- Algorithm to reverse elements in a string array
- Utilizes the custom Stack data structure
- O(n) time complexity implementation

### Polish Notation Calculator
- Evaluates mathematical expressions in Polish notation
- Supports addition and subtraction operations
- Implements operator detection and numeric conversion


## 📋 Examples

### Stack Usage
```java
Stack myStack = new Stack(10);
myStack.push("Hello");
myStack.push("World");
System.out.println(myStack.pop()); // Outputs: World
```

### String Array Reversal
```java
String[] array = {"A", "B", "C"};
Reverse.reverse(array);
// array is now {"C", "B", "A"}
```

### Polish Notation Calculation
```java
String[] expression = {"+", "-", "3", "5", "2"};
int result = Calculator.calculate(expression);
// result equals 0 (3 - (5 + 2))
```

## 🧪 Test Coverage
- Comprehensive unit tests for all major components
- Edge case handling for empty arrays, stack operations
- Mathematical operation validation

