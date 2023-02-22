import java.util.*;
import java.util.stream.Collectors;

public class Rough {
	static Scanner sc = new Scanner(System.in);

	public static int[] input() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];

		for (int t = 0; t < i.length; t++) {
			System.out.print("arr [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	@SuppressWarnings("unused")
	public static void bitonic(int[] a) {
		int k = 0;
		int point = 0;
		int i;
		int p1 = 0;
		int p2 = 0;
		ArrayList<Integer> s1 = new ArrayList<>();
		for (i = 1; i < a.length - 1; i++) {
			if (k == 0) {
				if (a[i] > a[i - 1]) {
					continue;
				}
				point = a[i - 1];
				k++;

			} else if (k == 1) {
				if (a[i] < a[i + 1]) {
					break;
				} else {
					s1.add(a[i]);
				}
			}

		}

		System.out.println("length-" + (s1.size() + 2) + "point-" + point);

	}

	public static ArrayList<String> CodeofString(String str) {
		if (str.length() <= 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr1 = CodeofString(ros);
		ArrayList<String> mr = new ArrayList<>();
		char cvrt_ch = (char) (ch + 48);
		for (String val : rr1) {
			mr.add(cvrt_ch + val);
		}
		if (str.length() >= 2) {
			String ch2 = str.substring(0, 2);
			String ros2 = str.substring(2);
			if (Integer.parseInt(ch2) <= 26) {
				char cvrt_ch2 = (char) (Integer.parseInt(ch2) + 'a' - 1);
				ArrayList<String> rr2 = CodeofString(ros2);
				for (String val : rr2) {
					mr.add(cvrt_ch2 + val);
				}
			}
		}
		return mr;
	}

	public static int polinomial(int x, int n) {
		int sum = 0;
		int a = (int) Math.pow(x, n);
		for (int i = 1; i <= n; i++) {
			sum += (i * a);
			a = a / x;
		}
		return sum;
	}

	public static void substring(String a) {
		for (int i = 0; i < a.length(); i++) {
			for (int j = i + 1; j <= a.length(); j++) {
				String s1 = a.substring(i, j);
				System.out.println(s1);
				palindrome(s1);
			}
		}
	}

	public static void palindrome(String a) {
		int count = 0;
		for (int i = 0; i < a.length() / 2; i++) {
			if (a.charAt(i) == a.charAt(a.length() - i - 1)) {
				++count;
			} else {
				count = 0;
				break;
			}
		}
		if (count > 0)
			System.out.println(true);
		else
			System.out.println(false);
//		return count;

	}

	public static void soe(int n) {
		boolean[] x = new boolean[n + 1];
		Arrays.fill(x, true);
		x[0] = false;
		x[1] = false;
		int t = 0;
		for (int i = 2; i * i <= n; i++) {
			if (x[i] == false)
				continue;
			{
				for (int j = 2; j * i <= n; j++) {
					t = i * j;
					x[t] = false;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] == true) {
				System.out.println(i);
			}
		}
	}

	@SuppressWarnings("unused")

	public static void PalindromicSubstring(String str) {
		// odd length palindromic substring
		int count = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}
		// even length palindromic substring
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
	}

	@SuppressWarnings("unused")

	public static void appendTime() {
		int n = 100000;
		String str = "";
		for (int i = 0; i <= n; i++) {
			str += i;
		}
	}

//	@SuppressWarnings("unused")
	public static int[][] array() {
		System.out.print("no of rows-");
		int a = sc.nextInt();
		System.out.print("no of cols-");
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int j = 0, i = 0;
		while (i < c.length) {
			if (j < c.length) {
				System.out.println("input[" + i + "," + j + "]- ");
				c[i][j] = sc.nextInt();

				j++;
			} else {
				i++;
				j = 0;
			}
		}
		return c;
	}

	// @SuppressWarnings("unused")
	public static void main(String args[]) {
		Functions f=new Functions();
		f.Diamond_Pattern(9, " ::: >>>>>----- ");
		// calculate time in milliseconds
//		long start = System.currentTimeMillis();
//		appendTime();
//		long end = System.currentTimeMillis();
//		System.out.println((double) (end - start) / 1000 + " Seconds");
////		int[] a = { 4,2,3,5,4,2,3 };
////		System.out.println("String");
//		String str = "    the sun rises";// print-rises sun the
//		System.out.println(str.trim());
//		String str1 = str;
//		String str2 = new String(str);
//		System.out.println((str == str1) + "," + (str == str2) + "\n" + (str.equals(str1)) + "," + (str.equals(str2)));
//		int j = 0, l = 0;
//		for (int i = str.length() - 1; i >= 0; i--) {
//
//			if (str.charAt(i) == ' ') {
//				for (int k = j; k <= l; k++) {
//					System.out.println(str.charAt(k));
//				}
//			} else
//				j = i;
//			if (str.charAt(i) != '\t' || str.charAt(i) == str.charAt(str.length() - 1)) {
//				l = i - 1;
//			}
////			j++;
//		}
//		String st = new String("nitin");
//		substring(st);
//		System.out.println(st.startsWith("h"));
//		System.out.println(st.endsWith("ll"));
//
////		String s1=sc.next();
//		System.out.println(str.substring(0, 2));
//		String s = str.replace('h', 'c');
////		System.out.println(str.subSequence(0, str.length()));
//		String a = s.toUpperCase();
//		String a2 = s.concat(str);
//		String a1 = s.repeat(5);
//		System.out.println(st.indexOf("ll"));
//		System.out.println(st.lastIndexOf("l"));
//
//		System.out.println("\n" + (char) s.codePointAt(2));
////		String a3=s.formatted(args);
//		String a4 = s.indent(9);
////		String s2=new String(sc.next());
////		int[] b = { 2, 6, 7 };
//		System.out.println(s + "\n" + a + "\n" + a1 + "\n" + a2 + "\n" + a4);
//		int n = sc.nextInt();
//		soe(n);

//		System.out.println("x-");
//		int x = sc.nextInt();
//		System.out.println(polinomial(x, n));

//		int []q=input();

//		int n=(int)Math.pow(10, 8);
		// bitonic(a);
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a);
//		}
//		ArrayList<Integer> s1 = new ArrayList<>(20);
//		Collections.r
		// ArrayList<Integer> s = sum(a, b);
//		Collections.reverse(s);//reverse array list
//		Collections.rotate(s, 1);//rotate array list
//		System.out.println(s);
	}
}

