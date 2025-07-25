//Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.

#include<stdio.h>
void main ()
{
	int english=80,math=75,science=90,marthi=95,hindi=85,sum,percentage;
	
	sum = english+math+science+marthi+hindi;
	printf("Total marks = %d",sum);
	
	percentage=sum/5;
	printf(" The percentage is = %d",percentage);
}