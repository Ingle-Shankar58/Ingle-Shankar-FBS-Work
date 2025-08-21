//write a program in c to find two maximum number in array..

#include<stdio.h>
void main()
{
	int arr[5];
	for(int i=0;i<5;i++){
		printf("enter array:%d index",i);
		scanf("%d",&arr[i]);
	}
	int max=arr[0];
	for(int i=1;i<5;i++){
		if(arr[i]>max){	
			max=arr[i];
		}
	}
	printf("maximum no of the array :%d\n",max);
	
	int smax=arr[0];
	for(int i=1;i<5;i++){
		if(arr[i]>smax&&arr[i]!=max){	
			smax=arr[i];
		}
	}
	printf("second maximum number of array:%d",smax);
	
	
}
