/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter account balance: ₹");
            double balance = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter withdrawal amount: ₹");
            double withdrawal = Double.parseDouble(scanner.nextLine());
            
            if (withdrawal > balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            
            balance -= withdrawal;
            System.out.printf("Withdrawal successful! Remaining balance: ₹%.2f\n", balance);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
