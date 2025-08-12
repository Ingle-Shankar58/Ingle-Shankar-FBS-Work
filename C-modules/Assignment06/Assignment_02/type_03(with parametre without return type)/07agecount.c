//Accept the age and check if the person is:
//Child (age < 12),Teenager (12?19),Adult (20?59),Senior (60 and above)

#include<stdio.h>
void agecount(int);
void main()
{
	int age;
	printf("enter a age : ");
	scanf("%d",&age);
	agecount(age);
}
// start
void agecount(int age)
{

	
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