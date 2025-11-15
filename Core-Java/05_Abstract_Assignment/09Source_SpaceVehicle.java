package Abstract;



abstract class SpaceVehicle {
	String name;
	String launchDate;
	String fuelType;
	String missionType;

	public SpaceVehicle() {
		
		this.name = "Default Name";
		this.launchDate = "Default Date";
		this.fuelType = "Default Fuel";
		this.missionType = "Default Mission";
	}

	public SpaceVehicle(String name, String launchDate, String fuelType, String missionType) {
		super();
		this.name = name;
		this.launchDate = launchDate;
		this.fuelType = fuelType;
		this.missionType = missionType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getMissionType() {
		return missionType;
	}

	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}

	

	abstract void performMission(); 

}// SpaceVehicle class ends here

class Satellite extends SpaceVehicle {
	String orbitType;
	String purpose;
	double transmissionPower;

	public Satellite() {
		super();
		this.orbitType = "default Type";
		this.purpose = "Default Purpose";
		this.transmissionPower = 0.00;
	}

	public Satellite(String name, String launchDate, String fuelType, String missionType, String orbitType,
			String purpose, double transmissionPower) {
		super(name, launchDate, fuelType, missionType);
		this.orbitType = orbitType;
		this.purpose = purpose;
		this.transmissionPower = transmissionPower;
	}

	public String getOrbitType() {
		return orbitType;
	}

	public void setOrbitType(String orbitType) {
		this.orbitType = orbitType;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public double getTransmissionPower() {
		return transmissionPower;
	}

	public void setTransmissionPower(double transmissionPower) {
		this.transmissionPower = transmissionPower;
	}

	

	@Override
	public String toString() {
		return "Satellite [orbitType=" + orbitType + ", purpose=" + purpose + ", transmissionPower=" + transmissionPower
				+ ", name=" + name + ", launchDate=" + launchDate + ", fuelType=" + fuelType + ", missionType="
				+ missionType + "]";
	}

	void performMission() {
		System.out.println("Satellite is orbiting Earth and collecting data.");
	}

}// Satellite Constructor Ends here

class Rover extends SpaceVehicle {
	String terrainCapability;
	double solarPanelSize;
	int cameraCount;

	public Rover() {
		super();
		this.terrainCapability = "Default capability";
		this.solarPanelSize = 0.00;
		this.cameraCount = 0;
	}

	public Rover(String name, String launchDate, String fuelType, String missionType, String terrainCapability,
			double solarPanelSize, int cameraCount) {
		super(name, launchDate, fuelType, missionType);
		this.terrainCapability = terrainCapability;
		this.solarPanelSize = solarPanelSize;
		this.cameraCount = cameraCount;
	}

	public String getTerrainCapability() {
		return terrainCapability;
	}

	public void setTerrainCapability(String terrainCapability) {
		this.terrainCapability = terrainCapability;
	}

	public double getSolarPanelSize() {
		return solarPanelSize;
	}

	public void setSolarPanelSize(double solarPanelSize) {
		this.solarPanelSize = solarPanelSize;
	}

	public int getCameraCount() {
		return cameraCount;
	}

	public void setCameraCount(int cameraCount) {
		this.cameraCount = cameraCount;
	}

	

	@Override
	public String toString() {
		return "Rover [terrainCapability=" + terrainCapability + ", solarPanelSize=" + solarPanelSize + ", cameraCount="
				+ cameraCount + ", name=" + name + ", launchDate=" + launchDate + ", fuelType=" + fuelType
				+ ", missionType=" + missionType + "]";
	}

	void performMission() {
		System.out.println("Rover is exploring planetary surface and collecting samples.");
	}

}// class Rover ends here

class SpaceShuttle extends SpaceVehicle {
	int crewCapacity;
	boolean reEntryCapability;
	double flightHours;

	public SpaceShuttle() {
		super();
		this.crewCapacity = 5;
		this.reEntryCapability = false;
		this.flightHours = 0.00;
	}

	public SpaceShuttle(String name, String launchDate, String fuelType, String missionType, int crewCapacity,
			boolean reEntryCapability, double flightHours) {
		super(name, launchDate, fuelType, missionType);
		this.crewCapacity = crewCapacity;
		this.reEntryCapability = reEntryCapability;
		this.flightHours = flightHours;
	}

	public int getCrewCapacity() {
		return crewCapacity;
	}

	public void setCrewCapacity(int crewCapacity) {
		this.crewCapacity = crewCapacity;
	}

	public boolean isReEntryCapability() {
		return reEntryCapability;
	}

	public void setReEntryCapability(boolean reEntryCapability) {
		this.reEntryCapability = reEntryCapability;
	}

	public double getFlightHours() {
		return flightHours;
	}

	public void setFlightHours(double flightHours) {
		this.flightHours = flightHours;
	}

	

	@Override
	public String toString() {
		return "SpaceShuttle [crewCapacity=" + crewCapacity + ", reEntryCapability=" + reEntryCapability
				+ ", flightHours=" + flightHours + ", name=" + name + ", launchDate=" + launchDate + ", fuelType="
				+ fuelType + ", missionType=" + missionType + "]";
	}

	void performMission() {
		System.out.println("Space Shuttle is transporting astronauts and cargo to space.");
	}

}// SpaceShuttle class Ends here

class Source_SpaceVehicle09 {
	public static void main(String[] args) {

		SpaceVehicle s1;
		s1 = new Satellite("INSAT-3D", "12-11-2025", "Liquid Fuel", "Communication", "Geostationary",
				"Weather Monitoring", 1500.75);
		System.out.println(s1);
		s1.performMission();
		System.out.println("\n\n");
		s1 = new Rover("Pragyan", "22-07-2023", "Solar", "Exploration", "Rocky Terrain", 2.5, 4);
		System.out.println(s1);
		s1.performMission();
		System.out.println("\n\n");

		s1 = new SpaceShuttle("Discovery", "24-04-1990", "Liquid Hydrogen", "Research", 7, true, 1200.5);
		System.out.println(s1);
		s1.performMission();

	}
}
