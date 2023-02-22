import java.util.*;

public class GenerateSortedArraysQuestion {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("array 1 size?");
		int size1 = sc.nextInt();
		System.out.println("array 2 size?");
		int size2 = sc.nextInt();
		subsequence(size1, size2);
	}

	public static int[] input(int size) {
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static void subsequence(int size1, int size2) {
		System.out.println("array 1?");
		int[] a = input(size1);
		System.out.println("array 2?");
		int[] b = input(size2);
		Arrays.sort(a);
		Arrays.sort(b);
		int c[] = new int[size1 + size2];
		System.out.println("possible combinations -> ");
		for (int i = 0; i < size1; i++) {
			c[0] = a[i];
			generateUtil(a, b, c, 0, 0, size1, size2, 0, false);
		}
	}

	public static void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n, int len, boolean flag) {
		if (flag) {
			if (len != 0)
				printArr(C, len + 1);
			for (int k = i; k < m; k++) {
				if (len == 0) {
					C[len] = A[k];
					generateUtil(A, B, C, k + 1, j, m, n, len, !flag);
				} else if (A[k] > C[len]) {
					C[len + 1] = A[k];
					generateUtil(A, B, C, k + 1, j, m, n, len + 1, !flag);
				}
			}
		} else {
			for (int l = j; l < n; l++) {
				if (B[l] > C[len]) {
					C[len + 1] = B[l];
					generateUtil(A, B, C, i, l + 1, m, n, len + 1, !flag);
				}
			}
		}
	}

	public static void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}