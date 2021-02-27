public class Arrays {
    public static void main(String[] args) {
           //     index: 0  1  2
//        int[] myInts = { 1, 2, 3 };
//
//        String[] myStrings = {"abc", "123", "xyz"};
//        System.out.println("value at index 0 is: " + myStrings[0]);

//        int[] manyInts = { 1, 8, 4, 11, 7, 9, 8, 3, 5 };
//
//        if (manyInts[4] > manyInts[3]) {
//            System.out.println("4th index is larger than 3rd index");
//        } else {
//            System.out.println("!!!");
//        }

//        String[] names = new String[3]; // { null, null, null }
//
//        names[0] = "Orion";
//        names[1] = "Tom";
//        names[2] = "David";
//        names[3] = "Ana";
//
//        System.out.println("result: " + names[2]);

        // starting with int[] ints = new int[4]; use a loop to create the array {1, 2, 3, 4}

//        int[] ints = new int[4];
//        for (int i = 0; i < 4; i++) {
//            ints[i] = i + 1; // #1 what is i?
//        }
//
//        System.out.println(ints[0]);
//        System.out.println(ints[1]);
//        System.out.println(ints[2]);
//        System.out.println(ints[3]);

//        String[] myStrings = {"hello", "world", "java", "rocks"};

//        for (int i = 0; i < myStrings.length; i++) {
//            System.out.println( myStrings[i] );
//        }

//        for (int i = 3; i >= 0; i--) {
//            System.out.println( myStrings[i] );
//        }

//        String[] myStrings = {"hello", "world", "java", "rocks"};
//
////        for (int index = 0; index < myStrings.length; index++) {
////            myStrings[index] += myStrings[index];
////        }
//        for(int index=0; index < myStrings.length; index++) {
//            myStrings[index] += "hello";
//        }
//        System.out.println( myStrings[3] );

        boolean[] myBools = { true, false, true };
        for(int index=0; index < myBools.length; index++) {
            if (myBools[index]) {
                System.out.println("green");
            } else  {
                System.out.println("blue");
            }
        }

    }
}
