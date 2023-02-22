/*
Jesse loves cookies and wants the sweetness of some cookies to be greater than value k. To do this, two cookies with the least sweetness are repeatedly mixed. This creates a special combined cookie with:

sweetness = (1 * Least sweet cookie + 2 * 2nd least sweet cookie).

This occurs until all the cookies have a sweetness>=k.

Given the sweetness of a number of cookies, determine the minimum number of operations required. If it is not possible, print -1.

----------------------------------------------------------------------------------

input format:
Line 1 contains two space-separated integers n and k denoting size of array of sweetness values and the minimum required sweetness required.

Line 2 contains n spaced integers denoting elements of array.

----------------------------------------------------------------------------------

output format:
Print a single integer denoting number of operations required or if it is not possible print -1.

----------------------------------------------------------------------------------

input:
6 7
1 2 3 9 10 12

----------------------------------------------------------------------------------

output:
2

----------------------------------------------------------------------------------

explained:
Combine the first two cookies to create a cookie with sweetness = 1*1 + 2*2=5

After this operation, the cookies are 3,5,9,10,12.

Then, combine the cookies with sweetness 3 and sweetness 5, to create a cookie with resulting sweetness = 1*3 + 2*5= 13

Now, the cookies are 9,10,12,13.

All the cookies have a sweetness>=7.

Thus, 2 operations are required to increase the sweetness.

----------------------------------------------------------------------------------

constraints:
1<=n<=10^6

0<=k<=10^9

0<=A[i]<=10^6
*/
package Gym.Easy;

import java.util.*;

public class Jesse_And_Cookies {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        System.out.println(stepsCounter(a, k));
    }

    public static int stepsCounter(List<Integer> arr, int sweetness) {
        int counter = 0;
        while (!sweetnessChecker(arr, sweetness)) {
            arr.set(1, (arr.get(0) * 1) + (arr.get(1) * 2));
            arr.remove(0);
            Collections.sort(arr);
            ++counter;
        }
        return counter;
    }

    public static Boolean sweetnessChecker(List<Integer> arr, int sweetness) {
        return Collections.min(arr) < sweetness ? false : true;
    }
}
