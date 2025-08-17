//9. Reverse the given array.
#include<stdio.h>
void reverse(int[],int,int);
void main()
{
	int arr[5]={1,2,3,4,5};
	int i,j;
	
	reverse(arr,i,j);
	
}
// start
void reverse(int arr[],int i,int j)
{
	
	for(i=0,j=4;i<j;i++,j--){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
		for(int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
	
	
}