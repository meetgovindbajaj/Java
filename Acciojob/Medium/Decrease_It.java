/**
@start--------------------------------------------

@param Question
Bob has an array A of N integers. He is playing a game. He has to make all the elements of the array unique. To do so, he can decrease the values of any elements of the array.

He needs to spend x coins to decrease an element of the array by x. You have to find the minimum number of coins that he has to spend to make all the elements of array unique.


@param Input-Format
The first line contains N.

The next line contains N integers


@param Output-Format
Print the ans in the new line


@param Input
4
2 4 2 4


@param Output
2


@param Explaination
He can decrease one of the 2's to 1, and one 4 to 3. The final array is [2, 4, 1, 3].

He had to spend 2 coins, 1 each, on the two elements.


@param Constraints
None

@end--------------------------------------------
*/


import java.util.*;

public class Decrease_It {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    static int[] arr = new int[10002];

    public static void main(String[] args) {
        int n = sc.nextInt(), x = 1, y;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            y = sc.nextInt();
            al.add(y);
            arr[y]++;
        }
        while (x < n) {
            int num = al.get(x);
            if (arr[num] > 1)
                al.set(x, change(al, num, 1));
            x++;
        }
        System.out.println(count);
    }

    public static int change(ArrayList<Integer> al, int num, int i) {
        count += 1;
        if (!al.contains(num - i)) {
            arr[num]--;
            return num - i;
        }
        return change(al, num, i + 1);
    }
}
