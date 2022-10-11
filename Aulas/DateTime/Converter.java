package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Converter {
    public static void main(String[] args) {
        /*
        imprime todas as ZoneId disponiveis:
        ZoneId = Fuso horario

        for(var s: ZoneId.getAvailableZoneIds())
            System.out.println(s);
         */

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        //convertendo instante para data local:
        LocalDate e1 = LocalDate.ofInstant(data3, ZoneId.systemDefault());
        System.out.println("Data convertida: " + e1);

        System.out.println("--------");

        //convertendo instante para dateTime local
        LocalDateTime e2 = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));
        System.out.println("Tempo/data convertidos: "+ e2);

        System.out.println("--------");

        //pegando partes de uma LocalDate
        System.out.println(data1.getMonthValue());
        System.out.println(data2.getDayOfMonth());
        System.out.println(data2.getHour());

        System.out.println("--------");

    }
}
