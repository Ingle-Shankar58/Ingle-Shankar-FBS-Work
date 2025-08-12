//Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong
#include<stdio.h>
void strong(int*,int*,int*,int*,int*);
void main()
{
	int num,reminder,fact,i,sum=0;
	printf("enter a number : ");
	scanf("%d",&num);
	strong(&num,&reminder,&fact,&i,&sum);
}
// start
void strong(int* num,int* reminder,int* fact,int* i,int* sum)
{
	
	int temp=*num;
	while(temp>0){
		*reminder=temp%10;
		*fact=1;
		*i=1;
	while(*i<=*reminder){
	*fact=*fact*(*i);
	(*i)++;
	}
	*sum=*sum+(*fact);
	temp=temp/10;
   }
   if(*sum==*num){
   	printf("number is strong");
   }
   else
   {
   	printf("number is not strong");
   }
}