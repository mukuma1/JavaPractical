package array;

import java.util.Scanner;

public class salaryArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the # of employees in the firm");
		int n = sc.nextInt();
		String[] employeelist = new String[n];
		int[] salaries = new int[n];
		for (int i = 0; i < employeelist.length; i++) {
			System.out.println("Enter the name of Employee" + (i + 1));
			employeelist[i] = sc.next();
			System.out.println("Enter the salary drawn ");
			salaries[i] = sc.nextInt();
		}
		for (int i =0; i<employeelist.length;i++) {
			System.out.println("Salary drawn by "+employeelist[i]+" is "+salaries[i]);
		}
	}

}
