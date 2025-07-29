//Calculating total salary based on basic. If basic <=5000 da, ta
//and hra will be 10%,20% and 25% respectively otherwise da, ta
// and hra will be 15%,25% and 30% respectively

#include<stdio.h>
void main() {
	int salary,da,ta,hra,total;
	printf("Enter Basic salary: ");
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
	printf("DA: %d\nTA: %d\nHRA:%d\nTotal Salary: %d",da,ta,hra,total);


}