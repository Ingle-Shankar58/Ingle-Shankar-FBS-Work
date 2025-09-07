//5. SalesManager (id, name, salary, incentive, target)

#include<stdio.h>
typedef struct employee
{
	int id;
	char name[50];
	double salary;
	int incentive;
	int target;
	
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
		printf("Enter employee ID: ");
		scanf("%d",&emp->id);
		printf("Enter employee Name: ");
		scanf(" %[^\n]",emp->name);
		printf("Enter employee Salary: ");
		scanf("%lf",&emp->salary);
		printf("Enter employee incentive :");
		scanf("%d",&emp->incentive);
		printf("Enter employee Terget: ");
		scanf("%d",&emp->target);
	}
}
void display(employee* emp,int n)
{
	for(int i=0;i<n;i++){
		printf("ID: %d",emp->id);
		printf("\nName: %s",emp->name);
		printf("\nSalary: %lf",emp->salary);
		printf("\nIncentive :%d",emp->incentive);
		printf("\nTarget: %d",emp->target);
	}
}