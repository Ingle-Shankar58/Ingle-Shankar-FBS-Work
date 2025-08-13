// wap to calculate selling price of book based on cost price and discount ...
//using function

#include<stdio.h>
void discount(int,int,int);
void main()
{
	int cost,sp,dis=5;
	printf("enter a cost price: ");
	scanf("%d",&cost);
	discount(cost,sp,dis);
}

// start
void discount(int cost,int sp,int dis)
{
	
	if(cost>sp){
		sp=cost-(cost*dis/100);
		printf("cost price is :%d and discount is :%d and final price is :%d ",cost,dis,sp);
		
	}
}