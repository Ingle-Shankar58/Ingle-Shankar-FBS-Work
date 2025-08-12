//Write a program to check whether a number is even or odd.?

#include<stdio.h>
void evenodd(int*);
void main()
{
	int num;
	printf("enter a number : ");
	scanf("%d",&num);
	evenodd(&num);
}


// start 
void evenodd(int* num)
{

	if (*num%2==0)
	{
		printf("The numer is even");
	}
	else
	{
		printf("The number is odd");
	}
}