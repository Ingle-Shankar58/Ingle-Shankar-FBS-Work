//8. Print a pattern of stars in diamond shape
//Input: n = 4
//Output:
//
//*
//**
//***
//****
//***
//**
//*

#include<stdio.h>
void main()
{
	int n=4,no=3;
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			printf("*");
		
		}
		
		printf("\n");
	}
		for(int k=1;k<=no;k++){
			for(int l=k;l<=no;l++){
					printf("*");
			}
				printf("\n");
			}
			
	
}
