#include<stdio.h>

void Display(int iNo)       // Callee
{
    int iCnt = 0;
    while (iCnt < iNo)
    {
        printf("Jay Ganesh....\n");
        iCnt++;
    }
    
}

int main()      // Caller
{
    
    Display(4);

    return 0;
}