public class Classes {
    public static void main(String[] args) {
        Orion orionOne = new Orion();
        Orion orionTwo = new Orion();
        Orion orionThree = new Orion();
        Orion orionFour = new Orion();
        orionThree.numberOfOrions = 5;
        orionOne.numberOfOrions = 3;
        Orion orionFive = new Orion();
        System.out.println(orionThree.numberOfOrions);
    }
}
class Orion {
    public static int numberOfOrions = 0;
    Orion() {
       numberOfOrions++;
    }
}

