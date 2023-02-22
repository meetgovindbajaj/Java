import java.util.*;
public class SubArrays {
	static Scanner sc = new Scanner(System.in);
	static int sum=0;
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
	public static void subarray_sum_max(int[] a) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int su=0;
			for (int j = i ; j < a.length; j++) {
//				int s[] = Arrays.copyOfRange(a, i, j+1);
				su=su+a[j];
				if(su>max)
				{
					max=su;
				}
				for (int k = i; k <=j; k++) {
					sum=sum+a[k];
					System.out.print("[" + k + "] : " + a[k]+"\t");
				}
				System.out.print("->sum - "+su);
				System.out.println();
			}
			System.out.println();
		}
		System.out.print("\nmax sum of sub arrays is - "+max);
		System.out.print("\nsum of all sub arrays is - "+sum);
	}
	public static void main(String args[]) {
		int q[] = input();
		subarray_sum_max(q);
	}
}