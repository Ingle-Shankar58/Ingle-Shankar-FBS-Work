//find the substring inside the string 
#include<stdio.h>
#include<string.h>
void main()
{
	char str[50]="i am shanky patil";
	char substr[50]="shankar";
	char *res=strstr(str,substr);
	if(res!=NULL){
		printf("position of substr: %u and remaining str: %s",res-str,res);
	}
	else
	printf("not found");
}