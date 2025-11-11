import java.util.*;
class ElectricityBill {

	String UserName;
	long MNumber;
	int NumberOfUnit;
	static double Rate;

	
	static{

		Rate = 10; 
	
    }// static fun ends here

	
	ElectricityBill(){

	this.UserName ="shanky";
	this.MNumber = 585870;
	this.NumberOfUnit =10;

    }// default constructor ends here ;

	ElectricityBill(String a,long b,int c){

	this.UserName = a ;
	this.MNumber = b ;
	this.NumberOfUnit = c ;

    }// parametersise constructor ends here 


	void setUserName(String a){

	this.UserName = a ;

    }

	void setMNumber(long b){

	this.MNumber = b ;

    }

	void setNumberOfUnit(int c){

	this.NumberOfUnit = c ;

    }

	static void setRate(double d){
	
	Rate = d;

    }// set ends here 

	
	
	String getUserName(){

	return this.UserName ;

    }

	long getMNumber(){

	return this.MNumber ;

    }

	int getNumberOfUnit(){

	return this.NumberOfUnit ;

    }

	double setRate(){
	
	return this.Rate ;

    }// set ends here 

	double totalBill(){

	return NumberOfUnit*Rate;

    }//calcalute bill ends here 


	void display(){

	System.out.println("Name is:"+this.UserName);
	System.out.println("Mob No :"+this.MNumber);
	System.out.println("No Of Units:"+ this.NumberOfUnit);
	System.out.println("Charge:"+this.Rate );
	System.out.println("Total Bill:"+totalBill());

    }//display ends here 



}//class ElectricityBill ends here 


class TestElectricityBill {

	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	ElectricityBill c1 = new ElectricityBill();
	ElectricityBill c2 = new ElectricityBill("shankar",585870,20);
	ElectricityBill c3 = new ElectricityBill("shiva",153675,30);


	c1.display();
	c2.display();
	c3.display();

	System.out.println("Enter a new Charge for PerUnit:");
	int charge = sc.nextInt();

	ElectricityBill.setRate(charge);
	
	c1.display();
	c2.display();
	c3.display();

    }
}

