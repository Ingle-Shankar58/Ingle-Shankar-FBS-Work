//7. Time (hour, min, sec)

#include<stdio.h>
typedef struct time
{
	int hour;
	int min;
	int sec;
}time;

void add(time*);
void convert(time*);
void display(time);


void main()
{
	time t1;
	add(&t1);
	convert(&t1);
	display(t1);
}
void convert(time* t1)
{
	int all=t1->hour*3600 + t1->min*60 + t1->sec;
	t1->hour=all/3600;
	t1->min=all%3600/60;
	t1->sec=all%3600%60;
		
} 

void add(time* t1)
{
	printf("Enter Hour : ");
	scanf("%d",&t1->hour);
	printf("Enter Mint : ");
	scanf("%d",&t1->min);
	printf("Enter Second : ");
	scanf("%d",&t1->sec);
}
void display(time t1)
{
	printf("%d : %d : %d",t1.hour,t1.min,t1.sec);
}

