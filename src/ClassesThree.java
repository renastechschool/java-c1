import java.util.Scanner;

public class ClassesThree {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle);
        System.out.println("The area is: " + circle.getArea());
        System.out.println("The circumference is: " + circle.getCircumference());
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius " + radius;
    }
}

// create a class Circle with a private property radius(double)
// a constructor, getter and setter is needed for radius
// create methods:
// getArea() that returns the Circle's area
// hint: area = radius squared * PI  (Math.PI)
// getCircumference() that returns the Circle's circumference
// hint: circumference = 2 * radius * PI  (Math.PI)
// toString() -> "A circle with radius [radius]"


// create 2 classes: Contact and Address

// Address will have private properties:
// street, state and zip, all Strings
// add a constructor and getters/setters for all properties
// toString() -> "[street], [state], [zip]"

// Contact will have private properties:
// name(String), phone(String) and address(Address)
// add a constructor and getters/setters for all properties
// toString() -> "name: [name] | phone: [phone] | address: [address]"

// please add your own test code to create and use Contact and Address.

// Contact contact = new Contact("Orion", "111-111-1111", new Address("123 java st.", "MD", "20853"));

//class Address {
//    private String street, state, zip;
//
//    public Address(String street, String state, String zip) {
//        this.street = street;
//        this.state = state;
//        this.zip = zip;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getZip() {
//        return zip;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }
//
//    @Override
//    public String toString() {
//        return street + " " + state + ", " + zip;
//    }
//}
//
//class Contact {
//    private String name, phone;
//    private Address address;
//
//    public Contact(String name, String phone, Address address) {
//        this.name = name;
//        this.phone = phone;
//        this.address = address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "name: " + name + " | phone: " + phone + " | address: " + address;
//    }
//
//    public static void main(String[] args) {
//        Address address = new Address("123 java st.", "MD", "20853");
//        Contact contact = new Contact("Orion", "111-111-1111", address);
//        System.out.println(contact);
//    }
//}

// create a class Plant with:
// private properties type(string) and height(int), both set in constructor.
// no getters or setters needed
// override toString() to return "[height]inch tall [type] plant."
// example "15 inch tall tomato plant"
//
// now create a command line application using Scanner to create Plant objects
// in a loop, prompt the user for the type, then the height.
// create a new Plant with the user data.
// then print out "You have created: [new plant's toString]"
// example: "You have created: 15 inch tall tomato plant"

class Plant {
    private String type;
    private int height;

    public Plant(String type, int height) {
        this.type = type;
        this.height = height;
    }

    @Override
    public String toString() {
        return height + " inch tall " + type + " plant.";
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean again = true;
        while (again) {
            System.out.print("Please enter the plant type: ");
            String type = myScanner.next();
            int height = -1;
            while (height < 0) {
                System.out.print("Please enter the plant height: ");
                if (myScanner.hasNextInt()) {
                    height = myScanner.nextInt();
                    if (height < 0) {
                        System.out.println("Please enter a positive number.");
                    }
                } else {
                    System.out.println("Please enter a number.");
                    myScanner.next();
                }
            }
            Plant plant = new Plant(type, height);
            System.out.println("You have created: " + plant);

            System.out.print("Would you like to create" +
                    " another plant? (y) to continue: ");
            char result = myScanner.next().toLowerCase().charAt(0);
            again = result == 'y';
        }
    }
}
