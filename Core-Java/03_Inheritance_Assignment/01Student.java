
class student {

	
		
		int firstbitid;
		String name;
		int distance;
		static int count = 0;
		
		//ster and geter 
		
		 int getFirstbitid() {
			return firstbitid;
		}
		 void setFirstbitid(int firstbitid) {
			this.firstbitid = firstbitid;
		}
		 String getName() {
			return name;
		}
		 void setName(String name) {
			this.name = name;
		}
		 int getDistance() {
			return distance;
		}
		 void setDistance(int distance) {
			this.distance = distance;
		}
		 static int getCount() {
			return count;
		}
		 static void setCount(int count) {
			student.count = count;
		}
		 
		 
		 student(){
			 
			 this.firstbitid = 101;
			 this.name = "shanky";
			 this.distance = 10;
			 count ++;
		 }
		 
		 student(int a,String b,int c){
			 
			 this.firstbitid = a;
			 this.name = b;
			 this.distance = c;
			 count ++;
		 }
		 
		 void display() {
			 
			 System.out.println("fbs id is: "+this.firstbitid);
			 System.out.println("name is: "+this.name);
			 System.out.println("distance is: "+this.distance);
		 }
		
}

class placestudent extends student{
	

	String comanyname;
	String designigation;
	

	 String getComanyname() {
		return comanyname;
	}
	 void setComanyname(String comanyname) {
		this.comanyname = comanyname;
	}
	 String getDesignigation() {
		return designigation;
	}
	 void setDesignigation(String designigation) {
		this.designigation = designigation;
	}
	 
	 placestudent(){
		 
		 super();
		 this.comanyname="wipro";
		 this.designigation="devloper";
		 
		 
	 }
	 placestudent(int a,String b,int c,String d,String e){
		 
		 super(a,b,c);
		 this.comanyname=d;
		 this.designigation=e;
		 
		 
	 }
	 
	 void display(){
		 
		 super.display();
		 System.out.println("complayis:"+ this.comanyname);
		 System.out.println("role is "+this.designigation);
		 
	 }
	 
}

class teststudent {
	
	public static void main(String[]args) {
		
		student s1 = new student();
		System.out.println("count:"+student.getCount());
		placestudent p1 = new placestudent(102,"shiv",20,"tcs","hr");
		System.out.println("count:"+student.getCount());
		s1.display();
		p1.display();
		
	}
	
	
}
