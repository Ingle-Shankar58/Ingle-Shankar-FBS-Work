//wap print even and odd number in a given range.

#include<stdio.h>
void main()
{
	int start ,end ,i,start1,end1,s;
	printf("enter a number for start of even number :");//user input
	scanf("%d",&start);
	printf("enter a number for end even number :");//user input
	scanf("%d",&end);
	printf("enter a number for start of odd number :");//user input
	scanf("%d",&start1);
	printf("enter a number for end odd number :");//user input
	scanf("%d",&end1);
	
	printf("even :");
	for(i=start;i<=end;i++)//condition
	{
	  if(i%2==0){//condition
	  	printf("%d ",i);
	  }
		
	}
	printf("\nodd :");
	for(s=start1;s<=end1;s++)//condition
	{
	  if(s%2!=0){//condition
	  	printf("%d ",s);
	  }
		
	}
	
}