//wap to add alternate numbers from given range

//start=1,end=5


#include<stdio.h>
void main()
{
	int start,end,sum=0;
	printf("enter a first number for alernet addition :");//user input
	scanf("%d",&start);
	printf("enter a last number for alternet addition :");//user input
	scanf("%d",&end);
	
	for(int i=1;i<=end;i=i+2)//condition 
		sum=sum+i;
		{
			printf("%d",sum);//result
		}
		
		
	
}