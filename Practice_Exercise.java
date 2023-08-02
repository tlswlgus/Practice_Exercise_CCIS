import java.util.Scanner;

public class Practice_Exercise {
	
	public static void main(String[] args) {
		Scanner inputSc = new Scanner(System.in);
		String nameUser,destination, busClass, ageClass;
		int age;
		double  totalPay = 0, change = 0, discount = 0, payment = 0, fare = 0;
		boolean checkClass = true, checkPay = true;
		
		System.out.print("\t Enter your Name: ");
		nameUser = inputSc.nextLine();
		System.out.print("\t Enter your Age: ");
		age = inputSc.nextInt(); 
		System.out.println("\n\t Bus Classes and Fare: ");
		System.out.println("\t |  Class A = 45000 |  Class B = 30000 |  Ordinary = 17000 |");
		System.out.print("\n\t Enter your Bus Class: ");
		inputSc.nextLine();
		busClass = inputSc.nextLine();
		
		while (checkClass) {
			if ("class a".equalsIgnoreCase(busClass) || "a".equalsIgnoreCase(busClass)) {
			fare = 45000;
			busClass = "CLass A";
			checkClass = false;
			}
			else if ("class b".equalsIgnoreCase(busClass) || "b".equalsIgnoreCase(busClass)) {
				fare = 30000;
				busClass = "CLass B";
				checkClass = false;
			}
			else if ("ordinary".equalsIgnoreCase(busClass)) {
				fare = 17000;
				busClass = "Ordinary";
				checkClass = false;
			}
			else {
				System.out.println("\t\t *Invalid Bus Class*");
				System.out.print("\t Enter your Bus Class: ");
				busClass = inputSc.nextLine();
			}
		}
		
		System.out.print("\t Enter your Destination: ");
		destination = inputSc.nextLine();
		System.out.print("\t Enter your Payment Amount: ");
		payment = inputSc.nextInt();
		
		if (age >= 60) {
			discount = fare * .20;
			ageClass = "Senior Citizen";
			
		}
		else if (age >= 18) {
			ageClass = "Adult";
		}
		else {
			ageClass = "Minor";
		}
		
		totalPay =  fare - discount;
		
		while (checkPay) {
			if (fare <= payment){
				System.out.println("\n\t\t *Amount Sufficient*\n");
				change =  payment - totalPay;
				checkPay = false;
			}
			else {
				System.out.println("\n\t\t *Amount Insufficient. Please Pay the exact amount or more*\n");
				System.out.print("\t Enter your Payment Amount: ");
				payment = inputSc.nextInt();
			}
		}
		
	inputSc.close();
		System.out.println("\t\t-----------------------------------------------");
		System.out.println("\t\t\t Name: " + nameUser);
		System.out.println("\t\t\t Age: " + age + " ("+ ageClass +")");
		System.out.println("\t\t\t Bus Class: " + busClass);
		System.out.println("\t\t\t Destination: " + destination);
		System.out.println("\t\t\t Fare: " + fare);
		System.out.println("\t\t\t Discount: " + discount);
		System.out.println("\t\t\t Payment Amount: " + payment);
		System.out.println("\t\t\t Change: " + change);
		System.out.println("\t\t\t Total: " + totalPay);
		System.out.println("\t\t-----------------------------------------------");
	}
}