//Write a C program to input five numbers and find their average.

#include<stdio.h>
void main()
{
	int a1=10,a2=20,a3=30,a4=40,a5=50,sum,avg;
	sum=a1+a2+a3+a4+a5;
	printf("The sum is = %d",sum);
	avg=sum/5;
	printf(" and the average is = %d",avg);
}