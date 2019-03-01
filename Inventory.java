import java.util.Scanner;
public class Inventory {
	
	static Scanner read = new Scanner(System.in);
	static void displayMenu() {
		//begin program menu
	System.out.println("");
	System.out.println("");
	System.out.println("***************************");
	System.out.println("----Inventory Valuation---");
	System.out.println("***(Weighted Average Method)***");
	System.out.println(""); 
	System.out.println("");
	System.out.println("--------- M E N U ---------");
	System.out.println("");
	   // end program menu
} //end method
	static double averageCost() {
			//Declare Variables
		double average = 0.0;
		double cost =0.0;
		double totalValue = 0.0;
		char answer = 'Y';	
		
		int number = 0;
		int sumItems = 0;
		int quantity = 0;
		
		String item = "";
			//end declaration of variables
	
	
	while (answer == 'y' || answer == 'Y') {
			//Begin Inventory Evaluation
		System.out.println("Number of Item Types:");
		number = read.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println("enter the item's description");
			item = read.next();
			System.out.println("item description: " + item);
			System.out.println("enter item quantity");
			quantity = read.nextInt();
			sumItems += quantity;
			System.out.println("enter item cost");
			cost = read.nextDouble();
			totalValue += cost * quantity;
			average = totalValue / sumItems;
				//end inventory evaluation
			
			
		}  //end for loop	
		
	} //end while loop
		return average;
} //end method
	public static void main(String args[]) {
		
		displayMenu();
		
	//Display results
	System.out.printf("average cost: $%.2f\n", averageCost());
	System.out.println("***************************");
		//end result display
	

	   // begin code block to perform additional program run 
	System.out.println("run again(Y or N)?");
	answer = read.next().charAt(0);
	   // end code block to perform additional program run 
	
	System.out.println("***************************");
	System.out.println("***************************");
	System.out.println("***************************");
		
		
				
	}         //end main argument

}             //end public class
