import java.util.Scanner;

public class RecursionQuestions {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Functions f = new Functions();
//		System.out.println("string?");
//		String s = new String(sc.next());
//		System.out.println("choice? (0,1,2,3,4,5,6,7,8,9) and x/X for exit");
//		char c = sc.next().charAt(0);
		// que1->"abc" string and its subsequences
//		subsequence(s, "");
		// que2->"abc" string and its subsequences with ascii
//		subsequenceAscii(s, "");
		// que3->keypad combination
//		keypad(c);
//		sequence(s, "");
		// que4
//		int n = sc.nextInt();
//		cointoss(n,"");
		// que5
//		parinthesis(n, "", 0, 0);
		// que6
//		System.out.println("max jump?");
//		int max = sc.nextInt();
//		int s1 = Integer.parseInt(s);
//		System.out.println("possible combinations - ");
//		stairs(s1, "", max);
		// que7
//		System.out.println("end row?");
//		int er = sc.nextInt();
//		System.out.println("end col?");
//		int ec = sc.nextInt();
//		mazepath(0, 0, er - 1, ec - 1, "");
		// que8
//		System.out.println("possible combinations - ");
//		permutation(s, "");
		// que9
//		int n = sc.nextInt();
//		ctoss(n, "", false);
		// que10
//		lexico(0, n);
		// que11
//		jumping(0, n);
		// que12
//		pstring(s, "");
	}

// que1(for every unique character in string s)
	public static void subsequence(String que, String ans) {
		if (que.length() == 0) {
			System.out.println("new subsequence -> " + ans);
			return;
		}
		char ch = que.charAt(0);// a
		String roq = que.substring(1);// bc
		subsequence(roq, ans + ch);// bc,a
		subsequence(roq, ans);// bc,_
	}

// que2(for every unique character in string s)
	public static void subsequenceAscii(String que, String ans) {
		if (que.length() == 0) {
			System.out.println("new subsequence -> " + ans);
			return;
		}
		char ch = que.charAt(0);// a
		String roq = que.substring(1);// bc
		subsequenceAscii(roq, ans);// bc,a
		subsequenceAscii(roq, ans + ch);// bc,_
		subsequenceAscii(roq, ans + (int) ch);// bc,96
	}

// que3(keypad phones buttons combo example->1, 2abc, 3def, 4ghi, 5jkl, 6mno, 7pqrs, 8tuv, 9wxyz, 0(space))
	public static void keypad(char ch) {
		if (ch == '1') {
			System.out.println(ch + " o_o");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '2') {
			System.out.println(ch + " abc");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '3') {
			System.out.println(ch + " def");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '4') {
			System.out.println(ch + " ghi");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '5') {
			System.out.println(ch + " jkl");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '6') {
			System.out.println(ch + " mno");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '7') {
			System.out.println(ch + " pqrs");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '8') {
			System.out.println(ch + " tuv");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '9') {
			System.out.println(ch + " wxyz");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == '0') {
			System.out.println(ch + " @#$");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		} else if (ch == 'x' || ch == 'x') {
			System.out.println("exit");
			return;
		} else {
			System.out.println("wrong choice!");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad(ch);
		}
	}

	public static String keypad1(char a) {
		if (a == '1')
			return "+-=";
		else if (a == '2')
			return "abc";
		else if (a == '3')
			return "def";
		else if (a == '4')
			return "ghi";
		else if (a == '5')
			return "jkl";
		else if (a == '6')
			return "mno";
		else if (a == '7')
			return "pqrs";
		else if (a == '8')
			return "tuv";
		else if (a == '9')
			return "wxyz";
		else if (a == '0')
			return "#*";
		else
			return "";
	}

	public static void sequence(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = que.charAt(0);
		String roq = que.substring(1);
		String code = keypad1(ch);
		for (int i = 0; i < code.length(); i++)
			sequence(roq, ans + code.charAt(i));
	}

// que4 coin-toss head tail
	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		cointoss(n - 1, ans + "H");
		cointoss(n - 1, ans + "T");
	}

// que5 valid parenthesis
	public static void parinthesis(int n, String ans, int open, int close) {
		if (open == n && close == n) {/* open = open '(' count & close = close ')' count */
			System.out.println(ans);
			return;
		}
		if (open > n || close > open)
			return;
		parinthesis(n, ans + "(", open + 1, close);
		parinthesis(n, ans + ")", open, close + 1);
	}

// que6 climbing stairs
	public static void stairs(int n, String ans, int max) {
		if (n < 0)
			return;
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= max; i++)
			stairs(n - i, ans + i, max);
	}

// que7 maze-path (horizontal, vertical & diagonal moves)
	public static void mazepath(int hm, int vm, int er, int ec, String ans) {
		if (hm == er && vm == ec) {
			System.out.println(ans);
			return;
		}
		if (hm > er || vm > ec)
			return;
		mazepath(hm + 1, vm, er, ec, ans + "H");
		mazepath(hm, vm + 1, er, ec, ans + "V");
		mazepath(hm + 1, vm + 1, er, ec, ans + "D");
	}

// que8 permutation of given string
	public static void permutation(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < que.length(); i++) {
			char ch = que.charAt(i);
			String roq = que.substring(0, i) + que.substring(i + 1);
			permutation(roq, ans + ch);
		}
	}

// que9 coin-toss next part (n toss result which does not contain 2 or more consecutive Head)
	public static void ctoss(int n, String ans, Boolean flag) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (flag == false)
			ctoss(n - 1, ans + "H", true);
		ctoss(n - 1, ans + "T", false);
	}

// que10 lexico count till nth number
	public static void lexico(int curr, int n) {
		if (curr > n)
			return;
		System.out.println(curr);
		int i = 0;
		if (curr == 0)
			i = 1;
		while (i <= 9) {
			lexico(curr * 10 + i, n);
			i += 1;
		}
	}

// que11 print jumping numbers having difference of 1 in their letters till nth number
	public static void jumping(int curr, int n) {
		if (curr > n)
			return;
		System.out.println(curr);
		int rem = curr % 10;
		if (curr == 0) {
			for (int i = 1; i <= 9; i++)
				jumping(i, n);
		} else {
			if (rem != 0)
				jumping(curr * 10 + rem - 1, n);
			if (rem != 9)
				jumping(curr * 10 + rem + 1, n);
		}
	}

// que12 palindromic partition of string
	public static void pstring(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= que.length(); i++) {
			String roq = que.substring(i);
			String roa = que.substring(0, i);
			if (isPalindrome(roa))
				pstring(roq, ans + roa + " ");
		}
	}

	private static Boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}