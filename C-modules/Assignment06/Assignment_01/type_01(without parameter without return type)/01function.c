//Convert Ass_1 and ASS_2 program into functions with four types of function.

#include<stdio.h>
	void evenorodd();
	void palindrom();
	void leapyear();
	void vowelornot();
	void voting();
	void salaryslip();
	void upperlower();
void main()

{
	 evenorodd();
	 palindrom();
	leapyear();
	vowelornot();
    voting();
    salaryslip();
	 upperlower();
	
}

/// the main is end
//start the evenododd
void evenorodd(){


	int num;
	printf("check the number is even or odd : ");
	scanf("%d",&num);
	if (num%2==0)
	{
		printf("The numer is even\n");
	}
	else
	{
		printf("The number is odd\n");
	}
}
	
// end the even or odd


//palindrom start 

void palindrom()
{

	int num,r1,r2,r3,q1;
	printf("check the number is pallindrome or not : ");
	scanf("%d",&num);
//	int r1,r2,r3,q1;
	r1=num%10;
	q1=num/10;
	r2=q1%10;
	r3=q1/10;
	if(r1==r3)
	{
		printf("number is pallindrome\n");
	}
	else
	{
		printf("number is not pallindrome\n");
	}

}
// end the pakindrom


// start the lear year or not

void leapyear()
{

	int year;
	printf("check the is year is leap or not : ");
	scanf("%d",&year);
	
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		printf("leap year\n");
	}
	else
	{
		printf("The year is not leap\n");
	}
}

//start the vowel or not

void vowelornot()
{
	char ch;
	printf("check the character is vowel or not :");
	scanf(" %c",&ch);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		printf("character is a vowel\n");
	}
	else
	{
		printf("character is a consonant\n");
	}
}

//start the voting 
void voting()
{

	int age;
	printf("enter the age for check the eligible for voting : ");
	scanf("%d",&age);
	
	if(age>=18)
	{
		printf("Eligible to vote\n");
	}
	else
	{
		printf("Not eligible to vote\n");
	}
}
// strt the upperlower

void upperlower()
{

	int ch;
	printf("enter a charecter for check the upper or lower : ");
	scanf(" %c",&ch);
	
	if(ch>='A' && ch<='Z')
	{
		printf("character is uppercase\n");
	}
	else
	{
		printf("character is lowercase\n");
	}
}
// start the saliry
void salaryslip()
{


int salary,da,ta,hra,total;
	printf("Enter Basic salary find the da ta hra : ");
	scanf("%d",&salary);
	if(salary<=5000) {
		da=(salary*10)/100;
		ta=(salary*20)/100;
		hra=(salary*25)/100;
	} else {
		da=(salary*15)/100;
		ta=(salary*25)/100;
		hra=(salary*30)/100;
	}
	total=salary+da+ta+hra;
	printf("DA: %d\nTA: %d\nHRA:%d\nTotal Salary: %d \n",da,ta,hra,total);
}


// end the program
	


