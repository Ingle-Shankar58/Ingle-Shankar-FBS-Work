package Abstract;

abstract class Vehicle {
	String brand;
	String model;
	int noOfWheels;
	int engineCapacity;
	String fuelType;

	// Default constructor

	Vehicle() {
		this.brand = "not given";
		this.model = "not given";
		this.noOfWheels = 00;
		this.engineCapacity = 00;
		this.fuelType = "not given";
	}

	// Parameterized Constructor

	Vehicle(String b, String m, int now, int cap, String f) {
		this.brand = b;
		this.model = m;
		this.noOfWheels = now;
		this.engineCapacity = cap;
		this.fuelType = f;
	}

	// Getters and Setters

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	int getEngineCapacity() {
		return engineCapacity;
	}

	void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	// Break Function Abstract

	abstract void Break();

}// class vehicle ends here

class Car extends Vehicle {

	boolean airBag;
	int noOfDoors;

	// Default constructor

	Car() {
		super();
		airBag = false;
		noOfDoors = 00;
	}

	// Parameterized Constructor

	Car(String brand, String model, int noOfWheels, int engineCapacity, String fuelType, boolean a, int nod) {
		super(brand, model, noOfWheels, engineCapacity, fuelType);
		airBag = a;
		noOfDoors = nod;
	}

	// Getters and Setters

	boolean isAirBag() {
		return airBag;
	}

	void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	int getNoOfDoors() {
		return noOfDoors;
	}

	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	// Break

	void Break() {

		System.out.println("Drum Break Appalied !!");
		System.out.println("------------------------------");
	}

	// Display

	@Override
	public String toString() {
		return "Car [airBag=" + airBag + ", noOfDoors=" + noOfDoors + ", brand=" + brand + ", model=" + model
				+ ", noOfWheels=" + noOfWheels + ", engineCapacity=" + engineCapacity + ", fuelType=" + fuelType + "]";
	}

}// class Car ends here

class Truck extends Vehicle {
	boolean emergancyDoor;
	int noOfDoors;

	// Default constructor

	Truck() {
		super();
		emergancyDoor = false;
		noOfDoors = 00;
	}

	// Parameterized Constructor

	Truck(String brand, String model, int noOfWheels, int engineCapacity, String fuelType, boolean a, int nod) {
		super(brand, model, noOfWheels, engineCapacity, fuelType);
		emergancyDoor = a;
		noOfDoors = nod;
	}

	// Getters and Setters

	boolean isEmergancyDoor() {
		return emergancyDoor;
	}

	void setEmergancyDoor(boolean emergancyDoor) {
		this.emergancyDoor = emergancyDoor;
	}

	int getNoOfDoors() {
		return noOfDoors;
	}

	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	// Break

	void Break() {

		System.out.println("Air Break Appalied !!");
		System.out.println("------------------------------");
	}

	// Display

	@Override
	public String toString() {
		return "Truck [emergancyDoor=" + emergancyDoor + ", noOfDoors=" + noOfDoors + ", brand=" + brand + ", model="
				+ model + ", noOfWheels=" + noOfWheels + ", engineCapacity=" + engineCapacity + ", fuelType=" + fuelType
				+ "]";
	}

}// class Truck ends here

class Bike extends Vehicle {
	boolean stand;

	// Default constructor

	Bike() {
		super();
		stand = false;

	}

	// Parameterized Constructor

	Bike(String brand, String model, int noOfWheels, int engineCapacity, String fuelType, boolean a) {
		super(brand, model, noOfWheels, engineCapacity, fuelType);
		stand = a;

	}

	// Getters and Setters

	boolean isStand() {
		return stand;
	}

	void setStand(boolean stand) {
		this.stand = stand;
	}

	// Break

	void Break() {

		System.out.println("Oil Break Appalied !!");
		System.out.println("------------------------------");
	}

	// Display

	@Override
	public String toString() {
		return "Bike [stand=" + stand + ", brand=" + brand + ", model=" + model + ", noOfWheels=" + noOfWheels
				+ ", engineCapacity=" + engineCapacity + ", fuelType=" + fuelType + "]";
	}

}// class bike ends here

class Source_Vehicle02 {

	public static void main(String[] args) {

		Vehicle v1;

		v1 = new Car("BMW", "M5", 4, 2000, "Diesel", true, 4);
		System.out.println(v1);
		v1.Break();

		v1 = new Truck();
		System.out.println(v1);
		v1.Break();

		v1 = new Bike();
		System.out.println(v1);
		v1.Break();

	}

}
