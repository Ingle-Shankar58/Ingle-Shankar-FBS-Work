//Write a program to check whether a number is even or odd.?

#include<stdio.h>
int evenodd(int);
void main()
{
	int num;
	printf("enter a number : ");
	scanf("%d",&num);
int res= evenodd(num);
	if(res==1){
		printf("The numer is even");
	}
	else
	{
		printf("The number is odd");
	}
}


// start 
int evenodd(int num)
{

	if (num%2==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}