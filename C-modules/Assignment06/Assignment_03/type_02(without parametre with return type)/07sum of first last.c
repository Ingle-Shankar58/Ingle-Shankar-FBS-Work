//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
int sumoffirstlast();
void main()
{
printf("%d",sumoffirstlast());//	sumoffirstlast();
	
}
//start
int sumoffirstlast()
{
	int no,ld,sum;
	
	printf("enter a number :");
	scanf("%d",&no);
	ld=no%10;
	while(no>=10){
		no=no/10;
	}
	sum=ld+no;
	return sum;
	
}