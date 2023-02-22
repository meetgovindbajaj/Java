package Gym.Medium;

import java.io.*;

public class AJ_Number {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] ajList = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
    static int[] visited = new int[17];

    public static void main(String[] args) throws IOException {
        searchAj(Integer.parseInt(br.readLine()), br.readLine());
    }

    public static void searchAj(int n, String s) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 0; j <= n - i; j++)
                if (checkAJ(s.substring(j, i + j)) && !isVisited(j, i + j)) {
                    count++;
                    setVisited(j, j + i);
                }
        System.out.println(count);
    }

    public static void setVisited(int s, int e) {
        for (int i = s; i < e; i++)
            visited[i] += 1;
    }

    public static Boolean isVisited(int s, int e) {
        for (int i = s; i < e; i++)
            if (visited[i] > 0)
                return true;
        return false;
    }

    public static Boolean checkAJ(String num) {
        long n = Long.parseLong(num);
        if (n == 0 || n == 1)
            return false;
        for (int i : ajList) {
            if (i == n)
                return true;
            if (n % i == 0)
                return false;
        }
        return true;
    }
}