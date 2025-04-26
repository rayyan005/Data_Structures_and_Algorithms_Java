# Recursive Algorithms & Visualization

## Overview
This repository demonstrates fundamental concepts of recursion through practical implementations.

This repository contains implementations of:
1. Recursive algorithms (sum, multiplication, Fibonacci)
2. Recursive square patterns using Java Graphics

## Recursive Methods

### 1. Recursive Sum
- Calculates sum of numbers from 1 to n
- Base case: `sum(1) = 1`
- Recursive case: `sum(n) = n + sum(n-1)`
- Time complexity: O(n)

### 2. Recursive Multiplication
- Multiplies two integers using only addition
- Handles positive, negative, and zero cases
- Base case: `multiply(m, 0) = 0`
- Recursive case: `multiply(m, n) = m + multiply(m, n-1)`
- Time complexity: O(n)

### 3. Fibonacci Sequence
- Computes nth Fibonacci number
- Base cases: `Fibonacci(0) = 0`, `Fibonacci(1) = 1`
- Recursive case: `Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)`
- Time complexity: O(2^n) (naive implementation)

## Recursive Squares Visualization

### Features:
- Draws recursive square patterns using Java's Graphics2D
- Each recursive step draws 4 smaller squares at the corners
- Square size halves with each recursion
- Base case: n = 0 (stops recursion)
- Recursive depth configurable (default n=4)

### Implementation Details:
- Uses `Rectangle2D.Double` for drawing
- Recursive method: `drawSquare(Graphics2D g, int x, int y, int length, int n)`
- Pattern creates a fractal-like visual where:
  - A square is drawn at coordinates (100, 100) with side length 100
  - Four squares with side length 50 are drawn at the corners
  - Four squares with side length 25 are drawn at each corner of each level 2 square
  - This pattern continues until reaching the specified recursion depth

## Testing

JUnit tests verify correctness of recursive methods:
- `testSum()`: Verifies sum calculations for n=1 through n=4
- `testMultiplyPositive()`: Tests positive multiplications
- `testMultiplyOneNegative()`: Tests negative operand cases
- `testMultiplyBothNegative()`: Tests double negative case
- `fibonacciTest()`: Verifies Fibonacci sequence calculation for n=8

## How to Run

### Running the Visual Demonstration

To view the recursive squares pattern:

1. Right-click on `RecursiveSquares.java` in Eclipse
2. Select "Run As" -> "Java Application"
3. A window will appear displaying the recursive square pattern
4. You can modify the recursion level by changing the `n` parameter in the `paint` method
