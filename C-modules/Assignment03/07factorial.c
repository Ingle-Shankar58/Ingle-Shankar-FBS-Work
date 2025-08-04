//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void main()
{
	int no,i;
	int fact =1;
	printf("enter a number : ");
	scanf("%d",&no);
	i=no;
	while(i>1)
	{
		fact=fact*i;
		i--;
	}
	
		printf("factorial of :%d",fact);
}