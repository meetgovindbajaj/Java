/**
@start--------------------------------------------

@param Question
You are given a string 'S'. You need to compress it using the following algorithms:

Take an empty string res. For every block of consecutive repeating character, do the following:

If the size of block is 1, concatenate it to the end of `S`.
Else, concatenate the character followed by the size of the block.

Return res after completing the above operations on the whole string

Note

StringBuilder in Java represents a mutable sequence of characters.


@param Input-Format
The first line contains the number of test cases.

For each test case: The first line contains the string 'S'


@param Output-Format
For each test case return the string res. Input and output is inbuilt.


@param Input
1
abbbccd


@param Output
ab3c2d


@param Explaination
a occurs once, so, we add a to res.

Then, b is repeated 3 times so, b3 is added.

Then, c is repeated 2 times so, c2 is added.

d occurs once, so, we add d to res.


@param Constraints
1 <= T <= 10
1 <= |S| <= 100000

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;
import java.io.*;

public class Compressed_Strings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            System.out.println(compressedString(br.readLine()));
        }
    }

    public static String compressedString(String s) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(s.split("")));
        StringBuilder res = new StringBuilder();
        String prev = al.get(0), curr;
        int count = 1;
        for (int i = 1; i < al.size(); i++) {
            curr = al.get(i);
            if (prev.equals(curr)) {
                count += 1;
            } else {
                res.append(prev + (count > 1 ? count : ""));
                count = 1;
            }
            prev = curr;
        }
        res.append(prev + (count > 1 ? count : ""));
        return res.toString();
    }
}
