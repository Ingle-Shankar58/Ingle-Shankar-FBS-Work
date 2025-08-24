//WAP to Remove the Characters of Odd Index Values in a String
#include<stdio.h>
void main()
{
	char str[]="shankar";
	for(int i=0;str[i]!='\0';i++){
		if(i%2==0){
			printf("%c",str[i]);
		}
	}
}