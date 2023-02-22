/**
@start--------------------------------------------

@param Question
You are given array of strings, you need to print words from that array which can be typed using only one row of Keyboard.

First row of keyboard = "qwertyuiop"

Second row of keyboard = "asdfghjkl"

Third row of keyboard = "zxcvbnm"


@param Input-Format
First line contains n number of strings in array

Next n lines contains strings denoting elements of array


@param Output-Format
Print strings which can be formed using single row of keyboard in separate lines


@param Input
3
horse
peter
jass


@param Output
peter
jass


@param Explained
none


@param Constraints
1 <= n <= 1000

1 <= |s| <= 100

Each string consist of lowercase english letter only.

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;
import java.util.regex.Pattern;

public class Word_From_Keyboard {
    static Scanner sc = new Scanner(System.in);
    static final String regex1 = "[qwertyuiop]+", regex2 = "[asdfghjkl]+", regex3 = "[zxcvbnm]+";

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    static ArrayList<String> getStrings(ArrayList<String> arr) {
        arr.removeIf(s -> (!Pattern.matches(regex1, s) && !Pattern.matches(regex2, s)
                && !Pattern.matches(regex3, s)));
        return arr;
    }
}
