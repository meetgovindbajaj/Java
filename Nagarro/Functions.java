import java.util.*;

public class Functions {

	Scanner sc = new Scanner(System.in);

	public int[][] TransposeArray(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int[][] t = new int[cols][rows];
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				t[i][j] = arr[j][i];
			}
		}
		return t;
	}

	public Boolean checkToeplitz(int[][] arr) {
		Boolean check1 = Toeplitz(arr), check2 = false;
		if (check1) {
			check2 = Toeplitz(TransposeArray(arr));
			return check2;
		} else {
			return check1;
		}
	}

	private Boolean Toeplitz(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		Boolean check = true;
		for (int i = 0; i < cols; i++) {
			int init = arr[0][i];
			int ic = i;
			int j = 0;
			while (j < rows) {
				if (ic == cols) {
					break;
				}
				if (init != arr[j][ic]) {
					return false;
				} else {
					++j;
					++ic;
				}
			}
		}
		return check;
	}

	public int IsQuery_Alex_Goes_Shopping(int arr[], int len_arr, int cost, int expected_range) {
		int cnt = 0;
		for (int i = 0; i < len_arr; i++) {
			if (cost % arr[i] == 0) {
				cnt++;
			}
		}
		if (cnt >= expected_range) {
			return 1;
		} else {
			return 0;
		}
	}

	public void angstrom(long angstrom1, long angstrom2) {
		for (long i = angstrom1; i <= angstrom2; i++) {
			long l = (long) (Math.log10(i) + 1);
			long a = i, b = 0;
			while (a != 0) {
				long rem = a % 10;
				b = b + ((long) Math.pow(rem, l));
				a /= 10;
			}
			if (b == i) {
				System.out.println(i);
			}
		}
	}

	public int[] inBarGraph() {
		System.out.print("Enter length- ");
		int n = sc.nextInt();
		int[] i = new int[n];
		for (int t = 0; t < i.length; t++) {
			System.out.print("arr-1 [" + t + "] : ");
			i[t] = sc.nextInt();
		}
		return i;
	}

	public int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public void BarGraphDisplay(int[] arr, int max) {
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i < (max - arr[j])) {
					System.out.print("   ");
				} else {
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}

	public int BinarySearchArray(int[] arr, int search) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (search > arr[mid]) {
				lo = mid + 1;
			} else if (search < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public boolean is_visited_coding_blocks_number(boolean[] visited, int si, int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i]) {
				return false;
			}
		}
		return true;
	}

	public int[] inputArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public boolean is_cb_number(int arr[], long number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (number % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

	public int add(int number1, int number2) {
		return (number1 + number2);
	}

	public int sub(int number1, int number2) {
		return (number1 - number2);
	}

	public double div(int number1, int number2) {
		return (double) number1 / (double) number2;
	}

	public int mul(int number1, int number2) {
		return number1 * number2;
	}

	public int mod(int number1, int number2) {
		return number1 % number2;
	}

	public int[] Fibonacci_Sequence_till_number(int number) {
		int a = 0, b = 1, i = 0, sum = 0;
		int[] arr = new int[number + 1];
		while (i <= number) {
			sum = a + b;
			arr[i] = a;
			a = b;
			b = sum;
			i++;
		}
		return arr;
	}

	public int Fibonacci_number_on_index1(int number) {
		int a = 0;
		int b = 1;
		int i = 0;
		int sum = 0;
		int z = 0;
		while (i <= number) {
			sum = a + b;
			z = a;
			a = b;
			b = sum;
			i++;
		}
		return z;
	}

	public int Fibonacci_number_on_index2(int number)/* Recursion */ {
		if (number == 0 || number == 1) {
			return number;
		}
		return Fibonacci_number_on_index2(number - 1) + Fibonacci_number_on_index2(number - 2);
	}

	public int GCD(int number1, int number2) {
		int a = 0;
		int b = 0;
		if (number1 < number2)
			a = number2;
		else
			a = number1;
		for (int i = 1; i <= a; i++) {
			if (number1 % i == 0 && number2 % i == 0)
				b = i;
		}
		return b;
	}

	public int HCF(int divident, int divisor) {
		while (true) {
			int rem = divident % divisor;
			if (rem == 0)
				break;
			divident = divisor;
			divisor = rem;
		}
		return divisor;
	}

	public ArrayList<Integer> Intersection_between_arrays(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> c = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while (p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] > arr2[p2]) {
				p2++;
			} else if (arr1[p1] < arr2[p2]) {
				p1++;
			} else {
				c.add(arr1[p1]);
				p1++;
				p2++;
			}
		}
		return c;
	}

	public int[] inverse_Array(int[] arr) {
		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			b[arr[i]] = i;
		}
		return b;
	}

	public int[][] jacked2DArray(int row) {
		int[][] i = new int[row][];
		for (int a = 0; a < i.length; a++) {
			System.out.print("no of cols of i[" + a + "]- ");
			int e = sc.nextInt();
			i[a] = new int[e];
			for (int j = 0; j < i[a].length; j++) {
				System.out.print("input for i[" + a + "][" + j + "]- ");
				int f = sc.nextInt();
				i[a][j] = f;
			}
			System.out.println();
		}
		return i;
	}

	private int lcm1(int N1, int N2) {
		if (N1 == 0)
			return N2;
		return lcm1(N2 % N1, N1);
	}

	public int lcm(int N1, int N2) {
		return (N1 / lcm1(N1, N2)) * N2;
	}

	public int LinearSearchArray(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				search = i;
				return search;
			}
		}
		return -1;
	}

	public String LongestCommonPrefix_Array(String arr[]) {
		if (arr.length == 0)
			return "";
		String prefix = arr[0];
		for (int i = 1; i < arr.length; i++)
			while (arr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}

	public int[][] MatrixMultiplication_2DArray(int[][] arr1, int[][] arr2) {
		int r1 = arr1.length;
		int c1 = arr1[0].length;
		int c2 = arr2[0].length;
		int[][] c = new int[r1][c2];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < c1; k++)
					sum += arr1[i][k] * arr2[k][j];
				c[i][j] = sum;
			}
			System.out.println();
		}
		return c;
	}

	public int minimumSwapsCount_Array(int[] arr)/* array range(1->n {continue}) */ {
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != i + 1) {
				while (arr[i] != i + 1) {
					int temp = 0;
					temp = arr[arr[i] - 1];
					arr[arr[i] - 1] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
			i++;
		}
		return count;
	}

	public int kadane(int[] arr)/* for maximum sub-array sum */ {
		int sum = arr[0];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			sum = Math.max(sum + arr[i], arr[i]);
			if (max < sum)
				max = sum;
		}
		return max;
	}

	public int MaxCircularSubarraySum(int[] arr) {
		int contributing_Element_Not_Wrapping = kadane(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] = -arr[i];
		}
		int non_Contributing_Element = kadane(arr);
		int contributing_Element_Wrapping = total_sum + non_Contributing_Element;
		return Math.max(contributing_Element_Not_Wrapping, contributing_Element_Wrapping);
	}

	public int MaxNumberOfTrianglesCount_Array(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for (int large = arr.length - 1; large >= 0; large--) {
			int l = 0;
			int r = large - 1;
			while (l < r) {
				if (arr[l] + arr[r] > arr[large]) {
					count += r - l;
					r--;
				} else {
					l++;
				}
			}
		}
		return count;
	}

	public int palindromicSubstringCount_String(String str) {
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
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}

	public void PascalPattern_Triangle(int number) {
		for (int line = 1; line <= number; line++) {
			int C = 1;
			for (int i = 1; i <= line; i++) {
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}

	public void SquarePattern1(int rows, String design) {
		int i = 0;
		while (i < rows) {
			i++;
			int j = 0;
			while (j < rows) {
				j++;
				System.out.print(design + "   ");
			}
			System.out.println("\n");
		}
	}

	public void SquarePattern2(int rows) {
		int row = 1;
		while (row <= rows) {
			for (int cst = rows; cst >= 1; cst--)
				System.out.print(cst + " ");
			row++;
			System.out.println();
		}
	}

	public void SquarePattern3(int rows, String design) {
		int row = 1;
		while (row <= rows) {
			int nst = rows;
			for (int cst = 1; cst <= rows; cst++) {
				if (cst + row == rows + 1)
					System.out.print(design + " ");
				else
					System.out.print(nst + " ");
				nst--;
			}
			row++;
			System.out.println();
		}
	}

	public void SquarePattern_Hollow(int rows, String design) {
		int row = 1;
		while (row <= rows) {
			if (row == 1 || row == rows) {
				for (int cst = 1; cst <= rows; cst++) {
					System.out.print(design + " ");
				}
			} else {
				for (int cst = 1; cst <= rows; cst++) {
					if (cst == 1 || cst == rows)
						System.out.print(design + " ");
					else
						System.out.print("  ");
				}
			}
			row++;
			System.out.println();
		}
	}

	public void TrianglePattern_LHS(int rows, String design) {
		int i = 0;
		while (i < rows) {
			i++;
			int j = 0;
			while (j < i) {
				j++;
				System.out.print(design + "   ");
			}
			System.out.println("\n");
		}
	}

	public void TrianglePattern_LHS_Reverse(int rows, String design) {
		int i = 0;
		while (i < rows) {
			i++;
			int j = rows;
			while (j >= i) {
				j--;
				System.out.print(design + "   ");
			}
			System.out.println("\n");
		}
	}

	public void TrianglePattern_RHS(int rows, String design) {
		int row = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= row; cst++) {
				System.out.print(design + " ");
			}
			row++;
			System.out.println();
		}
	}

	public void TrianglePattern_RHS_Reverse(int rows, String design) {
		int row = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= row - 1; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= rows - row + 1; cst++) {
				System.out.print(design + " ");
			}
			row++;
			System.out.println();
		}
	}

	public void TrianglePattern_RHS_Reverse_TiltedRHS(int rows, String design) {
		int row = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= row - 1; csp++) {
				System.out.print("  ");
				System.out.print("  ");
			}
			for (int cst = 1; cst <= rows - row + 1; cst++) {
				System.out.print(design + " ");
			}
			row++;
			System.out.println();
		}
	}

	public void TrianglePattern_LHS_RHS(int rows, String design) {
		int row = 1;
		int nst = 2 * rows - 1;
		while (row <= rows) {
			for (int cst = 1; cst <= row; cst++) {
				System.out.print(design + " ");
			}
			for (int cst = 1; cst < nst - 1; cst++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= row; cst++) {
				if (cst == rows)
					break;
				else
					System.out.print(design + " ");
			}
			nst = nst - 2;
			row++;
			System.out.println("");
		}
	}

	public void TrianglePattern_LHS_RHS_Reverse(int rows, String design) {
		int a = rows / 2;
		int row = 1;
		while (row <= rows) {
			for (int b = rows; b >= row; b--) {
				System.out.print(design + " ");
			}
			for (int i = a - row + 1; i < a + row - 2; i++) {
				System.out.print("  ");
			}
			int c = rows;
			while (c >= row) {
				c--;
				if (c == 0)
					break;
				else
					System.out.print(design + " ");
			}
			System.out.println();
			row++;
		}
	}

	public void X_Pattern(int rows, String design) {
		int j = rows / 2;
		int row = 0;
		int i = j;
		while (row < j) {
			int cst = 1;
			while (cst <= rows) {
				if (cst == row + 1 || cst == rows - row) {
					System.out.print(design + " ");
					cst++;
				} else {
					System.out.print("  ");
					cst++;
				}
			}
			row++;
			System.out.print("\n");
		}
		while (j < rows) {
			int cst = 1;
			while (cst <= rows) {
				if (cst == i + 1 || cst == rows - i) {
					System.out.print(design + " ");
					cst++;
				} else {
					System.out.print("  ");
					cst++;
				}
			}
			i++;
			j++;
			System.out.print("\n");
		}
	}

	public void Pyramid_Pattern1(int rows, String design) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(design + " ");
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern2(int rows) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(row + " ");
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern3(int rows) {
		int row = 1;
		int nst = 1;
		int a = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");
				a++;
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern4(int rows) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			int a = 1;
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");
				a++;
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern5(int rows) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			int a = 1;
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");
				if (cst <= nst / 2)
					a++;
				else
					a--;
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern6(int rows) {
		int row = 1;
		int nst = 1;
		int a = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");
				if (cst <= nst / 2)
					a++;
				else
					a--;
			}
			row++;
			a = a + 2;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern7(int rows) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("    ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == nst) {
					System.out.print(row + "   ");
				} else {
					System.out.print("0   ");
				}
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern8(int rows) {
		int row = 1;
		int nst = 1;
		int a = rows;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst <= nst / 2) {
					System.out.print(a + " ");
					a++;
				} else if (cst > nst / 2 + 1) {
					System.out.print(a + " ");
					a--;
				} else {
					a--;
					System.out.print("0 ");
				}
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern_Reverse(int rows, String design) {
		int row = 1;
		int nst = 2 * rows - 1;
		while (row <= rows) {
			for (int csp = 1; csp <= row - 1; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(design + " ");
			}
			row++;
			nst = nst - 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern_OddEven(int rows, String design) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0)
					System.out.print("  ");
				else
					System.out.print(design + " ");
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern(int rows, String design1, String design2) {
		int row = 1;
		int nst = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows - row; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 == 0)
					System.out.print(design2 + " ");
				else
					System.out.print(design1 + " ");
			}
			row++;
			nst = nst + 2;
			System.out.println();
		}
	}

	public void Pyramid_Pattern_RHS_Tilt1(int rows, String design) {
		int row = 1;
		int nst = 1;
		while (row <= 2 * rows - 1) {
			for (int cst = 1; cst <= nst; cst++)
				System.out.print(design + " ");
			if (row < rows)
				nst++;
			else
				nst--;
			row++;
			System.out.println();
		}
	}

	public void Pyramid_Pattern_RHS_Tilt2(int rows, String design) {
		int nst = 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * rows - 1) {
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0)
					System.out.print(val + " ");
				else
					System.out.print(design + " ");
			}
			if (row <= rows - 1) {
				nst = nst + 2;
				val++;
			} else {
				nst = nst - 2;
				val--;
			}
			row++;
			System.out.println();
		}
	}

	public void Pyramid_Pattern_LHS_Tilt(int rows, String design) {
		int row = 1;
		int nst = 1;
		while (row <= 2 * rows - 1) {
			for (int csp = 1; csp <= rows - nst; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(design + " ");
			}
			if (row < rows)
				nst++;
			else
				nst--;
			row++;
			System.out.println();
		}
	}

	public void Arrow_Pattern_RHS(int rows, String design) {
		int row = 1;
		int nst = 1;
		while (row <= 2 * rows - 1) {
			for (int csp = 1; csp <= nst - 1; csp++) {
				System.out.print("  ");
				System.out.print("  ");
			}
			for (int cst = 1; cst <= rows - nst + 1; cst++) {
				System.out.print(design + " ");
			}
			row++;
			if (row <= rows)
				nst++;
			else
				nst--;
			System.out.println();
		}
	}

	public void Arrow_Pattern_LHS(int rows, String design) {
		int row = 1;
		int nsp = 1;
		while (row <= 2 * rows - 1) {
			for (int csp = 1; csp <= rows - nsp; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= rows - nsp + 1; cst++) {
				System.out.print(design + " ");
			}
			if (row < rows)
				nsp++;
			else
				nsp--;
			row++;
			System.out.println();
		}
	}

	public void HollowDiamond_Pattern1(int rows, String design) {
		if (rows % 2 == 0)
			rows++;
		int row = 1;
		int nst = 1;
		int nsp = 1;
		while (row <= rows) {
			for (int csp = 1; csp <= rows / 2 + 1 - nst; csp++) {
				System.out.print(design + " ");
			}
			for (int cst = 1; cst <= nsp; cst++) {
				System.out.print("  ");
			}
			for (int csp = 1; csp <= rows / 2 + 1 - nst; csp++)
				System.out.print(design + " ");
			if (row <= rows / 2) {
				nst++;
				nsp = nsp + 2;
			} else {
				nst--;
				nsp = nsp - 2;
			}
			row++;
			System.out.println();
		}
	}

	public void HollowDiamond_Pattern2(int rows, String design) {
		if (rows % 2 == 0)
			rows++;
		int row = 1;
		int nst = 1;
		int nsp = 1;
		while (row <= rows) {
			if (row == 1 || row == rows)
				for (int cst = 1; cst <= rows; cst++)
					System.out.print(design + " ");
			else {
				for (int csp = 1; csp <= rows / 2 + 1 - nst; csp++) {
					System.out.print(design + " ");
				}
				for (int cst = 1; cst <= nsp; cst++) {
					System.out.print("  ");
				}
				for (int csp = 1; csp <= rows / 2 + 1 - nst; csp++)
					System.out.print(design + " ");
				if (row <= rows / 2) {
					nst++;
					nsp = nsp + 2;
				} else {
					nst--;
					nsp = nsp - 2;
				}
			}
			row++;
			System.out.println();
		}
	}

	public void HollowDiamond_Pattern3(int rows, String design) {
		int row = 1;
		int nst = 1;
		int nsp = 1;
		if (rows % 2 == 0)
			rows++;
		while (row <= rows) {
			for (int csp = 1; csp <= rows / 2 - nsp + 1; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 || cst == nst)
					System.out.print(design + " ");
				else
					System.out.print("  ");
			}
			if (row <= rows / 2) {
				nst = nst + 2;
				nsp++;
			} else {
				nst = nst - 2;
				nsp--;
			}
			row++;
			System.out.println();
		}
	}

	public void Diamond_Pattern(int rows, String design) {
		int row = 1;
		int nst = 1;
		int nsp = 1;
		if (rows % 2 == 0)
			rows++;
		while (row <= rows) {
			for (int csp = 1; csp <= rows / 2 - nsp + 1; csp++)
				System.out.print("  ");
			for (int cst = 1; cst <= nst; cst++)
				System.out.print(design + " ");
			if (row <= rows / 2) {
				nst = nst + 2;
				nsp++;
			} else {
				nst = nst - 2;
				nsp--;
			}
			row++;
			System.out.println();
		}
	}

	public Boolean isPrime(int number) {
		int a = 0, b = 2;
		while (b <= Math.sqrt(number)) {
			if (number % b == 0) {
				a++;
				break;
			}
			b++;
		}
		if (a == 0)
			return true;
		else
			return false;
	}

	public void printPrimes(int EndPrime) {
		for (int i = 2; i <= EndPrime; i++) {
			int c = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i + " ");
			}
		}
	}

	public int RainWaterTraping_Array(int[] arr) {
		int s = 0;
		int p1 = 0;
		int[] q = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				p1 = i;
				int p2 = i + 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] >= arr[i] && arr[i] > arr[p2]) {
						p2 = j;
					} else if (arr[j] > 0 && arr[j] > arr[p2] && arr[i] >= arr[p2]) {
						p2 = j;
					}
				}
				i = p2 - 1;
				for (int k = p1 + 1; k < p2; k++) {

					if (arr[p1] > arr[p2]) {
						q[k] = (arr[p2] - arr[k]);

					} else {
						q[k] = (arr[p1] - arr[k]);
					}
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (q[i] > 0)
				s += q[i];
		}
		return s;
	}

	public long Specific_digit_change(int source, int target, int number) {
		long place = 1;
		long n1 = number;
		if (number == source)
			number = target;
		long add = 0;
		while (n1 > 0) {
			long digit = n1 % 10;
			if (digit == source)
				add += place * Math.absExact(target - source);
			place = place * 10;
			n1 = n1 / 10;
		}
		if (target > source)
			return number + add;
		else
			return number - add;
	}

	public void English_Ruler_pattern(int inch, int tick) {
		for (int i = 0; i < tick; i++)
			System.out.print("-");
		System.out.println(0);
		for (int i = 1; i <= inch; i++) {
			ruler(tick - 1);
			for (int j = 1; j <= tick; j++) {
				System.out.print("-");
			}
			System.out.println(i);
		}
	}

	private void ruler(int tick) {
		if (tick == 0)
			return;
		ruler(tick - 1);
		for (int i = 0; i < tick; i++)
			System.out.print("-");
		System.out.println();
		ruler(tick - 1);
	}

	public int factorial(int number)/* Recursion */ {
		if (number == 0) {
			return 1;
		}
		return factorial(number - 1) * number;
	}

	public int power(int number, int power)/* Recursion */ {
		if (power == 0)
			return 1;
		return power(number, power - 1) * number;
	}

	public int first_occurrence_of_item_array(int[] arr, int start_index, int item)/* recursion */ {
		if (start_index == arr.length)
			return -1;
		if (item == arr[start_index])
			return start_index;
		return first_occurrence_of_item_array(arr, start_index + 1, item);
	}

	public int last_occurrence_of_item_array(int[] arr, int start_index, int item)/* recursion */ {
		if (start_index == arr.length)
			return -1;
		int s = last_occurrence_of_item_array(arr, start_index + 1, item);
		if (item == arr[start_index] && s == -1)
			return start_index;
		return s;
	}

	public int Reverse_Input(int number) {
		int q = 0;
		while (number != 0) {
			int rem = number % 10;
			number = number / 10;
			q = (q * 10) + rem;
		}
		return q;
	}

	public int[] Reverse_Array(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public int[][] Transpose_2DArray(int[][] arr) {
		int c = arr[0].length - 1;
		int[][] d = new int[arr[0].length][arr.length];
		while (c >= 0) {
			int r = 0;
			while (r != arr.length) {
				d[c][r] = arr[r][c];
				r++;
			}
			System.out.println();
			c--;
		}
		return d;
	}

	public int Rotate_Number(int number, int rotations) {
		int length = (int) (Math.log10(number) + 1);
		rotations = rotations % length;
		int rem = (int) (number % Math.pow(10, rotations));
		int que = (int) (number / (int) Math.pow(10, rotations));
		int s = rem * (int) (Math.pow(10, (length - rotations))) + que;
		return s;
	}

	public int[] Rotate_Array(int[] arr, int rotations) {
		rotations = rotations % arr.length;
		int[] arr1 = new int[arr.length];
		for (int i = arr.length - rotations; i < arr.length; i++)
			arr1[i] = arr[i];
		for (int i = 0; i < arr.length - rotations; i++)
			arr1[i] = arr[i];
		return arr1;
	}

	private int maximum(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}

	private int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}

	public void smallestDifferenceTriplet_Arrays(int arr1[], int arr2[], int arr3[], int length) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		// To store resultant three numbers
		int res_min = 0, res_max = 0, res_mid = 0;
		int i = 0, j = 0, k = 0;
		// Loop until one array reaches to its end
		// Find the smallest difference.
		int diff = 2147483647;
		while (i < length && j < length && k < length) {
			int sum = arr1[i] + arr2[j] + arr3[k];
			// maximum number
			int max = maximum(arr1[i], arr2[j], arr3[k]);
			// Find minimum and increment its index.
			int min = minimum(arr1[i], arr2[j], arr3[k]);
			if (min == arr1[i])
				i++;
			else if (min == arr2[j])
				j++;
			else
				k++;
			// comparing new difference with the
			// previous one and updating accordingly
			if (diff > (max - min)) {
				diff = max - min;
				res_max = max;
				res_mid = sum - (max + min);
				res_min = min;
			}
		}
		System.out.print("smallest difference triplet is- " + res_max + ", " + res_mid + ", " + res_min);
	}

	public void Spiral_Pattern(int number) {
		int a = 2 * number - 1;
		int row = 1;
		int row1 = number - 1;
		while (row <= number) {
			int b = number;
			int q = number + 1;
			for (int i = 1; i <= row; i++) {
				q--;
				if (q == 1) {
					break;
				}
				System.out.print(q);
			}
			for (int i = row + 1; i <= a - row; i++) {
				System.out.print(b - row + 1);
			}
			q--;
			for (int i = a - row + 1; i <= a; i++) {
				q++;
				System.out.print(q);
			}
			row++;
			b--;
			System.out.print("\n");
		}
		int b = 2;
		while (row <= a) {
			int q = number + 1;
			for (int i = 1; i <= row1; i++) {
				q--;
				if (q == 1) {
					break;
				}
				System.out.print(q);
			}
			for (int i = row1 + 1; i <= a - row1; i++) {
				System.out.print(b);
			}
			for (int i = a - row1 + 1; i <= a; i++) {

				System.out.print(q);
				q++;
			}
			row++;
			row1--;
			b++;
			System.out.print("\n");
		}
	}

	public void spiral_Pattern_2DArray_AntiClock(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int nel = arr.length * arr[0].length;
		int count = 0;
		while (count < nel) {
			for (int r = minrow; r <= maxrow; r++) {
				if (count < nel)
					System.out.print(arr[r][mincol] + " ");
				else
					break;
				count++;
			}
			mincol++;
			for (int c = mincol; c <= maxcol; c++) {
				if (count < nel)
					System.out.print(arr[maxrow][c] + " ");
				else
					break;
				count++;
			}
			maxrow--;
			for (int r = maxrow; r >= minrow; r--) {
				if (count < nel)
					System.out.print(arr[r][maxcol] + " ");
				else
					break;
				count++;
			}
			maxcol--;
			for (int c = maxcol; c >= mincol; c--) {
				if (count < nel)
					System.out.print(arr[minrow][c] + " ");
				else
					break;
				count++;
			}
			minrow++;
		}
	}

	public void spiral_Pattern_2DArray_Clock(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int nel = arr.length * arr[0].length;
		int count = 0;
		while (count < nel) {
			for (int c = mincol; c <= maxcol; c++) {
				if (count < nel)
					System.out.print(arr[minrow][c] + " ");
				else
					break;
				count++;
			}
			minrow++;
			for (int r = minrow; r <= maxrow; r++) {
				if (count < nel)
					System.out.print(arr[r][maxcol] + " ");
				else
					break;
				count++;
			}
			maxcol--;
			for (int c = maxcol; c >= mincol; c--) {
				if (count < nel)
					System.out.print(arr[maxrow][c] + " ");
				else
					break;
				count++;
			}
			maxrow--;
			for (int r = maxrow; r >= minrow; r--) {
				if (count < nel)
					System.out.print(arr[r][mincol] + " ");
				else
					break;
				count++;
			}
			mincol++;
		}
	}

	private int compareTo(String s1, String s2) {
		int i = 0;
		while (i < s1.length() && i < s2.length()) {
			if (s1.charAt(i) > s2.charAt(i)) {
				return 1;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
			i++;
		}
		if (s1.length() > s2.length()) {
			return -1;
		} else {
			return 1;
		}
	}

	public void Lexico_Sort_StringArray(String arr[], int length) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (compareTo(arr[j], arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public String String_Compress(String str) {
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				sb.append(str.charAt(i));
				if (cnt + 1 > 1) {
					sb.append(cnt + 1);
				}
				cnt = 0;
			}
		}
		return sb.toString();
	}

	public int Count_Palindromic_Substrings(String s) {
		int n = s.length(), ans = 0;
		if (n <= 0)
			return 0;
		boolean[][] dp = new boolean[n][n];
		for (int i = 0; i < n; ++i, ++ans)
			dp[i][i] = true;
		for (int i = 0; i < n - 1; ++i) {
			dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
			ans += (dp[i][i + 1] ? 1 : 0);
		}
		for (int len = 3; len <= n; ++len)
			for (int i = 0, j = i + len - 1; j < n; ++i, ++j) {
				dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
				ans += (dp[i][j] ? 1 : 0);
			}
		return ans;
	}

	public char String_MaxFreq_Char(String n) {
		int count = 0, max = 0;
		char f;
		char[] s = n.toCharArray();
		Arrays.sort(s);
		String s2 = new String(s);
		ArrayList<Character> s1 = new ArrayList<>();
		if (s2.length() <= 2) {
			f = s2.charAt(s2.length() - 1);
			return f;
		}
		for (int i = 1; i < s2.length(); i++) {
			if (s2.charAt(i) == s2.charAt(i - 1)) {
				count++;
				if (i == s2.length() - 1) {
					if (max <= count) {
						max = count;
						s1.add(s2.charAt(i));
					}
				}
			} else {
				if (max <= count) {
					max = count;
					s1.add(s2.charAt(i - 1));
				}
				count = 0;
			}
		}
		f = s1.get(s1.size() - 1);
		return f;
	}

	public String String_Reverse_Sentence(String a) {
		int j = a.length();
		String s = "";
		for (int i = a.length() - 1; i >= 0; --i) {
			if (i == 0) {
				for (int k = 0; k < j; k++) {
					s += a.charAt(k);
				}
				break;
			} else if (a.charAt(i) == ' ') {
				for (int k = i + 1; k < j; k++) {
					s += a.charAt(k);
				}
				j = i;
				s += " ";
			}
		}
		return s;
	}

	public void Target_Sum_Pairs_Array(int[] arr, int target) {
		Arrays.sort(arr);
		int i = 0;
		int q = 0, o = 0, p = 0, h = 1;
		int j = arr.length - 1;
		while (i < j) {
			q = arr[i] + arr[j];
			if (q < target)
				i++;
			else if (q > target)
				j--;
			else {
				System.out.println("pair " + h + "\n" + arr[i] + "\t" + arr[j]);
				o = i;
				p = j;
				h++;
				i++;
				j--;
			}
		}
		if (arr[o] + arr[p] != target)
			System.out.print("no corresponding sum present");
	}

	public void Target_Sum_Triplet_Array(int[] arr, int target) {
		Arrays.sort(arr);
		int h = 1;
		int q = 0, o = 0, p = 0, l = 0;
		for (int k = 0; k < arr.length; k++) {
			int i = k + 1;
			int j = arr.length - 1;
			while (i < j) {
				q = arr[i] + arr[j] + arr[k];
				if (q < target)
					i++;
				else if (q > target)
					j--;
				else {
					System.out.println("triplet " + h + "\n" + arr[k] + "\t" + arr[i] + "\t" + arr[j]);
					o = i;
					h++;
					p = j;
					l = k;
					i++;
					j--;
				}
			}
		}
		if (arr[o] + arr[p] + arr[l] != target)
			System.out.print("no corresponding sum present");
	}

	public void Wave_Pattern_2DArray_Col(int[][] arr) {
		int c = 0;
		while (c != arr[0].length) {
			if (c % 2 == 0) {
				int r = 0;
				while (r != arr.length) {
					System.out.print(arr[r][c] + " ");
					r++;
				}
			} else {
				int r1 = arr.length - 1;
				while (r1 >= 0) {
					System.out.print(arr[r1][c] + " ");
					r1--;
				}
			}
			c++;
		}
	}

	public void Wave_Pattern_2DArray_Row(int[][] arr) {
		int r = 0;
		while (r != arr.length) {
			if (r % 2 == 0) {
				int c = 0;
				while (c != arr[0].length) {
					System.out.print(arr[r][c] + " ");
					c++;
				}
			} else {
				int c1 = arr[0].length - 1;
				while (c1 >= 0) {
					System.out.print(arr[r][c1] + " ");
					c1--;
				}
			}
			r++;
		}
	}

	public void subsequence(String que, String ans) {
		if (que.length() == 0) {
			System.out.println("new subsequence -> " + ans);
			return;
		}
		char ch = que.charAt(0);// a
		String roq = que.substring(1);// bc
		subsequence(roq, ans + ch);// bc,a
		subsequence(roq, ans);// bc,_
	}

	public void subsequenceAscii(String que, String ans) {
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

	public void keypad1(char ch) {
		if (ch == '1') {
			System.out.println(ch + " o_o");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '2') {
			System.out.println(ch + " abc");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '3') {
			System.out.println(ch + " def");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '4') {
			System.out.println(ch + " ghi");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '5') {
			System.out.println(ch + " jkl");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '6') {
			System.out.println(ch + " mno");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '7') {
			System.out.println(ch + " pqrs");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '8') {
			System.out.println(ch + " tuv");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '9') {
			System.out.println(ch + " wxyz");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == '0') {
			System.out.println(ch + " @#$");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		} else if (ch == 'x' || ch == 'x') {
			System.out.println("exit");
			return;
		} else {
			System.out.println("wrong choice!");
			System.out.println("choice?");
			ch = sc.next().charAt(0);
			keypad1(ch);
		}
	}

	private String keypad2(char a) {
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

	public void keypad(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = que.charAt(0);
		String roq = que.substring(1);
		String code = keypad2(ch);
		for (int i = 0; i < code.length(); i++)
			keypad(roq, ans + code.charAt(i));
	}

	public void cointoss(int toss_times, String ans) {
		if (toss_times == 0) {
			System.out.println(ans);
			return;
		}
		cointoss(toss_times - 1, ans + "H");
		cointoss(toss_times - 1, ans + "T");
	}

	public void parinthesis_Pairs(int limit, String ans, int open, int close) {
		if (open == limit && close == limit) {/* open = open '(' count & close = close ')' count */
			System.out.println(ans);
			return;
		}
		if (open > limit || close > open)
			return;
		parinthesis_Pairs(limit, ans + "(", open + 1, close);
		parinthesis_Pairs(limit, ans + ")", open, close + 1);
	}

	public void stairs_Jump_outcome(int number_Stairs, String ans, int max_Jump) {
		if (number_Stairs < 0)
			return;
		if (number_Stairs == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= max_Jump; i++)
			stairs_Jump_outcome(number_Stairs - i, ans + i, max_Jump);
	}

	public void mazepath(int horizontal_move, int vertical_move, int end_row, int end_col, String ans) {
		if (horizontal_move == end_row && vertical_move == end_col) {
			System.out.println(ans);
			return;
		}
		if (horizontal_move > end_row || vertical_move > end_col)
			return;
		mazepath(horizontal_move + 1, vertical_move, end_row, end_col, ans + "H");
		mazepath(horizontal_move, vertical_move + 1, end_row, end_col, ans + "V");
		mazepath(horizontal_move + 1, vertical_move + 1, end_row, end_col, ans + "D");
	}

	public void permutation_String(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < que.length(); i++) {
			char ch = que.charAt(i);
			String roq = que.substring(0, i) + que.substring(i + 1);
			permutation_String(roq, ans + ch);
		}
	}

	public void coin_toss_NoConsicutiveHead(int n, String ans, Boolean flag) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (flag == false)
			coin_toss_NoConsicutiveHead(n - 1, ans + "H", true);
		coin_toss_NoConsicutiveHead(n - 1, ans + "T", false);
	}

	public void lexico_Number_sequence(int curr, int n) {
		if (curr > n)
			return;
		System.out.println(curr);
		int i = 0;
		if (curr == 0)
			i = 1;
		while (i <= 9) {
			lexico_Number_sequence(curr * 10 + i, n);
			i += 1;
		}
	}

	public void jumping_Numbers(int curr, int n) {
		if (curr > n)
			return;
		System.out.println(curr);
		int rem = curr % 10;
		if (curr == 0) {
			for (int i = 1; i <= 9; i++)
				jumping_Numbers(i, n);
		} else {
			if (rem != 0)
				jumping_Numbers(curr * 10 + rem - 1, n);
			if (rem != 9)
				jumping_Numbers(curr * 10 + rem + 1, n);
		}
	}

	public void palindromic_Partition_string(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= que.length(); i++) {
			String roq = que.substring(i);
			String roa = que.substring(0, i);
			if (isPalindrome(roa))
				palindromic_Partition_string(roq, ans + roa + " ");
		}
	}

	public Boolean isPalindrome(String s) {
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