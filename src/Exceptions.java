import java.util.*;

@SuppressWarnings("all")
public class Exceptions {
    public static void main(String[] args) {
        int i = 10;
        int x = 5;

        try {
            System.out.println("i divided by x is: " + (i / x));
        } catch(ArithmeticException e) {
            System.out.println("There was an error: " + e.getMessage());
        }

        System.out.println("The code is finished");
//        Test.ourMethodName("");
//        Test.myNumber(5);
    }
}


// write a method that takes an integer i
// and prints out "your number is " + i.
// But if the number is 5, throw an exception.

class Test7867 {
    // example
    public static void ourMethodName(String s) throws Exception {
        if (s.equals("java")) {
            throw new Exception("java");
        }
        System.out.println("your string was " + s);
    }

    // solution
    public void myNumber(int i) throws Exception {
        if (i == 5) {
            throw new Exception("The number was 5");
        }
        System.out.println("your number is " + i);
    }
}




// write a command line application that prompts
// the user for 2 numbers, divides them and prints
// out the result. Use exceptions to handle
// dividing by zero without breaking the application.
class test23432 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // prompt for number
        // get number
        System.out.print("enter an int: ");
        int num1 = scan.nextInt();

        // prompt for another number
        // get number
        System.out.print("enter an int: ");
        int num2 = scan.nextInt();

        // try to divide numbers,
        // catch exception from dividing by 0
        try {
            int result = num1 / num2;
            System.out.println("number 1 divided by number 2 is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero!!!!!");
        }
    }
}











// write a command line application that prompts
// the user for an integer then tells the user
// what their number squared is. Use exceptions
// to handle non integer input without breaking the application.
class r435 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("please enter a number: ");
            int input = scan.nextInt();
            System.out.println("Your number squared is : " + input * input);
        } catch (InputMismatchException e) {
            System.out.println("that was not an integer input!");
        }
    }
}

