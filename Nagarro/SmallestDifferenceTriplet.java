import java.util.*;

public class SmallestDifferenceTriplet {
	static Scanner sc = new Scanner(System.in);

	static int[] input(int n) {

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("[" + i + "]?");
			a[i] = sc.nextInt();
		}
		return a;
	}

	// function to find maximum number
	static int maximum(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}

	// function to find minimum number
	static int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	// Finds and prints the smallest Difference
	// Triplet
	static void smallestDifferenceTriplet(int arr1[], int arr2[], int arr3[], int n) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		// To store resultant three numbers
		int res_min = 0, res_max = 0, res_mid = 0;
		int i = 0, j = 0, k = 0;
		// Loop until one array reaches to its end
		// Find the smallest difference.
		int diff = 2147483647;
		while (i < n && j < n && k < n) {
			int sum = arr1[i] + arr2[j] + arr3[k];
			// maximum number
			int max = maximum(arr1[i], arr2[j], arr3[k]);
			// Find minimum and increment its index.
			int min = minimum(arr1[i], arr2[j], arr3[k]);
			if (min == arr1[i])
				i++;
			else if (min == arr2[j])
				j++;
			else
				k++;
			// comparing new difference with the
			// previous one and updating accordingly
			if (diff > (max - min)) {
				diff = max - min;
				res_max = max;
				res_mid = sum - (max + min);
				res_min = min;
			}
		}
		System.out.print("smallest difference triplet is- " + res_max + ", " + res_mid + ", " + res_min);
	}

	public static void main(String args[]) {
		System.out.println("length?");
		int n = sc.nextInt();
		System.out.println("array 1?");
		int[] a = input(n);
		System.out.println("array 2?");
		int[] b = input(n);
		System.out.println("array 3?");
		int[] c = input(n);
		smallestDifferenceTriplet(a, b, c, n);
	}
}