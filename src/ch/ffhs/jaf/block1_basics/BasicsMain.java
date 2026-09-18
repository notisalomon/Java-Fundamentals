package ch.ffhs.jaf.block1_basics;

public class BasicsMain {
    public static void main(String[] args) {
        // Aufgabe 1
        int age = 25;
        double grade = 5.5;
        char letterGrade = 'A';
        boolean isEnrolled = true;
        int roundedGrade = (int) grade;

        System.out.println(age);
        System.out.println(grade);
        System.out.println(letterGrade);
        System.out.println(isEnrolled);
        System.out.println(roundedGrade);

        // Aufgabe 2
        int a = 10;
        int b = 3;

        System.out.println("Summe: " + (a + b));
        System.out.println("Subtraktion: " + (a - b));
        System.out.println("Multiplikation: " + a * b);
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        System.out.println("(double) a / b: " + (double) a / b);
        System.out.println("(double) (a / b): " + (double) (a / b));

    }
}