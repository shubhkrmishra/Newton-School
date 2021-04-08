/*
Sara is solving a math problem in which she has given an integer N and her task is to find the number of operations required to convert N into 1.
Where in one operation you replace the number with its second-highest divisor.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return the number of operations required.
*/

/*
Sample Input:-
N=100

Sample Output:-
4

Explanation:-
100 - > 50
50 - > 25
25 - > 5
5 - > 1

Sample Input:-
N = 10

Sample Output:-
2
*/

static int DivisorProblem(int N){
  int count=0,div=2;
  while(N>1){
    if(N%div==0){
        N=N/div;
        //div=2;
        count++;
    }else{
      div++;
    }
  }
  return count;
}


/*
static int DivisorProblem(int N){
//Enter your code here
    int operations = 0;
    while( N > 1){
        int divisor = 2;
        while(N%divisor != 0){
            divisor++;
        }
        N = N/divisor;
        operations++;
    }
    return operations;
}
*/


/*
long count_=0;
        while(N!=1){
            bool updated=0;
            for(long i=2;i<=sqrt(N);i++){
                if(N%i==0){N=N/i;count_++;updated=1;break;}
            }
            if(updated==0) {count_++;break;}
        }
        return count_;
*/
