/*
Given an integer n, For each i (1<=i<=n) if i is even print "even" else print "odd".

Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions For_Loop() that takes the integer n as parameter.

Constraints:
1 <= n <= 100

Output
Print even or odd for each i (1<=i<=n) separated by white spaces.
*/
public static void For_Loop(int n){
//Enter your code here
    for(int i=0;i<n;i++){
         if(i%2==1){
             System.out.print("even ");
         }
         else {
             System.out.print("odd ");
         }
     }
}
