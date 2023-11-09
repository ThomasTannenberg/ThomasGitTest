package LF11Version2;

import java.util.Scanner;

public class Schaltjahrberechnung {
    Scanner scanner = new Scanner(System.in);
    public void istJahr(){
        while (true) {
            System.out.println("Bitte geben Sie ein Jahr ein: ");
            System.out.println("  *wenn Sie 0 geben, dann Pojekt wird zu ende.");
            int year = scanner.nextInt();
            if (year==0){
                break;
            }
            if(year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
                System.out.println("Das Jahr: " + year + " ist eine Schaltjahr.");
            }else {
                System.out.println("Das Jahr: " + year + " ist kein Schaltjahr.");
            }
        }
    }
}
