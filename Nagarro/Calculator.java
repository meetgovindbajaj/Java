import java.util.*;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	static long n, m;
	static char s;

	public static void add() {
		System.out.print("\nResult- " + (n + m) + "\n\n");
	}

	public static void sub() {
		System.out.print("\nResult- " + (n - m) + "\n\n");
	}

	public static void div() {
		System.out.print("\nResult- " + ((double) n / (double) m) + "\n\n");
	}

	public static void mul() {
		System.out.print("\nResult- " + n * m + "\n\n");
	}

	public static void mod() {
		System.out.print("\nResult- " + (n % m) + "\n\n");
	}

	public static void input() {
		System.out.print("number 1- ");
		n = sc.nextLong();
		System.out.print("number 2- ");
		m = sc.nextLong();
	}

	public static void display() {
		System.out.println("\n1 FOR ADD\n2 FOR SUB\n3 FOR DIV\n4 FOR MUL\n5 FOR MOD\nx or X FOR EXIT");
		System.out.print("\nchoice(one word)- ");
		s = sc.next().charAt(0);
		if (s == '1') {
			add();
		} else if (s == '2') {
			sub();
		} else if (s == '3') {
			div();
		} else if (s == '4') {
			mul();
		} else if (s == '5') {
			mod();
		} else if (s == 'x' || s == 'X') {
			System.out.print("\nExit");

		} else {
			System.out.print("\nInvalid Choice!\tERROR 404\n");
		}
	}

	public static void main(String[] args) {
		while (s != 'x'&&s != 'X') {
			input();
			display();
		}
		sc.close();
	}
}
