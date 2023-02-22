import java.util.*;

public class MaxCircularSubarraySum {
	static Scanner sc = new Scanner(System.in);

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public static int kadane(int[] a) {// for maximum subarray sum
		int sum = a[0];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < a.length; i++) {
			sum = Math.max(sum + a[i], a[i]);
			if (max < sum)
				max = sum;
		}
		return max;
	}

	public static int carray(int[] a) {
		// case 1:CE not wrapping :
		int cenw = kadane(a);
		// case 2:CE wrapping :
		/*
		 * non-Contributing-Element = nce
		 * contributing-Element-Not-Wrapping = cenw
		 * contributing-Element-Wrapping = cew
		 */
		int total_sum = 0;
		for (int i = 0; i < a.length; i++) {
			total_sum += a[i];
			a[i] = -a[i];
		}
		int nce = kadane(a);
		int cew = total_sum + nce;
		return Math.max(cenw, cew);
	}

	public static void main(String args[]) {
		int q[] = input();
		System.out.print("Maximum circular subarray sum- " + carray(q));
	}
}
