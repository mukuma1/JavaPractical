package array;

import java.util.Scanner;

public class arrayElement {

	public static void main(String[] args) {
		// find brampton in the list
		String[] cityList = { "Mississauga", "Toronto", "Kingston", "London", "Ottawa", "Brampton", "Sudbury",
				"Thunderbay", "Kitchner", "SaultStMarie", "Brampton" };
		System.out.println("No: of Cities in the List = "+cityList.length);
		boolean isFound = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city name to be searched");
		String cityName = sc.next();
		for (int i = 0; i < cityList.length; i++) {
			if (cityName.equals(cityList[i])) {
				isFound = true;
				break;
			}
		}
		System.out.println("City name " + cityName + " is in the list: " + isFound);

		// find a particular city name (repeated more than once) is found in the list

		System.out.println("Enter the city name to be searched");
		cityName = sc.next();
		int counter = 0;
		for (int i = 0; i < cityList.length; i++) {
			if (cityName.equals(cityList[i])) {
				counter++;
			}
		}
		if (counter > 0) {
			System.out.println("City name " + cityName + " found " + counter + " times");
		} else
			System.out.println("City name " + cityName + " NOT found ");
		
		// find at what index Brampton is found
				System.out.println("Enter the city name to be searched");
				cityName = sc.next();
				counter = 0;
				for (int i = 0; i < cityList.length; i++) {
					if (cityName.equals(cityList[i])) {
						System.out.println("City name " + cityName + " found at index "+i);
						counter++;
					}
				}
				if (counter == 0) {
					System.out.println("City name " + cityName + " NOT found ");
				} 
	}

}
