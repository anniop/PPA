#include<stdio.h>
#include<string.h>
int main()
{
    char Arr[20];
    printf("Enter character");
    printf("%s", &Arr);
    printf("the string is %s", Arr);
    
    return 0;
}
/*
char Arr[] = "Hello";
    char Brr[] = {'H','E','L','L','O','\0'};

    printf("%s\n", Arr);
    printf("%s\n", Brr);

    printf("%d\n",strlen(Arr));
    printf("%d\n",strlen(Brr));


*/