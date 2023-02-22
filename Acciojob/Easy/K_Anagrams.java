/**
@start--------------------------------------------

@param Question
Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if two strings are K-anagrams of each other or not.

Two strings are called K-anagrams if both of the below conditions are true.

Both have same number of characters.

Two strings can become anagram by changing at most K characters in a string.


@param Input-Format
Take input of k

Take input of two strings in the same line.


@param Output-Format
Output 1 for true and 0 for false.


@param Input
2
fodr gork


@param Output
1


@param Explained
Can change fd to gk


@param Constraints
1 ≤ length of String ≤ 105

1 ≤ K ≤ length of String

@end--------------------------------------------
*/

package Gym.Easy;

import java.util.*;

public class K_Anagrams {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int k = sc.nextInt();
            List<String> str1 = Arrays.asList(sc.next().split(""));
            List<String> str2 = Arrays.asList(sc.next().split(""));
            Set<String> strSet = new HashSet<>();
            strSet.addAll(str1);
            strSet.addAll(str2);
            int changed1 = 0, changed2 = 0;
            Boolean checker = false;
            if (str1.size() == str2.size()) {
                checker = true;
                for (String s : strSet) {
                    int freq1 = Collections.frequency(str1, s);
                    int freq2 = Collections.frequency(str2, s);
                    if (freq1 != freq2) {
                        if (freq1 > freq2) {
                            changed1 += freq1 - freq2;
                        } else {
                            changed2 += freq2 - freq1;
                        }
                    }
                }
            }
            System.out.println(checker && (k >= (changed1 > changed2 ? changed2 : changed1)) ? 1 : 0);
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}
