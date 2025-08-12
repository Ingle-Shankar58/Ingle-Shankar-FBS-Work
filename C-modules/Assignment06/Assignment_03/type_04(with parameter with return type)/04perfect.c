//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
int perfect(int,int,int);
void main()
{
	int no,i=1,sum=0;
	printf("enter a number :");
	scanf("%d",&no);
int res=perfect(no,i,sum);
		if(res==0){
			printf("Perfect number");
		}
		else
		{
			printf("not Perfect number");
		}
}
// start 
int perfect(int no,int i,int sum)
{
	
	while(i<no)
	{
	if(no%i==0){
		sum=sum+i;
	}
	i++;
    }
	if(sum==no){
		 return 0;
	}
	else
	{
		 return 1;
	}
}