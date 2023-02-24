/**
@start--------------------------------------------

@param Question
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice.

Return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space."


@param Input-Format
The first line contains a single integer n (size of the array)

Second line contains n-spaced integers representing the array


@param Output-Format
Print all the elements that appear twice in a sorted manner


@param Input
8
4 3 2 7 8 2 3 1


@param Output
2 3


@param Explaination
2 and 3 are only the elements that are repeated twice


@param Constraints
1 <= n <= 10^5

0 <= arr[i] <= 10^9

@end--------------------------------------------
*/



import java.util.*;

public class Find_All_Duplicates_In_An_Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        duplicates(arr);
    }

    public static void duplicates(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> s = new TreeSet<>();
        for (int i : arr)
            if (Collections.frequency(al, i) < 1)
                al.add(i);
            else
                s.add(i);
        s.forEach(i -> System.out.print(i + " "));
    }
}
