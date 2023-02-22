import java.util.*;

public class RecursionMaxInArrayAndOccurance {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		System.out.println("item?");
		int n = sc.nextInt();
		System.out.println("max value is " + max(arr, 0));
		System.out.println("index of first occurance of item " + n + " in array is " + foccur(arr, 0, n));
		System.out.println("index of last occurance of item " + n + " in array is " + loccur(arr, 0, n));
		System.out.print("indexes of all occurances of item " + n + " in array is ");
		int arr1[] = alloccur(arr, 0, n, 0);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr [" + (t + 1) + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public static int max(int[] arr, int index) {
		if (index == arr.length)
			return 0;
		return Math.max(arr[index], max(arr, index + 1));
	}

	public static int foccur(int[] arr, int index, int item) {
		if (index == arr.length)
			return -1;
		if (item == arr[index])
			return index;
		return foccur(arr, index + 1, item);
	}

	public static int loccur(int[] arr, int index, int item) {
		if (index == arr.length)
			return -1;
		int s = loccur(arr, index + 1, item);
		if (item == arr[index] && s == -1)
			return index;
		return s;
	}

	public static int[] alloccur(int[] arr, int index, int item, int count) {
		if (index == arr.length) {
			int arr1[] = new int[count];
			return arr1;
		}
		if (item == arr[index]) {
			int arr2[] = alloccur(arr, index + 1, item, count + 1);
			arr2[count] = index;
			return arr2;
		} else {
			int arr2[] = alloccur(arr, index + 1, item, count);
			return arr2;
		}
	}
}
