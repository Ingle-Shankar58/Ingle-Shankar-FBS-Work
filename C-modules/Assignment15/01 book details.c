//1. Create a structure Book with data members as bname, id, author, price. Accept the
//values of all these members from user and display them.
#include<stdio.h>
typedef struct book
{
	char bname[30];
	int id ;
	char author[50];
	int price;
}book;

void add(book*);
void display(book);

void main()
{
	book b1;
	add(&b1);
	display(b1);
}
void display(book b1)
{
	printf("Name:%s\n",b1.bname);
	printf("ID:%d\n",b1.id);
	printf("author:%s\n",b1.author);
	printf("Price:%d",b1.price);
}

void add(book* b1)
{
	printf("Enter Book Name: ");
	scanf("%s",b1->bname);
	printf("Enter Book ID: ");
	scanf("%d",&b1->id);
	printf("Enter Book author: ");
	scanf("%s",b1->author);
	printf("Entter Book Price: ");
	scanf("%d",&b1->price);
}