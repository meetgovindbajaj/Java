/**
@start--------------------------------------------

@param Question
You are given an integer 'N' and an empty string 'S'. You need to modify the string using the given operations to make it of length 'N'.

Insert the first character in the beginning of string, the second in the end, the third in the beginning, fourth in the end, and so on.

The first character should be a, followed by b, c, and so on. z will be followed by a.

Note: StringBuilder in Java represents a mutable sequence of characters.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains a single integer 'N'.


@param Output-Format
For each test case print the string 'S' of length 'N' in a new line.


@param Input
1
4


@param Output
cabd


@param Explaination
The first character to be inserted in the beginning is 'a', second is 'b' which is inserted at the end making our string as 'ab',

third character 'c', is inserted in the beginning which makes our string 'cab', the fourth character 'd' is inserted in the end making our stirng as cabd.


@param Constraints
1 <= T <= 10

1 <= N <= 500000

@end--------------------------------------------
*/



import java.util.*;

public class Strange_String {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        while (n-- > 0)
            System.out.println(strangeString(sc.nextInt()));
    }

    public static StringBuilder strangeString(int n) {
        StringBuilder sb = new StringBuilder();
        int ch = 97, i = -1;
        Boolean toggle = true;
        while (++i < n) {
            sb.insert(toggle ? 0 : sb.length(), (char) ch);
            toggle = !toggle;
            ch = ch + 1 > 'z' ? 'a' : ch + 1;
        }
        return sb;
    }
}