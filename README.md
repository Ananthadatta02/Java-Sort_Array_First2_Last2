# Sort First Two and Last Two Elements in Java

## Overview
This Java program sorts only the first two and last two elements of an array while keeping the rest unchanged. The program takes user input for the array size and elements, extracts the first and last two elements, sorts them, and reinserts them into the original array.

## How It Works

### Step 1: Taking User Input
- The program first asks the user to enter the size of the array.
- The user then inputs the elements of the array one by one.
- The array is printed to confirm the entered values.

### Step 2: Extracting First Two and Last Two Elements
- A new array `newArr[]` of size 4 is created to store the first two and last two elements of the original array.
- A variable `index` is used to track the position in `newArr[]`.
- Using a loop, the program extracts the first two (`arr[0]`, `arr[1]`) and last two (`arr[arr.length-2]`, `arr[arr.length-1]`) elements into `newArr[]`.
- The extracted array is printed.

### Step 3: Sorting the Extracted Elements
- A nested loop is used to sort `newArr[]` in ascending order.
  - The outer loop iterates through each element.
  - The inner loop compares the current element with the previous elements.
  - If a previous element is greater than the current element, they are swapped.
- The sorted `newArr[]` is printed.

### Step 4: Reinserting the Sorted Elements Back
- The sorted elements are placed back in their original positions in `arr[]` using the `index` variable.
- The updated `arr[]` is printed to show the final sorted array.

## Code Explanation

### 1. Declaring and Initializing `arr[]`
```java
int arr[] = new int[size];
```
- An array of size `size` is created based on user input.

### 2. Using a `for` Loop to Take User Input
```java
for(int i=0; i<=arr.length-1; i++)
{
    arr[i] = s.nextInt();
}
```
- This loop iterates through all elements and stores user input into `arr[]`.

### 3. Creating `newArr[]` and Extracting Elements
```java
int newArr[] = new int[4];
int index = 0;
for(int i=0; i<=arr.length-1; i++)
{
    if(i==0 || i==1 || i==arr.length-2 || i==arr.length-1)
    {
        newArr[index++] = arr[i];
    }
}
```
- `newArr[]` stores the first two and last two elements.
- The `index` variable helps in sequentially storing values in `newArr[]`.
- The `if` condition checks if the index is 0, 1, last-2, or last-1 before extracting elements.

### 4. Sorting `newArr[]` Using Nested `for` Loop
```java
for(int i=0; i<=newArr.length-1; i++)
{
    for(int j=0; j<=i-1; j++)
    {
        if(newArr[j] > newArr[i])
        {
            int temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
        }
    }
}
```
- Outer loop iterates through `newArr[]`.
- Inner loop compares and swaps elements if the previous element is greater than the current.
- This sorting technique is a basic variation of **bubble sort**.

### 5. Replacing Sorted Elements Back in `arr[]`
```java
index = 0;
for(int i=0; i<=arr.length-1; i++)
{
    if(i==0 || i==1 || i==arr.length-2 || i==arr.length-1)
    {
        arr[i] = newArr[index++];
    }
}
```
- The sorted elements from `newArr[]` are inserted back into their original positions in `arr[]`.
- The `index` variable ensures correct assignment.

### 6. Printing the Results
```java
System.out.println("Sorted Array" + Arrays.toString(arr));
```
- Displays the final sorted array.

## Example Execution
### Input:
```
Enter the Size
6
Enter the Elements
5 1 7 3 8 2
```
### Output:
```
Original Array: [5, 1, 7, 3, 8, 2]
New Array: [5, 1, 8, 2]
Sorted new Array: [1, 2, 5, 8]
Sorted Array: [1, 2, 7, 3, 5, 8]
```

## Key Features
- Demonstrates **array manipulation** in Java.
- Uses **sorting logic** on a subset of elements.
- Efficient handling of user input.
- Shows how to **modify specific elements** in an array.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Sort_Array_First2_Last2.git
```
