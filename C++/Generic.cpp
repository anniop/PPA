#include<iostream>
using namespace std;

int Addition(int iNo1, int iNo2)
{
    int Ans; 
    Ans = iNo1 + iNo2;
    return Ans;
}
int Maximun(int iNo1, int iNo2)
{
    if(iNo1>iNo2)
    {
        return iNo1;
    }
    else
    {
        return iNo2;
    }
}

int main()
{
    int A = 11, B = 21, Ans = 0;

    Ans = Addition(A,B);
    cout<<"Addition is :"<<Ans<<"\n";

    Ans = Maximun(A,B);
    cout<<"Largest number is : "<<Ans<<"\n";



    return 0;
}