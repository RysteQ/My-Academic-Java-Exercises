import java.util.Scanner;


/*
Name: ask_1.java
Input: None
Output: String (text output)

Purpose: This is my implementation of the first exercise we have to solve (well, we don't have to solve this) for the subject
object oriented programming in my place of education
*/


class Main {
    static Scanner input = new Scanner(System.in);
    

    public static void main (String[] args) {
        String bestProductName;
        int bestProductScore;
        Double bestProductPrice;

        String currentProductName;
        int currentProductScore;
        Double currentProductPrice;


        bestProductName = getString("Name: ");
        bestProductScore = getInt("Score: ");
        bestProductPrice = getDouble("Price: ");
        input.nextLine();


        while (!(currentProductName = getString("Name: ")).equals("exit")) {
            currentProductScore = getInt("Score: ");
            currentProductPrice = getDouble("Price: ");


            if ((currentProductScore / currentProductPrice) > (bestProductScore / bestProductPrice)) {
                bestProductName = currentProductName;
                bestProductScore = currentProductScore;
                bestProductPrice = currentProductPrice;
            }

            System.out.println();
            input.nextLine();
        }


        System.out.print("\n\n-= Best product =-\n\nName: " + bestProductName + "\nScore: " + bestProductScore + "\nPrice: " + bestProductPrice + "\n\n");
    }


    private static String getString(String msg) {
        System.out.print(msg);
        return input.nextLine();
    }

    private static int getInt(String msg) {
        System.out.print(msg);
        return input.nextInt();
    }

    private static Double getDouble(String msg) {
        System.out.print(msg);
        return input.nextDouble();
    }
}