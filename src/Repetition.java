public class Repetition {
    public static void main(String[] args) {
        //Aufgabe 1
        int a = 72;
        int b = 2;
        System.out.println(a/b);
        //System.out.println(a%b); //ich verstehe die aufgabe nicht. was heisst "berechne den ganzzahligen restwert modulo der division"?

        //Aufgabe 2
        int monat = 1;
        switch (monat) {
            case 12:
                System.out.println("Dezember");
                break;
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            default:
                System.out.println("Ungültiger Wert");
        }
    }

}