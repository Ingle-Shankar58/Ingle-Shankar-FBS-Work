package Abstract;

abstract class Course {

	String courseName;
	double duration;
	double fees;
	public int length;

	// Default Constructor

	Course() {
		this.courseName = "Java Programming";
		this.duration = 6;
		this.fees = 35000.0;
	}

	Course(String courseName, double duration, double fees) {

		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}

	String getCourseName() {
		return courseName;
	}

	void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	double getDuration() {
		return duration;
	}

	void setDuration(double duration) {
		this.duration = duration;
	}

	double getFees() {
		return fees;
	}

	void setFees(double fees) {
		this.fees = fees;
	}


	// Addmission Process

	abstract void AdmissionProcess();

} // class Course ends here

class OnlineCourse extends Course {

	String platform;
	boolean hasCertificate;

	// Default Constructor

	OnlineCourse() {
		super();
		this.platform = "Udemy";
		this.hasCertificate = true;
	}

	// Parameterized Constructor

	public OnlineCourse(String courseName, double duration, double fees, String platform, boolean hasCertificate) {

		super(courseName, duration, fees);
		this.platform = platform;
		this.hasCertificate = hasCertificate;
	}

	// Getter and Setter Methods

	String getPlatform() {
		return platform;
	}

	void setPlatform(String platform) {
		this.platform = platform;
	}

	boolean isHasCertificate() {
		return hasCertificate;
	}

	void setHasCertificate(boolean hasCertificate) {
		this.hasCertificate = hasCertificate;
	}

	

	

	// Addmission Process

	void AdmissionProcess() {
		System.out.println("\nAddmissio Process Done for OnlineCourse...!");
	}
	// Display

	@Override
	public String toString() {
		return "OnlineCourse [platform=" + platform + ", hasCertificate=" + hasCertificate + ", courseName="
				+ courseName + ", duration=" + duration + ", fees=" + fees + ", length=" + length + "]";
	}

}

class OfflineCourse extends Course {

	String location;
	int batchSize;

	// Default Constructor

	OfflineCourse() {

		super();
		this.location = "Pune";
		this.batchSize = 25;
	}

	// Parameterized Constructor

	OfflineCourse(String courseName, double duration, double fees, String location, int batchSize) {

		super(courseName, duration, fees);
		this.location = location;
		this.batchSize = batchSize;
	}

	// Getter and Setter Methods

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	int getBatchSize() {
		return batchSize;
	}

	void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	
	

	// Addmission Process

	void AdmissionProcess() {
		System.out.println("\nAddmissio Process Done for OfflineCourse...!");
	}
	
	// Display

	@Override
	public String toString() {
		return "OfflineCourse [location=" + location + ", batchSize=" + batchSize + ", courseName=" + courseName
				+ ", duration=" + duration + ", fees=" + fees + ", length=" + length + "]";
	}

}

class Source_Course05 {

	public static void main(String[] args) {

		//Course c1;

		Course[] arr = new Course[2];

		arr[0] = new OnlineCourse("python", 6, 35000, "udamy", true);
		arr[1] = new OfflineCourse();

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);
			arr[i].AdmissionProcess();
		}

	}

}
