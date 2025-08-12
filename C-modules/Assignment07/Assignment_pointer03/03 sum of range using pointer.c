//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
void sumofrange(int*,int*);
void main()
{
	int no,i=1;
	printf("enter a number :");
	scanf("%d",&no);
	sumofrange(&no,&i);
}

// start
void sumofrange(int* no,int* i)
{
	int sum=0;
	
	while(*i<=*no){
		sum=sum+(*i);
		(*i)++;
	}
		printf("sum= %d",sum);
} 