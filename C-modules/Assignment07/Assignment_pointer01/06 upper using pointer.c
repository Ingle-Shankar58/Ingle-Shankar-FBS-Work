//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void upper(char*);
void main()
{
	char ch;
	printf("Enter a character : ");
	scanf("%c",&ch);
	upper(&ch);
	
}

// start 

void upper(char* ch)
{
	
	if(*ch>='A' && *ch<='Z')
	{
		printf("character is uppercase");
	}
	else
	{
		printf("character is lowercase");
	}
	
}