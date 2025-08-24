//WAP to Form a New String where the First Character and the Last Character have been Exchanged
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("enter a string:");
	scanf("%s",&str);
int n=strlen(str);
//	printf("%d",n);
	
	char temp;
	temp=str[0];
	str[0]=str[n-1];
	str[n-1]=temp;
	
	printf("%s",str);
}