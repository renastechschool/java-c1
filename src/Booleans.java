@SuppressWarnings("")
public class Booleans {
    public static void main(String[] args) {
//        String myString = "my string";
//        char myChar = 's';
//        int myInt = 1;
//        double myDouble = 1.1;
//        boolean myTrueBoolean = true;
//        boolean myBoolean = myChar != 's'; // false
//
//        // !    "not"
//        // !=   "not equals"
//
//        boolean a = myBoolean || false; // false
//        boolean b = !myTrueBoolean; // false
//        boolean c = !true || !!false; // false
//        boolean d = !true == !!false; // true
//
//        System.out.println("The boolean value of a is: " + a);
//        System.out.println("The boolean value of b is: " + b);
//        System.out.println("The boolean value of c is: " + c);
//        System.out.println("The boolean value of d is: " + d);
//
//        //                  f    f    t
//        boolean myNewBool = a || c || d; // true
//
//        int int1 = 3;
//        int int2 = 11;
//        int int3 = 5;
//        boolean myResult = ( (!false || 1 > int1) || (!true && !!false) ) == false ; // false


        boolean myCondition = false;

        // java keywords: true false

        /*
        if (expression) { true -> (into code)  false -V (skip)
          do this code block if the expression is true
        }
         */

        int orionsInt = 10;
        int erimsInt = 15;
        boolean myBool = false;
        // start with one 'if'
        // then as many 'else if' as you need
        // then can end with one 'else'

        if (orionsInt == 10 || erimsInt == 10) {
            System.out.println("!!!!");
        } else if (orionsInt != erimsInt) {
            System.out.println("????");
        } else if (1 < 0) {
            System.out.println("####");
        } else {
            System.out.println("java");
        }


        if (1 + 1 == 2) {
            System.out.println("1 + 1 is 2");
        } else {
            System.out.println("1 + 1 is not 2");
        }


    }
}
