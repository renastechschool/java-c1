@SuppressWarnings("all")

public class ClassesTwo {
    public static void main(String[] args) {

    }
}


// create a class Person with the following requirements:
// private property name(string), Set in constructor with a getter, no setter
// private property catchPhrase(string), Set in constructor with getter and setter
// example: new Person("Orion", "Let's learn some Java!")
// private property isAwake(boolean) set to false, no getter or setter.
// method wakeUp() that turns isAwake to true and prints "[name] has woken up." only if they were sleeping
// method Sleep() that turns isAwake to false and prints "[name] went to sleep." only if they were awake
// toString() should return based on if they are awake:
// "[name] says [catchPhrase]." or "[name] is sleeping."

// TEST CODE:
// Person danny = new Person("Danny", "let's go to the mall");
// Person bart = new Person("Bart", "eat my shorts");
// System.out.println(bart);
// danny.wakeUp();
// System.out.println(danny);
// danny.setCatchPhrase("I don't like malls anymore");
// System.out.println(danny);
// System.out.println("Bart's catch phrase is: " + bart.getCatchPhrase());
// danny.sleep();

// EXPECTED OUTPUT:
// Bart is sleeping
// Danny has woken up.
// Danny says let's go to the mall
// Danny says I don't like malls anymore
// Bart's catch phrase is: eat my shorts
// Danny went to sleep.

class Person {
    private String name, catchPhrase;
    private boolean isAwake;
    public Person(String name, String catchPhrase) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        isAwake = false;
    }
    public String getName() {
        return name;
    }
    public String getCatchPhrase() {
        return catchPhrase;
    }
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }
    public void wakeUp() {
        if (!isAwake) {
            isAwake = true;
            System.out.println(name + " has woken up");
        }
    }
    public void sleep () {
        if (isAwake) {
            isAwake = false;
            System.out.println(name + " went to sleep.");
        }
    }

    @Override
    public String toString() {
        if (isAwake)
            return name + " says " + catchPhrase;
        else {
            return name + " is sleeping.";
        }
    }

    public static void main(String[] args) {
        Person danny = new Person("Danny", "let's go to the mall");
        Person bart = new Person("Bart", "eat my shorts");
        System.out.println(bart);
        danny.wakeUp();
        System.out.println(danny);
        danny.setCatchPhrase("I don't like malls anymore");
        System.out.println(danny);
        System.out.println("Bart's catch phrase is: " + bart.getCatchPhrase());
        danny.sleep();
    }
}


// create a class Fruit with the following requirements:
// private property name(string), Set in constructor with a getter, no setter
// private property (string), Set in constructor with a getter, no setter
// example: new Fruit("Lemon", "Bitter")
// private property isRipe(boolean) set to false in constructor.
// method ripen() that will set isRipe to true
// toString() should return: a string depending on isRipe
// isRipe = false -> "A [name] that is not ready to eat."
// isRipe = true -> "A [name] that is ready to eat."

class Fruit {
    private String name, taste;
    private boolean isRipe = false;

    public Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }
    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        if (isRipe) {
            return "A " + name + " that is ready to eat.";
        } else {
            return "A " + name + " that is not ready to eat.";
        }
        // return "A " + name + " that is " + (isRipe ? "" : "not ") + "ready to eat";
    }

    public void ripen() {
        isRipe = true;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("apple", "sweet");
        Fruit watermelon = new Fruit("watermelon", "sweet");
        System.out.println("The watermelon has a " + watermelon.getTaste() + " taste");
        System.out.println(apple);
        apple.ripen();
        System.out.println(apple);
        System.out.println(watermelon);
    }
}


// create a class Dog. It should have
// a name property that is private,
// set in a constructor and has a getter.
// It should have a speak() method that
// prints dog sounds. override toString()
// to return "A dog named [name]."

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println("hooww howwwllllll");
    }

    @Override
    public String toString() {
        return "A dog named " + name;
    }

    public static void main(String[] args) {
        Dog dogOne = new Dog("Daisy");
        Dog dogTwo = new Dog("Tofu");
        dogOne.speak();
        dogTwo.speak();
        System.out.println("dogOne's name is: " + dogOne.getName());
        System.out.println(dogOne);
        System.out.println(dogTwo);
    }
}

