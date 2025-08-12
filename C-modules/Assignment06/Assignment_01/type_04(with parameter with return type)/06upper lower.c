//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
int upper(char);
void main()
{
	char ch;
	printf("Enter a character : ");
	scanf("%c",&ch);
int res=upper(ch);
		if(res==1){
			printf("character is uppercase");
		}
		else
		{
			printf("character is lowercase");
		}
	
}

// start 

int upper(char ch)
{
	
	if(ch>='A' && ch<='Z')
	{
		 return 1;
	}
	else
	{
		 return 2;
	}
	
}