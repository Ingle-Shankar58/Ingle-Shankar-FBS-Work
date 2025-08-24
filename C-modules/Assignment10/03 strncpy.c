// copy first n character in string ...
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20]="shanky patil";
	char brr[20];
	int n=6;
	printf("display the str:%s\n",str);
	printf("before copy str in brr: %s\n",brr);
	strncpy(brr,str,n);
	
	printf("after copy str in brr: %s\n",brr);
	
	
}
