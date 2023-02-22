import java.util.*;

public class Testtt {
    public static void main(String[] args) {
        Boolean change = false;
        Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
        ArrayList<Integer> i = new ArrayList<>();
        for(int j=0;j<n;j++){
            int in=scn.nextInt();
            i.add(in);
        }
        Collections.sort(i);
        int store = 0;
        int count = 0;
        int innerCount = 0;
        int innerStore = 0;
        for (int j = 0; j < n - 1; j++) {
            if (i.get(j) == i.get(j + 1)) {
                change = true;
                store = i.get(j);
                if (j == n - 1) {
                    count += 2;
                } else {

                    count++;
                }
            } else {
                if (count > innerCount) {
                    innerCount = count;
                    innerStore = store;
                }
                count = 0;
            }
        }
        if (count > innerCount && change == true) {
            System.out.print(store);
        } else {
            if (change == false) {
                System.out.print(1);
            }
            else{

                System.out.print(innerStore);
            }
        }
        scn.close();
    }
}