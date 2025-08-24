//copy string using memcpy
#include<stdio.h>
#include<string.h>
void main()
{
	char str[50]="hey shanky";
	char brr[20];
	memcpy(brr,str,strlen(str)+1);
	printf("%s",brr);
	
	
}