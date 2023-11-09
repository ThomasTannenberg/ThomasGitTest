package LF11Version2;

import java.util.Scanner;

public class Tastaturmenu {
    public static void main(String[] args) {
        Schaltjahrberechnung schaltjahrberechnung = new Schaltjahrberechnung();
        GrößterGemeinsameTeiler größterGemeinsameTeiler = new GrößterGemeinsameTeiler();
        Kapitalverdoppelung kapitalverdoppelung = new Kapitalverdoppelung();
        FibnonacciFolge fibnonacciFolge = new FibnonacciFolge();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte wählen Sie eine Funktion aus: ");
            System.out.println("  * Wenn Sie 0 eingeben, wird das Programm beendet.");
            System.out.println("1. Schaltjahrberechnung");
            System.out.println("2. Größter Gemeinsame Teiler");
            System.out.println("3. Kapitalverdoppelung");
            System.out.println("4. Fibonacci-Folge");

            int n;
            try {
                n = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                scanner.nextLine();
                continue;
            }

            if (n == 0) {
                System.out.println("Auf Wiedersehen!");
                break;
            }

            switch (n) {
                case 1:
                    schaltjahrberechnung.istJahr();
                    break;
                case 2:
                    größterGemeinsameTeiler.großterRechnen();
                    break;
                case 3:
                    kapitalverdoppelung.kapitalverdoppeln();
                    break;
                case 4:
                    fibnonacciFolge.berechneFibonacciSequenz();
                    break;
                default:
                    System.out.println("Bitte eine der Optionen 1-4 wählen.");
                    break;
            }
        }
    }
}
