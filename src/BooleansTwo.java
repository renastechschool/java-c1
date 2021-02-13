@SuppressWarnings("")
public class BooleansTwo {
    public static void main(String[] args) {




//        int start = 1;
//        String message = "";
//        // when start is 0 print "learning java is fun"
//        // when start is less than 10 but not 0 print "hello"
//        // when start is greater than 9 print "hello world"
//
//        if (start == 0) {
//            message = "learning java is fun";
//        } else if (start < 10) {
//            message = "hello";
//        } else {
//            message = "hello world";
//        }
//
//        System.out.println(message);



//        int start = 7;
//        String message = "";
//        // when start is less than 10 and greater than 5 print "abc"
//        // otherwise print "good bye"
//
//        // code here
//        if (start < 10 && start > 5) {
//            message = "abc";
//        } else {
//            message = "good bye";
//        }
//
//        System.out.println(message);



//        int start = 0;
//        String message = "";
//        // when start is greater than 10 print "huge"
//        // when start is less than 10 print "small"
//        // when start is 10 print "it's ten!"
//
//        // code here
//
//
//        System.out.println(message);

        // 9 % 2 = 1: || || || || (|)
        // 6 % 2 = 0: || || || ()
        // 11 % 3 = 2: ||| ||| ||| (||)

        // boolean whatIsThis = 11 % 3 == 2; // true

//        int start = 12;
//        String message = "";
//        // when start is even print "even"
//        // otherwise print start (variable value)
//
//        // code here
//        if (start % 2 == 0) {
//            message = "even";
//        } else {
//            // System.out.println(start);
//            message = "" + start;
//        }
//
//        System.out.println(message);

        // 3 % 2 = 1: || (|)
        // 7 % 2 = 1: || || || (|)

        // start % 2 != 0
        // start % 2 == 1

//        int start = 17;
//        String message = "";
//        // when start is odd print "odd numbers rock"
//        // when start is even and greater than 10 print "large"
//        // otherwise print "hello world"
//
//        // code here
//        if (start % 2 == 1) {
//            message = "odd numbers rock";
//        } else if (start > 10) {
//            message = "large";
//        } else {
//            message = "hello";
//        }
//
//        System.out.println(message);



        int start = 7;
        String message = "";
        // when start is divisible by 3 and 4 print "super star"
        // otherwise
          // when start is divisible by 3 print "hello world"
          // when start is divisible by 4 print "java rocks"
          // otherwise print "good bye"

        // code here
        if (start % 3 == 0 && start % 4 == 0) {
            message = "super star";
        } else if (start % 3 == 0) {
            message = "hello world";
        } else if (start % 4 == 0) {
            message = "java rocks";
        } else {
            message = "good bye";
        }

        System.out.println(message);

    }
}
