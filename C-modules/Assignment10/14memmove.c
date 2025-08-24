#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shanky ingle";
	memmove(str + 3, str, 3);
	printf("%s",str);
	
}