/*
Given an array A of size N (at least three), you need to find its first, second and third maximum elements.

Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.
*/

/*
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1: 
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) throws IOException{
                      // Your code here
		//Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int test = scn.nextInt();
		String txt = br.readLine();
		int test = Integer.parseInt(txt);
		//for(int i=1; i <= test; i++)
		while(test-- > 0){
			//int N = scn.nextInt();
			int N = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] strArr = str.split(" ");
			long arr[] = new long[N];
			for(int i=0; i<N; i++){
				//arr[i] = scn.nextLong();
				arr[i] = Integer.parseInt(strArr[i]);
			}
			long max1 = 0, max2 = 0, max3 = 0;
			int idx =0;
			//1st maximum
			for(int i=0; i<N; i++){
				if(max1 < arr[i]){
					max1 = arr[i];
					idx = i;
				}
			}
			arr[idx] = 0;
			//2nd maximum
			for(int i=0; i<N; i++){
				if(max2 < arr[i]){
					max2 = arr[i];
					idx = i;
				}
			}
			arr[idx] = 0;
			//3rd maximum
			for(int i=0; i<N; i++){
				if(max3 < arr[i]){
					max3 = arr[i];
				}
			}
			System.out.println(max1 +" " + max2 +" " + max3);
		}

	}
}
