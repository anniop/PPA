#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

// SEEK_SET     Beginning of the file
// SEEK_CUR     Current Position
// SEEK_END     End of the file

int main()
{

    char Name[30];
    int fd = 0;
    int iRet = 0;
    char Data[30]= {'\0'};

    printf("Enter Name of file that you want to create : ");
    scanf("%s", Name);

    fd = open(Name, O_RDWR);
    lseek(fd, 10 , SEEK_SET);
    iRet = read(fd, Data , 27);

    printf("%d bytes gets succesfully read from the file \n", iRet);
    printf("%s \n",Data);

    close(fd);
     
    return 0;
}