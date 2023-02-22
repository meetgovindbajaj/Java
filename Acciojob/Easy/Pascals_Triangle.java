/**
@start--------------------------------------------

@param Question
You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.


@param Input-Format
You are given a single integer n representing the number of rows of pascal's triangle.


@param Output-Format
Print n lines of output, where ith line represents the ith row of the triangle.


@param Input
5


@param Output
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1


@param Explaination
None


@param Constraints
1<= n <= 30

@end--------------------------------------------
*/



import java.util.*;

public class Pascals_Triangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(sc.nextInt());
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++)
                System.out.print(triangle.get(i).get(j) + " ");
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {
        int j = 0, x = 0;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al.add(new ArrayList<>());
        while (x < n) {
            al.get(x).add((j == 0 || j == x) ? 1 : al.get(x - 1).get(j) + al.get(x - 1).get(j - 1));
            if (j == x) {
                x += 1;
                j = 0;
                al.add(new ArrayList<>());
            } else
                j++;
        }
        return al;
    }
}
