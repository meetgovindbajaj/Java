/**
@start--------------------------------------------

@param Question
Harsh has an M x N array 'MAT' where 'M' denotes the number of rows and 'N' denotes the number of columns. The element of each row are sorted in non-decreasing order.

Also, the last element of each row is smaller than the first element of the next row.

You are given an integer 'TARGET' and you need to check if this exist in 'MAT'.


@param Input-Format
The first line of input contains three space-separated integers M, N and TARGET where M and N denote the number of rows and columns of the MAT, respectively and TARGET is the integer to be found.

From the second line of input, the next N lines represent the rows of the MAT. Every row contains M single space-separated integers.


@param Output-Format
Print TRUE if 'TARGET' is present in the 'MAT', else print FALSE.


@param Input
3 4 9
2 3 4 5
6 7 8 9
10 11 12 13


@param Output
TRUE


@param Explaination
The 'TARGET' = 9 exists in the 'MAT' at index (1, 3).


@param Constraints
1 <= N <= 500

1 <= M <= 500

-10^5 <= MAT[i], TARGET <= 10^5

@end--------------------------------------------
*/

import java.util.*;

public class Search_Element_In_Sorted_Matrix{
    static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		int n=sc.nextInt(),m=sc.nextInt(),t=sc.nextInt(),x;
		Boolean isThere=false;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++){
				x=sc.nextInt();
				if(!isThere)isThere=x==t?true:false;		
			}
		System.out.print(isThere?"TRUE":"FALSE");
	}
}