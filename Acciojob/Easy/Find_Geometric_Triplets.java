/**
@start--------------------------------------------

@param Question
Write a program to print all the triplets that form a geometric progression. All the elements of the array are in increasing order of their value.


@param Input-Format
Input consists of two lines.

First line contains an integer N denoting size of array

Second line contains N integers denoting the array elements separated by single space


@param Output-Format
Print all the triplets that form a geometric progression, each in a new line. Print each geometric triplet in lexicographic form i.e. if a set of triplet has a lesser value at the same position compared to some other triplet then it has to be printed before the latter one.


@param Input
6
1 2 6 10 18 54


@param Output
2 6 18 
6 18 54


@param Explaination
None


@param Constraints
1 <= arr.size() <= 10

@end--------------------------------------------
*/



import java.util.*;

public class Find_Geometric_Triplets {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] arr = new double[n];
        input(n, arr);
        geometricTriplets(n, arr);
    }

    public static void input(int n, double[] arr) {
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextDouble();
    }

    public static void geometricTriplets(int n, double[] arr) {
        int i = 0, j = 1, k = 2;
        while (i < n - 2 && j <= n - 1 && k <= n) {
            if (k == n && j < n - 1) {
                j += 1;
                k = j + 1;
            } else if (j == n - 1) {
                i += 1;
                j = i + 1;
                k = j + 1;
            } else {
                if (arr[j] / arr[i] == arr[k] / arr[j])
                    System.out.println((int) arr[i] + " " + (int) arr[j] + " " + (int) arr[k]);
                k++;
            }
        }
    }
}