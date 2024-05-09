#include<stdio.h>

void Display(int iNo)       // Callee
{
    static int iCnt = 0;
    if (iCnt < iNo)
    {
        printf("Jay Ganesh....\n");
        iCnt++;
        Display(iNo);   // Recursive Call
    }
    
}

int main()      // Caller
{
    
    Display(3);

    return 0;
}