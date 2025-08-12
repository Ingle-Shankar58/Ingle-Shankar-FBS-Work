//Write a program to check whether a given year is a leap year.1`

#include<stdio.h>
void leapyear(int*);
void main()
{
	int year;
	printf("enter a year :");
	scanf("%d",&year);
	 leapyear(&year);
}
// start 

void leapyear(int* year)
{
	
	
	if((*year%4==0) && (*year%100!=0) || (*year%400==0))
	{
		printf("leap year");
	}
	else
	{
		printf("The year is not leap");
	}
}
