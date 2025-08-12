//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
int sumofrange();
void main()
{
 int res=sumofrange();
 printf("%d",res);
}
// start
int sumofrange()
{
	int i=1,no,sum=0;
	printf("enter a number :");
	scanf("%d",&no);
	while(i<=no){
		sum=sum+i;
		i++;
	}
		return sum;
}