//Admin (id, name, salary, allowance)
#include<stdio.h>
struct admin
{
	int id;
	char name[30];
	double salary;
	double allowance;
};
void store(struct admin adm[],int n);
void display(struct admin adm[],int n);
void main()
{
	struct admin A[3];
	store(A,3);
	display(A,3);
}
void store(struct admin* adm,int n)
{
	printf("-->Enter a Admin Details<--\n");
	for(int i=0;i<n;i++){
		printf("\n-->Enter a Admin Deatils:%d<--\n",i);
		printf("\nEnter Admin ID:");
		scanf("%d",&adm[i].id);
		printf("Enter Admin Name:");
		scanf("%s",adm[i].name);
		printf("Enter Salary:");
		scanf("%lf",&adm[i].salary);
		printf("Enter Allowance:");
		scanf("%lf",&adm[i].allowance);
		
	}
}
void display(struct admin adm[],int n)
{
	printf("\n\n-->Display a Adnin Details<--\n");
	for(int i=0;i<n;i++){
		printf("\n\n-->Display a Admin Details:%d<--\n",i);
		printf("\nAdmin ID:");
		printf("%d",adm[i].id);
		printf("\nAdmin Name:");
		printf("%s",adm[i].name);
		printf("\nAdmin Salary:");
		printf("%lf",adm[i].salary);
		printf("\nAdmin Allowance:");
		printf("%lf",adm[i].allowance);
	}
}