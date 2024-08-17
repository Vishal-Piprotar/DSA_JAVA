# Sorting Algorithms

This document provides detailed explanations, step-by-step examples, and complexity analysis for various sorting algorithms:

1. **Bubble Sort**
2. **Selection Sort**
3. **Insertion Sort**
4. **Quick Sort**
5. **Merge Sort**
6. **Counting Sort**
7. **Radix Sort**
8. **Bucket Sort**
9. **Shell Sort**
10. **Heap Sort**

---

## 1. Bubble Sort

### Description
Bubble Sort is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

### Approach
- **Comparison-Based**: Compares adjacent elements and swaps them if necessary.
- **Iterative**: Repeats the comparison and swapping process until no swaps are needed.

### Steps
1. Compare each pair of adjacent elements.
2. Swap them if they are in the wrong order.
3. Repeat the process for all elements.
4. Each pass places the next largest element in its correct position.

### Example
For an array `[64, 34, 25, 12, 22, 11, 90]`:
- **First Pass**:
  - Compare `64` and `34` → Swap to get `[34, 64, 25, 12, 22, 11, 90]`
  - Continue comparisons until the end of the array.
- **Subsequent Passes**: Continue the process with a reduced range until the entire array is sorted.

### Complexity
- **Best Case**: O(n) (when the array is already sorted).
- **Average Case**: O(n²).
- **Worst Case**: O(n²) (when the array is sorted in reverse order).

---

## 2. Selection Sort

### Description
Selection Sort divides the list into a sorted part and an unsorted part. It repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the end of the sorted part.

### Approach
- **Comparison-Based**: Finds the minimum or maximum element in the unsorted part.
- **Iterative**: Moves the boundary between sorted and unsorted parts one step forward.

### Steps
1. Start with the first element and find the minimum element in the unsorted part.
2. Swap the minimum element with the first element of the unsorted part.
3. Move the boundary between sorted and unsorted parts one step forward.
4. Repeat for the remaining unsorted part.

### Example
For an array `[64, 25, 12, 22, 11]`:
- **First Pass**:
  - Find minimum (`11`), swap with `64` → `[11, 25, 12, 22, 64]`.
- **Subsequent Passes**: Continue finding the minimum from the remaining unsorted part and placing it in the correct position.

### Complexity
- **Best Case**: O(n²).
- **Average Case**: O(n²).
- **Worst Case**: O(n²).

---

## 3. Insertion Sort

### Description
Insertion Sort builds the final sorted array one item at a time. It picks the next element and inserts it into its correct position in the already sorted portion of the array.

### Approach
- **Comparison-Based**: Compares and inserts each element into its correct position in the sorted part.
- **Adaptive**: Performs well on partially sorted arrays.

### Steps
1. Start from the second element and compare it with elements before it.
2. Shift elements that are greater than the current element to the right.
3. Insert the current element into its correct position.
4. Repeat for each element in the array.

### Example
For an array `[12, 11, 13, 5, 6]`:
- **First Pass**:
  - `11` compared with `12`, inserted before `12` → `[11, 12, 13, 5, 6]`.
- **Subsequent Passes**: Continue inserting `13`, `5`, and `6` into their correct positions.

### Complexity
- **Best Case**: O(n) (when the array is already sorted).
- **Average Case**: O(n²).
- **Worst Case**: O(n²) (when the array is sorted in reverse order).

---

## 4. Quick Sort

### Description
Quick Sort is a divide-and-conquer algorithm. It selects a 'pivot' element and partitions the array into two sub-arrays: elements less than the pivot and elements greater than the pivot. The sub-arrays are then sorted recursively.

### Approach
- **Divide and Conquer**: Divides the array into sub-arrays and recursively sorts them.
- **Partitioning**: Uses a pivot to partition the array into elements less than and greater than the pivot.

### Steps
1. Choose a pivot element.
2. Partition the array into elements less than and greater than the pivot.
3. Recursively apply Quick Sort to the sub-arrays.
4. Combine the sorted sub-arrays and pivot.

### Example
For an array `[10, 7, 8, 9, 1, 5]` with pivot `5`:
- **Partition**: Rearrange to `[1, 5, 8, 9, 7, 10]`.
- **Sub-arrays**: Apply Quick Sort to `[1]` and `[8, 9, 7, 10]`.

### Complexity
- **Best Case**: O(n log n) (when the pivot is the median).
- **Average Case**: O(n log n).
- **Worst Case**: O(n²) (when the pivot is the smallest or largest element).

---

## 5. Merge Sort

### Description
Merge Sort is a divide-and-conquer algorithm that divides the array into halves, recursively sorts each half, and then merges the sorted halves back together.

### Approach
- **Divide and Conquer**: Divides the array into halves, sorts each half, and merges them.
- **Merging**: Combines two sorted halves into a single sorted array.

### Steps
1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the two sorted halves into a single sorted array.

### Example
For an array `[12, 11, 13, 5, 6, 7]`:
- **Divide**: `[12, 11, 13]` and `[5, 6, 7]`.
- **Sort**: Recursively sort `[12, 11, 13]` to `[11, 12, 13]` and `[5, 6, 7]` remains as is.
- **Merge**: Combine `[11, 12, 13]` and `[5, 6, 7]` into `[5, 6, 7, 11, 12, 13]`.

