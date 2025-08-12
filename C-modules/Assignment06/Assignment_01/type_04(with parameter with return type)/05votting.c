//Write a program to check whether a person is eligible to vote (age = 18+).

#include<stdio.h>
int votting(int );
void main()
{
	int age;
	printf("enter the age :");
	scanf("%d",&age);
int res= votting(age );
		if(res==1){
			printf("Eligible to vote");	
		}
		else
		{
			printf("Not eligible to vote");
		}
	
	
}

// start 
int votting(int age)
{
	
	
	if(age>18)
	{
		 return 1;
	}
	else
	{
		 return 0;
	}
}