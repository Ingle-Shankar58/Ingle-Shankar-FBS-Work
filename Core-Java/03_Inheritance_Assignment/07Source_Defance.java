package Inheritance;

class defance {
	
	int defenceId;
	String nameofHead;
	int noOfTroops;
	double budget;
	int noOfDept;
	int noOfVehicle;
	String locationOfHeadcouter;
	String countryName;
	int manPowercount;
	int noOfMission;
	
	defance(){
		
		this.defenceId = 101;
		this.nameofHead = "shanky";
		this.noOfTroops = 10;
		this.budget = 5000;
		this.noOfDept = 10 ;
		this.noOfVehicle = 50000;
		this.locationOfHeadcouter = "nanded";
		this.countryName = "india";
		this.manPowercount = 50000;
		this.noOfMission = 500;
		
	}

	public defance(int defenceId, String nameofHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
			String locationOfHeadcouter, String countryName, int manPowercount, int noOfMission) {
		super();
		this.defenceId = defenceId;
		this.nameofHead = nameofHead;
		this.noOfTroops = noOfTroops;
		this.budget = budget;
		this.noOfDept = noOfDept;
		this.noOfVehicle = noOfVehicle;
		this.locationOfHeadcouter = locationOfHeadcouter;
		this.countryName = countryName;
		this.manPowercount = manPowercount;
		this.noOfMission = noOfMission;
	}

	public int getDefenceId() {
		return defenceId;
	}

	public void setDefenceId(int defenceId) {
		this.defenceId = defenceId;
	}

	public String getNameofHead() {
		return nameofHead;
	}

	public void setNameofHead(String nameofHead) {
		this.nameofHead = nameofHead;
	}

	public int getNoOfTroops() {
		return noOfTroops;
	}

	public void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getNoOfDept() {
		return noOfDept;
	}

	public void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}

	public int getNoOfVehicle() {
		return noOfVehicle;
	}

	public void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}

	public String getLocationOfHeadcouter() {
		return locationOfHeadcouter;
	}

	public void setLocationOfHeadcouter(String locationOfHeadcouter) {
		this.locationOfHeadcouter = locationOfHeadcouter;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getManPowercount() {
		return manPowercount;
	}

	public void setManPowercount(int manPowercount) {
		this.manPowercount = manPowercount;
	}

	public int getNoOfMission() {
		return noOfMission;
	}

	public void setNoOfMission(int noOfMission) {
		this.noOfMission = noOfMission;
	}
	
	void display() {
		
		System.out.println("defenceId: "+this.defenceId);
		System.out.println("nameofHead: "+this.nameofHead);
		System.out.println("noOfTroops: "+this.noOfTroops);
		System.out.println("budget: "+this.budget);
		System.out.println("noOfDept"+this.noOfDept);
		System.out.println("noOfVehicle: "+this.noOfVehicle);
		System.out.println("Location of Headquarter: " + locationOfHeadcouter);
	    System.out.println("Country Name: " + countryName);
	    System.out.println("Man Power Count: " + manPowercount);
	    System.out.println("Number of Missions: " + noOfMission);
	}
	
}

class Army extends defance{
	
	int noOftank;
	int noOfGun;
	int noOfGranids;
	int noOfBatilen;
	
	Army(){
		 super();
		 this.noOftank = 120;
	     this.noOfGun = 500;
	     this.noOfGranids = 2000;
	     this.noOfBatilen = 10;
	}

	Army(int defenceId, String nameofHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
			String locationOfHeadcouter, String countryName, int manPowercount, int noOfMission,int noOftank, int noOfGun, int noOfGranids, int noOfBatilen) {
		
		super(defenceId,nameofHead, noOfTroops, budget,  noOfDept,  noOfVehicle,
				 locationOfHeadcouter, countryName,  manPowercount,  noOfMission);
		this.noOftank = noOftank;
		this.noOfGun = noOfGun;
		this.noOfGranids = noOfGranids;
		this.noOfBatilen = noOfBatilen;
	}

	public int getNoOftank() {
		return noOftank;
	}

	public void setNoOftank(int noOftank) {
		this.noOftank = noOftank;
	}

	public int getNoOfGun() {
		return noOfGun;
	}