### Complexity
- **Best Case**: O(n log n).
- **Average Case**: O(n log n).
- **Worst Case**: O(n log n).

---

## 6. Counting Sort

### Description
Counting Sort is a non-comparison-based sorting algorithm that counts the occurrences of each unique element and uses this count to place elements in the correct position in the sorted array.

### Approach
- **Non-Comparison-Based**: Uses counting of elements rather than comparisons.
- **Integer-Based**: Suitable for arrays with integer keys within a known range.

### Steps
1. Find the maximum value in the array.
2. Create a count array and count occurrences of each element.
3. Update the count array to store cumulative counts.
4. Place elements in the output array based on cumulative counts.

### Example
For an array `[4, 2, 2, 8, 3, 3, 1]`:
- **Count Occurrences**: `{1: 1, 2: 2, 3: 2, 4: 1, 8: 1}`
- **Cumulative Count**: `{1: 1, 2: 3, 3: 5, 4: 6, 8: 7}`
- **Place Elements**: `[1, 2, 2, 3, 3, 4, 8]`.

### Complexity
- **Best Case**: O(n + k), where `k` is the range of input values.
- **Average Case**: O(n + k).
- **Worst Case**: O(n + k).

---

## 7. Radix Sort

### Description
Radix Sort is a non-comparison-based algorithm that sorts numbers by processing individual digits. It processes digits starting from the least significant digit to the most significant digit.

### Approach
- **Non-Comparison-Based**: Uses digit-based sorting (typically with Counting Sort).
- **Digit-Based**: Processes each digit from least significant to most significant.

### Steps
1. Find the maximum number to determine the number of digits.
2. Perform Counting Sort for each digit, starting from the least significant digit.
3. Repeat for more significant digits.

### Example
For an array `[170, 45, 75, 90, 802, 24, 2, 66]`:
- **Sort by Least Significant Digit**: `[170, 90, 802, 24, 45, 75, 2, 66]`.
- **Sort by Next Digit**: Continue sorting to get `[2, 24, 45, 66, 75, 90, 170, 802]`.

### Complexity
- **Best Case**: O(nk), where `k` is the number of digits.
- **Average Case**: O(nk).
- **Worst Case**: O(nk).

---

## 8. Bucket Sort

### Description
Bucket Sort distributes elements into several buckets. Each bucket is then sorted individually, either using a different sorting algorithm or recursively applying Bucket Sort.

### Approach
- **Distribute and Sort**: Distributes elements into buckets and sorts each bucket.
- **Combining**: Merges sorted buckets into a single sorted array.

### Steps
1. Create buckets and distribute elements into them based on a criterion.
2. Sort each bucket individually.
3. Concatenate all sorted buckets into a single array.

### Example
For an array `[0.89, 0.34, 0.78, 0.56, 0.12]` with 5 buckets:
- **Distribute**: Place elements into buckets based on their value range.
- **Sort Buckets**: Sort each bucket individually.
- **Concatenate**: Combine the sorted buckets into a single array.

### Complexity
- **Best Case**: O(n + k), where `k` is the number of buckets.
- **Average Case**: O(n + k).
- **Worst Case**: O(n²) (if all elements fall into the same bucket).

---

## 9. Shell Sort

### Description
Shell Sort generalizes insertion sort to allow the exchange of items that are far apart. It uses a sequence of gaps to sort the array and reduces the gap size over time.

### Approach
- **Gap-Based Insertion**: Uses gap sequences to perform insertion sort on elements that are far apart.
- **Adaptive**: The gap size decreases over time to eventually perform a final insertion sort.

### Steps
1. Choose an initial gap size.
2. Perform insertion sort on elements separated by the gap size.
3. Reduce the gap size and repeat the process until the gap size is 1.

### Example
For an array `[12, 34, 54, 2, 3]` with gap sequence `[3, 2, 1]`:
- **Gap 3**: No significant changes.
- **Gap 2**: Sort pairs of elements 2 positions apart.
- **Gap 1**: Final insertion sort.

Sorted array: `[2, 3, 12, 34, 54]`.

### Complexity
- **Best Case**: O(n log n) (with optimal gap sequences).
- **Average Case**: O(n^(3/2)).
- **Worst Case**: O(n²) (for specific gap sequences).

---

## 10. Heap Sort

### Description
Heap Sort builds a heap from the input data and then repeatedly extracts the maximum (or minimum) element from the heap and reconstructs the heap until all elements are sorted.

### Approach
- **Heap-Based**: Builds a heap and sorts by extracting elements from the heap.
- **In-Place**: Does not require additional memory beyond the input array.

### Steps
1. Build a max-heap (or min-heap) from the array.
2. Swap the root of the heap with the last element.
3. Reduce the heap size and heapify the root to maintain the heap property.
4. Repeat the process until the heap is empty.

### Example
For an array `[4, 10, 3, 5, 1]`:
- **Build Heap**: Convert the array into a max-heap.
- **Extract Max**: Swap the root with the last element, reduce the heap size, and heapify.
- **Continue**: Repeat until the heap is empty.

Sorted array: `[1, 3, 4, 5, 10]`.

### Complexity
- **Best Case**: O(n log n).
- **Average Case**: O(n log n).
- **Worst Case**: O(n log n).

---

Each sorting algorithm has its own use cases, advantages, and limitations. Choosing the right algorithm depends on the specific requirements and constraints of your application.