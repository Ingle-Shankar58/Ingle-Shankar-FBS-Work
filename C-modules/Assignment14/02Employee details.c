//Employee (id, name, salary) 
#include<stdio.h>
typedef struct employee
{
	int id;
	char name[50];
	double salary;
}employee;

void employeedetail(employee* emp);
void displaydetail(employee* emp);


void main()
{
	employee emp;
	employeedetail(&emp);
	displaydetail(&emp);
}
void employeedetail(employee* emp)
{
	printf("--- > Enter a Employee Details <---\n\n");
	printf("Enter a Employee ID:");
	scanf("%d",&emp->id);
	printf("Enter a Employee Name:");
	scanf(" %[^\n]",&emp->name);
	printf("Enter a Employee Salary:");
	scanf("%lf",&emp->salary);
}
void displaydetail(employee* emp)
{
	printf("\n\n--- > Dispaly a Employee Details <---\n");
	printf("\nEmployee ID:");
	printf("%d",emp->id);
	printf("\nEmployee Name:");
	printf("%s",emp->name);
	printf("\nEmployee Salary:");
	printf("%lf",emp->salary);
}


