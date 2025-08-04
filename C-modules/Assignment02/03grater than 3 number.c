//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("enter a number a = ");
	scanf("%d",&a);
	printf("enter a number b = ");
	scanf("%d",&b);
	printf("enter a number c = ");
	scanf("%d",&c);
	
	if(a>b)
	{
		printf("a is grater");
	}
	else
	{
		if(b>c)
		{
			printf("b is grater");
		}
		else
		{
			printf("c is grater");
		}
	}
}