public class Repetition {
    public static void main(String[] args) {
        //Aufgabe 1 - Datentypen, Airthmetik & Casting
        int a = 7;
        int b = 2;
        System.out.println((double) a/b);
        System.out.println(a%b); //ich verstehe die aufgabe nicht. was heisst "berechne den ganzzahligen restwert modulo der division"?

        //Aufgabe 2 - Ablaufsteuerung
        int monat = 12;
        switch (monat) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Frühling");
                break;
            case 6, 7, 8:
                System.out.println("Sommer");
                break;
            case 9, 10, 11:
                System.out.println("Herbst");
                break;
            default:
                System.out.println("Ungültiger Wert");
        }

        //Aufgabe 3 - Schleifen/Loops
        //Teil A (for)
        for (int i = 2; i <= 20; i=i + 2) {
            System.out.print(i);
            if (i < 20) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Teil B (while)
        int count = 1;
        int sum = 0;
        while (count <= 100) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}