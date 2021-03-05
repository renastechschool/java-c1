public class ArraysThree {
    public static void main(String[] args) {
        // block a
        String stringA = "a";

        { // block b

            { // block c

            }
            String stringB = "b";
            System.out.println(stringB);
        }


        { // block d

        }

        String myString;

        if (1 > 0) {
            myString = "true";
        } else {
            myString = "false";
        }

        System.out.println(myString);



    }


}
