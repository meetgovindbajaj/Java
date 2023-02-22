/*

Robin just received a stopwatch from her grandfather. Robin’s stopwatch has a single button. Pressing the button alternates between stopping and starting the stopwatch’s timer. When the timer is on, the displayed time increases by 1 every second.

Initially, the stopwatch is stopped and the timer reads 0 seconds. Given a sequence of times that the stopwatch button is pressed, determine what the stopwatch’s timer displays, if stopped. If it's still running, print "still running".

--------------------------------------------

input format:
The first line of input contains a single integer N, which is the number of times the stopwatch was pressed.

The next N lines describe the times the stopwatch’s button was pressed in increasing order. Each line contains a single integer t, which is the time the button was pressed. No two button presses happen in the same second.

--------------------------------------------

output format:
Print "still running" if the stopwatch’s timer is still running after all button presses were made. Otherwise, display the number of seconds the face of the stopwatch.

--------------------------------------------

input:
2
7
11

--------------------------------------------

output:
4

--------------------------------------------

explained:
The stopwatch’s timer starts at 0 seconds. After 7 seconds, the button is pressed, and the timer starts. After 11 seconds, the button is pressed again, and the timer stops. The stopwatch’s timer displays 4 seconds.

--------------------------------------------

constraints:
1 <= N <= 1000

1 <= t <= 10^6

*/



import java.util.*;

public class Stopwatch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(size % 2 != 0 ? "still running" : timer(arr, size, 1, true, 0));
        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }

    public static int timer(int[] arr, int size, int i, Boolean status, int sum) {
        if (i >= size)
            return sum;
        return timer(arr, size, i + 1, !status, status ? sum + (arr[i] - arr[i - 1]) : sum);
    }
}