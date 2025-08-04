//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void main()
{
	int no,i=1,sum=0;
	printf("enter a number :");
	scanf("%d",&no);
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