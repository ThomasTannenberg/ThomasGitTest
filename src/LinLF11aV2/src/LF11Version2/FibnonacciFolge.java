package LF11Version2;

import java.util.Scanner;

public class FibnonacciFolge {
    Scanner scanner = new Scanner(System.in);
    public void berechneFibonacciSequenz() {
        while (true){
            System.out.println("Bitte geben Sie eine Zahl ein:  ");
            System.out.println("  *wenn Sie 0 geben, dann Pojekt wird zu ende.");
            int n = scanner.nextInt();
            if (n<=0){
                System.out.println("Chao,Chao!");
                break;
            }
            long a = 0, b = 1;

            System.out.print("Fibonacci-Sequenz: " + a + ", " + b);

            for (int i = 2; i < n; i++) {
                long next = a + b;
                System.out.print(", " + next);
                a = b;
                b = next;
            }

            System.out.println(); // Neue Zeile für das Endergebnis
            System.out.println("Das Ergebnis der FibonacciFolge mit " + n + " Zahlen ist: " + b);

        }
    }
}