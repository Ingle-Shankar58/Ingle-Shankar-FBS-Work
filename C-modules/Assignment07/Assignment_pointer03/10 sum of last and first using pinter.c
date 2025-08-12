//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
void sumoffirstlast(int*,int*,int*);
void main()
{
	int no,ld,sum;
	
	printf("enter a number :");
	scanf("%d",&no);
	sumoffirstlast(&no,&ld,&sum);
	
}
// start
void sumoffirstlast(int* no,int* ld,int* sum)
{
	
	*ld=*no%10;
	while(*no>=10){
		*no=*no/10;
	}
	*sum=*ld+*no;
	printf("sum is %d",*sum);
	
}