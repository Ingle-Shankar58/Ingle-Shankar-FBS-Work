//Find sum of all numbers.
#include<stdio.h>
void main()
{
	int arr[5];
	
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
	printf("sum of array is:%d",sum);
	
}