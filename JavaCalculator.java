import java.util.Scanner;
// the is the short calculator 
//simply input the expression like a String formate.
public class JavaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String input = scanner.nextLine(); // Read as string, e.g., 5+6
        
        char operator = input.charAt(1);
        double num1 = Double.parseDouble(String.valueOf(input.charAt(0)));
        double num2 = Double.parseDouble(String.valueOf(input.charAt(2)));

        if (operator == '+')
            System.out.print(input + " = " + Math.round(num1 + num2));
        else if (operator == '-')
            System.out.print(input + " = " + Math.round(num1 - num2));
        else if (operator == '*')
            System.out.print(input + " = " + Math.round(num1 * num2));
        else if (operator == '/')
            System.out.print(input + " = " + Math.round(num1 / num2));
      
      //thanks for wateching
    }
}
