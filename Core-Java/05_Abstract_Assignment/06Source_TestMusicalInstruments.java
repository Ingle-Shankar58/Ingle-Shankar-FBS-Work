package Abstract;

abstract class MusicalInstruments {
	String name;
	String type;
	double price;

	public MusicalInstruments() { // default constructor
		super();
		this.name = "Default Name";
		this.type = "default type";
		this.price = 0;
	}

	public MusicalInstruments(String name, String type, double price) { // parameterized constructor
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Perform function
	abstract void perform();

}// class MusicalInstruments ends here

class Guiter extends MusicalInstruments {
	int numberOfStrings;
	String guiterType;

	public Guiter() {
		super();
		this.numberOfStrings = 0;
		this.guiterType = "Default type";
	}

	public Guiter(String name, String type, double price, int numberOfStrings, String guiterType) { // Parameterized
																									// constructor
		super(name, type, price);
		this.numberOfStrings = numberOfStrings;
		this.guiterType = guiterType;
	}

	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public String getGuiterType() {
		return guiterType;
	}

	public void setGuiterType(String guiterType) {
		this.guiterType = guiterType;
	}

	// Perfor Function

	void perform() {
		System.out.println("Performing guitar: Strumming chords and playing a solo!");
	}

	// display function
	@Override
	public String toString() {
		return "Guiter [numberOfStrings=" + numberOfStrings + ", guiterType=" + guiterType + ", name=" + name
				+ ", type=" + type + ", price=" + price + "]";
	}

}// Guiter class ends here

class Piano extends MusicalInstruments {
	int noOfKeys;
	boolean isDigital;

	public Piano() {
		super();
		this.noOfKeys = 0;
		this.isDigital = false;
	}

	public Piano(String name, String type, double price, int noOfKeys, boolean isDigital) {
		super(name, type, price);
		this.noOfKeys = noOfKeys;
		this.isDigital = isDigital;
	}

	public int getNoOfKeys() {
		return noOfKeys;
	}

	public void setNoOfKeys(int noOfKeys) {
		this.noOfKeys = noOfKeys;
	}

	public boolean isDigital() {
		return isDigital;
	}

	public void setDigital(boolean isDigital) {
		this.isDigital = isDigital;
	}

	// Piano function
	void perform() {
		System.out.println("Performing piano: Playing a melodious piece on the keys!");
	}

	// display function
	@Override
	public String toString() {
		return "Piano [noOfKeys=" + noOfKeys + ", isDigital=" + isDigital + ", name=" + name + ", type=" + type
				+ ", price=" + price + "]";
	}

}// Piano class ends here

class Flute extends MusicalInstruments {
	String material;
	double length;

	public Flute() { // Default constructor
		super();
		this.material = "Default Material";
		this.length = 0;
	}

	public Flute(String name, String type, double price, String material, double length) { // parametrized consstructor
		super(name, type, price);
		this.material = material;
		this.length = length;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	// flute Function

	void perform() {
		System.out.println("Performing flute: Blowing sweet melodious tunes!");
	}

	// Display function
	@Override
	public String toString() {
		return "Flute [material=" + material + ", length=" + length + ", name=" + name + ", type=" + type + ", price="
				+ price + "]";
	}

}// Flute class ends here

class Source_TestMusicalInstruments10 {
	public static void main(String[] args) {
		MusicalInstruments m1 ;

		m1 = new Guiter("Yamaha", "String Instrument", 6800, 6, "Acoustic");
		System.out.println(m1);
		m1.perform();
		System.out.println("\n");
		m1 = new Piano("Casio CTK-2550", "Keyboard Instrument", 12000.0, 61, true);
		System.out.println(m1);
		m1.perform();
		System.out.println("\n");
		m1 = new Flute("Bamboo Flute", "Wind Instrument", 1500.0, "Bamboo", 60.0);
		System.out.println(m1);
		m1.perform();

	}
}
