import java.util.Scanner;

public class CommandLineApp {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
//        System.out.print("please enter a number: ");
//
//        if (myScanner.hasNextInt()) {
//            int myNum = myScanner.nextInt();
//            System.out.println(
//                "you have entered " + myNum
//            );
//        } else {
//            System.out.println("You did not enter a number");
//        }

        // write a command line application that
        // prompts users to enter 2 numbers
        // and outputs the sum in a user friendly message.

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("please enter a number (decimals ok): ");
//        if (input.hasNextDouble()) {
//            System.out.println("You have entered: " + input.nextDouble());
//        } else {
//            System.out.println(input.next() + " is not a number :(");
//        }



//        // get first input
//        System.out.print("please enter a number: ");
//        int first;
//        if (input.hasNextInt()) {
//            first = input.nextInt();
//        } else {
//            first = 0;
//            String badInput = input.next();
//            System.out.println(badInput + " is not a number so we used 0");
//        }
//        // get second input
//        System.out.print("please enter another number: ");
//        int second;
//        if (input.hasNextInt()) {
//            second = input.nextInt();
//        } else {
//            second = 0;
//            System.out.println("you didnt enter a number so we used 0");
//        }
//        System.out.println("Your sum is: " + (first + second));


//        Scanner output = new Scanner(System.in);
//        System.out.println("enter your first number ");
//        if (output.hasNextInt()) {
//            int num1 = output.nextInt();
//            System.out.println("enter your second number ");
//            if (!output.hasNextInt()) {
//                System.out.println("please enter a number");
//                return;
//            }
//            int num2 = output.nextInt();
//            int sum = num1 + num2;
//            System.out.println("your sum =" + sum);}
//        else {
//            System.out.println("please enter a number");
//        }


        // nested if conditions example
//        int i = 9;
//
//        if (i % 3 == 0) {
//            System.out.println("i is multiple of 3");
//
//            if (i % 5 == 0) {
//                System.out.println("i is also multiple of 5");
//            }
//
//        }

        Scanner input = new Scanner(System.in);

        boolean again = true;

        while (again) {
            // gives error: int age = null;
            int age = 0;
            while (age < 1) {
                System.out.print("Please enter your age (must be at least 1): ");
                if (input.hasNextInt()) {
                    age = input.nextInt();
                } else {
                    System.out.println(input.next() + " is not a number, please try again.");
                }
            }
            if (age > 20) {
                System.out.println("Haha, you are old!");
            } else {
                System.out.println("Wow! You are very young!");
            }

            System.out.print("enter 1 to exit, any other key to continue: ");
            if (input.hasNextInt() && input.nextInt() == 1) {
                again = false;
            }
        }
        System.out.println("Good bye!");
    }
}
