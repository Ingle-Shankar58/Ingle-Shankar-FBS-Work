//split string into tokens
#include<stdio.h>
#include<string.h>
void main()
{
	char str[50]="java,spring,sql";
	char *res;
	res=strtok(str,",");
	while(res!=NULL){
		printf("%s  ",res);
		res=strtok(NULL,",");
	}
	
	
}