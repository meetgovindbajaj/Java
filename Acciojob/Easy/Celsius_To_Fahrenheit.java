/*
Given the temperature of a city in celsius, your task is to convert the temperature to Fahrenheit and return it.

Note: It is guaranteed that the temperature in celsius, C, will be a multiple of 5.

input format:
An integer C, represents the temperature in Celsius which is a multiple of 5.

output format:
Return an integer containing the converted temperature in Fahrenheit.

input:
25

output:
77

explained:
25 * 9/5 + 32 = 77

constraints:
-1000 <= C <= 1000
*/


import java.util.*;

public class Celsius_To_Fahrenheit {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int Celsius = sc.nextInt();
        int Fahrenheit = ((Celsius * 9) / 5) + 32;
        System.out.print(Fahrenheit);
    }
}