////Integer x=100;
////x=a;//autoboxing->stack to heap
////a=x;//unboxing->heap to stack
//ArrayList<Integer> ar = new ArrayList<>();
////ar.add(x);
//
//System.out.println("input?(y/n)");
//String choice = sc.next();
//while (choice.charAt(0) == 'y') {
//
//System.out.println("val?");
//int n = sc.nextInt();
//
//ar.add(n);
//
//System.out.println("more input?(y/n)");
//choice = sc.next();
//}
////ar.get(2);
//System.out.println(ar);
//System.out.println("get?(y/n)");
//String choice1 = sc.next();
//while (choice1.charAt(0) == 'y') {
//
//System.out.println("index?");
//Integer n = sc.nextInt();
//if (n < ar.size()) {
//	System.out.println(ar.get(n));
//} else
//	System.out.println("index not present!");
////ar.add(n);
//
//System.out.println("more get?(y/n)");
//choice1 = sc.next();
//}
////System.out.println(ar);
//System.out.println("update?(y/n)");
//String choice2 = sc.next();
//while (choice2.charAt(0) == 'y') {
//
//System.out.println("val?");
//int n = sc.nextInt();
//System.out.println("index?");
//int m = sc.nextInt();
//ar.set(m, n);
//
//System.out.println("more update?(y/n)");
//choice2 = sc.next();
//}
////System.out.println(ar.get(2));
//System.out.print(ar);
//System.out.println("remove?(y/n)");
//String choice3 = sc.next();
//while (choice3.charAt(0) == 'y') {
//
//System.out.println("index?");
//int m = sc.nextInt();
//if (m < ar.size()) {
//	System.out.println(ar.remove(m) + " val removed!");
//} else
//	System.out.println("index not present!");
//
//System.out.println("more remove?(y/n)");
//choice3 = sc.next();
//}
////System.out.println(ar.get(2));
//System.out.print(ar);