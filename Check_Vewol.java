import java.util.Scanner;
public class Check_Vewol {
    public static void main(String args[]) {
       // this program checks given character is vowel or not
       // input is initialized from the user
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a character: ");
       char ch = sc.next().toLowerCase().charAt(0); // input character
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
           System.out.println("The character is a vowel.");
       } else {
           System.out.println("The character is not a vowel.");
       }
    }
}