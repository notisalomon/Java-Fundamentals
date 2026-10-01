package ch.ffhs.jaf.block1_basics;

public class MethodsPractice {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static double calculateDiscount(double price, double percentage) {
        return(price - (price / 100 * percentage));
    }

    public static void greet(String name) {
        System.out.println("Halloooo, " + name + "!");
    }

    public static void greet(String name, String language) {
        switch (language) {
            case "DE":
                System.out.println("Hallo, " + name + "!");
                break;
            case "FR":
                System.out.println("Bonjour, " + name + "!");
                break;
            case "EN":
                System.out.println("Hello, " + name + "!");
                break;
            default:
                System.out.println("Diese Sprache ist nicht erkannt worden.");
        }
    }

    public static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {return c;}
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(calculateDiscount(100, 20));
        greet("Labi");
        System.out.println(maxOfThree(5, 5,55) + " ist die grösste Zahl");
        System.out.println(maxOfThree(7, 7,4) + " ist die grösste Zahl");
        System.out.println(maxOfThree(4, 4,4) + " ist die grösste Zahl");

    }

}