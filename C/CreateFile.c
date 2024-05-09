#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{

    char Name[30];
    int fd = 0;
    printf("Enter Name of file that you want to create : ");
    scanf("%s", Name);

    fd = creat(Name, 0777);
    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File is created with FD %d\n", fd);
    }
    
    return 0;
}