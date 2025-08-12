//Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
int vowel(char);
void main()
{
	char ch;
	printf("enter a character : ",ch);
	scanf("%c",&ch);
int res=vowel(ch);
		if(res==1){
			printf("character is a vowel");
		}
		else
		{
			printf("character is a consonant");
		}
}

// start 
int vowel(char ch)
{
	
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		 return 1;
	}
	else
	{
		 return 0;
	}
}