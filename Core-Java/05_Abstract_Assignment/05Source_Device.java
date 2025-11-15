package Abstract;



abstract class Device {
	String deviceName;
	String brand;
	double price;

	public Device() {
		super();
		this.deviceName = "Default Name";
		this.brand = "Default Brand";
		this.price = 0;
	}

	public Device(String deviceName, String brand, double price) {
		super();
		this.deviceName = deviceName;
		this.brand = brand;
		this.price = price;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	abstract void turnOn(); 

}// DeVice class ends here

class SmartRefrigerator extends Device {
	double temprature;
	boolean hasTouchScreen;

	public SmartRefrigerator() {
		super();
		this.temprature = 0;
		this.hasTouchScreen = true;
	}

	public SmartRefrigerator(String deviceName, String brand, double price, double temprature, boolean hasTouchScreen) {
		super(deviceName, brand, price);
		this.temprature = temprature;
		this.hasTouchScreen = hasTouchScreen;
	}

	public double getTemprature() {
		return temprature;
	}

	public void setTemprature(double temprature) {
		this.temprature = temprature;
	}

	public boolean isHasTouchScreen() {
		return hasTouchScreen;
	}

	public void setHasTouchScreen(boolean hasTouchScreen) {
		this.hasTouchScreen = hasTouchScreen;
	}

	

	@Override
	public String toString() {
		return "SmartRefrigerator [temprature=" + temprature + ", hasTouchScreen=" + hasTouchScreen + ", deviceName="
				+ deviceName + ", brand=" + brand + ", price=" + price + "]";
	}

	void turnOn() {
		System.out.println("Smart Refrigerator cooling system activated!");
	}

}// SmartRefrigerator class ends here

class SmartWatch extends Device {
	boolean heartRateSensor;
	int stepCount;
	int batteryLevel;

	public SmartWatch() {
		super();
		this.heartRateSensor = true;
		this.stepCount = 0;
		this.batteryLevel = 100;
	}

	public SmartWatch(String deviceName, String brand, double price, boolean heartRateSensor, int stepCount,
			int batteryLevel) {
		super(deviceName, brand, price);
		this.heartRateSensor = heartRateSensor;
		this.stepCount = stepCount;
		this.batteryLevel = batteryLevel;
	}

	public boolean isHeartRateSensor() {
		return heartRateSensor;
	}

	public void setHeartRateSensor(boolean heartRateSensor) {
		this.heartRateSensor = heartRateSensor;
	}

	public int getStepCount() {
		return stepCount;
	}

	public void setStepCount(int stepCount) {
		this.stepCount = stepCount;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	

	@Override
	public String toString() {
		return "SmartWatch [heartRateSensor=" + heartRateSensor + ", stepCount=" + stepCount + ", batteryLevel="
				+ batteryLevel + ", deviceName=" + deviceName + ", brand=" + brand + ", price=" + price + "]";
	}

	void turnOn() {
		System.out.println("SmartWatch screen activated!");
	}

}// class SmartWatch ends here

class WirelessHeadphones extends Device {
	int batteryLife;
	boolean noiseCancellation;

	public WirelessHeadphones() {
		super();
		this.batteryLife = 2;
		this.noiseCancellation = false;
	}

	public WirelessHeadphones(String deviceName, String brand, double price, int batteryLife,
			boolean noiseCancellation) {
		super(deviceName, brand, price);
		this.batteryLife = batteryLife;
		this.noiseCancellation = noiseCancellation;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public boolean isNoiseCancellation() {
		return noiseCancellation;
	}

	public void setNoiseCancellation(boolean noiseCancellation) {
		this.noiseCancellation = noiseCancellation;
	}

	

	@Override
	public String toString() {
		return "WirelessHeadphones [batteryLife=" + batteryLife + ", noiseCancellation=" + noiseCancellation
				+ ", deviceName=" + deviceName + ", brand=" + brand + ", price=" + price + "]";
	}

	void turnOn() {
		System.out.println("Wireless Headphones pairing mode activated!");
	}

}// Wirelessheadphones class ends here

class Source_Device07 {
	public static void main(String[] args) {
		SmartRefrigerator sr1 = new SmartRefrigerator("Samsung Family Hub", "Refrigerator", 180000.0, 5, true);
		System.out.println(sr1);
		sr1.turnOn();
		System.out.println("\n");
		SmartWatch sw1 = new SmartWatch("Apple Watch Series 9", "SmartWatch", 45000.0, true, 1000, 85);
		System.out.println(sr1);
		sw1.turnOn();
		System.out.println("\n");
		WirelessHeadphones wh1 = new WirelessHeadphones("Sony WH-1000XM5", "Headphones", 25000.0, 30, true);
		System.out.println(sr1);
		wh1.turnOn();
		

	}
}
