/**
@start--------------------------------------------

@param Question
Given an array arr of size n. You are required to find Smallest greater elements for all elements in arr. If there is no such element for some element in arr then put its smallest greater element as -10000000.

Note: You have to do this question using Bubble Sort


@param Input-Format
First line contains an integer n which is the size of the array.

Second line contains n space separated integers of array arr


@param Output-Format
Return an array of n elements which contains smallest greater elements of each of the n elements of arr


@param Input
4
13 6 17 12


@param Output
17 12 -10000000 13


@param Explaination
None


@param Constraints
1 <= n <= 10000

-10^6 <= arr[i] <= 10^6

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Smallest_Greater_Elements {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        input(n, al);
        ArrayList<Integer> al2 = new ArrayList<>(al);
        bubbleSort(n, al2);
        smallestGreater(n, al, al2);
    }

    public static void bubbleSort(int n, ArrayList<Integer> al) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int a = al.get(j), b = al.get(j + 1);
                if (a > b) {
                    al.set(j, b);
                    al.set(j + 1, a);
                }
            }
        }
        return;
    }

    public static void smallestGreater(int n, ArrayList<Integer> al, ArrayList<Integer> al2) {
        ArrayList<Integer> al3 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            try {
                al3.add(al2.get(al2.lastIndexOf(al.get(i)) + 1));
            } catch (Exception e) {
                al3.add(-10000000);
            }
        }
        print(n, al3);
    }

    public static void input(int n, ArrayList<Integer> al) {
        for (int i = 0; i < n; i++)
            al.add(sc.nextInt());
        return;
    }

    public static void print(int n, ArrayList<Integer> al) {
        for (int i : al)
            System.out.print(i + " ");
    }
}