package LF11Version2;

import java.util.Scanner;

public class GrößterGemeinsameTeiler {
    Scanner scanner = new Scanner(System.in);

    public void großterRechnen() {
        while (true) {
            System.out.println("Bitte geben Sie die erste Nummer ein:");
            System.out.println("* Wenn Sie 0 oder negativ eingeben, wird das Programm beendet.");

            int m;
            try {
                m = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Bitte eine ganze Zahl eingeben.");
                scanner.nextLine(); // Leeren Sie den Eingabepuffer
                continue;
            }

            if (m <= 0) {
                System.out.println("Die Eingabe von 0 oder negativ führt zu einem Abbruch.");
                return;
            }

            System.out.println("Bitte geben Sie die zweite Nummer ein:");
            System.out.println("* Wenn Sie 0 oder negativ eingeben, wird das Programm beendet.");

            int n;
            try {
                n = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Bitte eine ganze Zahl eingeben.");
                scanner.nextLine();
                continue;
            }

            if (n <= 0) {
                System.out.println("Die Eingabe von 0 oder negativ führt zu einem Abbruch.");
                return;
            }


            //Eucliden Algorithmus
            while (n != 0) {
                int temp = m % n;
                m = n;
                n = temp;
            }
            System.out.println("Größter gemeinsamer Teiler ist: " + m);
        }
    }
}

