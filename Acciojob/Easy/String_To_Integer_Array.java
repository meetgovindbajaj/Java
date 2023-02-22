/**
@start--------------------------------------------

@param Question
You are given a string S, consisting of , separated positive integers. You need to form an array by extracting these integers from the given string.

It is guaranteed that the formed integers will fit in 32-bit signed integer.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains the string S


@param Output-Format
For each test case print the final formed array.


@param Input
1
1321,3213,424,124


@param Output
[1321, 3213, 424, 124]


@param Explaination
The first integer is 1321 which is separated from 3213 by ','. 3213 is separated from 424 which is further separated from 124.


@param Constraints
1 <= T <= 10

1 <= |S| <= 100000

@end--------------------------------------------
*/



import java.io.*;
import java.util.*;

public class String_To_Integer_Array {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.println(ans.toString());
        }
    }

    static ArrayList<Integer> arrayGenerator(String s) {
        ArrayList<String> als = new ArrayList<>(Arrays.asList(s.split(",")));
        ArrayList<Integer> ali = new ArrayList<>();
        als.forEach(str -> ali.add(Integer.parseInt(str)));
        return ali;
    }
}
