import java.util.Scanner;

public class InheritanceTwo {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int count = 0;
//        boolean cont = true;
//        while (cont) {
//            System.out.println("What would you like to do?");
//            System.out.println("M - make a mouse");
//            System.out.println("A - make an ant");
//            System.out.println("P - make a parrot");
//            System.out.println("X - exit");
//            System.out.print("Please make a selection: ");
//
//            char selection = scan.next()// -> "string"
//                    .toLowerCase()// -> "string"
//                    .charAt(0);// -> char 's'
//            Pet pet;
//            switch (selection) {
//                case 'm':
//                    pet = new Mouse();
//                    System.out.print("Please enter a name for your mouse: ");
//                    pet.setName(scan.next());
//                    System.out.println(
//                            "The store clerk hands " + pet.getName()
//                                    + " to you and " + pet.getName()
//                                    + " says " + pet.makeSound()
//                    );
//                    count++;
//                    break;
//                case 'a':
//                    pet = new Ant();
//                    System.out.print("Please enter a name for your ant: ");
//                    pet.setName(scan.next());
//                    System.out.println(
//                            "The store clerk hands " + pet.getName()
//                                    + " to you and " + pet.getName()
//                                    + " says " + pet.makeSound()
//                    );
//                    count++;
//                    break;
//                case 'p':
//                    pet = new Parrot();
//                    System.out.print("Please enter a name for your parrot: ");
//                    pet.setName(scan.next());
//                    System.out.println(
//                            "The store clerk hands " + pet.getName()
//                                    + " to you and " + pet.getName()
//                                    + " says " + pet.makeSound()
//                    );
//                    count++;
//                    break;
//                case 'x':
//                    cont = false;
//                    break;
//                default:
//                    System.out.println("Please make a valid selection.");
//            }
//        }
//        System.out.println("Goodbye, you have created " + count + " pets");
    }
}
//
//interface Pet {
//    String makeSound();
//    String getName();
//    void setName(String name);
//}
//
//class Mouse implements Pet {
//    private String name;
//    public String makeSound() {
//        return "squeek";
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Ant implements Pet {
//    private String name;
//    public String makeSound() {
//        return "...";
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Parrot implements Pet {
//    private String name;
//    public String makeSound() {
//        return "what's up!";
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}




// Create a class after your name
// that inherits the following abstract class Student.
// In the constructor set the name property to your name.
// Override favQuote() to return a quote you like
// Override the toString() to return something interesting about yourself.
// Test the code by making an object with your new class,
// calling the speak method and printing out the toString method.

//abstract class Student {
//    String name = "student";
//    abstract String favQuote();
//    public void speak() {
//        System.out.println(name + " says " + favQuote());
//    }
//}
//
//class Orion2 extends Student {
//    public String favQuote(){
//        return "If you want to be good on Java .Ask questions...";
//    }
//    public Orion2() {
//        name = "Orion";
//    }
//    @Override
//    public String toString() {
//        return "Orion loves hot peppers.";
//    }
//
//    public static void main(String[] args) {
//        Orion2 orion = new Orion2();
//        orion.speak();
//        System.out.println(orion);
//    }
//}


// most simple / incomplete
// @@@ interface @@@
// *only have abstract methods
// no properties
// no constructors
// can't instantiate
// use implements keyword

// @@@ abstract class @@@
// can have both abstract and normal methods
// can have properties
// can have constructors
// can't instantiate
// use extends keyword

// @@@ class @@@
// no abstract methods
// can have properties, constructors and methods
// can instantiate
// use extends keyword
// most complex /complete

// abstract method vs method

// abstract = no body

// both have:
// access modifiers
// return type
// name / label
// parameters: (params) or just ()







// Create a class Rectangle that inherits the following interface Polygon.
// add necessary properties and constructor and/or getters/setters
// implement all methods
// override toString to give relevant information about your Rectangle.
// write test code to test your Rectangle's methods

//interface Polygon {
//    double getArea();
//    double getDiameter();
//}
//
//// Polygon shape = new Square(4.5);
//class Square implements Polygon {
//    private double side;
//    public Square(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public double getDiameter() {
//        return 4 * side;
//    }
//
//    public static void main(String[] args) {
//        Polygon shape = new Square(4.5);
//        System.out.println("area: " + shape.getArea());
//        System.out.println("diameter: " + shape.getDiameter());
//    }
//}
//
//// Polygon shape = new RightTriangle(10, 5);
//class RightTriangle implements Polygon {
//    double base, height;
//
//    public RightTriangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return base * height / 2;
//    }
//
//    @Override
//    public double getDiameter() {
//        double sideC = Math.sqrt( base * base + height * height );
//        return sideC + base + height;
//    }
//
//    public static void main(String[] args) {
//        Polygon shape = new RightTriangle(5, 10);
//        System.out.println("area: " + shape.getArea());
//        System.out.println("diameter: " + shape.getDiameter());
//    }
//}
//
//class Rectangle implements Polygon {
//    private double length, height;
//
//    Rectangle(double length, double height) {
//        this.length = length;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return length * height;
//    }
//    @Override
//    public double getDiameter() {
//        return 2 * length + 2 * height;
//    }
//    @Override
//    public String toString() {
//        return "Rectangle with height " + height + " and length " + length;
//    }
//
//    public static void main(String[] args) {
//        Polygon one = new Rectangle(2.5, 2);
//        Polygon two = new Rectangle(5, 10);
//        System.out.println(one);
//        System.out.println("area = " + one.getArea());
//        System.out.println("diameter = " + one.getDiameter());
//        System.out.println(two);
//        System.out.println("area = " + two.getArea());
//        System.out.println("diameter = " + two.getDiameter());
//    }
//}


/*
    #################################
    #########  Second Day  ##########
    #################################
 */











// fill in the blanks to complete the class Child

//interface Parent {
//    void myMethod();
//    String getString();
//    void setString(String string);
//    int add(int a, int b);
//    void printMyString(String string);
//}
//
//class Child implements Parent {
//    private String string;
//
//    public void myMethod() {
//        System.out.println("You have called my method!");
//    }
//
//    public String getString() {
//        return string;
//    }
//
//    public void setString(String string) {
//        this.string = string;
//    }
//
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public void printMyString(String string) {
//        System.out.println("Your string is: " + string);
//    }
//}
//
//
//
//






// Create an interface for a Bird.
// Add 3 methods that make sense for a bird to do, example: fly()
// Create 1 classes for types of birds that implement your Bird class
// add a few tests to test your new bird objects

//class Bird {
//    private int rating;
//    private String song;
//
//    Bird(int rating, String song) {
//        this.rating = rating;
//        this.song = song;
//    }
//
//    void sing() {
//        System.out.println(song);
//    };
//
//    public boolean fight(Bird predator) {
//        return rating > predator.rating;
//    }
//
//    public Bird mate(Bird partner) {
//        return new Bird((rating + partner.rating)/2, song + partner.song);
//    }
//}
//
//class test {
//    public static void main(String[] args) {
//        Bird duck = new Bird(2, "wok wok wok");
//        Bird crow = new Bird(6, "swawkk gukk");
//        System.out.println("duck fights the crow and " + (duck.fight(crow) ? "wins":"loses"));
//        Bird babyBird = duck.mate(crow);
//        System.out.println("baby bird fights the duck and " + (babyBird.fight(duck) ? "wins":"loses"));
//        System.out.println("baby bird fights the crow and " + (babyBird.fight(crow) ? "wins":"loses"));
//        babyBird.sing();
//    }
//}











// Create a class Date that holds int day, month and year.
// and constructor(day, month, year)
// toString() should return a date in format "month/day/year"

// Now create a class DateTime, which extends Date.
// in addition to Date's properties, DateTime will have
// int minute and hour
// and constructor(day, month, year, minute, hour)
// toString should return a date time in format "month/day/year hour:minute"
//
// hint you will need to use the super keyword in DateTime's
// constructor to call Date's constructor.
// here is an example: B extends A and needs to call A's constructor
class A {
    A(int a) { }
}

class B extends A {
    B(int a, int b) {
        super(a);
    }
}

class Date {
    private int day, month, year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return month+"/"+day+"/"+year;
    }
    public static void main(String[] args) {
        Date date = new Date(19, 3, 2021);
        System.out.println(date);
    }
}

class DateTime extends Date {
    private int minute, hour;
    public DateTime(int day, int month, int year, int minute, int hour) {
        super(day, month, year);
        this.minute = minute;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hour + ":" + minute;
    }

    public static void main(String[] args) {
        DateTime now = new DateTime(19, 3, 2021, 1, 10);
        System.out.println(now);
    }
}

// Constructors have same name as class














// Create interface X that has method String x()
// Create interface Y that has method int y()
// Create abstract class Z that has abstract
// method double z() and property String myString

// Create class XYZ that inherits X, Y and Z

interface X {
    // method x returns String
    String x();
}

interface Y {
    // method y returns int
    int y();
}

abstract class Z {
    // property myString that is a String
    String myString;

    public String zzz() {
        return "zzz";
    }

    // abstract method z returns double
    public abstract double z();
}

class XYZ extends Z implements X, Y { // inherits x y and z
    public String x() {
        return "x's string";
    }
    public int y() {
        return 0;
    }
    public double z() {
        return 0;
    }

    public static void main(String[] args) {
        X x = new XYZ();
        Y y = new XYZ();
        Z z = new XYZ();
        XYZ xyz = new XYZ();

        String exampleString = x.x();
        int exampleInt = y.y();
        double exampleDouble = z.z();
        String zString = z.zzz();

        String exampleString2 = xyz.x();
        int exampleInt2 = xyz.y();
        double exampleDouble2 = xyz.z();
        String zString2 = xyz.zzz();

        Z zz = new Z() {
            public double z() {
                return 1.1;
            }
        };

        double myDub = zz.z();
        String myStr = zz.zzz();
    }

}










// Implement the following interface.
// Read comments for desired functionality
interface MyInterface {
    String message(String input); // returns a message made from the input
    void printer(String input); // prints a message made from the input
//    int add(int one, int two); // adds 2 numbers together
//    int add(int one, int two, int three); // adds 3 numbers together
    int add(int ...ints); // adds all elements of array together
}

class ChildClass implements MyInterface {
    public String message(String input) {
        return "hey dude, " + input;
    }
    public void printer(String input) {
        System.out.println( message(input) );
    }
//    public int add(int one, int two) {
//        return one + two;
//    }
//    public int add(int one, int two, int three) {
//        return add(add(one, two), three);
//    }


    // Type ...variableName = array of that type same as: Type[] variableName
    // using ... lets us add as many params of that type as we want
    // example add(1, 2, 3) -> add({1, 2, 3})
    public int add(int ...ints) {
        int total = 0;
        for (int i = 0; i < ints.length; i++) {
            total = total + ints[i];
        }
        return total;
    }

    public int multiply(int ...ints) {
        int total = 1;
        for (int i = 0; i < ints.length; i++) {
            total = total * ints[i];
        }
        return total;
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        int sum = child.multiply(1, 2, 3, 4, 5, 6);
        int su2 = child.add(1, 2, 3, 4);
        System.out.println("the sum is: " + su2);
    }
}










// Write an interface RaceCar that has the following methods:
// goFaster - returns nothing and takes a number parameter amount
// slowDown - returns nothing and takes a number parameter amount
// honk - returns nothing and takes nothing
// paintCar - returns nothing and takes a string parameter color
// getSpeed - returns a number and takes nothing
// getVin - returns a string and takes nothing
// checkSystem - returns a boolean and takes a string parameter system

interface RaceCar {
    void goFaster(int amount);
    void slowDown(int amount);
    void honk();
    void paintCar(String color);
    int getSpeed();
    String getVin();
    boolean checkSystem(String system);
}










// inherit the following interface WordList on a class Words.
// this class will store an array of strings (words) and has methods for
// - setting the stored word array
// - get a word at an index of the array
// - set a word at an index of the array
// - print all the words in the array
interface WordList {
    void setWords(String[] words);
    String getWordAt(int index);
    void setWordAt(int index, String word);
    void printAllWords();
    int amountOfWords();
}

class Words implements WordList {
    String[] words;

    public static void main(String[] args) {
        WordList words = new Words();
        words.setWords(new String[]{"Hello", "World", "Java", "Rocks", "!!!"});
        System.out.println("the word at index 2 is: " + words.getWordAt(2));
        words.setWordAt(2, "JAVA");
        System.out.println("now the word at index 2 is: " + words.getWordAt(2));
        System.out.println("We will now print all the words:");
        words.printAllWords();
        System.out.println("there are " + words.amountOfWords() + " words");
    }

    @Override
    public void setWords(String[] words) {
        this.words = words;
    }

    @Override
    public String getWordAt(int index) {
        return words[index];
    }

    @Override
    public void setWordAt(int index, String word) {
        words[index] = word;
    }

    @Override
    public void printAllWords() {
        for(int i = 0; i < words.length; i++){
            System.out.println(getWordAt(i));
        }
    }

    @Override
    public int amountOfWords() {
        return words.length;
    }
}


