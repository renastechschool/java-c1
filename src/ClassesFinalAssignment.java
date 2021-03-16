import java.util.Scanner;

public class ClassesFinalAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car myCar = new Car(5, 10, 45);
        while (true) {
            System.out.print("'a' = accelerate, 'b' = break: ");
            char result = input.next().toLowerCase().charAt(0);
            System.out.print("how much by? ");
            int amount = input.nextInt();
            if (result == 'a') {
                myCar.accelerate(amount);
            } else if (result == 'b') {
                myCar.pressBreaks(amount);
            }
            System.out.print("Your speed is now: " + myCar.getSpeed());
        }
    }
}

class Car {
    private int maxAcceleration;
    private int maxBreakPower;
    private int maxSpeed;
    private int speed = 0;

    Car(int maxAcceleration, int maxBreakPower, int maxSpeed) {
        this.maxAcceleration = maxAcceleration;
        this.maxBreakPower = maxBreakPower;
        this.maxSpeed = maxSpeed;
    }

    // make sure amount isn't greater than max acceleration
    // add amount to the speed
    // make sure speed isn't greater than max speed
    public void accelerate(int amount) {
        if (amount > maxAcceleration) {
            amount = maxAcceleration;
        }
        if (amount > 0) {
            speed += amount;
            if (speed > maxSpeed) {
                speed = maxSpeed;
            }
        }
    }

    // make sure amount isn't greater than max break
    // subtract amount from the speed
    // make sure speed isn't less than than 0
    public void pressBreaks(int amount) {
        if (amount > maxBreakPower) {
            amount = maxBreakPower;
        }
        if (amount > 0) {
            speed -= amount;
            if (speed < 0) {
                speed = 0;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }
}

// Car Requirements:
//        It will have the following properties set in a constructor.
//          max acceleration
//          max break power
//          max speed
//        It should have a speed property:
//          Starts at 0.
//          Can’t go under 0 or over max speed.
//          Getter for accessing speed, no setter (you can’t just set a car speed, you gotta accelerate to it)
//        It should have the following methods for manipulating the speed:
//          accelerate(int amount);
//            Increases speed by amount, only takes amounts between 1 and max acceleration
//            If higher amount is passed in, use max.
//            Speed can’t increase past max speed.
//          break(int amount);
//           Decreases speed by amount, only takes amounts between 1 and max break power
//           If higher amount is passed in, use max.
//           Speed can’t decrease under zero;

