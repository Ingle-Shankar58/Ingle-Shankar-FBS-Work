// concatenation the string  but with a limit on the numbers of characters...
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20]="shanky";
	char brr[20]=" patil";
	int n=2;
	printf("display the str:%s\n",str);
	printf("display the brr:%s\n",brr);
	strncat(str,brr,n);
	
	printf("after concatenation brr in str: %s\n",str);
	
	
}
