/**
@start--------------------------------------------

@param Question
Ramesh is given two arrays, arr1 and arr2. He wants to sort arr1 in such a way that the relative order of arr2 is maintained in arr1. For elements that are not present in arr2, he wants to add the these elements at the end of the array in sorted fashion.

Can you help Ramesh achieve this task?


@param Input-Format
First line contains two integers n and m denoting size of arrays arr1 and arr2 respectively.

Second line contains n space separated integers denoting the array arr1.

Third line contains m space separated integers denoting the array arr2.


@param Output-Format
Print the relatively sorted arr1


@param Input
11 4
2 1 2 5 7 1 9 3 6 8 8
2 1 8 3


@param Output
2 2 1 1 8 8 3 5 6 7 9


@param Explaination
arr1 is sorted according to arr2 elements, hence 2 comes before 1, 1 before 8 and 8 before 3. Elements not in arr2 are sorted and appended at the end of arr1.


@param Constraints
1<= n <= 10^5

0 <= arr1[i], arr2[i] <= 10^9

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Relative_Sorting {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        input(n, al1);
        input(m, al2);
        relativeSorting(n, m, al1, al2);
    }

    public static void input(int n, ArrayList<Integer> al) {
        while (--n >= 0)
            al.add(sc.nextInt());
    }

    public static void relativeSorting(int n, int m, ArrayList<Integer> al1, ArrayList<Integer> al2) {
        for (Integer e : al2) {
            System.out.print((e + " ").repeat(Collections.frequency(al1, e)));
            al1.removeIf(s -> s == e);
        }
        Collections.sort(al1);
        for (Integer e : al1)
            System.out.print(e + " ");
    }
}
