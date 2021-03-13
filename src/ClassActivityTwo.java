public class ClassActivityTwo {
    public static void main(String[] args) {
        CellPhone myCellPhone = new CellPhone(
                "Orion", "orion@gmail.com", "111 - 111 - 1111"
        );

        System.out.println(myCellPhone.getMyInfo());
        System.out.println("is the Cell phone on? " + myCellPhone.isOn());
        myCellPhone.setOn(true);

    }
}

class CellPhone {
    private boolean isOn = false;
    private Contact myInfo;

    CellPhone(String name, String email, String phoneNumber) {
        myInfo = new Contact(name, email, phoneNumber);
    }

    public Contact getMyInfo() {
        return myInfo;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
}

class Contact {
    String name;
    String email;
    String phoneNumber;
    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return name + " " + email + " " + phoneNumber;
    }
}


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

