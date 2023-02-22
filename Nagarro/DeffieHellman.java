import java.util.*;

public class DeffieHellman {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		int q = 23;
		int a = 9;
		int Xa, Xb, Ya, Yb, Ka, Kb;
		System.out.println("User-1 Private-Key?");
		Xa = sc.nextInt();
		System.out.println("User-2 Private-Key?");
		Xb = sc.nextInt();
		Ya = (int) (Math.pow(a, Xa)) % q;
		Yb = (int) (Math.pow(a, Xb)) % q;
		System.out.println("\nUser-1 Public-Key: " + Ya + "\nUser-2 Public-Key: " + Yb);
		Ka = (int) Math.pow(Yb, Xa) % q;
		Kb = (int) Math.pow(Ya, Xb) % q;
		if (Ka == Kb) {
			System.out.println("\nEncryption-key: " + Ka);
		} else {
			System.out.println("\nSome error occured while generating Encryption-Keys");
		}
	}
}
