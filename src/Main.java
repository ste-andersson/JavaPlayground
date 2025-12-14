public class Main {

    public static void main(String[] args) {

        System.out.println("=== KAPITEL 1: LOGIK ===");

        // Vi anropar metoder i LogicOps-klassen genom att skriva: Klassnamn.Metodnamn()
        int price = LogicOps.getTicketPrice(70);
        System.out.println("Biljettpris: " + price);

        String vader = LogicOps.checkWeather(25);
        System.out.println("Väder: " + vader);


        System.out.println("\n=== KAPITEL 2: ARRAYS ===");

        int[] data = {10, 20, 30, 5, 99};

        int total = ArrayOps.sumArray(data);
        System.out.println("Summa: " + total);

        // Här testar vi din nya metod
        int max = ArrayOps.findMax(data);
        System.out.println("Största talet: " + max); // Borde bli 99 (när du löst den)

    }
}