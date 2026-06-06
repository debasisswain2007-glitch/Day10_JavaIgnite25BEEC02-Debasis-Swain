/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter balance: ");
            double balance = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter withdrawal amount: ");
            double withdrawal = Double.parseDouble(sc.nextLine());
            
            if (withdrawal < 0) 
                throw new IllegalArgumentException("Negative withdrawal amount");
            
            if (withdrawal > balance) 
                throw new ArithmeticException("Insufficient Balance");
            
            System.out.println("Transaction Successful");
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
