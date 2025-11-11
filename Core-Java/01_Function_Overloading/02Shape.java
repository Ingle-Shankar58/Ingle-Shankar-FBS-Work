class Shape {

    // Triangle 

	void Area(double a, double b){

	double area  = 	0.5 * a * b;

	System.out.println("Area of Triangle : "+area);

    }

    // Rectangle

	void Area (int a , int b){

	double area = a * b;

	System.out.println("Area of Rectangle: "+area);

    }

    // Circle

	void Area(double a){

	double area = 3.14 * a * a;

	System.out.println("Area od Circle: "+area);

    }

}

    // TestShape

class TestShape {

    public static void main(String[]args){

	Shape s1 = new Shape();

	s1.Area(10.5,5.5);
	s1.Area(10,5);
	s1.Area(10.5);



    }

}