# Utilities README

## Overview

This project provides a collection of utility methods for array manipulation and string processing in Java. The methods cover various operations such as converting arrays to strings, counting and filtering elements, rotating arrays, and extracting strings based on length.

## Methods

### `getArrayString(int[] array, char separator)`

- **Description**: Converts an integer array to a string with elements separated by a specified character.
- **Concepts Covered**: Exception handling, StringBuffer, looping.

### `getInstances(int[] array, int lowerLimit, int upperLimit)`

- **Description**: Counts the number of elements in an integer array that fall within a specified range.
- **Concepts Covered**: Exception handling, looping, conditional statements.

### `filter(int[] array, int lowerLimit, int upperLimit)`

- **Description**: Filters the elements of an integer array to include only those within a specified range.
- **Concepts Covered**: Exception handling, array manipulation, reusing methods.

### `rotate(int[] array, boolean leftRotation, int positions)`

- **Description**: Rotates the elements of an integer array either to the left or right by a specified number of positions.
- **Concepts Covered**: Exception handling, looping, conditional statements, private helper methods.

### `getArrayStringsLongerThan(StringBuffer[] array, int length)`

- **Description**: Returns an array of `StringBuffer` objects that have a length greater than the specified value.
- **Concepts Covered**: Exception handling, looping, array manipulation.

## Java Concepts Covered

- **Exception Handling**: Handling invalid input and ensuring the robustness of methods.
- **StringBuffer**: Using `StringBuffer` for efficient string manipulation.
- **Looping**: Iterating through arrays using for-loops.
- **Conditional Statements**: Applying conditions to filter and count elements.
- **Array Manipulation**: Creating and modifying arrays based on specific criteria.
- **Private Helper Methods**: Encapsulating functionality within private methods to promote code reuse and clarity.
