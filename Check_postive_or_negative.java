import java.util.Scanner;
public class Check_postive_or_negative {
    public static void checkNumber() {
        // program to check if the number is positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Given number is positive.");
        }
    }

    public static void main(String args[]) {
        checkNumber();
        // Calling the method to check if the number is positive or negative
        // This method will prompt the user for input and display the result
    }
}