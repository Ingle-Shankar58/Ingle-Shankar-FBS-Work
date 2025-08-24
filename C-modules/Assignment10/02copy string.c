// copy the string into another string 
#include<stdio.h>
#include<string.h>
void main()
{
	char str[10];
	char brr[10];
	printf("enter a string :");
	scanf("%s",str);
	printf("display in str:%s\n",str);
	printf("before copy string in brr: %s\n",brr);
	strcpy(brr,str);
	printf("after copy string in brr:%s",brr);
	
}