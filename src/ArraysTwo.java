
import java.util.Arrays;

public class ArraysTwo {
    public static void main(String[] args) {

//        int[] myInts = {1,2,3};
//        String[] myStrings = {"hey", "its", "java"};
//        boolean[] myBooleans = {true, false};

//        for (int myInt: myInts) {
//           myInt = 0;
//           System.out.println(myInt);
//        }
//        System.out.println(myInts[1]);

//        for (int i = 0; i < myStrings.length; i++) {
//            System.out.println(myStrings[i]);
//        }
//
//        for (String myString : myStrings) {
//            System.out.println( myString );
//        }


//        myInts[1] = myInts[2]; // {1,3,3}
//        System.out.println(myInts[1]);




















        // write code to print the sum of values in int[] ints.

//        int[] ints = {3,1,3};
//        int sum = 0;
//        for (int i : ints) {
//            sum += i;
//        }
//        System.out.println(sum);







        // write code to print the average value in int[] ints.
        // average = sum / total number of values,
        // 1,2,3 has sum of 6 and total of 3 numbers
        // so 6/3 = 2 average

//        int[] numbers = {1,2,4};
//        double sum = 0;
//        for (int i : numbers) {
//            sum = sum + i;
//        }
//        System.out.println(sum/numbers.length);


        // write code to print "yes" or "no" if int[] ints
        // contains int x.
//        int[] ints = {1,2,3};
//        int x = 2;
//        //expect "no"
//        boolean result = false;
//        for (int i : ints) {
//            if (i == x) {
//                result = true;
//            }
//        }
//        System.out.println(result ? "yes" : "no");



        // write code to print the index and value of the
        // highest number in int[] ints. all positive numbers
//        int[] ints = {3,2,4,15,2,7,3,1,8,9,0};
//        int highestIndex = 0;
//
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] > ints[highestIndex]) {
//                highestIndex = i;
//            }
//        }
//        System.out.println("highest is: " +
//                ints[highestIndex] + " and index is: " + highestIndex);

        // without index:
//        for (int i : ints) {
//            if (i > highest) {
//                highest = i;
//            }
//        }
//        System.out.println("the highest is: " + highest);





        // write code to create a new int[] where are values
        // in int[] ints are squared. (number * itself)
//        int[] ints = {1,2,3}; // new array = {1,4,9}
//        int[] newInts = new int[ints.length];
//        for (int i = 0; i < ints.length; i++) {
//            newInts[i] = ints[i] * ints[i];
//        }
//        System.out.println( newInts[0] );
//        System.out.println( newInts[1] );
//        System.out.println( newInts[2] );




        // write code to create a new String[] that is the
        // reverse of String[] strings.
//        String[] strings = {"one", "two", "three"};
//        String[] newStrings = new String[strings.length];
//        // expectation: {"three", "two", "one"}
//
////        for (int i = strings.length - 1; i >= 0; i--) {
//        for (int i = 0; i < strings.length; i++) {
////            newStrings[strings.length - i - 1] = strings[i];
//            newStrings[i] = strings[strings.length - i - 1];
//        }
//        System.out.println(newStrings[0]);
//        System.out.println(newStrings[1]);
//        System.out.println(newStrings[2]);






        // write code to print the index and value of the
        // lowest number in int[] ints. (all positive under 100)
//        int[] ints = {4,2,8,4,3}; // expect: number: 2 index: 1
//        int lowestIndex = 0;
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[lowestIndex] > ints[i]) {
//                lowestIndex = i;
//            }
//        }
//        System.out.println("lowest is: " + ints[lowestIndex]);
//        System.out.println("index is: " + lowestIndex);





        // write code to print the FizzBuzz result of each
        // number in int[] ints.
        // (n/3=fizz, n/5=buzz, both=fizzbuzz, none=n)
//        int[] ints = {4, 5, 9, 15};
        // 4
        // buzz
        // fizz
        // fizzbuzz

//        for (int i : ints) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }



                      //   (1 > 4 ? "!!!" : "???") = "???"
        // ternary recap: (condition) ? (true output) : (false output)
        // write code to print "yes" or "no" if int[] ints1
        // is the same as int[] ints2.
//        int[] ints1 = {1,2,3};
//        int[] ints2 = {1,1,3};
//        //expected "no"
//        boolean isSame = true;
//        if (ints1.length != ints2.length) {
//            isSame = false;
//        } else {
//            for (int i = 0; i < ints1.length; i++) {
//                if (ints1[i] != ints2[i]) {
//                    isSame = false;
//                }
//            }
//        }
//        System.out.println(isSame ? "yes" : "no");






        // write code to print "yes" or "no" if int[] ints
        // contains only consecutive values.
        // example: {1,2,3} = "yes", {3,1,2} = "no"
//        int[] ints = {2,2,4}; // expect "yes"
//        boolean isConsecutive = true;
//        for (int i = 0; i < ints.length - 1; i++) {
//            if (ints[i + 1] != ints[i] + 1) {
//                isConsecutive = false;
//            }
//        }
//        System.out.println(isConsecutive ? "yes" : "no");

        //nested ternary example:
//        int i = 3;
//                //1 = "hi", 2 = "bye", 3 = "go away"
//        System.out.println( i == 1 ? "hi" : (i == 2 ? "bye" : "go away") );






        // write code to print "yes" or "no" if the sum of the first
        // two values in int[] ints is contained in int[] ints.
        // example: {2,3,6,2,3,5} = "yes"
        // because 2 + 3 = 5 and 5 is in the array.
//        int[] ints = {2,3,6,2,3,5};
//
//        if (ints.length < 2) {
//            System.out.println("invalid input");
//            return;
//        }
//
//        boolean myBool = false;
//        int sum = ints[0] + ints[1];
//
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] == sum) {
//                myBool = true;
//            }
//        }
//
//        System.out.println(myBool ? "yes" : "no");



        // write code to print the longest value in String[] strings.
//        String[] strings = {};

//        if (strings.length == 0) {
//            System.out.println("invalid input");
//            return;
//        }
//
//        // first solution
//        int highestIndex = 0;
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].length() > strings[highestIndex].length()) {
//                highestIndex = i;
//            }
//        }
//        System.out.println(strings[highestIndex]);
//        // solution two
//        String longest = strings[0];
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].length() > longest.length()) {
//                longest = strings[i];
//            }
//        }
//        System.out.println(longest);



        // write code to create a boolean[] from int[] ints
        // where even = true and odd = false.
        // {1, 2, 3} -> {false, true, false}
//        int[] ints = {0, 4, 7};
//        boolean[] myBools = new boolean[ints.length]; // {false, false, false}
//        boolean myBool = false; // false

//        for (int i = 0; i < ints.length; i++) {
//            myBools[i] = ints[i] % 2 == 0;
//        }

//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] % 2 == 0) {
//                myBools[i] = true;
//            } else {
//                myBools[i] = false;
//            }
//        }

        // test method one
        // System.out.println( Arrays.toString(myBools) );

        // test method two
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(myBools[i]);
//        }










        // write code that prints the difference between the highest
        // number in int[] ints and the lowest number in int[] ints.
        // example: {2,7,4,1,8} = 8 - 1 = 7
//        int[] ints = {2};
//
//        if (ints.length < 1) {
//            return;
//        }
//
//        int highest = ints[0], lowest = ints[0];
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] > highest) {
//                highest = ints[i];
//            }
//            if (ints[i] < lowest) {
//                lowest = ints[i];
//            }
//        }
//        System.out.println(highest - lowest);








        // write code to print out the highest and the second highest
        // numbers in int[] ints.
        // example {1,6,3,8,3,9,4} -> 9 and 8
        int[] myint = {8,9,3,9,8,8,4};
        Arrays.sort(myint);
        int index = myint.length - 1, fbig = myint[index], sbig = fbig;
        while (fbig == sbig && index >= 0) {
            sbig = myint[index--];
        }

//
//        for (int x : myint) {
//            if (x > fbig) {
//                sbig = fbig;
//                fbig = x;
//            } else if (x > sbig) {
//                sbig = x;
//            }
//        }
        System.out.println(fbig + " and " + sbig);
    }














}
