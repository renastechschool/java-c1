public class Loops {
    public static void main(String[] args) {

//        int count = 0;
//
//        while (count < 10) {
//            System.out.println("count is: " + count);
//            count++; // same as: count = count + 1;
//        }
//
//        System.out.println("the end and count is: " + count);

        // count++ : count = 5 -> output 5 then do +1
        // ++count : count = 5 -> +1 then output 6

//        int count = 5;
//
//        while (count > 0) {
//            System.out.println("count is: " + count--);
//        }

//        int x = 0;
//
//        while (++x < 15) {
//            System.out.println("x is " + x);
//            if (x % 3 == 0) {
//                x++;
//            }
//        }

//        boolean bool = false;
//
//        do {
//            System.out.println("printing a message");
//        } while (bool);

//        int count = 0;
//        do {
//            System.out.println("count is: " + count++);
//        } while (count < 5);


        //(declare counter; condition; increment/decrement counter)
//        for (int x = 0; x < 5; x++) {
//            System.out.println("x = " + x);
//        }

        // write any loop that outputs even numbers
        // 0 through 10 : inclusive
        // between 0 and 10 : exclusive

//        int x;
//        for (x = 0; x <= 10; x++) {
//            if (x % 2 == 0) {
//                System.out.println(x);
//            }
//        }

//        int x = 0; // start our x at 0
//        while (x <= 10) { // check condition, enter code block if true
//            System.out.println("x is " + x); // printing out value of x
//            x += 2; // add 2 to x
//        } // go back to while condition

//        int x = 0;
//        do {
//            System.out.println("x is " + x);
//            x += 2;
//        } while (x <= 10);
                       //               V
//        String helloWorld = "hello world";
//        int index = 0;
//
//        while (index < helloWorld.length()) {
//            System.out.println("char: " + helloWorld.charAt(index));
//            index++;
//        }
        // 0 1 2 3 4
        // h e l l o
                      //012345
//        String hello = "qwerty";
//        System.out.println(  hello.charAt(2) );

        // pyramid challenge
//        for (int x = 0; x < 5; x++) {
//            for(int i = 0; i <= x; i++) {
//                System.out.print("O");
//            }
//            System.out.println();
//        }
//
        //                  01234
//        System.out.println("abcd".substring(2, 4));

//        String str = "hihi";
//        int numberOfHi = 0;
//        for(int i = 0; i < str.length(); i++) {
//            System.out.println("looking at: " + str.substring(i, i + 2));
//            if (str.substring(i, i + 2).equals("hi")) {
//                numberOfHi++;
//            }
//        }
//        System.out.println("The number of hi is: " + numberOfHi);


        /*
      	    write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
				use str.charAt(index) => char at that index
         */

//        String java = "Java";
//        int index = java.length() - 1;
//        String result = "";
//        while (index >= 0) {
//            System.out.println("looking at: " + java.charAt(index));
//            result += java.charAt(index);
//            index--;
//        }
//        System.out.println(result);

//        //                     01234
//        String haluksString = "haluk";
//        System.out.println(  haluksString.charAt(3)  ); // u



        // write a program that starts with the string "hello world"
        // and outputs a string with every other char removed, ie: "hlowrd"
        // use charAt()

//        String hello = "hello world";
//        String result = "";
//        for (int i = 0; i < hello.length(); i+=2) {
//            result = result + hello.charAt(i);
//        }
//        System.out.println(result);



        // Print integers 1 to N, but print “Fizz” if an integer is
        // divisible by 3, “Buzz” if an integer is divisible by 5,
        // and “FizzBuzz” if an integer is divisible by both 3 and 5.

//        int a;
//        for(a = 1; a <= 20; a++) {
//            if (a % 3 == 0 && a % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (a % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (a % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(a);
//            }
//        }

        // pyramid challenge to 6

//        for (int i = 0; i < 6; i++) {
//            for (int a = 0; a < i; a++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 6; i++) {
            for (int a = 6 - i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int a = 0; a < i * 2 - 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}









