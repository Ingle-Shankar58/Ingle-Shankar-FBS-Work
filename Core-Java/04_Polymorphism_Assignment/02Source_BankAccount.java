
package Poylmorphism;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class BankAccount {
	int AccNo;
	String HName;
	String Barchname;
	
	// Default constructor
	
	BankAccount(){
		
		this.AccNo = 1234;
		this.HName = "shanky";
		this.Barchname = "Nanded";
	}

	// Parameterized Constructor
	
	BankAccount(int accNo, String hName, String barchname) {
		
		AccNo = accNo;
		HName = hName;
		Barchname = barchname;
	}
	
	// Getters And Setters

	int getAccNo() {
		return AccNo;
	}

	void setAccNo(int accNo) {
		AccNo = accNo;
	}

	String getHName() {
		return HName;
	}

	void setHName(String hName) {
		HName = hName;
	}

	String getBarchname() {
		return Barchname;
	}

	void setBarchname(String barchname) {
		Barchname = barchname;
	}
	
	// Display 
	
	void display() {
		
		System.out.println("AccNo is: "+this.AccNo);
		System.out.println("HName is: "+this.HName);
		System.out.println("Branch name: "+this.Barchname);
	}	
	
	// Withdawamount 
	
	void Withdawamount(double amo) {
		
		System.out.println("Withdawamount sucess full ");
	}
	
}

class SavingAcc extends BankAccount{
	
	double minBalance;
	int withdrawLimit;
	
	
	// Default constructor
	
	SavingAcc(){
		
		super();
		this.minBalance = 50000;
		this.withdrawLimit = 10;
	}

	// Parameterized Constructor
	
	SavingAcc(int accNo,String hname,String Bname,double minBalance, int withdrawLimit) {
		
		super(accNo,hname,Bname);
		this.minBalance = minBalance;
		this.withdrawLimit = withdrawLimit;
	}
	
	// Getters And Setters

	double getMinBalance() {
		return minBalance;
	}

	void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	int getWithdrawLimit() {
		return withdrawLimit;
	}

	void setWithdrawLimit(int withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
	
	// Display 
	
	void display() {
		
		super.display();
		System.out.println("minBalance: "+this.minBalance);
		System.out.println("withdrawLimit:"+this.withdrawLimit);
		System.out.println("----------------------------------------");
	}
	
	// Withdawamount 
	
		void Withdawamount(double amo) {
			
			if(getMinBalance()>= amo) {
				
				System.out.println("Withdawamount sucess full");
			}
			else {
				System.out.println("Withdawamount sucess fail");
			}
		}
	
}// Seving Acc class ends here 

class currnetAcc extends BankAccount{
	
	String businessName;
	double odilimit;
	double balance = 50000;
	
	// Default constructor
	
	currnetAcc(){
		
		super();
		this.businessName = "poultry";
		this.odilimit = 1000;
	}
	
	// Parameterized Constructor

	currnetAcc(int accNo, String hName, String barchname,String businessName,double odilimit) {
		
		super(accNo,hName,barchname);
		this.businessName = businessName;
		this.odilimit = odilimit;
	}

	// Getters And Setters
	
	String getBusinessName() {
		return businessName;
	}

	void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	void setOdiLimit(double odi) {
		this.odilimit = odi;
	}
	double getOdiLimit() {
		return this.odilimit;
	}
	
	// Display
	
	void display() {
		
		super.display();
		System.out.println("businessName: "+this.businessName);
	}
	
	// Withdawamount 
	
			void Withdawamount(double amo) {
				
				if (balance - amo >= getOdiLimit()) {
		            balance -= amo;
		            System.out.println("Withdrawal successful! New balance: ₹" + balance);
		        } else {
		            System.out.println("❌ Withdrawal failed! Overdraft limit exceeded.");
		        }
			}
	
} //currentAcc ends here 

class SalaryAccount extends BankAccount{
	
	LocalDate lastSalaryDate;
	double balance = 30000;
	
	SalaryAccount(){
		
		super();
		this.lastSalaryDate =  LocalDate.now();
	}

	 SalaryAccount(int accNo, String hName, String barchname,LocalDate lastSalaryDate) {
		super(accNo, hName, barchname);
		this.lastSalaryDate = lastSalaryDate;
	}

	 LocalDate getLastSalaryDate() {
		return lastSalaryDate;
	}

	 void setLastSalaryDate(LocalDate lastSalaryDate) {
		this.lastSalaryDate = lastSalaryDate;
	}
	 
	 void display() {
		 super.display();
		 System.out.println(getLastSalaryDate());
	 }

	
	 void Withdawamount(double amount) {
	        LocalDate today = LocalDate.now();
	        long daysSinceSalary = ChronoUnit.DAYS.between(lastSalaryDate, today);

	        if (daysSinceSalary <= 60) { // within 2 months (approx 60 days)
	            if (balance >= amount) {
	                balance -= amount;
	                System.out.println("✅ Withdrawal successful! New balance: ₹" + balance);
	            } else {
	                System.out.println("❌ Insufficient balance!");
	            }
	        } else {
	            System.out.println("❌ Withdrawal denied! No salary credited in last 2 months.");
	        }
	    }
	
}


class Source_BankAccount {

	public static void main(String[] args) {
		
		
		BankAccount a1;
		
		a1 = new SavingAcc();
		a1.Withdawamount(10000);
		
		a1 = new SalaryAccount();
		a1.Withdawamount(10000);
		
		a1 = new currnetAcc();
		a1.Withdawamount(10000);
	}

}
