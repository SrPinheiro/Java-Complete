package DateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();

        System.out.println("!!DATA PADRAO!!");
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println("!!DATA PADRAO!!");

        LocalDate semanaPassadaD1 = data1.minusDays(7); //removendo 7 dias da data
        System.out.println(semanaPassadaD1);
        System.out.println("");
        System.out.println("");

        LocalDateTime proximaSemanaD2 = data2.plusDays(7); //adicionando 7 dias na data
        System.out.println(proximaSemanaD2);

        System.out.println("");
        System.out.println("");

        //No instant é diferente, pois você precisa passar a quantidade e depois informar a unidade
        Instant proximoMesD3 = data3.plus(30, ChronoUnit.DAYS); //ChronoUnit = unidade de tempo
        System.out.println(proximoMesD3);

        System.out.println("");
        System.out.println("");

        //Calcular a duração de uma data



        Duration d2 = Duration.between(proximaSemanaD2, data2); //recomendado usar Math.abs para evitar erros!
        System.out.println(d2); //imprime a diferença em horas
        System.out.println(d2.toDays()); //imprime a difereça em dias
        System.out.println(d2.toMinutes());//imprime a diferença em minutos

        System.out.println("----");
        //Para usar LocalDate é diferente pois ele não possui tempo a ser calculado
        // por isso devemos dar um tempo para poder calcular a duração!
        //para dar tempo use data.atTime(0,0) ou usar data.atStartOfDay()

        Duration d1 = Duration.between(data1.atTime(0,0), semanaPassadaD1.atStartOfDay());
        System.out.println(Math.abs(d1.toDays())); //Math.abs pega o valor absoluto, assim evitando tempo negativo!

        System.out.println("----");

        Duration d3 = Duration.between(data3, proximoMesD3);
        System.out.println(d3.toDays());


    }
}
