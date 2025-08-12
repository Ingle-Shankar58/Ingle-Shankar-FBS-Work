//Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>
int pallindrome();

void main()
{

	if(pallindrome()==1 ){
		printf("the number is pallindrome");
	}
	else
	{
		printf("the number is not pallindrome");
	}
}

int pallindrome()
{
	int num,r1,r2,r3,q1;
	printf("enter a number : ");
	scanf("%d",&num);
	r1=num%10;
	q1=num/10;
	r2=q1%10;
	r3=q1/10;
	if(r1==r3)
	{
		return 1;
	}
	else
	{
	return 0;
	}
}