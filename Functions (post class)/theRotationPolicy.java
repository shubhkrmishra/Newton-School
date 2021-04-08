/*
English Team has now adopted a rotation policy for two of their players: Dom and Leach. On the first day, both of them played but, from the second day onwards, Dom plays every second day, while Leach plays every third day.

For example, on Day 1 - Both, Day 2 - Neither of them, Day 3 - Dom, Day 4 - Leach, Day 5 - Dom, Day 6 - Neither of them, Day 7 - Both.. and so on.

Find the number of days in the interval [A, B] (A and B, both inclusive) when neither Dom played nor Leach.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function RotationPolicy() that takes integers A, and B as arguments.

Constraints:-
1 <= A, B <=100000
Output
Return the number of days when neither of the two players played the game.
*/

/*
Sample Input:-
A = 3, B = 8

Sample Output:-
2

Sample Input:-
A=1, B = 4

Sample Output:-
1
*/

static int RotationPolicy(int A, int B){
    int arr[] = new int[B];
    int count=0;
    arr[0]=1;
    for(int i=0;i<B;i=i+2){
        arr[i]=1;
    }

    for(int i=0;i<B;i=i+3){
        arr[i]=1;
    }
    for(int i=A;i<B;i++){
        if(arr[i]==0){
            count++;
        }
    }
    return count;

}
