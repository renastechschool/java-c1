import java.util.*;
import java.util.Arrays;
import java.util.Collections;
@SuppressWarnings("all")
public class CollectionsThree {}

// create a command line application that prompts the user to
// enter quotes until they enter "exit", then print out all the
// quotes the user entered line by line. store quotes in a List<String>
class ColprobOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> quotes = new LinkedList<>();

        boolean cont = true;
        while (cont) {
            // prompt user for quote
            System.out.println("Please enter a quote, or exit to leave:");

            // get users input
            String input = scan.nextLine();

            // check if input was "exit", leave
            if (input.equals("exit")) {
                cont = false;
            }
            // else add it to the list then re prompt
            else {
                quotes.add(input);
            }
        }

        quotes.sort(
                (a, b) -> a.length() - b.length()
        );

        // print every quote line by line
        quotes.forEach(
                quote -> System.out.println(quote)
        );

    }
}





// method parts:

// *return type
// *name
// *body (code block)
// *parameters
// access modifiers
// static

// accessMod static returnType name(ParamType paramName) {body}





// write a method concatLists(list, string) that will
// take a list of strings and another string and return a list where the
// extra string is concatenated onto the strings in the list.
// example: (["abc", "xyz"], "my string") -> ["abcmy string", "xyzmy string"]
class ColProbTwo {
    static List<String> concatLists(List<String> list, String string) {
        List<String> results = new ArrayList();
        for (String s : list) {
            results.add( s + string );
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("one", "two", "three");
        System.out.println(concatLists(myList, " number"));
    }
}

// inherit the following two interfaces:
interface MyInterfaceOne {
    void myVoidMethod();
    String myStringMethod();
    List<String> myList();
    boolean trueOrFalse();
}

interface MyInterfaceTwo {
    MyInterfaceOne builderOne();
    MyInterfaceTwo builderTwo();
    boolean isTrueOrFalse(MyInterfaceOne obj);
}

class MyClassDemo implements MyInterfaceOne, MyInterfaceTwo {
    // MyInterfaceOne methods
    public void myVoidMethod() {}
    public String myStringMethod() {
        return "java rocks";
    }
    public List<String> myList() {
        return null;
    }
    public boolean trueOrFalse() {
        return true;
    }

    // MyInterfaceTwo methods
    public MyInterfaceOne builderOne() {
        return new MyClassDemo();
    }
    public MyInterfaceTwo builderTwo() {
        return new MyClassDemo();
    }
    public boolean isTrueOrFalse(MyInterfaceOne obj) {
        return obj.trueOrFalse();
    }
}

// List listName = new ArrayList();






// write a method listsToMap(List<String> keys, List<Integer> values)
// that takes 2 Lists of equal size and returns a
// map using the first lists as keys and the second list as values

// array -> array[index]
// map -> map[key]

class ColProbFour {
    public static Map<String, Integer> listsToMap(List<String> keys, List<Integer> values) {
        Map<String, Integer> myMap = new HashMap();
        for (int i = 0; i < values.size(); i++) {
            myMap.put(keys.get(i), values.get(i));
        }
        return myMap;
    }

    public static void main(String[] args) {
        List<String> keys = Arrays.asList("one", "two", "javarocks");
        List<Integer> values = Arrays.asList(12, 45, 10);

        Map myMap = listsToMap(keys, values);

        System.out.println("javarocks holds value: " + myMap.get("javarocks"));
        myMap.replace("one", 123);
        System.out.println("one holds value: " + myMap.get("one"));
    }
}



// write a method to reverse the order of a List

class ColProbFive {
    public List reverse(List list) {
//        Collections.reverse(list); // easy way
        List returnList = new ArrayList();
        for (int i = list.size() - 1; i <= 0; i--) {
            returnList.add(list.get(i));
        }
        return returnList;
    }
    public static void main(String[] args) {
        // Collections.reverse demo
        List list = Arrays.asList(1, 2, 3);
        System.out.println(list);
        System.out.println("reversing list");
        Collections.reverse(list);
        System.out.println(list);
    }
}







// create a class Account that has private properties
// money *double with getter and method addMoney(amount) that returns the amount of money left
// like: double addMoney(double amount);
// accountId *string with getter, no setter, set in constructor
// now create a List<Account> and write a command line application
// to prompt the user to create an account or add money to an account
// create - ask user for account ID and create an Account with that id and add to list
// add money to an account - ask user for account ID and amount of money to add;
// add money to that account and tell the user the new balance or give error message if bad account ID







// create a method List<String> toList(String[] arr)
// that takes an array of strings and returns a List<String> of the same strings
class ColProbSix {
    List<String> toList(String[] arr) {
        return Arrays.asList(arr);
//        List list = new ArrayList();
//        for (String string : arr) {
//            list.add(string);
//        }
//        return list;
    }
}










// write a method lengthFinder(list) that takes a list of int[] and returns a new list of each int[] length
class ColProbSeven { // [ {1, 2}, {1}, {1, 2, 3}]
    public List<Integer> lengthFinder(List<Integer[]> list) {
        List<Integer> returnList = new ArrayList();

        // List<Integer> myInts; Collection
        // Integer[] myIntsTwo; Array

        for (Integer[] ints : list) {
            returnList.add(ints.length);
        }
        return returnList;
    }
}





// write a method switchPairs(list) that takes a List<String> and returns
// a new List<string> with every 2 strings switched with each other
// example: ["one", "two", "three", "four", "five"]
// becomes: ["two", "one", "four", "three", "five"]
class ColProbEight {
    public static List<String> switchPairs(List<String> list) {
//        for (int i = 0; i < list.size() - 1; i += 2) {
//            Collections.swap(list, i, i + 1);
//        }
//        return list;
        List<String> returnList = new ArrayList();
        for (int i = 0; i < list.size() - 1; i += 2) {
            returnList.add(list.get(i + 1));
            returnList.add(list.get(i));
        }

        if (list.size() % 2 == 1) {
            returnList.add(list.get(list.size() - 1));
        }
        return returnList;
    }

    public static void main(String[] args) {
        List<String> myList =
                switchPairs(Arrays.asList(
                        "one", "two", "three", "four", "five"
                ));
        System.out.println(myList);
    }
}







// write a method filterOut(list, string) that takes a List of String and
// another String and returns a new List with any matching string removed

class ColProbNine {
    public static List<String> filterOut(List<String> list, String string) {
        List<String> returnList = new ArrayList();
        for (String str : list) {
            if (!str.equalsIgnoreCase(string)) {
                returnList.add(str);
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        List<String> myList =
                filterOut(Arrays.asList(
                        "one", "two", "three", "four", "five"
                ), "two");
        System.out.println(myList);
    }
}



// write a method that takes a List of ints and removes any duplicates
class ColProbTen {
    public static List<Integer> removeDups(List<Integer> list) {
        Set<Integer> set = new HashSet();
        for (int i : list) {
            set.add(i);
        }
        List<Integer> returnList = new ArrayList();
        returnList.addAll(set);

        return returnList;
    }

    public static void main(String[] args) {
        List<Integer> myList =
                removeDups(Arrays.asList(
                        1, 1, 3, 2, 5, 4, 2 , 4, 5, 3, 5
                ));
        System.out.println(myList);
    }
}

