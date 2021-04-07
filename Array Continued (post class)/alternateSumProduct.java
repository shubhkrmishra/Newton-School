/*
Given an array Arr of N integers, your task is to print the sum of elements present at even places and print the product of elements present at the odd places.

Note:- Consider the first element to start from 1.
Input
The first line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
1 <= N <= 50
1 <= Arr[i] <= 5
Output
Print the sum of elements present at even places and print the product of elements present at the odd places separated by a space.
*/

/*
Sample Input:-
5
1 2 3 4 5

Sample Output:-
6 15

Explanation:-
Sum = 2 + 4
Product = 1*3*5

Sample Input:-
2
4 6

Sample Output:-
6 4
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0, product=1;
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<N;j++){
            
            if((j+1)%2==0){
                sum = sum+arr[j];
                
            }
            else{
                product = product*arr[j];
                            }
        }
        System.out.print(sum+" ");
        System.out.print(product);
	}
}
/*
sum = sum+arr[j]
product = product*arr
*/
