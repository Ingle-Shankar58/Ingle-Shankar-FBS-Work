//write a program to accept array and exchangr the data of x th position to y th position
//eg arr[]={11,23,30,4,21,45,50}
//x th position =3;
//y th position =5;
//op(11,23,21,4,30,45,50)
//using function
#include<stdio.h>
void main()
{
	int arr[7]={11,23,30,4,21,45,50};
	int x=3;
	int y=5;

		int temp=arr[x-1];
		arr[x-1]=arr[y-1];
		arr[y-1]=temp;
		for(int i=0;i<7;i++){
		printf("%d ",arr[i]);
	}


}