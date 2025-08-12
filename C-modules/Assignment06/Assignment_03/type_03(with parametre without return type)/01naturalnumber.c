//Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10

#include<stdio.h>
void naturalnum(int);
void main()
{
	int i=1;
	naturalnum(i);
}

// start 
void naturalnum(int i)
{
	
	while(i<=10){
		printf("%d\n",i);
		i++;
	}
}