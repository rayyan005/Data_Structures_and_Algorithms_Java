# Binary Search Tree & Priority Queue Implementation

This repository showcases my implementation of binary search trees, priority queues, and sorting algorithms. The project demonstrates tree traversal techniques, priority queue operations, and efficient sorting methods.

## Overview

The project implements:
- Binary Search Tree with in-order traversal algorithms
- Priority Queue implementation and testing
- Sorting algorithm using a Priority Queue

## Implementations

### Binary Search Tree

The Binary Search Tree implementation includes:
- Basic BST operations (insert, delete, search)
- In-order traversal that prints node values
- In-order traversal that returns a doubly linked list of node values

### Priority Queue

The Priority Queue implementation provides:
- `insert` operation to add elements
- `min` operation to retrieve the minimum element
- `removeMin` operation to retrieve and remove the minimum element

### Sorting Algorithm

A sorting algorithm that uses the Priority Queue to sort an array in-place:
1. Insert all elements from the array into a priority queue
2. Extract elements in order using `removeMin()` and place them back in the array

## Test Cases

The project includes JUnit tests for:
- Binary Search Tree traversal operations
- Priority Queue operations
- Sort algorithm validation

## How It Works

### In-Order Traversal

The in-order traversal algorithm visits nodes in the following order:
1. Recursively traverse the left subtree
2. Visit the root node
3. Recursively traverse the right subtree

This ensures elements are visited in ascending order in a BST.

### Sorting with a Priority Queue

The sorting algorithm works by:
1. Pushing all elements into a priority queue
2. Extracting elements in sorted order (using `removeMin()`)
3. Placing them back into the original array

This approach has O(n log n) time complexity.

