/**
@start--------------------------------------------

@param Question
You are given a 0-indexed array of integers arr of length n and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: Your task is to complete the function printFirstNegativeInteger() which takes the array arr, its size n and an integer k as inputs and returns the first negative number in every window of size k starting from the first till the end. If a window does not contain a negative integer , then return 0 for that window.


@param Input-Format
The first line contains an integer n denoting the size of the array arr. The next line contains n space separated integers forming the array arr. The last line contains the window size k.


@param Output-Format
Print the first negative integer in each window of size k seperated by a space.


@param Input
9
-10 20 -30 -40 50 60 -70 80 90
3


@param Output
-10 -30 -30 -40 -70 -70 -70 


@param Explaination
The windows of size 3 with their first negative integers are as follows:-
[-10, 20, -30] => -10 
[20, -30, -40] => -30 
[-30, -40, 50] => -30
[-40, 50, 60] => -40
[50, 60, -70] => -70 
[60, -70, 80] => -70 
[-70, 80, 90] => -70 


@param Constraints
1 <= n <= 10^5

10^-5 <= arr[i] <= 10^5

1 <= k <= n

@end--------------------------------------------
*/


import java.util.*;

public class First_Negative_Integer_In_Every_Window_Of_Size_K {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        subArr(arr, n, k).forEach(s -> System.out.print(s + " "));
    }

    public static ArrayList<Integer> subArr(int[] arr, int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if ((j - i + 1) == k) {
                    Boolean check = true;
                    for (int l = i; l <= j && check; l++)
                        if (arr[l] < 0) {
                            al.add(arr[l]);
                            check = false;
                        }
                    if (check)
                        al.add(0);
                }
        return al;
    }
}