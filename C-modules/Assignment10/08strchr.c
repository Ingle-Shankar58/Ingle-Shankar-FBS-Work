//find first occurrence of character..
#include<stdio.h>
#include<string.h>
int main()
{
	char strr[20]="developer shanky";
	char ch ='s';
	char *ptr=strrchr(strr,ch);
	if(ptr!=NULL){
		printf("first occurrence of: %c is at posion :%u",ch,ptr-strr);
	}
	
}