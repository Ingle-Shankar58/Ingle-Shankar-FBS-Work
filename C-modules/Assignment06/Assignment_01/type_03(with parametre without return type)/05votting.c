//Write a program to check whether a person is eligible to vote (age = 18+).

#include<stdio.h>
void votting(int );
void main()
{
	int age;
	printf("enter the age :");
	scanf("%d",&age);
	 votting(age );
	
	
}

// start 
void votting(int age)
{
	
	
	if(age>18)
	{
		printf("Eligible to vote");
	}
	else
	{
		printf("Not eligible to vote");
	}
}