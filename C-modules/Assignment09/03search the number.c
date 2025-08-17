//Search the given number in array.
#include<stdio.h>
int searchthenumber(int,int [],int,int,int);
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
int res=searchthenumber(size,arr,x,flag,idx);
		if(res==idx){
			printf("the number is index of:%d",res);
		}
		else
		{
			printf("the number is not found");
		}
}

//stsrt 
int searchthenumber(int size,int arr[],int x,int flag,int idx)
{
	
	for(int i=0;i<size;i++){
		if(arr[i]==x){
			idx=i;
			flag=1;	
		}
		
	}
	if(flag==1){
		return idx;
	}
	else
	{
		return 0;
	}
}