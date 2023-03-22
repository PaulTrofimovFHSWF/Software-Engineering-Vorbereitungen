package Uebung1.src;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        boolean isPrimzahl = berechnePrimzahl(zahl);

        if (isPrimzahl && zahl > 1) {
            System.out.println(zahl + " ist eine Primzahl.");
        } else {
            System.out.println(zahl + " ist keine Primzahl.");
        }

        int quersummeErgebnis = berechneQuersumme(zahl);
        System.out.println("Die Quersumme von " + zahl + " ist " + quersummeErgebnis);


    }


    public static boolean berechnePrimzahl(int zahl) {
        boolean isPrimzahl = true;
        for (int i = 2; i <= zahl / 2; i++) {
            if (zahl % i == 0) {
                isPrimzahl = false;
                break;
            }
        }

        return isPrimzahl;
    }

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
