//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>
#include<math.h>
void armstrong(int,int,int,int,int);
void main()
{
	int no,digits=0,sum=0,rem,temp;
	printf("enter a number :");
	scanf("%d",&no);
	armstrong(no,digits,sum,rem,temp);
}
// start
void armstrong(int no,int digits,int sum,int rem,int temp)
{
	
	temp = no;
	while(temp>0)
	{
		temp=temp/10;

		digits++;
	}
    temp=no;
    while(temp>0)
    {
    	rem=temp%10;
    	sum=sum+pow(rem,digits);
    	temp=temp/10;
	}
	if(no==sum){
		printf(" Armstrong");
	}
	else
	{
		printf("not Armstrong");
	}
}