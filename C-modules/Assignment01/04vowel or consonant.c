//Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
void main()
{
	char ch;
	printf("enter a character = ",ch);
	scanf("%c",&ch);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		printf("character is a vowel");
	}
	else
	{
		printf("character is a consonant");
	}
}