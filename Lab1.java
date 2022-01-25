package lab1;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Hello, I am Arshad!");

		String moduleCode = "CSC1009";

		switch (moduleCode) {
		case "CSC1006":
			System.out.println("Mathematics 2");
			break;
		case "CSC1007":
			System.out.println("Operating Systems");
			break;
		case "CSC1008":
			System.out.println("Data Structures and Algorithms");
			break;
		case "CSC1009":
			System.out.println("Object-Oriented Programming");
			break;
		default:
			System.out.println("Unknown Module Code");
			break;
		}

		for (int i = 102; i >= 66; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
