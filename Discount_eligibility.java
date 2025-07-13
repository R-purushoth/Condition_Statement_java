import java.util.Scanner;
public class Discount_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total purchase amount: ");
        double purchaseAmount = sc.nextDouble(); // input purchase amount
        if(purchaseAmount>500) {
            // Check if the purchase amount is greater than 500
            // If true, the user is eligible for a discount
            double discountAmount= purchaseAmount*0.10; // 10% discount
            double finalAmout = purchaseAmount - discountAmount; // final amount after discount
            System.out.println("Your discount Amount is: " + discountAmount);
            System.out.println("Your final amount after discount is: " + finalAmout);
        } else {
            System.out.println("You are not eligible for a discount.");
        }
    }
    
}
