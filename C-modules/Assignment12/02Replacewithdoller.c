//WAP Replace all Occurrences of ‘a’ with $ in a String 
#include<stdio.h>
void main()
{
	int n=50;
	char str[n];
	char ch='a';
	printf("enter a string :");
	scanf("%s",&str);
	
	for(int i=0;i<n-1;i++){
		if(str[i]==ch){
			str[i]='$';
		}
	}
	printf("%s",str);
}