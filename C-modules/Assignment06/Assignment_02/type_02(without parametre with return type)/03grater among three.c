//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
int grateramongthree();
void main()
{
int res=grateramongthree();
		if(res==0){
			printf("a is grater");
		}
		else if(res==1){
			printf("b is grater");
		}
		else
		{
			printf("c is grater");
		}
}
//start 

int grateramongthree()
{
	int a,b,c;
	printf("enter a number a : ");
	scanf("%d",&a);
	printf("enter a number b : ");
	scanf("%d",&b);
	printf("enter a number c : ");
	scanf("%d",&c);
	
	if(a>b)
	{
		return 0;
	}
	else
	{
		if(b>c)
		{
			 return 1;
		}
		else
		{
			 return 2;
		}
	}
}