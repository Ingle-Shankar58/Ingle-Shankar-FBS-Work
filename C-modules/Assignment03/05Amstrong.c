//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>
#include<math.h>
void main()
{
	int no,rem,digits=0;
	int sum=0;
	int temp;
	printf("enter a number :");
	scanf("%d",&no);
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