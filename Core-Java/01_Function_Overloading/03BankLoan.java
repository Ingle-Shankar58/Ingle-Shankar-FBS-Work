class Student {

	int rollno;
	String name;
	double percentage;

	Student(){

	this.rollno = 101;
	this.name = "Shanky";
	this.percentage = 85.8;

    }
    
}

class Employee {

	int id;
	String name;
	double annualSalary;

	Employee(){

	this.id = 101;
	this.name = "Shanky";
	this.annualSalary = 85000;

    }

}

class Bank {

	void approveLoan(Student s1){

	if(s1.percentage>80){
	
	System.out.println("Eliglible for loan 2 lpa");

	}else if (s1.percentage>60&&s1.percentage<=80){

	System.out.println("Eliglible for loan 1 lpa");

	}else if(s1.percentage>40&&s1.percentage<=60){

	System.out.println("Eliglible for loan 50 lpa");

	}else {

	System.out.println(" No loan approved");

	}
    }


	void approveLoan(Employee e1){

	if(e1.annualSalary>1200000){
	
	System.out.println("Eliglible for loan 7 lpa");

	}else if (e1.annualSalary>1000000&&e1.annualSalary<=1200000){

	System.out.println("Eliglible for loan 6 lpa");

	}else if(e1.annualSalary>400000&&e1.annualSalary<=600000){

	System.out.println("Eliglible for loan 4 lpa");

	}else {

	System.out.println(" No loan approved");

	}
    }

	
}

class Testloan {

public static void main(String []args){

	Student s1 = new Student();
	Employee e1 = new Employee();
	Bank b1 = new Bank();

	b1.approveLoan(s1);
	b1.approveLoan(e1);

	}
}