package Inheritance;


class Payment {
	
	double amount;
	String paymentDate;
	String recieverName;
	String paymentMethod;
	
	// Default constructor
	
	Payment(){
		this.amount=00;
		this.paymentDate="null";
		this.recieverName="null";
		this.paymentMethod="null";
		
	}
	
	// Parameterized Constructor
	
	Payment(double a,String pd,String rn,String pm){
		this.amount=a;
		this.paymentDate=pd;
		this.recieverName=rn;
		this.paymentMethod=pm;
		
	}
	
	// Getters And Setters
	
	double getAmount() {
		return amount;
	}
	String getPaymentDate() {
		return paymentDate;
	}
	String getPaymentMethod() {
		return paymentMethod;
	}
	String getRecieverName() {
		return recieverName;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	
	void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}
	
	// Display 
	
	void display() {
		System.out.println("Amout is : "+this.amount);
		System.out.println("PaymentDate is : "+this.paymentDate);
		System.out.println("reciver name is : "+this.recieverName);
		System.out.println("Payment Method is : "+this.paymentMethod);
	}
	

}// class Payment ends here


class CreditCard extends Payment{
	
	int cardNo;
	int CVV;
	
	// Default constructor
	
	CreditCard(){
		super();
		this.cardNo=00;
		this.CVV=00;
	}
	
	// Parameterized Constructor
	
	CreditCard(double a,String pd,String rn,String pm,int cn,int cv){
		super(a,pd,rn,pm);
		this.cardNo=cn;
		this.CVV=cv;
	}
	
	// Getters and Setters
	
	int getCardNo() {
		return cardNo;
	}
	void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	int getCVV() {
		return CVV;
	}
	void setCVV(int cVV) {
		CVV = cVV;
	}
	
	
	// Display 
	
	void display() {
		super.display();
		System.out.println("Card no is :" + this.cardNo);
		System.out.println("CVV is :" + this.CVV);
		System.out.println("-------------------------------------");
	}
	
	
}// class CreditCard ends here 


class UpiPayment extends Payment{
	
	String upiId;
	int upiPin;
	
	// Default constructor
	
	UpiPayment(){
		super();
		this.upiId="Null";
		this.upiPin=00;
	}
	
	// Parameterized Constructor
	
	UpiPayment(double a,String pd,String rn,String pm,String cn,int cv){
		super(a,pd,rn,pm);
		this.upiId=cn;
		this.upiPin=cv;
	}
	
	// Getters and Setters
	
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public int getUpiPin() {
		return upiPin;
	}
	public void setUpiPin(int upiPin) {
		this.upiPin = upiPin;
	}
	
	// Display
	
	void display() {
		super.display();
		System.out.println("UPI ID  : " + this.upiId);
		System.out.println("UPI PIN : " + this.upiPin);
		System.out.println("-------------------------------------");
	}
		
	
}// class UPI payment ends here


public class Source_Payment {

	public static void main(String[] args) {
		
		CreditCard c1= new CreditCard(1233.76,"11-NOV-2025","Virat KOhli","CreditCard",123445,29);
		c1.display();
		UpiPayment u1= new UpiPayment(1233.76,"11-NOV-2025","AB Devilliers","UPI","AB@upi",2954);
		u1.display();

	}

}// class CreditCard ends here 
