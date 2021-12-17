
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 4, bredth=5;
		int constant = 2;
		int radius = 5;
		double pi = 3.14;
		int Addition = length + bredth;
		int substraction = length - bredth;
		int area1 = length * bredth;
		double area2 = pi * radius * radius;
		double perimeter = constant * pi * radius;
		String $address = "Mamatha, 3455 morningstar drive, ON-L4T3T9";
		String _email = "mamatha@gmail.com";
		int $price = 10;
		System.out.println("Sum:" + Addition);
		System.out.println("Difference:" + substraction);
		System.out.println("RectangularArea:" + area1);
		System.out.println("CircularArea:" + area2);
		System.out.println("Circumference:" + perimeter);
		System.out.println("Myemail:" + _email);
		System.out.println("My Address:" + $address);
		System.out.println("cost:" + $price);
		System.out.println(+$price);

	}

}
