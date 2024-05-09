#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{

    char Name[30];
    
    printf("Enter Name of file that you want to Delete : ");
    scanf("%s", Name);
    
    unlink(Name);

    return 0;
}   