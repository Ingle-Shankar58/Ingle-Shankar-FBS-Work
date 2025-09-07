//10. Product (id, name, quantity, price
#include<stdio.h>
typedef struct product
{
	int id;
	char name[30];
	int quantity;
	int price;
}product;

void add(product*,int);
void display(product*,int);
void main()
{
	product p[2];
	add(p,2);
	display(p,2);
}
void display(product* p,int n)
{
	for(int i=0;i<n;i++){
		printf("\nID:%d",p[i].id);
		printf("\nName:%s",p[i].name);
		printf("\nQuantity:%d",p[i].quantity);
		printf("\nPrice:%d",p[i].price);
	}
}
void add(product* p ,int n)
{
	for(int i=0;i<n;i++){
		printf("Enter ID: ");
		scanf("%d",&p[i].id);
		printf("Enter Name :");
		scanf("%s",&p[i].name);
		printf("Enter quantity: ");
		scanf("%d",&p[i].quantity);
		printf("Enter Price: ");
		scanf("%d",&p[i].price);
	}
}
