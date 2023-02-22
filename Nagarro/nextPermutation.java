import java.util.*;

public class nextPermutation {
	static Scanner sc = new Scanner(System.in);

	public static void nextpermutation(int[] nums) {
		// find first decreasing digit
		int mark = -1;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				mark = i - 1;
				break;
			}
		}
		if (mark == -1) {
			reverse(nums, 0, nums.length - 1);
			for (int i : nums) {
				System.out.println(i);
			}
			return;
		}
		int idx = nums.length - 1;
		for (int i = nums.length - 1; i >= mark + 1; i--) {
			if (nums[i] > nums[mark]) {
				idx = i;
				break;
			}
		}
		swap(nums, mark, idx);
		reverse(nums, mark + 1, nums.length - 1);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	public static void reverse(int[] nums, int i, int j) {
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

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

	public static void main(String[] args) {
		System.out.print("n-");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int q[] = input();
			nextpermutation(q);
		}
	}
}
