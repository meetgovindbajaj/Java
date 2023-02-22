import java.util.*;

public class Minimum_swapsArray {
	static Scanner sc = new Scanner(System.in);

	public static int minimumSwaps(int[] arr) {
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != i + 1) {
				while (arr[i] != i + 1) {
					int temp = 0;
					temp = arr[arr[i] - 1];
					arr[arr[i] - 1] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
			i++;
		}
		return count;
	}

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr-1 [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public static void main(String[] args) {
		int arr[] = input();
		System.out.println(minimumSwaps(arr));
	}
}
