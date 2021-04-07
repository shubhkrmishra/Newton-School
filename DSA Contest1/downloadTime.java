/*
Internet download speed is often expressed in bit per second whereas file size is expressed in Bytes. It is known that 1 Byte = 8 bits. Given file size in megabytes(MB) and internet speed in megabits per seconds(Mbps), find the time taken in seconds to download the file.
Input
The only line of input contains two integers denoting the file size in MB and download speed in Mbps.

1 <= file size <= 1000
1 <= download speed <= 1000
Output
Print a single integer denoting the time taken to download the file in seconds.
It is guaranteed that the result will be an integer.
*/

/*
Sample Input:
10 16

Sample Output:
5
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int result;
		result = (t1*8)/t2;
		System.out.print(result);
	}
}
