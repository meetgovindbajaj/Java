import java.util.*;

/**
 * SumArrayExceptSelf
 */
public class SumArrayExceptSelf {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int sum = getSum(arr, i, 0, size, 0);
            newArr[i] = sum;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static int getSum(int[] arr, int i, int sum, int size, int j) {
        if (j < size) {
            sum += (j != i ? arr[j] : 0);
            return getSum(arr, i, sum, size, j += 1);
        } else {
            return sum;
        }
    }
}