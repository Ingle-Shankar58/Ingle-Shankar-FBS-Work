//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
int perfect();
void main()
{
int res=perfect();
		if(res==0){
			printf("Perfect number");
		}
		else
		{
			printf("not Perfect number");
		}
}

//start 
int perfect()
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
		 return 0;
	}
	else
	{
		 return 1;
	}
}