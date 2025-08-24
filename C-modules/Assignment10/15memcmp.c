//memcmp() compares the first n bytes of memory blocks ptr1 and ptr2:
#include<stdio.h>
#include<string.h>
void main()
{
	char arr[20]="shankar";
	char brr[20]="shivaji";
	
int res=memcmp(arr,brr,3);
	if(res==0){
		printf("both are equal");
	}
	else if(res<0){
		printf("arr is less than brr");
	}
	else
	{
		printf("brr is less than arr");
	}
}