//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.

#include<stdio.h>
double calculater();
void main()
{
	printf("%lf",calculater());

}
// start 

double calculater()

 {
	double num1,num2,result;
	char operators;
	printf("enter a num1 : ");
	scanf("%lf",&num1);
	printf("enter a num2 :");
	scanf("%lf",&num2);
	printf("enter an operator (+, -, *, /,%) : ");
	scanf(" %c", &operators);
	if( operators=='+') {
		result= num1+num2;
		 return result;
	} else if( operators=='-') {
		result= num1-num2;
		 return result;
	} else if(operators=='*'){
		result=num1*num2;
		 return result;
	}else if( operators== '/') {
		if(num2!=0)
			result= num1/num2;
		 return result;
	} else if( operators== '%') {

		result= (int)num1%(int)num2;
		 return result;
	}

}
