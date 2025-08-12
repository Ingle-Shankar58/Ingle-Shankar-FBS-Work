//Write a program to check whether a given character is uppercase or lowercase.

#include<stdio.h>
char upperlower();
void main()
{
	
	if(upperlower()=='A')
	{
		printf("character is uppercase");
	}
	else
	{
			printf("character is lowercase");
	}
	
}

// start 

char upperlower()
{
	int ch;
	printf("Enter a character : ");
	scanf("%c",&ch);
	
	if(ch>='A' && ch<='Z')
	{
		return 'A';
	}
	else
	{
			return 'a';
	}
	
}