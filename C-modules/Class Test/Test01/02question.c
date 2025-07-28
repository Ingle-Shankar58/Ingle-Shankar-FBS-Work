//WAP to check if the year is leap or not.

#include<stdio.h>
void main()
{
	int year;
	printf("enter the yer");
	scanf("%d",&year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		printf("The year is leap");
	
	}
	else
	{
		printf("The year is not leap");
	}
	
}