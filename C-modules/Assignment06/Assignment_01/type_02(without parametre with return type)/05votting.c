//Write a program to check whether a person is eligible to vote (age = 18+).

#include<stdio.h>
int voting();

void main()
{
	
	if(voting()==1){
			printf("Eligible to vote");
	}
	else
	{
		printf("Not eligible to vote");
	}
}

// start
int voting()
{
	int age;
	printf("enter the age : ");
	scanf("%d",&age);
	
	if(age>18)
	{
			return 1;
	}
	else
	{
		return 0;
	}
}