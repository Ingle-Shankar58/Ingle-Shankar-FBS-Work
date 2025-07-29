//Write a program to check given 3 digit number is pallindrome or not.

#include<stdio.h>
void main()
{
	int num,r1,r2,r3,q1;
	printf("enter a number= ");
	scanf("%d",&num);
//	int r1,r2,r3,q1;
	r1=num%10;
	q1=num/10;
	r2=q1%10;
	r3=q1/10;
	if(r1==r3)
	{
		printf("number is pallindrome");
	}
	else
	{
		printf("number is not pallindrome");
	}
}