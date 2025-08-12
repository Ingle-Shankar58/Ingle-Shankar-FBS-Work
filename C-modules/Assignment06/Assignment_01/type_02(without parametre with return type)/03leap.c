//Write a program to check whether a given year is a leap year.1`

#include<stdio.h>
int year();
void main()
{
	
	 if(year()==1){
	 	printf("leap year ");
	 }
	 else
	 {
	 	printf("not leap");
	 }
}


int year()
{
	int year;
	printf("enter a year :");
	scanf("%d",&year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}