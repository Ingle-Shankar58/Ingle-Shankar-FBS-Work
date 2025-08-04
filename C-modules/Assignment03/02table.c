//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50

#include<stdio.h>
void main()
{
	int no=5,i=1,table;
	while(i<=10){
	table= no*i;
	i++;
	printf(" %d\n",table);
	}


}