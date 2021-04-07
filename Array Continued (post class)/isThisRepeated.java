/*
Given an array A of N integers, find whether there exists three consecutive same integers in the array.
Input
The first line of the input contains an integer N.
The second line contains N space separated integers of the array A.

Constraints
3 <= N <= 1000
1 <= A[i] <= 100
Output
Output "Yes" if there exists three consecutive equal integers in the array, else output "No" (without quotes).
*/

/*
Sample Input
5
1 2 2 2 4

Sample Output
Yes

Explanation: The segment [2, 2, 2] follows the criterion.

Sample Input
5
1 2 2 3 4

Sample Output
No
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = scn.nextInt();
		}
		int temp;
		int count = 1;
		boolean segment = false;
    
		for (int i=0;i<N-2;i++){
			temp = arr[i];
      		count = 1;
			
			for(int j = 1;j<3;j++){
				if(temp == arr[i+j]){
					count++;
				}

			}
			if(count == 3){
				segment = true;
			}
		}
		if(segment){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	
		

  }

 
}
