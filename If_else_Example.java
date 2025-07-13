import java.util.Scanner;
public class If_else_Example{
    public static void odd_even(){
        // program to perform check the number odd or even by using the method.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is even number.");
        }else{
            System.out.println("Given number is odd");
        }
    }
    public static void main(String args[]){
        odd_even();
    }
}