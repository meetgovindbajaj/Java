import java.util.*;

public class BinarySearchArray {
	static Scanner sc = new Scanner(System.in);
	static int a1;
	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		System.out.println("Enter array in sorted manner");
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr " + t + "-");
			i[t] = sc.nextInt();
		}
		System.out.print("Search- ");
		a1 = sc.nextInt();
		return i;
	}
	public static void display(int a) {
		System.out.println("Item is present in index- " + a);
	}
	public static int search(int[] a, int p) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (p > a[mid]) 
			{
				lo = mid + 1;
			} 
			else if (p < a[mid]) 
			{
				hi = mid - 1;
			} 
			else 
			{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] q = input();
		int w = search(q, a1);
		//int e=Arrays.binarySearch(q, a1);
		display(w);
		//display(e);
	}
}
