package Poylmorphism;

class Employee{
	int id;
	String name;
	double salary;
	
	//Default constructor
	
	Employee(){
		
		this.id = 1;
		this.name = "Not declare";
		this.salary = 0 ;
	}
	
	//Parameterized Constructor
	
	Employee(int id,String name,double salary){
		
		this.id = id ;
		this.name = name;
		this.salary = salary;
		
	}
	
	// Getters and Setters

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Display 
	
	void display(){
		
		System.out.println("Id is: "+this.id);
		System.out.println("Name is: "+this.name);
		System.out.println("Salary is: "+this.salary);
	}
	
	// Calculate Salary
	
	double calSalary() {
		
		return salary;
	}
	
	
} // Employee Class ends here


class Hr extends Employee{
	
	double commission;
	
	// Default constructor
	Hr(){
		
		super();
		this.commission = 1000;
		
	}
	
	// Parameterized Constructor
	
	Hr(int id,String name,double salary,double commission){
		
		super(id,name,salary);
		this.commission = commission;
		
	}
	
	// Getters and Setters

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	// Display 
	
	void display(){
		
		super.display();
		System.out.println("Commission is: "+this.commission);
		
	}
	
	// Calculate Salary
	
		double calSalary() {
			
			return salary + commission;
		}
		
		
	
} // class hr ends here

class Admin extends Employee{
	
	  double Allowance;
	  
	// Default constructor
	  
	  Admin(){
		  
		  super();
		  this.Allowance = 1000;
	  }
	  
	// Parameterized Constructor
	  
	  Admin(int id,String name,double salary,double allowance){
		  
		  super(id,name,salary);
		  this.Allowance = allowance;
	  }
	  
	// Getters and Setters

	  double getAllowance() {
		  return Allowance;
	  }

	  void setAllowance(double allowance) {
		  Allowance = allowance;
	  }
	  
	// Display
	  
	  void display() {
		  
		  super.display();
		  System.out.println("Allowance is: "+this.Allowance);
		  
	  }
	  
	// Calculate Salary
		
		double calSalary() {
				
				return salary + Allowance;
		}
	  
	  
	
} // Admin class ends here 

class salsemanager extends Employee{
	
	double incentive;
	
	// Default constructor
	  
	salsemanager(){
			  
			  super();
			  this.incentive = 1000;
	}
	
	// Parameterized Constructor
	  
	salsemanager(int id,String name,double salary,double incentive){
			  
			  super(id,name,salary);
			  this.incentive = incentive;
	}
	
	// Getters and Setters

	double getincentive() {
		return incentive;
	}

	void setCommission(double incentive) {
		this.incentive = incentive;
	}
	
	// Display 
	
	void display() {
		
		super.display();
		System.out.println("incentive is: "+this.incentive);
		
	}
	
	// Calculate Salary
	
		double calSalary() {
				
			return salary + incentive;
		}
	
} // salsemanager class ends here

class Areasalsemanager extends salsemanager{
	
	String areaName;
	
	// Default constructor
	
	Areasalsemanager(){
		
		this.areaName = "nanded";
	}
	
	// Parameterized Constructor

	Areasalsemanager(int id,String name,double salary,double incentive,String areaName) {
		
		super(id,name,salary,incentive);
		this.areaName = areaName;
		
	}
	
	// Getters and Setters

	String getAreaName() {
		return areaName;
	}

	void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	// Display
	
	void display() {
		
		super.display();
		System.out.println("areaname: "+areaName);
	}
		
}


 class Source_Employee {
	 
	 public static void main(String[]args) {
		 
		
		// Areasalsemanager as1 = new Areasalsemanager(101,"shanky",50000,500,"shanky");
		 
		 Employee e1;
		 
		 e1 = new Employee(101,"shanky",5000);
		 e1.display();
		 e1.calSalary();
		 
		 e1 = new Admin(102,"shanky",5000,500);
		 e1.display();
		 System.out.println("Total Salary:"+e1.calSalary());
		 
		 e1 = new Hr();
		 e1.display();
		 System.out.println("Total Salary:"+e1.calSalary());
		 
		 e1 = new salsemanager();
		 e1.display();
		 System.out.println("Total Salary:"+e1.calSalary());
		 
	 }
}
