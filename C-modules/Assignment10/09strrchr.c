//find the last occurrence of character..
#include<stdio.h>
#include<string.h>
int main()
{
	char strr[20]="developer shankys";
	char ch ='e';
	char *ptr=strrchr(strr,ch);
	if(ptr!=NULL){
		printf("last occurrence of character: %c is at posion :%u",ch,ptr-strr);
	}
	else
	printf("character is not found");
	
}