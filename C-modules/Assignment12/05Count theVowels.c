//WAP to Count the Number of Vowels in a String
#include<stdio.h>
void main()
{
	char str[20];
	printf("enter a string:");
	scanf("%s",&str);
	int count=0;
	
	for(int i=0;str[i]!='\0';i++){
		char ch=str[i];
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			count++;
		}
	}
	printf("%d",count);
	
}