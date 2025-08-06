//Oue 1. WAP to calculate electricity bill.
//For 1-50 units - 30 rs/unit, For 51-150 units - 40 rs/unit, For 15land above u 50 rs/unit.

#include<stdio.h>
void main()
{
	int unit,bill;
	printf("enter a unit :");
	scanf("%d",&unit);
	
	if(unit<=50){
		bill=unit*30;
		printf("%d",bill);
	}
	else
	
	if(unit<=150)
	{
		bill=unit*40;
		printf("%d",bill);
	}

	else
	{
		if(unit<=151){
			bill=unit*50;
			printf("%d",bill);
		}
	}
}