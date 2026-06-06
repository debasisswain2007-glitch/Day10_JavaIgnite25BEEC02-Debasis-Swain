/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a string: ");
            String text = scanner.nextLine();
            
            if (text.isEmpty()) {
                System.out.println("Warning: Empty string provided");
            }
            
            System.out.print("Enter starting index for substring: ");
            int start = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter ending index for substring: ");
            int end = Integer.parseInt(scanner.nextLine());
            
            // Substring operation with exception handling
            try {
                String result = text.substring(start, end);
                System.out.println("Substring result: \"" + result + "\"");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Invalid index for substring operation");
            }
            
            System.out.print("Enter index for charAt operation: ");
            int index = Integer.parseInt(scanner.nextLine());
            
            // charAt operation with exception handling
            try {
                char character = text.charAt(index);
                System.out.println("Character at index " + index + ": '" + character + "'");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Invalid index for charAt operation");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter numeric values for indices");
        } finally {
            scanner.close();
        }
    }
}
