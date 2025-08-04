//Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome
#include<stdio.h>
void main()
{
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