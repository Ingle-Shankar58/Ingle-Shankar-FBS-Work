//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void main()
{
	int ch;
	printf("Enter a character = ");
	scanf("%c",&ch);
	
	if(ch>='A' && ch<='Z')
	{
		printf("character is uppercase");
	}
	else
	{
		printf("character is lowercase");
	}
	
}