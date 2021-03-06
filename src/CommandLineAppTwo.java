import java.util.Scanner;

public class CommandLineAppTwo {
    public static void main(String[] args) {

        //assignment solution 1
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("enter name press N, enter age press A, exit press X");
//            String answer = input.next();
//            String name = "";
//            Integer age =null;
//            if (answer.equals("N")) {
//                System.out.println("Please enter your name");
//                name = input.next();
//                while (name.length() < 3) {
//                    System.out.println("Name must be at least 3 character");
//                    name = input.next();
//                }
//                System.out.println("Your name is " + name);
//            }
//            if (answer.equals("A")) {
//                System.out.println("Please enter your age");
//                while (age == null){
//                    if(input.hasNextInt()){
//                        age = input.nextInt();
//                        break;
//                    }else{
//                        System.out.println("enter a number");
//                        input.next();
//                    }
//                }
//                System.out.println("age : "+ age);
//            }
//            if(answer.equals("X")){
//                System.out.println("Good bye");
//                break;
//            }
//            // if(!answer.equals("A") || !answer.equals("N") || !answer.equals("X")){
//            if(!answer.equals("A") && !answer.equals("N") && !answer.equals("X")){
//                System.out.println("Wrong input. Enter again");
//                continue;
//            }
//        }

        // solution 2
//        boolean again = true;
//        while (again){
//            System.out.println("MENU (N)enter name (A)enter age (X)exit;");
//            Scanner input = new Scanner(System.in);
//            String given = input.nextLine();
//            if (given.compareTo("N")==0){
//                boolean againName = true;
//                while (againName){
//                    System.out.print("Please enter your name:");
//                    Scanner inputName = new Scanner(System.in);
//                    if (!inputName.hasNextInt()) {
//                        String givenName = inputName.next();
//                        if (givenName.length() < 3) {
//                            System.out.println("Name must be at least 3 chars.");
//                        } else {
//                            System.out.println("Your name is " + givenName);
//                            againName = false;
//                        }
//                    }else{
//                        System.out.println("You entered incorrect input!");
//                    }
//                }
//            }
//            else if (given.compareTo("A")==0){
//                boolean againAge = true;
//                while (againAge){
//                    System.out.print("Please enter your age:");
//                    Scanner inputAge = new Scanner(System.in);
//                    if (inputAge.hasNextInt()) {
//                        int givenAge = inputAge.nextInt();
//                        if (givenAge < 1) {
//                            System.out.println("You must enter a number for age.");
//                        } else {
//                            System.out.println("Your age is " + givenAge);
//                            againAge = false;
//                        }
//                    }else{
//                        System.out.println("You entered incorrect input!");
//                    }
//                }
//            }
//            else if (given.compareTo("X")==0){
//                System.out.println("Good bye!");
//                again = false;
//            }else{
//                System.out.println("That is not a valid menu selection.");
//            }
//        }

        // declare scanner for keyboard input
//        Scanner input = new Scanner(System.in);
//
//        boolean repeat = true;
//
//        while (repeat) {
//
//            // prompt main menu to user
//            System.out.println("MAIN MENU");
//            System.out.println("N - enter a name");
//            System.out.println("A - enter an age");
//            System.out.println("X - exit program");
//            System.out.print("Enter Selection: ");
//
//            // get user menu selection
//            char menuSelection = input.next().toUpperCase().charAt(0);
//            System.out.println("You have entered " + menuSelection);
//
//            switch (menuSelection) {
//                // user selected N - name
//                case 'N' :
//                    // prompt user for name
//                    System.out.print("Enter your name: ");
//
//                    // declare variable to hold name, start with invalid value
//                    String name = "";
//
//                    // while name is invalid
//                    while (name.length() < 3) {
//
//                        // get a name from the user
//                        name = input.next();
//
//                        // if it is still invalid, tell them
//                        if (name.length() < 3) {
//                            System.out.print("Your name must be at least 3 characters: ");
//                        }
//                    }
//
//                    // tell them their name
//                    System.out.println("Your name is " + name);
//                    break;
//
//                // user selected A - age
//                case 'A' :
//
//                    // prompt for a age
//                    System.out.print("Enter your age: ");
//
//                    // declare variable to hold the age, start with invalid age
//                    int age = -1;
//
//                    // while age is invalid
//                    while (age < 0) {
//
//                        // check for valid number input
//                        if (input.hasNextInt()) {
//
//                            // get age if input is a number
//                            age = input.nextInt();
//                        } else {
//
//                            // otherwise ask for a number
//                            System.out.println("enter a number");
//
//                            // clear input
//                            input.next();
//                        }
//
//                        // if the age is invalid, re prompt for an age
//                        if (age < 0) {
//                            System.out.print("Your age must be at least 0: ");
//                        }
//                    }
//
//                    // tell them their age
//                    System.out.println("Your age is " + age);
//                    break;
//                // user selected X - exit
//                case 'X' :
//
//                    // tell the user good bye
//                    System.out.println("Goodbye!");
//
//                    // leave while loop
//                    repeat = false;
//                    break;
//                // user selected other - wrong
//                default:
//
//                    // wrong input message
//                    System.out.println("Wrong input. Enter again");
//            }
//        }

        // write a command line application that
        // prompts the user for numbers (int) until
        // the user enters something that is not a number,
        // then prints out the sum of all the numbers the user entered.

        // solution 1
//        Scanner scan = new Scanner(System.in);
//        Integer num = null;
//        boolean isNumber = true;
//        int result = 0;
//        while (isNumber) {
//            System.out.print("Pls enter your number: ");
//            if (scan.hasNextInt()){
//                num = scan.nextInt();
//                result += num;
//            } else {
//                System.out.println("your total is: " + result);
//                isNumber = false;
//            }
//        }

//        // create a scanner
//        Scanner input = new Scanner(System.in);
//
//        // store total here
//        int count = 0;
//
//        // while we haven't gotten a non number input
//        while (true) {
//
//            // prompt for a number or other input
//            System.out.print("Enter a number(or non number to finish): ");
//            if (input.hasNextInt()) {
//                // add the number if it is a number
//                count += input.nextInt();
//            } else {
//                // leave the loop
//                break;
//            }
//        }
//
//        // give the user the sum
//        System.out.println("Your sum is: " + count);


        // write a command line application that prompts
        // the user for 3 types of words (example, a name,
        // place, verb, adjective ect) and then outputs a
        // message made with the 3 words. (example ask for
        // a name, place and feelings then output "name was
        // feeling as they walked to place")

        // solution one
//        int again = 0;
//        String name = "";
//        String place = "";
//        String feeling = "";
//        System.out.println("Please enter 3 type of words");
//        while (again < 4) {
//            if (again == 0) {
//                System.out.print("Please enter a name:");
//                Scanner inputName = new Scanner(System.in);
//                if (!inputName.hasNextInt()) {
//                    String givenName = inputName.next();
//                    if (givenName.length() < 3) {
//                        System.out.println("Name must be at least 3 chars.");
//                    } else {
//                        name = givenName;
//                        again = 1;
//                    }
//                } else {
//                    System.out.println("You entered incorrect input!");
//                }
//            } else if (again == 1) {
//                System.out.print("Please enter a place name:");
//                Scanner inputPlace = new Scanner(System.in);
//                if (!inputPlace.hasNextInt()) {
//                    String givenPlace = inputPlace.next();
//                    if (givenPlace.length() < 3) {
//                        System.out.println("Place must be at least 3 chars.");
//                    } else {
//                        place = givenPlace;
//                        again = 2;
//                    }
//                } else {
//                    System.out.println("You entered incorrect input!");
//                }
//            } else if (again == 2) {
//                System.out.print("Please enter a feeling:");
//                Scanner inputFeeling = new Scanner(System.in);
//                if (!inputFeeling.hasNextInt()) {
//                    String givenFeeling = inputFeeling.next();
//                    if (givenFeeling.length() < 3) {
//                        System.out.println("Feeling must be at least 3 chars.");
//                    } else {
//                        feeling = givenFeeling;
//                        again = 3;
//                    }
//                } else {
//                    System.out.println("You entered incorrect input!");
//                }
//            } else if (again == 3) {
//                System.out.println(name + " was " + feeling + " as they walked to " + place + "\n");
//                System.out.println("If you want to do again please enter Y/N: ");
//                Scanner repeat = new Scanner(System.in);
//                String givenRepeat = repeat.nextLine();
//                if (givenRepeat.compareTo("Y") == 0) {
//                    again = 0;
//                } else {
//                    System.out.println("Good bye!");
//                    again = 4;
//                }
//            }
//        }

        // solution 2
//        String[] words = new String[3];
//        Scanner input = new Scanner(System.in);
//        System.out.println("3 Types of Words");
//        System.out.print("Enter a name: ");
//        words[0] = input.next();
//        System.out.print("Enter a place: ");
//        words[1] = input.next();
//        System.out.print("Enter feelings: ");
//        words[2] = input.next();
//        System.out.println(words[0] + " was " + words[2] + " as they walked to " + words[1]);


        // write a command line application that
        // prompts the user for 3 numbers (int)
        // and outputs the highest number.

        // solution 1
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Input the first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Input the second number: ");
//        int num2 = input.nextInt();
//        System.out.print("Input the third number: ");
//        int num3 = input.nextInt();
//
//        if (num1 > num2 && num1 > num3)
//            System.out.println("The highest: " + num1);
//        if (num2 > num1 && num2 > num3)
//            System.out.println("The highest: " + num2);
//        if (num3 > num1 && num3 > num2)
//            System.out.println("The highest: " + num3);

        // solution 2
//        Scanner input = new Scanner(System.in);
//        int[] numbers = new int[3];
//        System.out.print("Enter first number: ");
//        numbers[0] = input.nextInt();
//        System.out.print("Enter second number: ");
//        numbers[1] = input.nextInt();
//        System.out.print("Enter third number: ");
//        numbers[2] = input.nextInt();
//        int highNumber = numbers[0];
//        for (int i=0; i<3; i++){
//            if (numbers[i]>highNumber){
//                highNumber = numbers[i];
//            }
//        }
//        System.out.println("This is highest number: "+ highNumber);


        // solution 3
//        Scanner input= new Scanner(System.in);
//        System.out.println("enter 3 numbers");
//
//        System.out.println("enter number first:");
//        int first= input.nextInt();
//        System.out.println("enter number second:");
//        int second=input.nextInt();
//        System.out.println("enter number third:");
//        int third=input.nextInt();
//
//        int high=Math.max(first,second);
//        System.out.println("highest number:"+  Math.max(high,third));

        // solution 4
//        int nums [] = new int[3];
//        Scanner given = new Scanner(System.in);
//        int again = 0;
//        int biggest = 0;
//        System.out.println("Please enter 3 numbers...");
//        while (again < 3){
//            if (again == 0){
//                System.out.print("Enter first number: ");
//                if (given.hasNextInt()){
//                    nums[0] = given.nextInt();
//                    again++;
//                }else{
//                    System.out.println("You entered incorrect input!");
//                }
//            }
//            else if (again == 1){
//                System.out.print("Enter second number: ");
//                if (given.hasNextInt()){
//                    nums[1] = given.nextInt();
//                    again++;
//                }else{
//                    System.out.println("You entered incorrect input!");
//                }
//            }
//            else if (again == 2){
//                System.out.print("Enter third number: ");
//                if (given.hasNextInt()){
//                    nums[2] = given.nextInt();
//                    again++;
//                }else{
//                    System.out.println("You entered incorrect input!");
//                }
//            }
//        }
//        for (int i = 0; i<3; i++){
//            if (nums[i]>biggest){
//                biggest=nums[i];
//            }
//        }
//        System.out.println("Biggest number is " + biggest);

        // solution 5
//        int nums [] = new int[3];
//        Scanner given = new Scanner(System.in);
//        int index = 0;
//        System.out.println("Please enter " + nums.length + " numbers...");
//        while (index < nums.length){
//            System.out.print("Enter number " + (index + 1));
//            if (given.hasNextInt()){
//                nums[index] = given.nextInt();
//                index++;
//            }else{
//                System.out.println("You entered incorrect input!");
//                given.next();
//            }
//        }
//        int biggest = 0;
//        for (int i = 0; i<nums.length; i++){
//            if (nums[i]>biggest){
//                biggest=nums[i];
//            }
//        }
//        System.out.println("Biggest number is " + biggest);


        // hasNext methods:
        // hasNextInt(), hasNextBoolean()
        // check in if the scanner has data
        // doesnt empty scanner data

        // next methods:
        // next(), nextInt(), nextBoolean()
        // take the data out of the scanner
        // empties scanner data


        // basic while validation example
        // get a positive number input from the user and print it out
//        Scanner input = new Scanner (System.in);
//
//        int num = -1;
//
//        while (num < 0) {
//            System.out.print("Please enter a positive number: ");
//            if (input.hasNextInt()) {
//                num = input.nextInt();
//            } else {
//                System.out.println("That is an invalid input");
//                input.next();
//            }
//        }
//
//        System.out.println(num);


        // write a command line application that prompts
        // the user to enter 2 numbers and an operator -, +, or *
        // and preforms the operation on the 2 numbers, output result

//        System.out.println("Enter 2 numbers and a math operator to preform the operation.");
//        Scanner scanner = new Scanner(System.in);
//        Integer first = null;
//        Integer second = null;
//
//        // get first number
//        while (first == null) {
//            System.out.print("Enter first number: ");
//            if (scanner.hasNextInt()) {
//                first = scanner.nextInt();
//            } else {
//                scanner.next();
//                System.out.println("please enter a valid number");
//            }
//        }
//
//        // get second number
//        while (second == null) {
//            System.out.print("Enter second number: ");
//            if (scanner.hasNextInt()) {
//                second = scanner.nextInt();
//            } else {
//                scanner.next();
//                System.out.println("please enter a valid number");
//            }
//        }
//
//        System.out.println("Enter math operator");
//        boolean repeat = true;
//        while (repeat) {
//            char operator = scanner.next().charAt(0);
//            if (operator != '+' && operator != '-' && operator != '*') {
//                System.out.print("Wrong operator, try again: ");
//            } else {
//                repeat = false;
//                System.out.println(operator == '+' ? (first + second)
//                        : ( operator == '-' ? (first - second) : (first * second)));
//            }


//            switch (operator) {
//                case '+':
//                    System.out.println("Result: " + (first + second));
//                    repeat = false;
//                    break;
//                case '-':
//                    System.out.println("Result: " + (first - second));
//                    repeat = false;
//                    break;
//                case '*':
//                    System.out.println("Result: " + (first * second));
//                    repeat = false;
//                    break;
//                default:
//                    System.out.print("Wrong operator, try again: ");
//                    break;
//            }
//        }


        // write a command line app that will prompt the
        // user to create a password, then go into a loop
        // and keep prompting the user to enter the pass
        // again until it matches the original password.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a valid password");
        String password = scan.next();
        String password2 = null;
        while (!password.equals(password2)) {
            System.out.print("please enter current password: ");
            password2 = scan.next();
            if (!password.equals(password2)) {
                System.out.println("Passwords are not match, re-enter password");
            }
        }
        System.out.println("Accepted");
    }
}
