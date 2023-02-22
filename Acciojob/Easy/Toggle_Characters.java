/**
@start--------------------------------------------

@param Question
Given a string of length N, toggle the case of all the characters in the string, i.e. You should set all lowercase characters to uppercase and vice versa.

Please note that the string may contain numbers or special characters as well.


@param Input-Format
The input consists of two lines.

The first line of the input contains one integer N, denoting the size of the string.

The second line of the input contains the string S.


@param Output-Format
Your code should output the string S with its characters toggled.


@param Input
4
aBC1


@param Output
Abc1


@param Explaination
All the lower case alphabets got converted into upper case and vice versa.


@param Constraints
1 <= N <= 2*10^5

@end--------------------------------------------
*/



import java.io.*;

public class Toggle_Characters {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        br.readLine();
        toggleCase(new StringBuilder(br.readLine()));
    }

    public static void toggleCase(StringBuilder s) {
        for (char c : s.toString().toCharArray())
            System.out.print((char) (c + (c >= 'a' && c <= 'z' ? -32 : c >= 'A' && c <= 'Z' ? 32 : 0)));
    }
}
