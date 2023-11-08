package TestPackage;

public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("Suche nach bugs...");
            Thread.sleep(1000);


            if (Math.random() > 0.5) {
                throw new Exception("BUG GEFUNDEN!");
            }


            System.out.println("KEINE BUG gefunden. Es ist ein Wunder");
        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("Lösche Bug...");
            // Bug squashed
            System.out.println("Bug gelöscht. Weiter mit dem coding!");
        }
    }
}
