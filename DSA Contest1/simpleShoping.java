/*
You went to shopping. You bought an item worth N rupees. What is the minimum change that you can get from the shopkeeper if you possess only 200 and 500 rupees notes.

Eg: If N = 678, the minimum change you can receive is 22, if you pay the shopkeeper a 500 and a 200 rupee note. You can show that no other combination can lead to a change lesser than this like (200, 200, 200, 200) or (500, 500).

Note: You have infinite number of 200 and 500 rupees notes. Enjoy, XD.
Input
The first and the only line of input contains an integer N.

Constraints
1 <= N <= 1000000000
Output
Output a single integer, the minimum amount of change that you will receive.
*/

/*
Sample Input
678

Sample Output
22

Sample Input
900

Sample Output
0
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=500 && n>400){
        	System.out.print(500-n);
    	}
		else if(n<=200 && n>0) {
			System.out.print(200-n);
		}
		else if(n>200 && n<=400) {
			System.out.print(400-n);
		}
		else if(n==0) {
			System.out.print(0);
		}
		else {
			int five=n/500;
			n=n-five*500;
			int two=n/200;
			n=n-two*200;
			if(n == 0) {
				System.out.print(0);
			}
			else {
				System.out.print(Math.min(Math.abs(100-n),200-n));
			}
		}
	}
}
