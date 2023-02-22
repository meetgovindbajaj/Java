import java.util.Scanner;

public class Help_ramu {
    public static int min(int a, int b, int c) {

        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else
            return c;
    }

    @SuppressWarnings("resource")
	public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int q = 1; q <= n; q++) {
            int c1 = scn.nextInt(), c2 = scn.nextInt(), c3 = scn.nextInt(), c4 = scn.nextInt();
            int rnum = scn.nextInt(), cnum = scn.nextInt();
            int[] numr = new int[rnum], numc = new int[cnum];
            int totalridesrick = 0, totalridescab = 0;
            for (int i = 1; i <= rnum; i++) {
                numr[i - 1] = scn.nextInt();
                totalridesrick += numr[i - 1];
            }
            for (int i = 1; i <= cnum; i++) {
                numc[i - 1] = scn.nextInt();
                totalridescab += numc[i - 1];
            }
            int i = 0;
            int ric = 0;   //To store total cost of ride in rickshaw with considering case 2 .. one rickshaw unlimited
            while (i < rnum) {               //If the value of total rides in a rickshaw is greater than unlimited rides in that rickshaw then unlimited rides is taken
                int rickshaw_sum = c1 * numr[i];
                if (rickshaw_sum > c2) {
                    ric += c2;
                } else {
                    ric += rickshaw_sum;
                }
                i++;
            }
            i = 0;
            int c = 0;    //To store total cost of ride in cab with considering case 2 .. one cab unlimited
            while (i < cnum) {    //If the value of total rides in a cab is greater than unlimited rides in that cab then unlimited rides is taken
                int cab_sum = c1 * numc[i];
                if (cab_sum > c2) {
                    c += c2;
                } else {
                    c += cab_sum;
                }
                i++;
            }
            int rickshaw = min(c3, ric, c1 * totalridesrick);

            int cab = min(c3, c, c1 * totalridescab);

            System.out.println(min(rickshaw + cab, c4, Integer.MAX_VALUE));
        }
    }
}