//1. Print armstrong numbers in the given range 1 to n.
#include<stdio.h>
#include<math.h>
void armstrongrange(int,int,int,int,int);
void main()
{
	int num,count,temp,rem,sum;
	printf("enter the number :");
	scanf("%d",&num);
	armstrongrange(num,count,temp,rem,sum);
   	
}

//start
void armstrongrange(int num, int count, int temp,int rem,int sum)
{

	
	for(int i=1;i<=num;i++){
		temp=i;
		count=0;
		sum=0;
		
   while(temp>0){
   	temp=temp/10;
   	count++;
   }
   temp=i;
   while(temp>0){
   
   rem=temp%10;
//   rem=rem*count;
   sum=sum+pow(rem,count);
   temp=temp/10;
   }
   if(sum==i){
   	printf("%d\n",i);
   }
}
   	
}