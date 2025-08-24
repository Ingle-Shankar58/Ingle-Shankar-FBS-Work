//mystrrchr user define function
#include<stdio.h>
#include<string.h>
char* mystrrchr(char*,char);
void main()
{
	char str[]="shankar";
	char ch='a';
	//mystrrchr(str,ch);
char* res=mystrrchr(str,ch);
printf("%u",res-str);
}

char* mystrrchr(char* str,char ch)
{
int res=strlen(str);
//printf("%d\n",res);

for(int i=res-1;i>=0;i--){
//	printf("%u\n",&str[i]);
	if(ch==str[i]){
		return &str[i];
		break;
	}
}



}