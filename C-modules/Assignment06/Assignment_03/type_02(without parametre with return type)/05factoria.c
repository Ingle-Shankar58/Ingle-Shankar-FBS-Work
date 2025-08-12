//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
int factoria();
void main()
{
int res=factoria();
printf("%d",res);
}

// start
int factoria()
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
	
		return fact;
}