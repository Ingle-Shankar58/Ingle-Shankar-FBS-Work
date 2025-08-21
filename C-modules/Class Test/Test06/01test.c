//write a program in c for to find common element in two array
//egg arr=1 2 3 4 5 
//brr=1 6 7 3 2
//out out = 1 2 3

#include<stdio.h>
void main()
{
	int arr[5];
	int brr[5];
	
	for(int i=0;i<5;i++){
		printf("enter array:%d index",i);
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++){
		printf("enter array:%d index",i);
		scanf("%d",&brr[i]);
	}
	
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(arr[i]==brr[j]){
				printf("%d",arr[i]);
			}
		}
	}
}