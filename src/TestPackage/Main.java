package TestPackage;

public class Main {
    //lin hat zwei mal geändert.
    //lin hat das erste ändert.
    public static void main(String[] args) {
        try {
            // Start the code inspection
            System.out.println("Suche nach bugs...");
            Thread.sleep(1000); // Simulate code inspection time

            // If a bug is found
            if (Math.random() > 0.5) {
                throw new Exception("BUG GEFUNDEN!");
            }

            // If no bugs were found
            System.out.println("KEINE BUG gefunden. Es ist ein Wunder");
        } catch (Exception e) {
            // Handle the bug
            System.out.println(e.getMessage());
            System.out.println("Lösche Bug...");
            // Bug squashed
            System.out.println("Bug gelöscht. Weiter mit dem coding!");

            //out
            System.exit(0);
        }
    }
}
