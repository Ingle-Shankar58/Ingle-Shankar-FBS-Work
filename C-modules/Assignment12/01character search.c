//Write a program to scan string from user then scan a single character and search it 
//in a accepted string.
#include<stdio.h>
#include<string.h>
void main()
{
	int n=50;
	char str[n];

	printf("enter a string :");
	scanf("%s",&str);
	
	char ch;
	printf("enter a charecter :");
	scanf(" %c",&ch);
	
	int flag=0;
	for(int i=0;i<n-1;i++){
		if(str[i]==ch){
			printf("the charecter is fount in the:%uth index",i);
			flag=1;
		}
		
	}
	if(flag==0){
		printf("invalid charecter");
	}
	
	

	
}