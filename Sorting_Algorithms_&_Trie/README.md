# Sorting Algorithms & Advanced Data Structures

This repository contains implementations of fundamental data structures and algorithms.

## Overview

This project implements several key data structures and algorithms used in computer science:

- **Sorting Algorithms**: Implementation and comparison of different sorting techniques
- **Trie Data Structure**: An efficient tree-like data structure for string retrieval operations
- **Doubly Linked List**: A bidirectional linked list implementation with sorting capabilities

## Components

### Sorting Algorithms (`ArraySort.java`)

Multiple sorting algorithms implemented and compared:

- **Insertion Sort**: O(n²) in-place comparison-based sorting algorithm
- **Bubble Sort**: O(n²) simple comparison-based algorithm
- **Quick Sort**: O(n log n) efficient divide-and-conquer sorting algorithm

Each algorithm is thoroughly tested in the `ArraySortTest.java` class.

### Trie Implementation (`Trie.java`)

A complete implementation of the Trie data structure that supports:

- Word insertion
- Word deletion
- Word searching
- Prefix-based word retrieval
- Word counting

The Trie is particularly efficient for dictionary operations and prefix-based queries, with comprehensive tests in `TrieTest.java`.

### Doubly Linked List (`DLinkedList.java`)

A bidirectional linked list implementation that includes:

- Head and tail node access
- Node insertion at head/tail
- Node deletion from head/tail
- List size calculation
- Sorting capabilities (insertion sort)

Tested thoroughly in `DLinkedListTest.java`.

## Testing

All implementations come with JUnit tests that verify:
- Correctness of the algorithms
- Edge cases (empty collections, single elements)
- Performance characteristics

