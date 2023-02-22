import java.util.*;

public class MaxSubarraySum_kadane {
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
		int ei = 0;
		int start[] = new int[a.length];
		start[0] = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < a.length; i++) {
			if (sum + a[i] >= a[i])
				start[i] = start[i - 1];
			else
				start[i] = i;
			//kadane algo
			sum = Math.max(sum + a[i], a[i]);
			if (max < sum) {
				max = sum;
				ei = i;
			}
		}
		System.out.println("starting index- "+start[ei]+"\tending index- "+ei);
		return max;
	}
	public static void main(String args[]) {
		int q[] = input();
		System.out.print("Maximum subarray sum- " + kadane(q));

	}
}
