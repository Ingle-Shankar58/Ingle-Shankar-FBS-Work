//Write a C program to convert given minutes into hours and remaining minutes.

#include<stdio.h>
void main()
{
	int min = 140,hrs;
	
	hrs = 140/60;
	min = 140%60;
	printf("The hours is = %d and minutes is %d ",hrs,min);
	
	
}