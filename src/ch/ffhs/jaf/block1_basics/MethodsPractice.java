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

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(calculateDiscount(100, 20));
    }
}