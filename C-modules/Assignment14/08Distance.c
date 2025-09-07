//8. Distance ( feet, inch)
#include<stdio.h>
typedef struct distance
{
	int feet;
	int inch;
}distance;

void add(distance*);
void convert(distance*);
void display(distance);

void main()
{
	distance d1;
	add(&d1);
	convert(&d1);
	display(d1);
}
void display(distance d1)
{
	printf("%d : %d ",d1.feet,d1.inch);
}
void add(distance* d1)
{
	printf("Enter Feet: ");
	scanf("%d",&d1->feet);
	printf("Enter Inch: ");
	scanf("%d",&d1->inch);
}
void convert(distance* d1)
{
	int all=d1->feet*12 + d1->inch;
	d1->feet=all/12;
	d1->inch=all%12;
}