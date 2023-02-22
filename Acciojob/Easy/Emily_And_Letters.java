/**
@start--------------------------------------------

@param Question
There was a young woman named Emily who worked as a librarian at a large public library. She was very organized and had a great memory, which helped her keep track of all the books in the library''s collection.

One day, a patron came to Emily and asked her to help them find a book with a specific title. Emily searched through the library''s database and found several books with the same title, but none of them seemed to match the description provided by the patron. She was about to give up when she remembered that the patron had also mentioned the author of the book.

Emily quickly searched the database again and this time, she noticed that there was only one book with the same title and author as the one described by the patron. She triumphantly retrieved the book and handed it to the patron, who was delighted to finally have found the book they were looking for.

As Emily was putting the rest of the books back on the shelf, she realized that it would have been much easier to find the book if she had a system in place to keep track of which books were unique in the library''s collection. She decided to write a program that would take a string representing the title of a book, and return the index of the first non-repeating character in the string. If there were no non-repeating characters in the string, the program would return -1. Can you help Emily write this program?


@param Input-Format
The first line of input contains a string.


@param Output-Format
The first line of output contains the index of the first non-repeating character in the string. If there are no non-repeating characters in the string, the program should return -1.


@param Input
leetcode


@param Output
0


@param Explained
The first non-repeating character in the string is ''l'', which has an index of 0.


@param Constraints
1 <= length of string <= 10^5

The string will only contain lowercase English letters.

@end--------------------------------------------
*/



import java.util.*;

public class Emily_And_Letters {
    static Scanner sc = new Scanner(System.in);
    static String s = sc.next();
    static List<String> str1 = Arrays.asList(s.split(""));

    public static void main(String[] args) {
        System.out.println(firstUniqueChar(0));
    }

    public static int firstUniqueChar(int i) {
        return i >= s.length() ? -1 : freqChecker(Character.toString(s.charAt(i))) == 1 ? i : firstUniqueChar(i + 1);
    }

    public static int freqChecker(String s) {
        return Collections.frequency(str1, s);
    }
    // if (i >= s.length())
    // return -1;
    // if (freqChecker(Character.toString(s.charAt(i))) == 1)
    // return i;
    // else
    // return firstUniqueChar(i + 1);
}
