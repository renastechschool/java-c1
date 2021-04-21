import java.io.FileNotFoundException;
import java.io.UncheckedIOException;
import java.util.Scanner;

@SuppressWarnings("All")

public class ExceptionsTwo {

    public static void main(String[] args) {
        System.out.println("The code is starting");

        String[] ourStrings = { "hello", "world" };

        int userInput = 3;

        try {
            System.out.println(ourStrings[userInput]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your number is out of range," +
                    " please enter a number lower than " + ourStrings.length + " to get a word");
        }

        System.out.println("The code finished");
    }

    static void findFile() throws FileNotFoundException {
        throw new FileNotFoundException("***our custom message***");
    }

}

@SuppressWarnings("all")


class MultipleExceptions1 {
    public static void main(String[] args) {
        System.out.println("code starting");
        try {
            int input = 7;
            if (input > 6) {
                findFile();
            } else {
                indexer(input);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds exception throw");
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception throw");
        }
        System.out.println("code ending");
    }

    static void indexer(int index) throws ArrayIndexOutOfBoundsException {
        if (index > 5) {
            throw new ArrayIndexOutOfBoundsException("That number is toooo high!");
        }
    }
    static void findFile() throws FileNotFoundException {
        throw new FileNotFoundException("We could not find your file");
    }
}

@SuppressWarnings("all")
class FinallyBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("!!!EXCEPTION!!!");
            System.out.println(1/0); // finally block will ALWAYS RUN
        } finally {
            System.out.println("The try catch blocks have finished.");
        }

    }
}


@SuppressWarnings("all")
class CustomExceptions123 {
    public static void main(String[] args) {

        boolean tookTooLong = true;
        int number = 13;

        try {
            if (tookTooLong) {
                throw new TookTooLongToComeUpWithANameException();
            }
            if (number == 13) {
                throw new NumberIDontLikeException();
            }
        } catch (TookTooLongToComeUpWithANameException e) {
            System.out.println("you took too long to come up with a name!");
        } catch (NumberIDontLikeException e) {
            System.out.println("I dont like that number :(");
        }

    }
}

class TookTooLongToComeUpWithANameException extends Exception {}
class NumberIDontLikeException extends Exception {}


// write a custom exception with any name you like and use it in a try catch block
class CouldNotFindExceptionException extends Exception {}
class FoundExceptionException extends Exception {}

class CustomExceptionExample123 {
    public static void main(String[] args) {
        boolean didFindException = true;
        try {
            if (didFindException) {
                throw new FoundExceptionException();
            } else {
                throw new CouldNotFindExceptionException();
            }
        } catch (FoundExceptionException e) {
            System.out.println("EXCEPTION: found an exception");
        } catch (CouldNotFindExceptionException e) {
            System.out.println("EXCEPTION: could not find an exception");
        }
    }
}

