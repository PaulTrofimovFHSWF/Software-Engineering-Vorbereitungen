package Uebung1.src;

import java.util.Scanner;

/**
 * Dieses Program ist das Ergebnis der Aufgabenstellung "Warm-Up Programmieren mit Intellij"
 */
public class WarmUp {
    /**
     * Die Main-Methode führt die übrigen Methoden für die Primzahlen- und Quersummenermittlung mit einer entsprechenden Ausgabe aus,
     * zeigt es alle Zahlen an, die eine Primzahl und zugleich auch die Quersumme dieser Primzahl eine Primzahl ist auch mit einer entsprechenden Ausgabe mithilfe einer for-Schleife
     * @param args Zur Ausführung der Main-Methode
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        boolean isPrimzahl = ermittlePrimzahl(zahl);

        if (isPrimzahl && zahl > 1) {
            System.out.println(zahl + " ist eine Primzahl.");
        } else {
            System.out.println(zahl + " ist keine Primzahl.");
        }

        int quersummeErgebnis = berechneQuersumme(zahl);
        System.out.println("Die Quersumme von " + zahl + " ist " + quersummeErgebnis);

        System.out.println("-----------------------");

        int counter = 0;
            for (int i = 1; i < 100; i++) {
                if (ermittlePrimzahl(i) && ermittlePrimzahl(berechneQuersumme(i)) && i != 1) {
                    counter++;
                    System.out.println(i + " ist eine Primzahl und gleichzeitig ist die Quersumme " + berechneQuersumme(i) + " ebenfalls eine Primzahl");
                }
            }
            System.out.println("Die Anzahl der Zahlen die eine Primzahl und deren Quersumme auch eine Primzahl ist lautet: " + counter);
    }


    /**
     * Die Methode ermittelt, ob die übergebene Zahl eine Primzahl ist,
     * indem alle Zahlen von zwei bis letzten Zahl vor der übergebenen Zahl mit der übergebenen Zahl geteilt werden und sobald eine davon mit einem Rest von Null als Ergebnis hat,
     * ist es keine Primzahl
     * @param zahl Die zu prüfende Zahl
     * @return Ob es eine Primzahl (true) ist oder nicht (false)
     */
    public static boolean ermittlePrimzahl(int zahl) {
        boolean isPrimzahl = true;
        for (int i = 2; i <= zahl - 1; i++) {
            if (zahl % i == 0) {
                isPrimzahl = false;
                break;
            }
        }

        return isPrimzahl;
    }

    /**
     * Mithilfe der übergebenen Zahl wird in dieser Methode die Quersumme dieser berechnet, indem die Zahl zu einem String geparst wird und mithilfe einer Schleife die einzelnen Zahlen in Character
     * umgewandelt werden und schließlich diese Character miteinander multipliziert werden
     * @param zahl Die übergebene Zahl woraus die Quersumme berechnet werden soll
     * @return Die Addition aus den einzelnen Ziffern (Character)
     */
    public static int berechneQuersumme(int zahl) {
        String zahlAlsString = Integer.toString(zahl);
        int sum = 0;

        for (int i = 0; i < zahlAlsString.length(); i++) {
            int ziffer = Character.getNumericValue(zahlAlsString.charAt(i));
            sum += ziffer;
        }
        return sum;
    }

}