	public void setNoOfGun(int noOfGun) {
		this.noOfGun = noOfGun;
	}

	public int getNoOfGranids() {
		return noOfGranids;
	}

	public void setNoOfGranids(int noOfGranids) {
		this.noOfGranids = noOfGranids;
	}

	public int getNoOfBatilen() {
		return noOfBatilen;
	}

	public void setNoOfBatilen(int noOfBatilen) {
		this.noOfBatilen = noOfBatilen;
	}
	
	 void display() {
		 
		    super.display();
	        System.out.println("Number of Tanks: " + noOftank);
	        System.out.println("Number of Guns: " + noOfGun);
	        System.out.println("Number of Grenades: " + noOfGranids);
	        System.out.println("Number of Battalions: " + noOfBatilen);
	    }
	 
	
	
	
}

class navy extends defance{
	
	int noOfship;
	int noOfSumerians;
	int noOftorped;
	
	navy() {
	        this.noOfship = 25;
	        this.noOfSumerians = 8;
	        this.noOftorped = 200;
	    }

	public navy(int defenceId, String nameofHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
			String locationOfHeadcouter, String countryName, int manPowercount, int noOfMission,int noOfship, int noOfSumerians, int noOftorped) {
		super(defenceId,nameofHead, noOfTroops, budget,  noOfDept,  noOfVehicle,
				 locationOfHeadcouter, countryName,  manPowercount,  noOfMission);
		this.noOfship = noOfship;
		this.noOfSumerians = noOfSumerians;
		this.noOftorped = noOftorped;
	}

	public int getNoOfship() {
		return noOfship;
	}

	public void setNoOfship(int noOfship) {
		this.noOfship = noOfship;
	}

	public int getNoOfSumerians() {
		return noOfSumerians;
	}

	public void setNoOfSumerians(int noOfSumerians) {
		this.noOfSumerians = noOfSumerians;
	}

	public int getNoOftorped() {
		return noOftorped;
	}

	public void setNoOftorped(int noOftorped) {
		this.noOftorped = noOftorped;
	}
	
	 void display() {
		 
		 	super.display();
	        System.out.println("Number of Ships: " + noOfship);
	        System.out.println("Number of Submarines: " + noOfSumerians);
	        System.out.println("Number of Torpedoes: " + noOftorped);
	    }
	
}

class AirForce extends defance{
	
	int noOfaircruft;
	String AircruftName;
	int noOfSquadron;
	
	 AirForce() {
	        this.noOfaircruft = 50;
	        this.AircruftName = "Rafale";
	        this.noOfSquadron = 12;
	    }

	 public AirForce(int defenceId, String nameofHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
				String locationOfHeadcouter, String countryName, int manPowercount, int noOfMission,int noOfaircruft, String aircruftName, int noOfSquadron) {
		super(defenceId,nameofHead, noOfTroops, budget,  noOfDept,  noOfVehicle,
				 locationOfHeadcouter, countryName,  manPowercount,  noOfMission);
		this.noOfaircruft = noOfaircruft;
		AircruftName = aircruftName;
		this.noOfSquadron = noOfSquadron;
	 }

	 public int getNoOfaircruft() {
		 return noOfaircruft;
	 }

	 public void setNoOfaircruft(int noOfaircruft) {
		 this.noOfaircruft = noOfaircruft;
	 }

	 public String getAircruftName() {
		 return AircruftName;
	 }

	 public void setAircruftName(String aircruftName) {
		 AircruftName = aircruftName;
	 }

	 public int getNoOfSquadron() {
		 return noOfSquadron;
	 }

	 public void setNoOfSquadron(int noOfSquadron) {
		 this.noOfSquadron = noOfSquadron;
	 }
	 
	 void display() {
		 
		 	super.display();
	        System.out.println("Number of Aircrafts: " + noOfaircruft);
	        System.out.println("Aircraft Name: " + AircruftName);
	        System.out.println("Number of Squadrons: " + noOfSquadron);
	    }
	 
	 
}

public class Source_Defance {
	
	public static void main(String[]args) {
		
		Army a1 = new Army();
		AirForce af1= new AirForce();
		navy n1 = new navy();
		
		a1.display();
		af1.display();
		n1.display();
		
	}

}
