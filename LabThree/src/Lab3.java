
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String cont = null;
		do {
			System.out.println("Enter a number 1 and 100.");
			int num = scnr.nextInt();
			System.out.println(num);
			while (num < 1 || num > 100) {

				System.out.println("Must be betwwen 1 and 100");
				System.out.println("Enter a number between 1 and 100");
				num = scnr.nextInt();
			}
			if (num % 2 == 0) {
				System.out.println("The number is even. ");
				if (num >= 2 && num <= 25) {

					System.out.println("The number is less than 25");

				} else if (num > 60) {
					System.out.println(num);

				}
			} else {
				System.out.println("The number is odd.");
				if (num > 60) {
					System.out.println("Number is over 60");
				}

				
			} 
			System.out.println("Do you want to continue? Type Y.");
			
			cont = scnr.next();
		} while (cont.equalsIgnoreCase("Y"));
		
		
		
		scnr.close();



	}
}


	

