/**
@start--------------------------------------------

@param Question
Hitesh has an array A of N integers. He wants his friend to sort the array in the non-decreasing order. Since it would be a too easy problem, Hitesh allows him to use only the following operation:

Choose indices i and j such that 1 ≤ i, j ≤ n, and |i−j|≥X. Then, swap elements A[i] and A[j].

Can you tell if there is a way to sort the array in the non-decreasing order by using the operation written above some finite number of times (possibly 0)?


@param Input-Format
The first line contains two integers, N and X.

The second line contains N space-separated integers.


@param Output-Format
If you can sort the array in non-decreasing order using the operation written above, output "YES" (without quotes). Otherwise, output "NO" (without quotes).


@param Input
5 2
5 1 2 3 4


@param Output
YES


@param Explaination
In this test case, you can do the operations as follows:

-   [5,1,2,3,4], swap(a1,a3)
-   [2,1,5,3,4], swap(a2,a5)
-   [2,4,5,3,1], swap(a2,a4)
-   [2,3,5,4,1], swap(a1,a5)
-   [1,3,5,4,2], swap(a2,a5)
-   [1,2,5,4,3], swap(a3,a5)
-   [1,2,3,4,5]

(Here, swap(ai, aj) refers to swapping elements at positions i, j).


@param Input
3 3
3 2 1


@param Output
NO


@param Explaination
You can not do any operations.


@param Constraints
1 ≤ X ≤ N ≤10⁵

1 ≤ A[i] ≤ 10⁹

@end--------------------------------------------
*/



import java.util.*;

public class Array_Swaps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++)
            sc.nextInt();
        System.out.println(n / x <= 1 ? "NO" : "YES");
    }
}
