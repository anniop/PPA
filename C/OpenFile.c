#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>

// O_RDONLY  Read Only
// O_WRONLY  Write Only
// O_RDWR    Read & Write Both

int main()
{

    char Name[30];
    int fd = 0;
    printf("Enter Name of file that you want to Open : ");
    scanf("%s", Name);

    fd = creat(Name, O_RDWR);
    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File is opened with FD %d\n", fd);
    }

    close(fd);
    
    return 0;
}