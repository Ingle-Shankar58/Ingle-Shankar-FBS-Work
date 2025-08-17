//Merge two arrays
#include<stdio.h>
void main()
{
	int size;
	printf("enter a arr size :");
	scanf("%d",&size);
	int arr[size];
	int size1;
	printf("enter a brr size :");
	scanf("%d",&size1);
	int brr[size1];
	int crr[size+size1];
	for(int i=0;i<size;i++){
		printf("enter a :%d index of arr:",i);
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<size1;i++){
		printf("enter a :%d index of brr:",i);
		scanf("%d",&brr[i]);
	}
	
	for(int i=0;i<size;i++){
		crr[i]=arr[i];
	}
	for(int j=size+size1-1,i=size-1;j>=size1;j--,i--){
		crr[j]=brr[i];
	}
	printf("[");
	for(int i=0;i<size+size1;i++){
		printf("%d ",crr[i]);
	}
	printf("]");

}
