package array;

import java.util.Scanner;

public class stringArray {

	public static void main(String[] args) {
//		Create a String array of 10 names & print it using loop
		String[] listofNames = { "Mukundan", "Maniyamma", "Manjusha", "Mamatha", "Praseed", "Niranjan", "Anish",
				"Neeraj" };
		for (int i = 0; i < listofNames.length; i++) {
			System.out.println("Name" + (i + 1) + "= " + listofNames[i]);
		}

//		Create a String array.array. Take length using scanner & create a name list & print the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of names to be stored in the list");
		int n = sc.nextInt();
		String[] nameList = new String[n];
		for (int i = 0; i < nameList.length; i++) {
			System.out.println("Enter Name" + (i + 1));
			nameList[i] = sc.next();
		}
		for (int i = 0; i < nameList.length; i++) {
			System.out.println(nameList[i]);
		}
	}

}
