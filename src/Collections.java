import java.util.*;

public class Collections {
    public static void main(String[] args) {

        List<String> myStrings = new LinkedList<>();
        System.out.println(myStrings.isEmpty());
        myStrings.add("hello");
        myStrings.add("world");
        myStrings.add(1, "new");

        myStrings.forEach(variableName -> System.out.println(variableName));
        //System.out.println(myStrings);


        // use forEach method to sum all values
        List<Integer> myInts = new ArrayList();
        myInts.add(1);
        myInts.add(2);
        myInts.add(5);
        myInts.add(1);
        myInts.add(7);
        myInts.add(13);

        int total = 0;

        for (Integer i : myInts) {
            total += i;
        }

        System.out.println(total);






    }
}

// example of using generic types
class GenericWrapper<Generic> {
    // Generic data type variable
    private Generic data;

    public Generic getData() {
        return data;
    }

    public void setData(Generic data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericWrapper<String> string = new GenericWrapper();
        GenericWrapper<Integer> integer = new GenericWrapper();
        GenericWrapper<Boolean> bool = new GenericWrapper();
        string.setData("hello");
        integer.setData(11);
        bool.setData(true);
    }
}
