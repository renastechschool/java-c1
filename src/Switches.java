@SuppressWarnings("all")
public class Switches {
    public static void main(String[] args) {

//        String myString = "gras";
//
//        switch (myString) {
//            case "dog" :
//                System.out.println("i love dogs");
//            case "cat" :
//            case "lion" :
//                System.out.println("myString is an animal");
//                break;
//            case "grass" :
//            case "gras":
//            case "desk" :
//                System.out.println("myString is not an animal");
//                break;
//            default:
//                System.out.println("I dont know what myString is");
//        }

        // swich can use types other than string

//        int myInteger = 3;
//
//        //   swich condition
//        switch (myInteger) {
//            case 1: // case: situation we a checking condition against
//            case 2:
//                System.out.println("my integer is small");
//                break; // break: break out of swich statement
//            case 3:
//            case 4:
//                System.out.println("my integer is big");
//                break;
//            default: // default: catch-all when condition is not matched by a case
//                System.out.println("integer out of range");
//        }



        // when string is "large", "big" or "huge" print out "large string"
        // when string is "small" or "tiny" print out "small string"

//        String string = "huge";
//
//        switch (string) {
//            case "large" : case "big" : case "huge" :
//                System.out.println("large string"); break;
//            case "small" : case "tiny" :
//                System.out.println("small string");
//        }

        // when string is "tom", "bob" or "orion" print out "its a boy"
        // when string is "sarah", "ana" or "kate" print out "its a girl"
        // when string is "orion" also print out "it's the teacher"
        // if I dont know what the string is print out "hmmmmmm"

//        String string = "orion";
//        switch (string) {
//            case "orion" :
//                System.out.println("it's the teacher");
//            case "tom" :
//            case "bob" :
//                System.out.println("its a boy");
//                break;
//            case "sarah" :
//            case "ana" :
//            case "kate":
//                System.out.println("Its a girl");
//                break;
//            default:
//                System.out.println("hmmmm");
//        }


        // when string is "chair", "sofa" or "ottoman" print out "furniture"
        // when string is "dog", "cat" or "snake" print out "what a cute animal"
        // when string is "dog" also print out "I love dogs"
        // if I dont know what the string is print out "I dont know what that is"


//        String string = "snake";
//
//        switch (string) {
//            case "chair" :
//            case "sofa" :
//            case "ottoman" :
//                System.out.println("furniture");
//                break;
//            case "dog" :
//                System.out.println("I love dogs");
//            case "cat" :
//            case "snake" :
//                System.out.println("what a cute animal");
//                break;
//            default :
//                System.out.println("I dont know what that is");
//        }

        // we will have these strings:
        // "dog" "cat" "London" "Maryland" "seven" "book" "chips" "bananna" "six" "ten"
        // print out the following messages for the correspending strings:
        // "it is an animal", "it is a place", "it is a number", "it is a food"
        // make a default message "I dont know what that is"

//        String string = "potato";
//
//        switch (string) {
//            case "dog" :
//            case "cat" :
//                System.out.println("it is an animal");
//                break;
//            case "London" :
//            case "Maryland" :
//                System.out.println("it is a place");
//                break;
//            case "seven" :
//            case "six" :
//            case "ten" :
//                System.out.println("it is a number");
//                break;
//            case "chips" :
//            case "bananna" :
//            case "potato" :
//                System.out.println("it is a food");
//                break;
//            default:
//                System.out.println("I dont know what it is");
//        }







        // we will have these strings:
        // "stew" "birthday" "Brittny" "Danny" "new years" "tofu" "watermelon"
        // print out the following messages for the corresponding strings:
        // "it is a time of year", "it is a name", "it is a food"
        // for default print out "when, who, what? yum"

        String string = "tofu";

        switch (string) {
            case "coffee" :
                System.out.println("yum coffee");
            case "stew" :
            case "tofu" :
            case "watermelon" :
                System.out.println("it is a food");
                break;
            case "Brittny" :
            case "Danny" :
                System.out.println("it is a name");
                break;
            case "birthday" :
            case "new years" :
                System.out.println("it is a time of year");
                break;
            default :
                System.out.println("when, who, what? yum");
        }

    }
}
