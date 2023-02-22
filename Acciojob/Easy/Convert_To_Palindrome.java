/**
@start--------------------------------------------

@param Question
Given a string S consisting only of lowercase characters. We need to check whether it is possible to make this string a palindrome after removing exactly one character from this.

If it is possible then print 1 else return 0.


@param Input-Format
The first line given is the string S.


@param Output-Format
Print 1 if it is possible to convert S to palindrome by removing exactly one character else return 0.


@param Input
abcba


@param Output
1


@param Explaination
We can remove character 'c' to make string palindrome.


@param Constraints
3 <= |S| <= 10^5

S[i] is always a lowercase character.

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class Convert_To_Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sol(sc.nextLine()));
    }

    static int sol(String s) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList(s.split("")));
        int i = 0, j = str.size() - 1;
        Boolean isOdd = str.size() % 2 == 0 ? false : true;
        while (i < j) {
            if (str.get(i).equals(str.get(j))) {
                str.remove(i);
                j--;
                str.remove(j);
                j--;
            } else {
                i++;
                j--;
            }

        }
        if ((isOdd && (str.size() + 1) / 2 > 2) || (!isOdd && str.size() / 2 > 1)) {
            return 0;
        }
        return 1;
    }
}