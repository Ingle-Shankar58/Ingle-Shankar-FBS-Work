// comprision first charecter
#include<stdio.h>
#include<string.h>
void main()
{
	char str[20]="shanky";
	char brr[20]="patil";
	int n=1;
int res=strncmp(str,brr,n);
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