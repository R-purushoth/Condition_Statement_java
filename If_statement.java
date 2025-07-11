import java.util.Scanner;
public class If_statement {
    // This program checks if a person is eligible to vote based on their age
    // input are taken from the user name and age
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Example name input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Example age input
        if (age > 18) {
            System.out.println(name + ", you are eligible to vote.");
        } 
    }
}