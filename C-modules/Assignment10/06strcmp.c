// copmaresion two string 
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20]="shanky";
	char brr[20]="patil";
int res=strcmp(str,brr);
 printf("%d",res);
	if(res==0){
		printf("bot string is equal");
	}
	else if(res<0){
			printf("brr is grater then str");
		}
		else
		{
			printf("str is grater than brr");
		}
	
	
	
}