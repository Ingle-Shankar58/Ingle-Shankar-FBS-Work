//5. Write a menu driven program to take a number for user and perform operations as follows.
//
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.

#include<stdio.h>
void main()
{
	printf("This is the mainu driven for your operations\n");
	printf("To check number is even or odd enter a : 1 \n");
	printf("To check number is prime or not enter a : 2\n");
	printf("To check number is pallindrome or not enter a : 3\n");
	printf("To check number is positive, negative or zero enter a : 4\n");
	printf("To reverse a number enter a : 5\n");
	printf("To find sum of digits enter a : 6\n");
	
	int choice;
	
	printf("enter the number in the mainu driven for perfom operations: ");
	scanf("%d",&choice);
	
	//To check number is even or odd.
	
	if(choice==1){
		int num;
		printf("enter a number for check the number is even or odd:");
		scanf("%d",&num);
		
		if(num%2==0){
			printf("even number");
		}
		else
		{
			printf("odd number");
		}
	}
	else   //To check number is prime or not.
	{
		if(choice==2){
			
			int num2,flag=0,i=2;
			printf("enter a number for check the number is prime or not: ");
			scanf("%d",&num2);
			
		while(i<=num2/2){
			if(num2%i==0){
				flag=1;
				break;
			}
			i++;
		}
		if(flag==0){
			printf("the number is prime");
		}
		else
		{
			printf("the number is not prime");
		}
			
		}
		else //check number is pallindrome or not.
		{
			if(choice==3){
				
			int num3,rev=0,temp;
			printf("enter the number for check the number is palindrom or not :");
			scanf("%d",&num3);
			temp=num3;
			
			while(num3>0){
				rev=(rev*10)+num3;
				num3=num3/10;
			}
			if(temp==rev){
				printf("the number is palindrom");
			}
			else
			{
				printf("the number is not palindrom");
			}
			}
			else //To check number is positive, negative or zero.
			{
				if(choice==4){
					
					int num4;
					printf("enter the number for check the number is positive negative : ");
					scanf("%d",&num4);
					
					if(num4>0){
						printf("the number is positive");
					}
					else
					{
						if(num4<0){
							printf("the number is negative");
						}
						else
						{
							printf("the number is zero");
						}
					}
				}
				else //To reverse a number.
				{
					if(choice==5){
						int num5,rev=0;
						printf("enter the number for reverse number : ");
						scanf("%d",&num5);
						
						while(num5>0){
							rev=(rev*10)+num5%10;
							num5=num5/10;
						}
						printf("the reverse number is %d",rev);
					}
					else  //To find sum of digits.
					{
						if(choice==6){
							int num6,sum=0,rem;
							printf("enter a number for sum of digits : ");
							scanf("%d",&num6);
						
							
							while(num6>0){
								rem=num6%10;
								num6=num6/10;
								sum=sum+rem;
							}
							printf("the sum of digits is %d ",sum);
						}
					}
				}
				
			}
		}
	}
}

       // end the mainu driven program........