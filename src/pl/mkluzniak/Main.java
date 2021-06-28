package pl.mkluzniak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // exception = an event that occurs during the executions of a program that,
        // disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try { //it will test everythig that is in it

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();


            System.out.println("Enter a whole number to divide: ");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("result: " + z);
        } catch (ArithmeticException e) { //is for specific error that ocute ->divide by 0
            System.out.println("You can't divide by zero!!");

        } catch (InputMismatchException e) {//its for error that return wrong number
            System.out.println("Please input a number!");
        } catch (Exception e) {//its for all error what could occured
            System.out.println("Something went wrong!");
        }
        finally { //its good practice to close scanner
            scanner.close();
        }
    }
}
