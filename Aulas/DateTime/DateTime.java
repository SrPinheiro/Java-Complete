package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate data01 = LocalDate.now(); // Pegando Data
        System.out.println("Data1: " + data01);

        System.out.println("----------------");

        LocalDateTime data02 = LocalDateTime.now(); // pegando data e hora
        System.out.println("Data2: " + data02);

        System.out.println("----------------");

        Instant data03 = Instant.now(); // pegando data e hora global (Londres)
        System.out.println("Data3: " + data03);

        System.out.println("----------------");

        LocalDate data04 = LocalDate.parse("2004-01-31"); // gerando uma data
        System.out.println("Data4: " + data04);

        System.out.println("----------------");

        LocalDateTime data05 = LocalDateTime.parse("2004-01-31T01:24:30"); // Gerando uma dataHora
        System.out.println("Data5: " + data05);

        System.out.println("----------------");

        Instant data06 = Instant.parse("2004-01-31T01:24:30Z"); //Gerando uma dataHora com fuso Horario(Londres)
        System.out.println("Data6: " + data06);

        System.out.println("----------------");

        Instant data07 = Instant.parse("2004-01-31T01:24:30-03:00"); //Gerando uma dataHora com fuso Horario(Brasilia)
        System.out.println("Data7: " + data07);

        System.out.println("----------------");

        //LocalDate data08 = LocalDate.parse("11/10/2022"); formato invalido! precisa tratar
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data08 = LocalDate.parse("11/10/2022", formatador); //passando formatador como parametro para aceitar o modelo
        System.out.println("Data8: " + data08);

        System.out.println("----------------");

        //LocalDateTime data09 = LocalDateTime.parse("11/10/2022 01:00", formatador); Errado, pois a hora esta fora do formato
        DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime data09 = LocalDateTime.parse("11/10/2022 01:00", formatador2);
        System.out.println("Data9: " + data09);

        System.out.println("----------------");
        LocalDate data10 = LocalDate.of(2022,01,25);
        System.out.println("Data10: " + data10); //GERANDO UMA DATA  System.out.println("----------------");

        System.out.println("----------------");

        LocalDateTime data11 = LocalDateTime.of(2022,01,25,12,30,20);
        System.out.println("Data11: " + data11); //GERANDO UMA DATAHORA



    }
}
