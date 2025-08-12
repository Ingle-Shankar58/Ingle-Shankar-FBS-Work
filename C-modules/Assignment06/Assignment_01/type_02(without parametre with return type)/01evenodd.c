//Write a program to check whether a number is even or odd.?

#include<stdio.h>
int evenodd();


void main()
{
	
	if(evenodd()==0){
		printf("enevn number");
	}
	else
	{
		printf("odd number");
	}
}
int evenodd()
{

int num;
	printf("enter a number : ");
	scanf("%d",&num);
	if (num%2==0)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	
	
}