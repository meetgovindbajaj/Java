import java.util.*;

public class RecursionArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = input();
		display(arr, 0);
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

	public static void display(int[] arr, int index) {
		if (index == arr.length)
			return;
		// System.out.print(arr[index] + " ");
		display(arr, index + 1);
		System.out.print(arr[index] + " ");
	}

}
