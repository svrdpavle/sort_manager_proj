# Sort Manager
A program that manages different types of sorting algorithms and allows the user to sort a randomised array.
<<<<<<< HEAD
***
=======
*** 
>>>>>>> ce23157f2c24cf81324bb6c26eefbdedd7dfa65e

# Table of Contents
- [**Project Overview**](#project-overview)
  - [**Sorting Algorithms**](#sorting-algorithms)
  - [**Application**](#application)
  - [**Design Choices**](#design-choices)
  - [**Tests**](#testing)
    - [**Sorter Tests**](#sorter-test-cases)
    - [**Performance Tests**](#performance-test-cases)
  - [**Future Steps**](#future-steps)
- [**Project Manual**](#project-manual)

## Project Overview
Sort Manager implements 3 different type of sort algorithms, which all sort an array of integers
into ascending order. These algorithms are tested against various test cases to ensure they are fully
functional.

### Sorting Algorithms
The algorithms included are:
- **Binary Tree Sorter** - Builds a binary search tree from the elements to be sorted, and then traverses the tree so that elements come out in sorted order.
- **Bubble Sorter** - Repeatedly steps through the array, compares adjacent elements and swaps them if they are in the wrong order.
- **Merge Sorter** - Splits the array into half until each sub-array is one element and then recursively merges each sub-array back into a sorted order.

### Application
Once the application is launched, the user is prompted to enter commands to control it.
The user can choose the sorting algorithm to be used and then the size of array they would like to be sorted. Once these
parameters have been inputted by the user, a random array of the size specified is generated and sorted by 
the chosen sorting algorithm. Finally, the application prints the results which include:
the name of the sorter used, the unsorted array, the sorted array and the time taken to finish sorting
in nanoseconds.

### Design Choices
#### Interfaces
The use of interfaces allowed for a level of abstraction, specifying the methods for particular classes and achieving multiple inheritance.

#### Factory
The use of a factory design pattern allowed for various types of objects to be created without necessarily knowing
what kind of object has been created or how it's been created.

### Testing
Two classes of test cases were produced in order to test the functionality and performance of the 3 sorters.

#### Sorter Test Cases
The sorter tests that were run on each sorter include:
1. **Sorting a large array** - Testing that the selected sorter can sort a large array of integer (10,000 values)
2. **Sorting a positive array** - Testing that the selected sorter can sort a positive array of integers
3. **Sorting a negative array** - Testing that the selected sorter can sort a negative array of integers
4. **Sorting a sorted array** - Testing that the selected sorter can sort an array of integers already in ascending order.
5. **Sorting a single element array** - Testing that the selected sorter can sort an array consisting of one element
6. **Sorting an odd sized array** - Testing that the selected sorter can sort an odd sized array
7. **Sorting an array containing duplicates** - Testing that the selected sorter can sort an array of integers including duplicates

#### Performance Test Cases
The performance tests that were run include:
1. **Testing the performance of the binary tree sorter** - Tests how long it takes for the binary tree sorter to sort a large array of integers (10,000 values)
2. **Testing the performance of the bubble sorter** - Tests how long it takes for the bubble sorter to sort a large array of integers (10,000 values)
3. **Testing the performance of the merge sorter** - Tests how long it takes for the merge sorter to sort a large array of integers (10,000 values)


### Future steps
#### GUI
The next step for the project would be creating a graphical user interface for the sort manager,
allowing for a more appealing user experience than the console.

## Project Manual
Instructions in order to run the program:
<<<<<<< HEAD
1.
=======
1. 
>>>>>>> ce23157f2c24cf81324bb6c26eefbdedd7dfa65e
