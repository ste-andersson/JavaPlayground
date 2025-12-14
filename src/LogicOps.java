public class LogicOps {

    // Metod för biljettpris (If - Else If - Else)
    public static int getTicketPrice(int age) {
        if (age < 18) {
            return 100;
        } else if (age >= 65) {
            return 150;
        } else {
            return 200;
        }
    }

    // Metod för väder (Strängar och logik)
    public static String checkWeather(int temp) {
        if (temp < 0) {
            return "Kallt";
        } else if (temp >= 20) {
            return "Varmt";
        } else {
            return "Lagom";
        }
    }
}