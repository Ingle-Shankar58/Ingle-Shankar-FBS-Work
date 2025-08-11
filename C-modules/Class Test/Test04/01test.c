// Q1 write a program to print factors of number in given range ..
// Eg. range 10 to 15
//10=1,2,5,10
//11=1,11
//12=1,2,3,4,6,12
//13=1,13
//14=1,2,7,14
//15=1,3,5,15

#include<stdio.h>
void main()
{
	int end,start;
	printf("enter the starting number :");// user input
	scanf("%d",&start);
	printf("enter the ending number :");// user input
	scanf("%d",&end);
	
	for(int i=start;i<=end;i++){//condition
		printf("%d :",i);
		for(int j=1;j<=i;j++){//condition
			if(i%j==0){
				printf("%d ",j);//result
			}
		}
		printf("\n");
	}
}
