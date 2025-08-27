//check if the arryis palindrome or note (using function)
#include<stdio.h>
int palindrome(int*,int);
void main()
{
	
	int arr[3]={1,2,1};
	int n=sizeof(arr)/sizeof(int);
int flag=palindrome(arr,n);
	
	if(flag==0){
		printf("array is palindrome");
	}
	else
	printf("array is not palindrome");
}
int palindrome(int arr[],int n){

 int flag=0;
	for(int i=0;i<n;i++){
		if(arr[i]!=arr[n-1-i])
		flag=1;
		break;
	}
	return flag;
}