/**
@start--------------------------------------------

@param Question
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".


@param Input-Format
2 strings


@param Output-Format
return no. of jewels present in stones


@param Input
aA
aAAbbbb


@param Output
3


@param Explaination
None


@param Constraints
1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.

@end--------------------------------------------
*/


import java.util.*;

public class Jewels_And_Stones {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String jewels = sc.next();
        String stones = sc.next();
        System.out.println(numJewelsInStones(jewels, stones));
    }

    // runtime < 6ms
    public static int numJewelsInStones(String jewels, String stones) {
        return stones.replaceAll("[^" + jewels + "]", "").length();
    }

    // runtime < 1ms
    public static int numJewelsInStones1(String jewels, String stones) {
        int count = 0;
        for (char a : jewels.toCharArray())
            for (char b : stones.toCharArray())
                if (a == b)
                    count++;
        return count;
    }
}