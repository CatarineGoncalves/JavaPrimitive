

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String welcome;
        String name = "Catarine";

        LocalDate today = LocalDate.now();
        //Locale brazil = new Locale("pt", "BR");
        Locale brazil = Locale.of("pt", "BR");
        String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brazil);


        LocalDateTime now = LocalDateTime.now();
        int hourOfDay = now.getHour();

        if (hourOfDay >= 0 && hourOfDay < 12) {
            welcome = "Bom dia";
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            welcome = "Boa tarde";
        } else {
            welcome = "Boa noite";
        }

        System.out.printf("%s %s! Hoje é %s.%n", welcome, name, dayOfWeek);
    }
}