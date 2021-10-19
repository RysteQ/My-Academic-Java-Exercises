import java.util.Scanner;


/*
Name: ask_2
Input: Keyboard Input (terminal)
Output: Text Output (terminal)

Purpose: This is the solution of the second exercise we had to solve for the OOP class in my place of education, it's the same as the first exercise but this time we used a class to solve the problem,
unlike the first exercise when we were using Java just like C
*/


class Main {
    public static void main (String[] args) {
    	product mainProcess = new product("exit");
    	mainProcess.findBestProduct();
    }
}


class product {
	product(String endStringValue) {
		endValue = endStringValue;
		
		findBestProduct();
	}
	
	
	public void findBestProduct() {
		// initial values
		System.out.print("Name: ");
		productName = bestProductName = input.nextLine();
		
		System.out.print("Score: ");
		bestProductScore = input.nextInt();
		
		System.out.print("Price: ");
		bestProductPrice = input.nextInt();
		input.nextLine();
		
		
		while (true) {
			System.out.print("Name: ");
			productName = input.nextLine();
			
			if (productName.equals(endValue)) break;
			
			System.out.print("Score: ");
			productScore = input.nextInt();
			
			System.out.print("Price: ");
			productPrice = input.nextInt();
			input.nextLine();
			
			calculateProduct();	
		}
		
		
		bestProduct();
	}
	
	private void bestProduct() {
		System.out.println("\n\n-= Best product =-\n\nName: " + bestProductName + "\nScore: " + bestProductScore + "\nPrice: " + bestProductPrice + "\n\n");
	}
	
	private void calculateProduct() {	
		if ((productScore / productPrice) > (bestProductScore / bestProductPrice)) {
			bestProductName = productName;
			bestProductScore = productScore;
			bestProductPrice = productPrice;
		}
	}
	
	
	
	private Scanner input = new Scanner(System.in);
	private String endValue = "exit";
	
	private String bestProductName;
	private int bestProductScore;
	private int bestProductPrice;
	
	private String productName;
	private int productScore;
	private int productPrice;
}