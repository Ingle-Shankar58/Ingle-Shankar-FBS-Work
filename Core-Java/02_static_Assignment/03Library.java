import java.util.*;

class Library {

	String name;
	int daysLate;
	static double finePerDay;

	static {

	finePerDay = 50;

    }//Static block ends here 

    // default Constructor 

	Library(){

	this.name = "shanky";
	this.daysLate = 0 ;

    }	

    // parameter Constructor

	Library(String a,int b){

	this.name = a;
	this.daysLate = b ;

    }

    // set classes start 

	void setname(String a){

	this.name = a;

    }

	void setdaysLate(int a){

	this.daysLate = a ;

    }

	static void setfinePerDay(double a){

	finePerDay = a ;

    }

    // get class start 

	String setname(){

	return this.name ;

    }

	int  setdaysLate(){

	return this.daysLate ;

    }

	double setfinePerDay(){

	return this.finePerDay;

    }

    // calculate fine 

	double calculateFine(){

	return daysLate * finePerDay;

    }

    //display start 

	void display(){

	System.out.println("User Name: " + name);
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine per Day: " + finePerDay);
	System.out.println("Total Fine: " + calculateFine());
	System.out.println("----------------------------------");

    }


}// Library class ends here 


class TestLibrary {

    public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	Library s1 = new Library();
	Library s2 = new Library("shiva",2);
	Library s3 = new Library("shankar",5);

	s1.display();
	s2.display();
	s3.display();

	System.out.println("Fine rate changed: ");
	double x = sc.nextDouble();

	Library.setfinePerDay(x);

	s1.display();
	s2.display();
	s3.display();
    }
}