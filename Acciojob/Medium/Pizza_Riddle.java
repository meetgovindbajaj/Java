/**
@start--------------------------------------------

@param Question
Robert works as a chef at a pizza place. He has only three kinds of pizza bases:- big, medium, and small.

There are a fixed number of bases for each size.

Design a pizza base management system for his kitchen.

Implement the PizzaBase class:

PizzaBase(int big, int medium, int small) : Initializes object of the PizzaBase class. The number of bases for each pizza size are given as part of the constructor.

bool checkBase(int pizzaSize): Checks whether there is a pizza base available of pizzaSize for the pizza ordered. pizzaSize can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. If there is no base available, return false, else make a pizza from a base of that size and return true.


@param Input-Format
The first line contains q which denotes the total number of operations to be performed.

Each query contains a single integer that denotes the size of the required pizza base.


@param Output-Format
Return the result for every query of the type checkBase.


@param Input
5
2 1 1
3
3
2
2
3


@param Output
true
false
true
false
false


@param Explaination
Initially 2 Big, 1 Medium, 1 small bases are available.

First query:- a small base is needed. Since number of small bases > 0, return true.

Counter-> 2 Big, 1 Medium, 0 small.

Second query:- a small base is needed. Since number of small bases = 0, return false.

Counter-> 2 Big, 1 Medium, 0 small.

Third query:- a medium base is needed. Since number of medium bases > 0, return true.

Counter-> 2 Big, 0 Medium, 0 small.

Fourth query:- a medium base is needed. Since number of medium bases = 0, return false.

Counter-> 2 Big, 0 Medium, 0 small.

Fifth query:- a small base is needed. Since number of small bases = 0, return false.

Counter-> 2 Big, 0 Medium, 0 small.


@param Constraints
Number of queries/function calls lies in the range [1,1000].

@end--------------------------------------------
*/


import java.util.*;

public class Pizza_Riddle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), big = sc.nextInt(), medium = sc.nextInt(), small = sc.nextInt();
        PizzaBase pb = new PizzaBase(big, medium, small);
        while (n-- > 0)
            System.out.println(pb.checkBase(sc.nextInt()));
    }
}

class PizzaBase {
    int big, medium, small;

    public PizzaBase(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    Boolean checkBase(int pizzaSize) {
        switch (pizzaSize) {
            case 1:
                return big-- > 0 ? true : false;
            case 2:
                return medium-- > 0 ? true : false;
            case 3:
                return small-- > 0 ? true : false;
        }
        return false;
    }
}