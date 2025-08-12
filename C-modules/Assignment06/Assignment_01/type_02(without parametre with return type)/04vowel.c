//Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
char vowel();
void main()
{
	if(vowel()==1){
		printf("character is a vowel");
	}
	else
	{
		printf("character is a consonant");
	}
}

// start
char vowel()
{
	char ch;
	printf("enter a character : ",ch);
	scanf("%c",&ch);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}