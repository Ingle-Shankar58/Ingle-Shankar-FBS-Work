//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void perfect(int,int,int);
void main()
{
	int no,i=1,sum=0;
	printf("enter a number :");
	scanf("%d",&no);
	perfect(no,i,sum);
}
// start 
void perfect(int no,int i,int sum)
{
	
	while(i<no)
	{
	if(no%i==0){
		sum=sum+i;
	}
	i++;
    }
	if(sum==no){
		printf("Perfect number");
	}
	else
	{
		printf("not Perfect number");
	}
}