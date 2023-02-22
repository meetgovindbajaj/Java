/*
Given an array arr with n positive integers. Find if the array contains any duplicates.

input format:
The first line of input contains the integer n.
The last line contains n spaced integers.

output format:
For each test case print true if duplicates are present or print false if duplicates are not present.

input: 4
1 2 3 1

output: true

explained: 1 is duplicate here.

constraints: 
1 <= n <= 10000
0 <= arr[i] <= 100000

*/


import java.util.*;

public class Contains_Duplicate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        checkDuplicate(arr, 0, 1, false, size);
    }

    public static void checkDuplicate(int[] arr, int startIndex, int endIndex, Boolean isDuplicate, int size) {
        if (isDuplicate || (startIndex > size - 2 && endIndex > size - 1)) {
            System.out.print(isDuplicate);
            return;
        }
        if (endIndex > size - 1) {
            checkDuplicate(arr, startIndex + 1, startIndex + 2, isDuplicate, size);
        }
        if (endIndex < size && arr[endIndex] == arr[startIndex]) {
            checkDuplicate(arr, startIndex, endIndex + 1, true, size);
        } else if (endIndex < size && arr[endIndex] != arr[startIndex]) {
            checkDuplicate(arr, startIndex, endIndex + 1, isDuplicate, size);
        }
    }
}
