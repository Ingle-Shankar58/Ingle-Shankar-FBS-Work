//Accept a number and check if it is divisible by 3, 5, or both.
// (Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//  both" or” Divisible by None”)

#include<stdio.h>
void divisiblebyboth(int);
void main()
{
	int num;
	printf("enter a number : ");
	scanf("%d",&num);
	divisiblebyboth(num);
}
// start 
void divisiblebyboth(int num)
{
	
	
	if(num%3==0 && num%5==0){
		printf("Divisible by both");
	}
	else
	{
		if(num%3==0||num%5!=0){
			printf("Divisible by 3");
		}
		else
		{
			if(num%3!=0||num%5==0){
				printf("Divisible by 5");
			}
			else
			{
				printf("Divisible by None");
			}
		}
	}
}