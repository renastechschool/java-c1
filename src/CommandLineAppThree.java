import java.util.*;

public class CommandLineAppThree {
    public static void main(String[] args) {

        // write a command line application for a fruit stand.
        // when the user starts the program they will be prompted
        // to enter how much money they have, get this input and
        // store it. Then prompt the user a menu to buy:
        // a) apple - 2$
        // b) banana - 1$
        // c) pineapple - 5$
        // l) leave store
        // keep track of how many apples, bananas and pineapples
        // the user has bought, dont let them spend more money
        // then they started with and when they leave, tell them
        // how many of each fruit they have bought and how much
        // money they have left

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("How much do you have? ");
//        double money = scan.nextDouble();
//        double balance = 0;
//        boolean cont = true;
//        int apple = 0, banana = 0, pineapple = 0;
//
//        while (cont) {
//            // prompt menu
//            System.out.println("You have $" + (money - balance) + " to spend.");
//            System.out.println("You can choose from the menu: ");
//            System.out.println("a) apple - 2$");
//            System.out.println("b) banana - 1$");
//            System.out.println("c) pineapple - 5$");
//            System.out.println("l) leave store");
//            // get users input
//            char userInput = scan.next()
//                    .toLowerCase() // "ABC" -> "abc"
//                    .charAt(0); // "acd" -> 'a'
//
//            switch (userInput) {
//
//                // buy apple
//                case 'a':
//                    if (balance + 2 <= money) {
//                        System.out.println("You add an apple to your cart.");
//                        balance += 2;
//                        ++apple; // apple++
//                        System.out.println("Your balance is: $" + balance);
//                    } else {
//                        System.out.println("You do not have sufficient " +
//                                "funds to buy another apple.");
//                    }
//                    break;
//                // buy banana
//                case 'b':
//                    if (balance + 1 <= money) {
//                        System.out.println("You add a banana to your cart.");
//                        balance++;
//                        ++banana;
//                        System.out.println("Your balance is: $" + balance);
//                    } else {
//                        System.out.println("You do not have sufficient " +
//                                "funds to buy another banana.");
//                    }
//                    break;
//                // buy pineapple
//                case 'c':
//                    if (balance + 5 <= money) {
//                        System.out.println("You add a pineapple to your cart.");
//                        balance += 5;
//                        ++pineapple;
//                        System.out.println("Your balance is: $" + balance);
//                    } else {
//                        System.out.println("You do not have sufficient " +
//                                "funds to buy another pineapple.");
//                    }
//                    break;
//                // leave
//                case 'l':
//                    cont = false;
//                    break;
//                // default wrong input message
//                default:
//                    System.out.println("You have entered invalid " +
//                            "input. Please try again");
//            }
//        }
//
//        System.out.println("########################");
//        System.out.println("Thanks for shopping with us.");
//        System.out.println("apples: x" + apple + " $" + apple * 2);
//        System.out.println("bananas: x" + banana + " $" + banana);
//        System.out.println("pineapples: x" + pineapple + " $" + pineapple * 5);
//        System.out.println("Total: $" + balance);
//        System.out.println("Your change is: $" + (money - balance));
//        System.out.println("Please come again!");
//        System.out.println("########################");







        // prompt the user for numbers adding up to 50 until the
        // sum of all the user's numbers is 50 or over,
        // print out "success, your numbers add up to 50"
        // for a sum of 50, else print out:
        // "fail, your numbers sum is over 50"

//        Scanner scan = new Scanner(System.in);
//        int total = 0;
//
//        while (true) {
//            System.out.println("enter a number please: ");
//            int num;
//            if (scan.hasNextInt()) {
//                num = scan.nextInt();
//            } else {
//                num = 0;
//                String error = scan.next();
//                System.out.println(error + " is invalid. Please enter a valid number.");
//            }
//            total += num;
//            if (total >= 50) {
//                break;
//            }
//        }
//
//        if (total == 50)
//            System.out.println("success, your numbers add up to 50");
//        else
//            System.out.println("fail, your numbers sum is over 50");






        // generate a random int between 1 and 100
        // you can use: (Math.random() * 100 + 1)
        // prompt the user for guesses until the guess
        // the random number. if their guess is within 10
        // more or less, tell them "a little too high/low"
        // if their guess is 10 or more off then tell
        // them "much too high/low"

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100.");
        int target = (int)(Math.random() * 100 + 1);
        int guess = -1;
        int guesses = 0;

        // while the user has not guessed correctly yet
        while (guess != target) {
            System.out.print("Please enter your guess: ");
            if (scan.hasNextInt()) {
                guesses++;
                guess = scan.nextInt();
                if (guess != target) {
                    if (guess > target) {
                        if (guess - 10 >= target) {
                            System.out.println(guess + " is much too high.");
                        } else {
                            System.out.println(guess + " is a little too high.");
                        }
                    } else {
                        if (guess + 10 <= target) {
                            System.out.println(guess + " is much too low.");
                        } else {
                            System.out.println(guess + " is a little too low.");
                        }
                    }
                }
            } else {
                System.out.println("Please enter a number.");
                scan.next();
            }
        }

        System.out.println("Congratulations, you have guessed the number " + target + ". It only took you " + guesses + " tries.");




    }
}
