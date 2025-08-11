//Print perfect numbers in the given range 1 to n.

#include<stdio.h>
void main()
{
	int num,i,j,sum;
	printf("enter a number: ");
	scanf("%d",&num);
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