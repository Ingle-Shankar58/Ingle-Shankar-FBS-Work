#include<stdio.h>
int sumofarray(int[]);
void main()
{
	int arr[5];
printf("sum of array:%d",sumofarray(arr));
	
}
// start 
int sumofarray(int arr[])
{
	
	
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	printf("Display\n");
	for(int i=0;i<5;i++){
		printf("%d\n",arr[i]);
	}
	int sum=0;
	for(int i=0;i<5;i++){
		sum=sum+arr[i];
	}
	return sum;
	
}