//Accept a number and check if it is divisible by 3, 5, or both.
// (Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//  both" or” Divisible by None”)

#include<stdio.h>
int divisibleby();
void main()
{
int res=divisibleby();
		if(res==0){
			printf("Divisible by both");
		}
		else if(res==1){
			printf("Divisible by 3");
		}
		else if(res==2){
			printf("Divisible by 5");
		}
		else if(res==3){
			printf("Divisible by None");
		}
}
// start 
int divisibleby()
{
	int num;
	printf("enter a number : ");
	scanf("%d",&num);
	
	if(num%3==0 && num%5==0){
		 return 0;
	}
	else
	{
		if(num%3==0||num%5!=0){
		 return 1;
		}
		else
		{
			if(num%3!=0||num%5==0){
				 return 2;
			}
			else
			{
				 return 3;
			}
		}
	}
}