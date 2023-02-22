import java.util.*;

public class Testing {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) throws java.lang.Exception {
                Functions f = new Functions();
                int[][] arr = input();
                System.out.println(f.checkToeplitz(arr));
        }

        public static int[][] input() {
                int rows = sc.nextInt();
                int cols = sc.nextInt();
                int[][] arr = new int[rows][cols];
                for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {

                                arr[i][j] = sc.nextInt();
                        }
                }
                return arr;
        }

}
