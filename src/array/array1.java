package array;

public class array1 {

	public static void main(String[] args) {

		String[] animal = new String[3];
		animal[0] = "CAT";
		animal[1] = "Alligator";
		animal[2] = "Tiger";
		for (int i = 0; i < 3; i++) {
			System.out.println("For variable animal, index " + i + "- " + animal[i]);
		}
//		 Second way of declaring array

		String[] name = { "Manjusha", "Mamatha", "Niranjan", "Neeraj" };

		for (int i = 0; i < 4; i++) {
			System.out.println("For variable name, index " + i + "- " + name[i]);
		}

		System.out.println(animal.length);

	}
	

}
