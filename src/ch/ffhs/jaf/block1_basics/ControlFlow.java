package ch.ffhs.jaf.block1_basics;

public class ControlFlow {
    public static void main(String[] args) {
        int score = 89;
        if (score >= 90) {
            System.out.println("Note: A");
        }
        else if (score >= 80) {
            System.out.println("Note: B");
        }
        else if (score >= 70) {
            System.out.println("Note: C");
        }
        else {System.out.println("Katastrophale Note");}

        int weekday = 7;
        switch (weekday) {
            case 1:
                System.out.println("Montag");
                break;
            case 2: System.out.println("Dienstag");
                break;
            case 3: System.out.println("Mittwoch");
                break;
            case 4: System.out.println("Donnerstag");
                break;
            case 5: System.out.println("Freitag");
                break;
            case 6: System.out.println("Samstag");
                break;
            case 7: System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungültiger Wochentag");
        }
    }
}