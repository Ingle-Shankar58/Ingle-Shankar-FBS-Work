// concatenation the string ...
#include<stdio.h>
#include<string.h>
void main()
{
	char str[30]="shanky";
	char brr[20]=" patil";
char* res=strcat(str,brr);
	
	printf("after concatenation brr in str: %s",res);
	
}





// #include<stdio.h>
// #include<string.h>
// char* mystrcat(char*,char*);
// void main()
// {
// 	char str[30]="shanky";
// 	char brr[20]=" patil";
// char*res=	mystrcat(str,brr);
	
// 	printf("after concatenation brr in str: %s",res);
	
// }
// char* mystrcat(char* a,char* b)
// {
// 	int n=strlen(a);
// 	printf("Length=%d\n",n);
// 	int i=n,j=0;
// 	for(;b[j]!='\0';){
// 		a[i]=b[j];
// 		i++;
// 		j++;
// 	}
// 	puts(a);
// //  return a;
// }

