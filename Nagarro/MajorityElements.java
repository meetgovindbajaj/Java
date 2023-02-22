import java.util.*;

public class MajorityElements {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.majorityElement(arr, n);
    }
}

class Solution {
    public void majorityElement(int[] arr, int n) {
        int val = (int) ((n + 1) / 2);
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        map = freqCounter(arr, n);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= val) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    public Map<Integer, Integer> freqCounter(int[] arr, int size) {
        int counter = 0, currVal = arr[0];
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < size) {
            if (currVal != arr[i]) {
                map.put(currVal, counter);
                currVal = arr[i];
                counter = 1;
            } else {
                counter += 1;
            }
            i++;
        }
        map.put(currVal, counter);
        return map;
    }
}