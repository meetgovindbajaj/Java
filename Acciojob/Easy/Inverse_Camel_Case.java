/**
@start--------------------------------------------

@param Question
One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case.

You are given a string S, written in Camel Case. Find All The Words Contained In It.

Note Complete the given function. The input would be handled by the driver code. You only have to print the answer.


@param Input-Format
The only line contains the string S.


@param Output-Format
Print each word in a new line


@param Input
IAmAJavaProgrammer


@param Output
I
Am
A
Java
Programmer


@param Explaination
We separate each word and print them in a new line.


@param Constraints
1 <= |str| <= 10000

@end--------------------------------------------
*/



import java.util.*;

public class Inverse_Camel_Case {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inverseCamelCase(sc.next(), 0);
    }

    public static void inverseCamelCase(String s, int i) {
        for (char c : s.toCharArray())
            System.out.print(c >= 'A' && c <= 'Z' && i++ != 0 ? "\n" + c : c);
    }
}
