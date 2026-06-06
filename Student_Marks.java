/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
import java.util.Scanner;

public class StudentMarksSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = {85, 92, 78, 88, 96}; // Pre-stored marks for 5 students
        
        System.out.println("=== Student Marks System ===");
        System.out.println("Students: 0=Rahul, 1=Priya, 2=Amit, 3=Neha, 4=Raj");
        
        while (true) {
            try {
                System.out.print("\nEnter student index (0-4) or -1 to exit: ");
                String input = scanner.nextLine();
                int index = Integer.parseInt(input);
                
                if (index == -1) {
                    System.out.println("Exiting program...");
                    break;
                }
                
                // Check for valid index range
                if (index < 0 || index >= marks.length) {
                    throw new ArrayIndexOutOfBoundsException("Index " + index + " not found");
                }
                
                System.out.printf("Student at index %d scored: %d marks\n", index, marks[index]);
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number (0-4)");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index! Please enter between 0 and " + (marks.length - 1));
            }
        }
        
        scanner.close();
    }
}
