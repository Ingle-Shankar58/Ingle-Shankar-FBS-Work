//This is the Swapping of two number using a temporwory third variable

#include<stdio.h>
void main()
{
	int a=5,b=10,temp;
	temp=a;
	a=b;
	b=temp;
	printf("a = %d, b = %d",a,b);
}