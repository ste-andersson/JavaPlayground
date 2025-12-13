public class Main {

    public static void main(String[] args) {
        // Här testar vi min metod
        System.out.println("--- TEST BILJETT ---");
        int pris = getTicketPrice(70); // Testa att ändra 70 till 10 eller 30
        System.out.println("Biljettpris: " + pris + " kr");

        // DITT UPPDRAG:
        // Avkommentera raderna nedan (ta bort //) när du skrivit din metod.

        String vader = kollaVader(25);
        System.out.println("Vädret är: " + vader);
    }

    // EXEMPEL: En metod som räknar ut pris baserat på ålder
    // "public static int" betyder: Denna metod är öppen, statisk, och svarar med ett HELTAL (int).
    public static int getTicketPrice(int age) {
        // Om ålder är under 18
        if (age < 18) {
            return 100; // Barnpris
        }
        // Annars om ålder är 65 eller mer
        else if (age >= 65) {
            return 150; // Pensionär
        }
        // I alla andra fall
        else {
            return 200; // Vuxen
        }
    }

    // --- HÄR SKA DU SKRIVA DIN KOD ---

    // UPPGIFT: Skriv en metod som heter "kollaVader".
    // 1. Den ska ta emot en temperatur (int temp).
    // 2. Den ska returnera text (String).
    // 3. Logik:
    //    - Om temp är under 0: returnera "Kallt"
    //    - Om temp är över 20: returnera "Varmt"
    //    - Annars: returnera "Lagom"

    public static String kollaVader(int temp) {
        // Om temperaturen är under noll
        if (temp < 0) {
            return "Kallt"; // Minusgrader
        }
        // Annars om temperaturen är 20 eller högre
        else if (temp >= 20) {
            return "Varmt"; // Sommarväder
        }
        // I alla andra fall
        else {
            return "Lagom"; // Normalväder
        }
    }


}

  