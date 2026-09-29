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

    public static void main(String[] args) {
        System.out.println(isEven(10));
    }
}