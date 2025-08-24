//WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
void main()
{
	char str[20];
	printf("enter a string:");
	scanf("%s",&str);
	int n;
	printf("enter a index:");
	scanf("%d",&n);
	
	for(int i=n;str[i]!='\0';i++){
		str[i]=str[i+1];
		}
	printf("%s",str);
}