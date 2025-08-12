//Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome
#include<stdio.h>
int palindrome();
void main()
{
int res=palindrome();
	if(res==0){
		printf("palindrome",res);
	}
	else
	{
		printf("not a palindrome",res);
	}

}
// start
int palindrome()
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
		 return 0;
	}
	else
	{
		return 1;
	}
}