/**
@start--------------------------------------------

@param Question
Saurav doesn't like integers that are divisible by 3 or end with the digit 3 in their decimal representation.

Saurav starts to write out positive integers which he likes:

1, 2, 4, 5, 7, 8, 10 .... Output the k-th element of this sequence.


@param Input-Format
The first line of input integer k.


@param Output-Format
Output the k-th element of the sequence liked by Saurav.


@param Input
7


@param Output
10


@param Explaination
None


@param Constraints
1 <= k <= 1000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Hate_Three {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), k = 0;
        while (n > 0) {
            k += 1;
            n -= k % 3 != 0 && k % 10 != 3 ? 1 : 0;
        }
        System.out.println(k);
    }
}
