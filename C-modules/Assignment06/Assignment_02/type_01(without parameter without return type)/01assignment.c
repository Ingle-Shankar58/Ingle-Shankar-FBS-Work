#include<stdio.h>
void calculater();
void triangle();
void greatest();
void result();
void discount();
void divisiblenumber();
void agecount();
void main() {
	calculater();
     triangle();
     greatest();
     result();
     discount();
     divisiblenumber();
     agecount();
}

//01 Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.

void calculater() {
	double num1,num2,result;
	char operators;
	printf("enter a num1 : ");
	scanf("%lf",&num1);
	printf("enter a num2 : ");
	scanf("%lf",&num2);
	printf("enter an operator (+, -, *, /,%)= ");
	scanf(" %c", &operators);
	if( operators=='+') {
		result= num1+num2;
		printf("%lf",result);
	} else if( operators=='-') {
		result= num1-num2;
		printf("%lf",result);
	} else if( operators== '/') {
		if(num2!=0)
			result= num1/num2;
		printf("%lf",result);
	} else if( operators== '%') {

		result= (int)num1%(int)num2;
		printf("%d",result);
	}



}

//02 Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.

void triangle()
{
	int a,b,c;
	printf("\nAccept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.\n");
	printf("\nEnter a first side: ");
	scanf("%d",&a);
	printf("Enter a first second:");
	scanf("%d",&b);
	printf("Enter a first third: ");
	scanf("%d",&c);

	if(a==b&&b==c) 
	{
		printf("equilateral");
    }
    else
    {
    	if(a==b || b==c || c==a)
    	{
    		printf(" triangle");
		}
		else
		{
			printf("scalene");
		}
	}

}

//03  Write a program to find greatest of three numbers using nested if-else.

void greatest()
{
	int a,b,c;
	printf("\nfind greatest of three numbers\n ");
	printf("\nenter a number a : ");
	scanf("%d",&a);
	printf("enter a number b : ");
	scanf("%d",&b);
	printf("enter a number c ; ");
	scanf("%d",&c);
	
	if(a>b)
	{
		printf("a is grater");
	}
	else
	{
		if(b>c)
		{
			printf("b is grater");
		}
		else
		{
			printf("c is grater");
		}
	}
}

//04  Ask the user to enter marks. Then show the result based on these rules:
//If marks are more than 75 ? show "Distinction"
//If marks are more than 65 ? show "First Class"
//If marks are more than 55 ? show "Second Class"
//If marks are 40 or more ? show "Pass Class"
//If marks are less than 40 ? show "Fail"


void result()
{
	int marks;
	printf("\nshow the result based on these rules\n");
	printf("\n enter a marks: ");
	scanf("%d",&marks);
	if(marks>75){
		printf("Distinction");
	}
	else
	{
		if(marks>65){
			printf("First Class");
		}
		else
		{
			if(marks>55){
				printf("Second Class");
			}
			else
			{
				if(marks>40){
					printf("pass");
				}
				else
				{
					printf("fail");
				}
			}
		}
	}
	
}

//05  Accept the price from user. Ask the user if he is a student (user may say y or n).
//If he is a student and he has purchased more than 500 than discount is 20% otherwise discount is 10%.
//But if he is not a student then if he has purchased more than 600 discount is 15% otherwise there is not discount.

void discount()
{
	int price,discount,finalprice ;
	char ch;
	printf("\n student discount\n");
	printf("\nenter a price: ");
	scanf("%d",&price);
	printf("are you student (y,n): ");
	scanf(" %c",&ch);
	
	if(ch=='y'){
		if(price>500){
			discount=(price*20)/100;
		}
		else{
			discount=(price*10)/100;
		}
	}
	else
	if(ch=='n'){
		if(price>600){
			discount=(price*15)/100;
		}
		else
		printf("other wise no discount");
	}
	
    finalprice= price-discount;
    printf("discount %d =",discount);
    printf(" finalprice %d",finalprice);
}
//06  Accept a number and check if it is divisible by 3, 5, or both.
// (Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//  both" or” Divisible by None”)
void divisiblenumber()
{
	int num;
	printf("\nAccept a number and check if it is divisible by 3, 5, or both\n");
	printf("\nenter a number :");
	scanf("%d",&num);
	
	if(num%3==0 && num%5==0){
		printf("Divisible by both");
	}
	else
	{
		if(num%3==0||num%5!=0){
			printf("Divisible by 3");
		}
		else
		{
			if(num%3!=0||num%5==0){
				printf("Divisible by 5");
			}
			else
			{
				printf("Divisible by None");
			}
		}
	}
}

//07  Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)

void agecount()
{
	int age;
	printf("\nAccept the age and check if the person is:Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)\n");
	printf("\nenter a age: ");
	scanf("%d",&age);
	
	if(age<12){
		printf("Child");
	}
	else
	{
		if(age<19){
			printf("Teenager");
		}
		else
		{
			if(age<59){
				printf("Adult");
			}
			else
			{
				printf("Senior");
			}
		}
	}

}
// end the program......