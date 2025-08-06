// Que 2.wap to check if number is positive ,negative or neutral..

#include<stdio.h>
void main()
{
	int num;
	printf("enter a number : ");
	scanf("%d",&num);
	
	if(num>0){
		printf("positive");
	}
	else
	if(num<0){
		printf("negative");
	}
	else
	printf("neutral");
}