package Inheritance;

class Farmer {
	int farmerId;
	String farmerName;
	int landArea;
	String location;
	double annualIncome;
	int noOfEquipment;
	double insuranceAmount;

	// Default Constructor
	Farmer() {
		this.farmerId = 101;
		this.farmerName = "Ramesh Patil";
		this.landArea = 5;
		this.location = "Nashik";
		this.annualIncome = 250000.50;
		this.noOfEquipment = 4;
		this.insuranceAmount = 50000.0;
	}

	// Parameterized Constructor
	Farmer(int farmerId, String farmerName, int landArea, String location, double annualIncome, int noOfEquipment,
			double insuranceAmount) {
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.landArea = landArea;
		this.location = location;
		this.annualIncome = annualIncome;
		this.noOfEquipment = noOfEquipment;
		this.insuranceAmount = insuranceAmount;
	}

	// Getter and Setter Methods
	int getFarmerId() {
		return farmerId;
	}

	void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	String getFarmerName() {
		return farmerName;
	}

	void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	int getLandArea() {
		return landArea;
	}

	void setLandArea(int landArea) {
		this.landArea = landArea;
	}

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	double getAnnualIncome() {
		return annualIncome;
	}

	void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	int getNoOfEquipment() {
		return noOfEquipment;
	}

	void setNoOfEquipment(int noOfEquipment) {
		this.noOfEquipment = noOfEquipment;
	}

	double getInsuranceAmount() {
		return insuranceAmount;
	}

	void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	// Display Method
	void display() {
		System.out.println("Farmer ID: " + farmerId);
		System.out.println("Farmer Name: " + farmerName);
		System.out.println("Land Area (Acres): " + landArea);
		System.out.println("Location: " + location);
		System.out.println("Annual Income: ₹" + annualIncome);
		System.out.println("Number of Equipment: " + noOfEquipment);
		System.out.println("Insurance Amount: ₹" + insuranceAmount);
	}
}

// ==================== Dairy Farmer ====================
class DairyFarmer extends Farmer {
	int noOfCattle;
	int milkProductionPerDay;
	int licenseNo;

	// Default Constructor
	DairyFarmer() {
		super();
		this.noOfCattle = 20;
		this.milkProductionPerDay = 250;
		this.licenseNo = 1001;
	}

	// Parameterized Constructor
	DairyFarmer(int farmerId, String farmerName, int landArea, String location, double annualIncome, int noOfEquipment,
			double insuranceAmount, int noOfCattle, int milkProductionPerDay, int licenseNo) {

		super(farmerId, farmerName, landArea, location, annualIncome, noOfEquipment, insuranceAmount);
		this.noOfCattle = noOfCattle;
		this.milkProductionPerDay = milkProductionPerDay;
		this.licenseNo = licenseNo;
	}

	// Getters & Setters
	public int getNoOfCattle() {
		return noOfCattle;
	}

	public void setNoOfCattle(int noOfCattle) {
		this.noOfCattle = noOfCattle;
	}

	public int getMilkProductionPerDay() {
		return milkProductionPerDay;
	}

	public void setMilkProductionPerDay(int milkProductionPerDay) {
		this.milkProductionPerDay = milkProductionPerDay;
	}

	public int getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(int licenseNo) {
		this.licenseNo = licenseNo;
	}

	// Display Method
	void display() {
		super.display();
		System.out.println("Number of Cattle: " + noOfCattle);
		System.out.println("Milk Production per Day (Liters): " + milkProductionPerDay);
		System.out.println("License Number: " + licenseNo);
	}
}

// ==================== Poultry Farmer ====================
class PoultryFarmer extends Farmer {
	int noOfChickens;
	int noOfShed;
	int eggProduction;

	// Default Constructor
	PoultryFarmer() {
		super();
		this.noOfChickens = 500;
		this.noOfShed = 4;
		this.eggProduction = 300;
	}

	// Parameterized Constructor
	PoultryFarmer(int farmerId, String farmerName, int landArea, String location, double annualIncome,
			int noOfEquipment, double insuranceAmount, int noOfChickens, int noOfShed, int eggProduction) {

		super(farmerId, farmerName, landArea, location, annualIncome, noOfEquipment, insuranceAmount);
		this.noOfChickens = noOfChickens;
		this.noOfShed = noOfShed;
		this.eggProduction = eggProduction;
	}

	// Getters & Setters
	public int getNoOfChickens() {
		return noOfChickens;
	}

	public void setNoOfChickens(int noOfChickens) {
		this.noOfChickens = noOfChickens;
	}

	public int getNoOfShed() {
		return noOfShed;
	}

	public void setNoOfShed(int noOfShed) {
		this.noOfShed = noOfShed;
	}

	public int getEggProduction() {
		return eggProduction;
	}

	public void setEggProduction(int eggProduction) {
		this.eggProduction = eggProduction;
	}

	// Display Method
	void display() {
		super.display();
		System.out.println("Number of Chickens: " + noOfChickens);
		System.out.println("Number of Sheds: " + noOfShed);
		System.out.println("Egg Production per Day: " + eggProduction);
	}
}

class organicFarmer extends Farmer{
	
	int orgFarmarId;
	String cropType;
	String fretilization;
	
	// Default Constructor
	
	organicFarmer(){
		
		super();
		this.orgFarmarId = 101;
		this.cropType = "whet";
		this.fretilization = "DAP";
	}
	
	// Parameterized Constructor

	organicFarmer(int farmerId, String farmerName, int landArea, String location, double annualIncome,
			int noOfEquipment, double insuranceAmount,int orgFarmarId, String cropType, String fretilization) {
		
		super(farmerId, farmerName, landArea, location, annualIncome, noOfEquipment, insuranceAmount);
		this.orgFarmarId = orgFarmarId;
		this.cropType = cropType;
		this.fretilization = fretilization;
	}

	// Getters & Setters
	
	public int getOrgFarmarId() {
		return orgFarmarId;
	}

	public void setOrgFarmarId(int orgFarmarId) {
		this.orgFarmarId = orgFarmarId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getFretilization() {
		return fretilization;
	}

	public void setFretilization(String fretilization) {
		this.fretilization = fretilization;
	}
	
	void display() {
		
		super.display();
		System.out.println("orgFarmarId: "+this.orgFarmarId);
		System.out.println("cropType: "+this.cropType);
		System.out.println("fretilization: "+this.fretilization);
		
	}
	
	
	
}

// ==================== Main Class ====================


public class Source_farmer {
	public static void main(String[] args) {

		System.out.println("=== Dairy Farmer Data ===");
		DairyFarmer d1 = new DairyFarmer();
		d1.display();

		System.out.println("\n=== Poultry Farmer Data ===");
		PoultryFarmer p1 = new PoultryFarmer();
		p1.display();
		
		System.out.println("\n===organicFarmer Data===");
		organicFarmer o1 = new organicFarmer();
		o1.display();
	}
}
