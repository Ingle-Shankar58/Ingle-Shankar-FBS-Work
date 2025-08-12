//Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10

#include<stdio.h>
#include<math.h>
void naturalnumber();
void table();
void sumofnumber();
void primeornot();
void amstrong();
void perfect();
void factorial();
void strong();
void palindrome();
void sumoffirstandlastdigit();
void main()
{
	naturalnumber();
	table();
	sumofnumber();
	primeornot();
	amstrong();
	perfect();
	factorial();
	strong();
	palindrome();
	sumoffirstandlastdigit();
}
// start

// 01 Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10
void naturalnumber()
{
	printf("numbers from 1 to 10\n");
	int i=1;
	while(i<=10){
		printf("%d\n",i);
		i++;
	}
}
// 02 Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50
void table()
{
	printf("\ntable for given number\n");
	int no=5,i=1,table;
	while(i<=10){
	table= no*i;
	i++;
	printf(" %d\n",table);
	}
}

// 03 Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

void sumofnumber()
{
	printf("\nSum of numbers in given range\n");
	int i=1,no,sum=0;
	printf("enter a number :");
	scanf("%d",&no);
	while(i<=no){
		sum=sum+i;
		i++;
	}
		printf("sum= %d",sum);
}

// 04 Check the given number is prime or not.
//Input: n = 7
//Output: Prime

void primeornot()
{
	printf("\nCheck the given number is prime or not\n");
	int no,flag=0,i=2;
	printf("enter a number :");
	scanf("%d",&no);
	while(i<=no/2)
	{
		if(no%i==0){
		flag=1;
		break;
		}
		i++;
	}
	if(flag==0){
		printf("number is prime");
	}
	else
	{
		printf("number is not prime");
	}
}

// 05 Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong

void amstrong()
{
	printf("\nCheck the given number is Armstrong number or not\n");
	int no,rem,digits=0;
	int sum=0;
	int temp;
	printf("enter a number :");
	scanf("%d",&no);
	temp = no;
	while(temp>0)
	{
		temp=temp/10;

		digits++;
	}
    temp=no;
    while(temp>0)
    {
    	rem=temp%10;
    	sum=sum+pow(rem,digits);
    	temp=temp/10;
	}
	if(no==sum){
		printf(" Armstrong");
	}
	else
	{
		printf("not Armstrong");
	}
}

// 06 Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect

void perfect()
{
	printf("\nCheck the given number is Perfect number or not\n");
	int no,i=1,sum=0;
	printf("enter a number :");
	scanf("%d",&no);
	while(i<no)
	{
	if(no%i==0){
		sum=sum+i;
	}
	i++;
    }
	if(sum==no){
		printf("Perfect number");
	}
	else
	{
		printf("not Perfect number");
	}
}

// 07 Find factorial of given number.
//Input: n = 5
//Output: 120
void factorial()
{
	printf("\nFind factorial of given number\n");
	int no,i;
	int fact =1;
	printf("enter a number : ");
	scanf("%d",&no);
	i=no;
	while(i>1)
	{
		fact=fact*i;
		i--;
	}
	
		printf("factorial of :%d",fact);
}

// 08 Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong

void strong()
{
	printf("\nCheck the given number is Strong number or not\n");
	int num,reminder,fact,i,sum=0;
	printf("enter a number : ");
	scanf("%d",&num);
	int temp=num;
	while(temp>0){
		reminder=temp%10;
		fact=1;
		i=1;
	while(i<=reminder){
	fact=fact*i;
	i++;
	}
	sum=sum+fact;
	temp=temp/10;
   }
   if(sum==num){
   	printf("number is strong");
   }
   else
   {
   	printf("number is not strong");
   }
}
// 09 Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome
void palindrome()
{
	printf("\nCheck the given number is Palindrome number or not\n");
	int num,temp,remainder,reverse=0;
	printf("enter a number : ");
	scanf("%d",&num);
	
	temp=num;
	while(temp>0){
		remainder=temp%10;
		reverse = reverse*10 + remainder;
		temp=temp/10;
	}
	if(reverse==num){
		printf("%d is palindrom",num);
	}
	else
	{
		printf("%d is not a palindrom",num);
	}
}
// 10 Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)

void sumoffirstandlastdigit()
{
	printf("\nSum of first and last digit of given number\n");
	int no,ld,sum;
	
	printf("enter a number :");
	scanf("%d",&no);
	ld=no%10;
	while(no>=10){
		no=no/10;
	}
	sum=ld+no;
	printf("sum is %d",sum);
	
}