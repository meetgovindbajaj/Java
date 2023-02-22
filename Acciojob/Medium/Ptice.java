/**
@start--------------------------------------------

@param Question
Adrian, Bruno and Goran wanted to join the bird lovers’ club. However, they did not know that all applicants must pass an entrance exam. The exam consists of n questions, each with three possible answers: A, B and C.

Unfortunately, they couldn’t tell a bird from a whale so they are trying to guess the correct answers. Each of the three boys has a theory of what set of answers will work best:

Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...

Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...

Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

Write a program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.


@param Input-Format
First line contains an integer n denoting number of questions.

Second line contains a string of n letters ‘A’, ‘B’ and ‘C’. These are, in order, the correct answers to the questions in the exam.

Last line contains the indices separated by space.


@param Output-Format
On the first line, output m, the largest number of correct answers one of the three boys gets.

After that, output the names of the boys (in alphabetical order) whose sequences result in m correct answers.


@param Input
9
AAAABBBBB


@param Output
4
Adrian
Bruno
Goran


@param Explaination
Here all 3 have 4 correct answers.


@param Constraints
1 <= n <= 100

@end--------------------------------------------
*/

package Gym.Medium;

import java.util.*;

public class Ptice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ptice(sc.nextInt(), sc.next());
    }

    static void ptice(int n, String key) {
        String adrian = "ABC", bruno = "BABC", goran = "CCAABB";
        int a = 0, b = 0, g = 0, max = 0;
        for (int i = 0; i < n; i++) {
            a += key.charAt(i) == adrian.charAt(i % 3) ? 1 : 0;
            b += key.charAt(i) == bruno.charAt(i % 4) ? 1 : 0;
            g += key.charAt(i) == goran.charAt(i % 6) ? 1 : 0;
            max = Math.max(a, Math.max(b, g));
        }
        System.out.println(
                max + (max == a ? "\nAdrian" : "") + (max == b ? "\nBruno" : "") + (max == g ? "\nGoran" : ""));
    }
}
