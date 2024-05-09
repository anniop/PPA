#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>


int main()
{

    char Name[30];
    int fd = 0;
    int iRet = 0;
    char Data[] = "Google i am Comming for you";

    printf("Enter Name of file that you want to create : ");
    scanf("%s", Name);

    fd = open(Name, O_RDWR);
    iRet = write(fd, Data , 27);

    printf("%d bytes gets succesfully written into the file \n", iRet);

    close(fd);
     
    return 0;
}