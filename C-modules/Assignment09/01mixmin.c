//Find minimum and maximum number in array.
#include<stdio.h>
void maxandmin(int []);
void main()
{
	int arr[5];
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	maxandmin(arr);	
}
void maxandmin(int arr[])
{
	
	int max=arr[0];
	for(int i=1;i<5;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}
	printf("maximum number:%d\n",max);
	int min=arr[0];
	for(int i=1;i<5;i++){
		if(arr[i]<min){
			min=arr[i];
		}
	}
	printf("minimum number is :%d",min);

}
