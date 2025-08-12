//Check the given number is prime or not.
//Input: n = 7
//Output: Prime

#include<stdio.h>
int primrornot();
void main()
{
int res= primrornot();
		if(res==1){
			printf("number is prime");	
		}
		else
		{
			printf("number is not prime");
		}
}

//start
int primrornot()
{
	int no,flag=0,i=2;
	printf("enter a number :");
	scanf("%d",&no);
	while(i<=no/2)
	{
		if(no%i==0){
		flag=1;
		break;
		}
		i++;
	}
	if(flag==0){
		 return 0;
	}
	else
	{
		 return 1;
	}
}