import java.util.*;
import java.util.Arrays;

@SuppressWarnings("all")

public class CollectionsTwo {

    public static void main(String[] args) {
//        CollectionsTwo tools = new CollectionsTwo();
//        List<String> myList = Arrays.asList("xJXaxVa", "RxoXcxKs", "HXeLlxO WoRXlD");
//        System.out.println( tools.noX( tools.lower(myList) ) );

        // write some code to create a List<String>
        // of colors example "red" "blue" ect
        // and print out all the colors.

        List<String> myList = Arrays.asList("red", "yellow", "purple");
        myList.forEach(str -> System.out.println(str));

//        for (String str: myList) {
//            System.out.println(str);
//        }

        // create a List<String> of random quotes.
        // write a command line application to
        // prompt the user for an index between 0 and n and
        // prints the quote at that index,
        // if they enter a bad index print "index out of bounds"

        List<String> myQuotes = Arrays.asList(
            "The grass is always greener on the other side",
            "Java Rocks",
            "Whether you think you can or you think you can't, you're right.",
            "Be yourself; everyone else is already taken.",
            "Aspire to inspire before we expire"
        );
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter an index between 0 and " + (myQuotes.size() - 1) + ": ");
            if (scan.hasNextInt()) {
                int result = scan.nextInt();
                if (result < myQuotes.size() && result > -1) {
                    System.out.println(myQuotes.get(result));
                } else {
                    System.out.println("Pease enter a valid index");
                }
            } else {
                System.out.println("Pease enter a valid integer");
                scan.next();
            }
        }
    }


    // Given a list of integers,
    // return a list where each integer is multiplied with itself.
    public List<Integer> square(List<Integer> nums) {
        List returnList = new ArrayList<Integer>();
        for (int num : nums) {
            returnList.add(num * num);
        }
        return returnList;
    }


    // Given a list of strings,
    // return a list where each string has "*" added at its end.
    public List<String> addStar(List<String> strings) {
        List<String> myList = new ArrayList();
        for (String a : strings) {
            myList.add(a + "*");
        }
        return myList;
    }


    // Given a list of strings,
    // return a list where each string is replaced by
    // 3 copies of the string concatenated together.
    // [one, two] => [oneoneone, twotwotwo]
    public List<String> copies3(List<String> strings) {
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            list.add( string + string + string );
        }
        return list;
    }


    // Given a list of strings,
    // return a list where each string has "y" added at its start and end.
    // "my string" -> "ymy stringy"
    public List<String> moreY(List<String> strings) {
        List<String> returnList = new ArrayList();
        for (int i = 0; i < strings.size(); i++) {
            returnList.add("y" + strings.get(i) + "y");
        }
        return returnList;
    }



    // Given a list of integers,
    // return a list where each integer is added
    // to 1 and the result is multiplied by 10. (number + 1) * 10
    public List<Integer> math1(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            list.add( (nums.get(i) + 1) * 10 );
        }
        return list;
    }


    // Given a list of non-negative integers,
    // return an integer list of the rightmost digits. (Note: use %)
    public List<Integer> rightDigit(List<Integer> nums) {
        List<Integer> returnList = new ArrayList<>();
        for (Integer i : nums) {
            returnList.add(i % 10);
        }
        return returnList;
    }

    // 11 % 10 ? 1
    // 493 % 10 ?  490 / 10 + 3



    // Given a list of strings,
    // return a list where each string is converted
    // to lower case (Note: String toLowerCase() method).
    public List<String> lower(List<String> strings) {
        List<String> returnList = new ArrayList<>();
        int i = 0;
        while (i < strings.size()) {
            returnList.add(strings.get(i).toLowerCase());
            i++;
        }
        return returnList;
    }


    // Given a list of strings,
    // return a list where each string has all its "x" removed.
    public List<String> noX(List<String> strings) {
//        List<String> returnList = new ArrayList<>();
//        int i = 0;
//        while (i < strings.size()) {
//            returnList.add(strings.get(i).replace("x", "") );
//            i++;
//        } [ex, xdre, xd]
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }
}
