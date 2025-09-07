//HR (id, name, salary, commission)
#include<stdio.h>
typedef struct employee
{
	int id;
	char name[50];
	double salary;
}employee;

void add(employee*,int);
void display(employee*,int);

void main()
{
	employee emp[1];
	add(emp,1);
	display(emp,1);
}
void add(employee* emp,int n)
{
	for(int i=0;i<n;i++){
		printf("Enter HR ID: ");
		scanf("%d",&emp->id);
		printf("Enter HR Name: ");
		scanf(" %[^\n]",emp->name);
		printf("Enter HR Salary: ");
		scanf("%lf",&emp->salary);
	}
}
void display(employee* emp,int n)
{
	for(int i=0;i<n;i++){
		printf("ID: %d",emp->id);
		printf("\nName: %s",emp->name);
		printf("\nSalary: %lf",emp->salary);
	}
}