//6. Date (date, month, year)
#include<stdio.h>
typedef struct date
{
	int date;
	char month[50];
	int year;
}date;

void add(date*);
void display(date*);

void main()
{
	date d1;
	add(&d1);
	display(&d1);
}

void add(date* d1)
{
	printf("Enter a Date :");
	scanf("%d",&d1->date);
	printf("Enter Month : ");
	scanf("%s",&d1->month);
	printf("Enter Year: ");
	scanf("%d",&d1->year);
}
void display(date* d1)
{
	printf("Date : %d ",d1->date);
	printf("Month: %s ",d1->month);
	printf("Year : %d ",d1->year);
}