//Write a program to check whether a number is even or odd.?

#include<stdio.h>
void main()
{
	int num;
	printf("enter a number= ");
	scanf("%d",&num);
	if (num%2==0)
	{
		printf("The numer is even");
	}
	else
	{
		printf("The number is odd");
	}
}