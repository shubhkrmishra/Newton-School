/*
Write a program to find the simple interest for given principal amount P, time Tm(in years) and rate R.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SimpleInterest() that takes the principal amount P, rate R, and time Tm as a parameter.

Constraints:
1 <= P <= 10^3
1 <= Tm <= 20
1 <= R <= 20

Output
Return the floor value of the simple interest i.e. interest in integer format.
*/
static int SimpleInterest(int P, int R, int Tm){
    //enter your code here
        int sInter;
        sInter=(P*R*Tm)/100;
        return sInter;
    }