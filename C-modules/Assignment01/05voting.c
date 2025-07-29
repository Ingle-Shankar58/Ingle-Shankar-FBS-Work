//Write a program to check whether a person is eligible to vote (age = 18).

#include<stdio.h>
void main()
{
	int age;
	printf("enter the age = ");
	scanf("%d",&age);
	
	if(age>=18)
	{
		printf("Eligible to vote");
	}
	else
	{
		printf("Not eligible to vote");
	}
}