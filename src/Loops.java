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
        for (int x = 0; x < 5; x++) {
            for(int i = 0; i <= x; i++) {
                System.out.print("O");
            }
            System.out.println();
        }



    }
}
