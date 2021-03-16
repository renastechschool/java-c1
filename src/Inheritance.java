public class Inheritance {
    public static void main(String[] args) {
//        Animal dog = new Doggy();
//        Animal cat = new Cat();
//        System.out.println("The doggy says: " + dog.speak());
//        System.out.println("The cat says: " + cat.speak());
//        dog.eat();
//        cat.eat();
    }
}

// write an interface called Vehicle with a method move()
// and implement it on a class called Boat


interface Float {
    void drown();
}

interface Vehicle {
    void move();
}

class Boat implements Vehicle, Float {
    @Override
    public void move() {
        System.out.println("the boat floats");
    }
    @Override
    public void drown() {
        System.out.println("the boat sinks");
    }
    public static void main(String[] args) {
        Float floatyBoat = new Boat();
        Vehicle moveyBoat = new Boat();
        Boat boatyboat = new Boat();

        // Float type
        floatyBoat.drown();

        // Vehicle type
        moveyBoat.move();

        // Boat type
        boatyboat.drown();
        boatyboat.move();
    }
}


// extends - for inheriting classes
// implements - for inheriting interfaces

//interface Animal {
//    void eat();
//}
//
//class Doggy implements Animal {
//    @Override
//    public void eat() {
//        System.out.print("The doggy eats some dog food");
//    }
//    public void bark() {
//        System.out.println("wof woof");
//    }
//}

//abstract class Animal {
//    String name;
//    abstract String speak();
//    public void eat() {
//        System.out.println("The animal eats.");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    String speak() {
//        return "meyyoow";
//    }
//
//    @Override
//    public void eat() {
//        super.eat();
//        System.out.println("The cat catches a mouse for dinner.");
//    }
//}
//
//class Doggy extends Animal {
//    @Override
//    String speak() {
//        return "Woof!";
//    }
//}
