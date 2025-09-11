#include<stdio.h>
#include<string.h>
void main(){
	char str[30];
	printf("Enter String : ");
	scanf("%s",str);
	
	
	char ch;
	printf("Enter Chacracter:");
	fflush(stdin);
	scanf("%c",&ch);
	int len=strlen(str);
	
	for(int i=0;i<len;i++){
		if(str[i]==ch){
			str[i]='$';
		}
	}
	printf("%s",str);
}