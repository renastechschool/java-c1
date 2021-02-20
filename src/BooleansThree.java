@SuppressWarnings("all")
public class BooleansThree {
    public static void main(String[] args) {
        {
            boolean myTrueBoolean = true;
            boolean myFalseBoolean = false;

//        boolean myBool = 5 == 4;
//        boolean myBool = 5 > 4;
//        boolean myBool = 5 != 5;
//        boolean myBool = !(5 >= 5) || (5 != 5);

            { //code block start

            } //code block end

//        boolean myBool = false;
//
//        if (myBool) {
//            // if code block
//            myBool = true;
//            System.out.println("if code block");
//        } else if (myBool == true) {
//            // else if code block
//            System.out.println("else if code block");
//        } else {
//            // else code block
//            System.out.println("else code block");
//        }

        }

//        When x is even, output “booleans are cool”
//        When x is odd
//          and greater than 20, output “I’m learning java”
//          and less than 10, output “too many conditions”
//          and between 10 and 20, output the value of x

//        String output = "";
        // your code here
        int x = 11;
        // check if x is even
        if (x % 2 == 0) {
            System.out.println("Booleans are cool");
            // check x greater than 20
        } else if (x > 20) {
            System.out.println("I am learning java");
            // check x less than 10
        } else {
            System.out.println(x < 10 ? "too many conditions" : x);
        }
//        // check if x is even
//        if (x % 2 == 0) {
//            System.out.println("Booleans are cool");
//        // check x greater than 20
//        } else if (x > 20){
//            System.out.println("I am learning java");
//        // check x less than 10
//        }else if (x < 10){
//            System.out.println("too many conditions");
//        }else {
//            System.out.println(x);
//        }

            // 7 % 3 : ### ### (#) = 1
            // 11 % 4 : $$$$ $$$$ ($$$) = 3
            // (even check) 12 % 2 == 0 : && && && && && && () = 0
            // (odd check) 11 % 2 != 0 : @@ @@ @@ @@ @@ (@) = 1
            // (odd check alt) 11 % 2 == 1

//        System.out.println(11 % 4);


        //  <condition> ? <true result> : <false result>

        //         conditon     true              false
//        String foo = 1 != 1 ? "it was true" : "it was false";
//
//        System.out.println(foo);

    }
}
