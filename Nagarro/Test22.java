import java.util.*;

public class Test22 {
    static int result=0;
    public static void MinCost(int N, int K, List<Integer> A, int result, int i, int j) {
        if (A.size() < K && A.size()<j) {
            return;
        }
        if (i < K) {
            int max = Collections.max(A);
            int index = A.indexOf(max);
            A.remove(index);
            MinCost(N, K, A, result, i + 1, j);
        } else {
            for (Integer integer : A) {
                result += integer;
            }
            MinCost(N, K, A, result, i, j + 1);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine().trim());
        int K = Integer.parseInt(scn.nextLine().trim());
        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scn.nextLine().trim()));
        }
        MinCost(N, K, A,0,0,0);
        System.out.println(result);
        scn.close();
    }
}
