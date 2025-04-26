# Linked Lists and Stack Implementation

This repository contains implementations and tests for linked list traversal algorithms and stack data structures.

## Overview

This project demonstrates key concepts in data structures implementation and testing:
- Implementing and testing methods to iterate over linked lists
- Analyzing time complexity of algorithms
- Implementing a stack data structure using linked nodes
- Applying Test-Driven Development (TDD) methodology


## Implemented Features

### LinkedList

The `LinkedList` class includes implementation of two core iteration methods:

1. **size()** - Returns the number of nodes in the linked list
   - Returns 0 for empty lists
   - Time Complexity: O(n)

2. **total()** - Calculates the sum of all values in the linked list
   - Returns 0 for empty lists
   - Time Complexity: O(n)

### Stack

The `Stack` class implements a standard stack data structure with the following operations:

1. **push(int o)** - Adds an element to the top of the stack
   - Time Complexity: O(1)

2. **pop()** - Removes and returns the top element
   - Time Complexity: O(1)
   - Throws StackException when stack is empty

3. **top()** - Returns the top element without removing it
   - Time Complexity: O(1)
   - Throws StackException when stack is empty

## Testing

### LinkedListTest

Tests include verification of:
- Size of empty lists
- Size of lists with multiple elements
- Consistent results from successive calls to size()
- Sum calculation for empty lists
- Sum calculation for lists with multiple elements
- Consistent results from successive calls to total()
- Exception handling for operations on empty lists

### StackTest

Tests include verification of:
- Push operation
- Pop operation
- Top operation
- Empty condition after pushing and popping
- Exception handling for operations on empty stacks




