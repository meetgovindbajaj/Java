/**
@start--------------------------------------------

@param Question
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note
12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.

12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.


@param Input-Format
First line contains a 12-hour clock time as a string s.


@param Output-Format
Print the 24-hour clock time.


@param Input
07:05:45PM


@param Output
19:05:45


@param Explained
As the problem states "codeleet" becomes "leetcode" after shuffling.


@param Constraints
All valid 12-hour clock times.

s.length() == 10

@end--------------------------------------------
*/



import java.util.*;

public class Time_Conversion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        timeConversion(str);
    }

    static void timeConversion(String s) {
        int len = s.length();
        String format = s.substring(len - 2, len), time = s.substring(0, len - 2);
        String arr[] = time.split(":");
        int hr = Integer.parseInt(arr[0]);
        Boolean c1 = format.equalsIgnoreCase("PM") && hr < 12,
                c2 = format.equalsIgnoreCase("AM") && hr == 12;
        time = String.join(":", c1 ? Integer.toString(hr + 12) : c2 ? "00" : arr[0], arr[1], arr[2]);
        System.out.println(time);
    }
}