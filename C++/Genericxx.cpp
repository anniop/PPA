#include<iostream>
using namespace std;

template <class T>
T Addition(T iNo1, T iNo2)
{
    T Ans = 0;
    Ans = iNo1 + iNo2;
    return Ans;
}
template <class A>
A Maximun(A iNo1, A iNo2)
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

    cout<<"Enter Number 1 : \n";
    cin>>A;

    cout<<"Enter Number 2 : \n";
    cin>>B;

    float X = 0.0f, Y = 0.0f, Ans1 = 0.0f;

    cout<<"Enter Number 1 : \n";
    cin>>X;

    cout<<"Enter Number 2 : \n";
    cin>>Y;
    
    Ans1 = Addition(X,Y);
    cout<<"Addition is :"<<Ans1<<"\n";

    Ans1 = Maximun(X,Y);
    cout<<"Largest number is : "<<Ans1<<"\n";

    return 0;
}