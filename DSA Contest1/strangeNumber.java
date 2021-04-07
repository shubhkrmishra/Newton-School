/*
A number X (X>=0) is called strange if the sum of its digits is divisible by 9. Given an integer N, your task is to find the Nth strange number.
Input
The input contains a single line containing the value of N.

Constraints:-
1 <= N <= 1000
Output
Print the Nth strange number.
*/

/*
Sample Input:-
3

Sample Output:-
18

Explanation:-
0, 9, and 18 are the first three strange numbers.

Sample Input:-
2

Sample Output:-
9
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int sum;
		sum= (N-1)*9;
		System.out.println(sum);
	}
}
