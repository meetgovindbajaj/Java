/*

Toros went to the supermarket to buy K items. There were a total of N items. Each item had a distinct price Pi. He is cost-effective, so he would buy the K cheapest item. But he knows that the more cheaper an item is, the more is the chances that it can be defective. So he planned to ignore 2 cheapest items and buy K from the remaining ones. Find the total cost of all items that he would buy.

--------------------------------------------

input format:
The first line contains two integers N and K, denoting the total number of items in the supermarket and the number of items Toros is going to buy. The second line contains N distinct integers Pi , denoting the prices of the items

--------------------------------------------

output format:
Print a single integer denoting the total cost of items Toros would buy.

--------------------------------------------

input:
 5 2
 4 1 2 3 5

--------------------------------------------

output:
7

--------------------------------------------

explained:
 Toros will ignore items with price 1 and 2 and would buy items with price 4 and 3.

--------------------------------------------

constraints:
1 <= N <= 100000

1 <= K <= N - 2

1 <= Pi <= 1000000

*/

package Gym.Easy;

import java.util.*;

public class Shopping {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // # javascript

            // var readline = require("readline").createInterface(process.stdin);

            // let inputArr = [];
            // var lineNumber = -1;
            // var A;
            // var B;
            // readline.on("line", readInputs);

            // function readInputs(line) {
            // inputArr.push(line);
            // lineNumber++;
            // if (lineNumber == 0) {
            // [A, B] = inputArr[0].split(" ").map((x) => parseInt(x));
            // }

            // if (lineNumber === 1) {
            // logic("s");
            // readline.close();
            // }
            // }

            // function logic(input) {
            // const n = A;
            // const k = B;
            // const prices=inputArr[1].split(" ").map(x=>parseInt(x));
            // console.log(supermarket(prices,n,k))

            // }

            // function supermarket(prices, n, k) {
            // prices.sort((a,b)=>(a>b?1:-1));
            // let sum=0;
            // for (let i = 2; i < 2+k; i++) {
            // sum+=prices[i];
            // }
            // return sum;
            // }

        } catch (Exception e) {
            System.out.println("\nError Occured -\n");
            e.printStackTrace();
        } finally {
            System.out.println("\n------------------------\n Exiting the program... \n------------------------\n");
        }
    }
}
