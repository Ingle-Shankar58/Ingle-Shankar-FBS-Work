// Q2 write a program to find power of any number ..
// Eg.2^4=16.

#include<stdio.h>
void main()
{
	int base,exponent;
	printf("enter a base :");//use input base
	scanf("%d",&base);
	printf("enter a exponent :");// user input exponent 
	scanf("%d",&exponent);
	int result=1;
	
	for(int i=1;i<=exponent;i++){//condition 
		result=result*base;//calculate the power 
	}
	printf("The power of %d is: %d",base,result);//result
}