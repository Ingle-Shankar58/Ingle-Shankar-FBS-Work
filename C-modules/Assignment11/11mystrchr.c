// mystrchr use define function
#include<stdio.h>
#include<string.h>
char* mystrchr(char*,char);
void main()
{
	char str[]="shankar";
	char ch='a';


char* res=mystrchr(str,ch);
printf("%u",res-str);

}
char* mystrchr(char* str,char ch)
{
	for(int i=0;str[i]!='\0';i++){
		if(ch==str[i]){
		return &str[i];
			break;
		}
	}
}