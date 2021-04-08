/*
Sherlock is a great detective but he is weak in maths. On one day Sherlock wants to divide N apples into M people but he is not sure whether he can divide them equally or not. Your task is to help Sherlock to solve the problem.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Help() that takes integers N and M as arguments.

Constraints:-
1 <= N M <= 1000
Output
Return 1 if it is possible to divide N apple among M people else return 0.

*/

/*
Sample Input:-
N = 6, M = 2

Sample Output:-
1

Explanation:- 
both people will get 3 apples each.

Sample Input:-
N=3, M = 4

Sample Output:-
0
*/

static int Help(int N, int M){
    if(N%M==0){
            return 1;
        }
        else{
            return 0;
        }
//Enter your code here
}
