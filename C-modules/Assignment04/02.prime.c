//Print prime numbers in the given range 1 to n.
#include<stdio.h>
void main(){
	int num,i,j;
	printf("enter a number : ");
	scanf("%d",&num);
	
	for(i=2;i<=num;i++){
		int flag=0;
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0){
			flag=1;
			break;
		}
	}
	if(flag==0){
		printf("%d\n",i);
	}
}
	
}