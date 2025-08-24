//WAP to Calculate the Number of Words Present in a String
#include<stdio.h>
void main()
{
	char str[]="Hello shankar how are you";
	int count=1;
	for(int i=0;str[i]!='\0';i++){
		if(str[i]==' '){
			count ++;
		}
		
	}
	printf("%d",count);
}