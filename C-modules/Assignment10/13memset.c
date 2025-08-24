#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	gets(str);
	memset(str,'*',5);
	puts(str);
	
}

