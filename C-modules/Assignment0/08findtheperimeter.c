//Write a C program to input the length and width of a rectangle and find its perimeter.
//Perimeter=2×(Length+Width)

#include<stdio.h>
void main()
{
	int length=30,width=40,perimeter;
	
	perimeter=2*length*width;
	printf("The perimeter is = %d",perimeter);
}