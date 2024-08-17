# Searching Algorithms

This document provides detailed explanations, step-by-step examples, and complexity analysis for Linear Search and Binary Search algorithms.

## 1. Linear Search

### Description
Linear Search is a simple search algorithm that checks each element in a list sequentially until the target element is found or the end of the list is reached.

### Approach
- **Sequential Search**: Examines each element one by one.
- **Unsorted/Sorted**: Can be applied to both unsorted and sorted lists.

### Steps
1. Start from the first element of the list.
2. Compare the current element with the target element.
3. If they match, return the index of the current element.
4. If not, move to the next element.
5. Repeat until the target element is found or the end of the list is reached.

### Example
For an array `[3, 5, 2, 4, 9]` and target `4`:
- Compare `3` with `4` → No match.
- Compare `5` with `4` → No match.
- Compare `2` with `4` → No match.
- Compare `4` with `4` → Match found at index `3`.

### Complexity
- **Best Case**: O(1) - Target is the first element.
- **Average Case**: O(n) - Target is somewhere in the middle.
- **Worst Case**: O(n) - Target is the last element or not present.

---

## 2. Binary Search

### Description
Binary Search is a more efficient search algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search interval in half.

### Approach
- **Divide and Conquer**: Repeatedly splits the search range in half.
- **Sorted List**: Requires the list to be sorted before searching.

### Steps
1. Start with the entire range of the array.
2. Find the middle element of the array.
3. If the middle element is equal to the target, return its index.
4. If the target is less than the middle element, search the left half.
5. If the target is greater than the middle element, search the right half.
6. Repeat the process until the target is found or the search range is empty.

### Example
For a sorted array `[1, 2, 4, 5, 7, 8, 9]` and target `5`:
- **Initial Search Range**: `[1, 2, 4, 5, 7, 8, 9]`
  - Middle element is `5` → Match found at index `3`.

### Complexity
- **Best Case**: O(1) - Target is the middle element.
- **Average Case**: O(log n) - Generally requires splitting the array approximately log₂(n) times.
- **Worst Case**: O(log n) - Target is found after the maximum number of splits.

---

Each search algorithm has its own strengths and use cases. Linear Search is straightforward and applicable to any list, while Binary Search is efficient but requires the list to be sorted.
