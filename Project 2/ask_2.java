import java.util.Scanner;


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
		System.out.print("Name: ");
		productName = bestProductName = input.nextLine();
		
		System.out.print("Score: ");
		bestProductScore = input.nextInt();
		
		System.out.print("Price: ");
		bestProductPrice = input.nextDouble();
		input.nextLine();
		
		
		while (true) {
			System.out.print("Name: ");
			productName = input.nextLine();
			
			if (productName.equals(endValue)) break;
			
			System.out.print("Score: ");
			productScore = input.nextInt();
			
			System.out.print("Price: ");
			productPrice = input.nextDouble();
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
	private double bestProductPrice;
	
	private String productName;
	private int productScore;
	private double productPrice;
}