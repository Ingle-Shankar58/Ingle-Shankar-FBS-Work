//Print perfect numbers in the given range 1 to n.

#include<stdio.h>
void perfectinrange(int,int,int,int);
void main()
{
	int num,i,j,sum;
	printf("enter a number: ");
	scanf("%d",&num);
	perfectinrange(num,i,j,sum);
}
// start 
void perfectinrange(int num,int i,int j,int sum)
{
	
	for(i=1;i<=num;i++){
		sum=0;
	for(j=1;j<i;j++){
		if(i%j==0){
			sum=sum+j;
		}
	}

	if(sum==i){
		printf("Perfect number %d\n",i);
	}
}
}