//Print alternate elements in array.
#include<stdio.h>
void alternate(int[]);
void main()
{
	int arr[5]={1,2,3,4,5};
	alternate(arr);
}
void alternate(int arr[]){
	for(int i=0;i<5;i=i+2){
		printf("%d ",arr[i]);
		
	}
}