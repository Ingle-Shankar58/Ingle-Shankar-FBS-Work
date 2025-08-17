//Search the given number in array.
#include<stdio.h>
void main()
{
	int size;
	printf("enter a array size:");
	scanf("%d",&size);
	int arr[size];
	for(int i=0;i<size;i++){
		printf("enter array %d index:",i);
		scanf("%d",&arr[i]);
	}
	int x;
	int flag=0;
	printf("enter serching element :");
	scanf("%d",&x);
	int idx;
	for(int i=0;i<size;i++){
		if(arr[i]==x){
			idx=i;
			flag=1;	
		}
		
	}
	if(flag==1){
		printf("element in index of:%d",idx);
	}
	else
	{
			printf("element is not found");
	}
}