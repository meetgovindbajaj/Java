import java.util.*;

public class MiniSeqString {
	static Scanner sc = new Scanner(System.in);

	public static void PrintMinNumberForPattern(String arr)/*D & I*/ {
		int curr_max = 0;
		int last_entry = 0;
		int j;
		for (int i = 0; i < arr.length(); i++) {
			int noOfNextD = 0;
			switch (arr.charAt(i)) {
			case 'I':
				j = i + 1;
				while (j < arr.length() && arr.charAt(j) == 'D') {
					noOfNextD++;
					j++;
				}
				if (i == 0) {
					curr_max = noOfNextD + 2;
					System.out.print("" + ++last_entry);
					System.out.print("" + curr_max);
					last_entry = curr_max;
				} else {
					curr_max = curr_max + noOfNextD + 1;
					last_entry = curr_max;
					System.out.print("" + last_entry);
				}
				for (int k = 0; k < noOfNextD; k++) {
					System.out.print("" + --last_entry);
					i++;
				}
				break;
			case 'D':
				if (i == 0) {
					j = i + 1;
					while (j < arr.length() && arr.charAt(j) == 'D') {
						noOfNextD++;
						j++;
					}
					curr_max = noOfNextD + 2;
					System.out.print("" + curr_max + "" + (curr_max - 1));
					last_entry = curr_max - 1;
				} else {
					System.out.print("" + (last_entry - 1));
					last_entry--;
				}
				break;
			}
		}
		System.out.println();
	}

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int n = sc.nextInt();//test cases
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			PrintMinNumberForPattern(s);
		}
	}

}