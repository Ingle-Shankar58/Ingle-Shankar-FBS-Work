//Sort the array.

#include<stdio.h>
void main()
{
	int arr[5]={5,2,3,4,1};
		printf("swappinf in acending order\n");
	for(int i=0;i<5;i++){
		for(int j=i+1;j<5;j++){
			if(arr[i]>arr[j]){
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		printf("%d ",arr[i]);
	}
	
	printf("\nswapping in decending order\n");
	for(int i=0;i<5;i++){
		for(int j=i+1;j<5;j++){
			if(arr[i]<arr[j]){
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		printf("%d ",arr[i]);
	}
	

}
	