# Doubly Linked List & Stack Reversal Algorithms

## Overview

This repository contains Java implementations of essential data structures including a doubly linked list (DLinkedList), a linked list-based queue (LQueue), and algorithms for stack reversal. The implementations demonstrate efficient manipulation of linked data structures with an emphasis on:

1. Reversing a stack using only a queue
2. Implementing and testing a linked list-based queue
3. Completing a doubly linked list implementation
4. Reversing a doubly linked list in-place

## Components

### Doubly Linked List (DLinkedList)

A doubly linked list implementation that maintains references to both head and tail nodes. Each node stores a value and references to both the next and previous nodes.

**Features:**
- Add elements at head/tail
- Delete elements from head/tail
- Retrieve elements by index
- Reverse the entire list

### Queue (LQueue)

A queue implementation using a linked list structure, following the First-In-First-Out (FIFO) principle.

**Operations:**
- `enqueue`: Add an element to the end of the queue
- `dequeue`: Remove and return the element from the front of the queue
- `front`: Retrieve the front element without removing it
- `isEmpty`: Check if the queue is empty
- `size`: Get the current size of the queue

### Stack Reversal

The `ReverseStack` class provides functionality to reverse the order of elements in a stack using a queue as an auxiliary data structure. The algorithm:

1. Transfers all elements from the stack to a queue
2. Transfers elements back from the queue to the stack, which effectively reverses the order

## Implementation Details

### Reversal Algorithms

#### Stack Reversal
- Time Complexity: O(N)
- Space Complexity: O(N)
- Uses an auxiliary queue to achieve the reversal

#### Doubly Linked List Reversal
- In-place reversal by swapping next and previous pointers for each node
- Updates head and tail references after reversal

## Testing

The repository includes comprehensive JUnit tests for each data structure:

- `DLinkedListTest.java`: Tests for doubly linked list operations
- `LQueueTest.java`: Tests for queue operations
- `ReverseStackTest.java`: Tests for stack reversal functionality
