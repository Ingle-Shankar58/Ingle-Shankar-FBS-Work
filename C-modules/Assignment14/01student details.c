//Student (rollNo, name, marks) 
#include<stdio.h>
#include<string.h>
typedef struct student
{
	int rollno;
	char name[50];
	int marks;
}student;

	void addstudent(student*);
	void displaystudent(student*);
void main()
{
	 student s1;
	
	addstudent(&s1);
	displaystudent(&s1);
	
	
}
void addstudent(student* s1)
{
	printf("\n\n--->Enter the student Details<---\n\n");
	printf("Enter a Student Rollno:");
	scanf("%d",&s1->rollno);
	printf("Enter the Student Name:");
	scanf("%s",&s1->name);
	printf("Enter the Student Marks:");
	scanf("%d",&s1->marks);
}
void displaystudent(student* s1)
{
	printf("\n\n--->Display the second student Details<---\n\n");
	printf("Student Rollno:%d\n",s1->rollno);
	printf("Student Name:%s\n",s1->name);
	printf("Student Marks:%d\n",s1->marks);
}