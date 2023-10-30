import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateMain {
    public static void main(String[] args) {

        //DatetimeFormatter
        //local Date --> Now() --> parse() --> of()
        //Local time --> Now() --> parse() --> of()
        //Local Date Time --> Now() --> parse() --> of()
        //Penod --> Between()
        //Duration --> Between()

        //ChronoUnit//
        //Instanst//

        /*
        LocalDate miCumpleaños = LocalDate.of(1995, 7, 12);
        LocalDate otroCumpleaños = LocalDate.parse("2022-12-31");

        System.out.println(otroCumpleaños);
        */

        LocalDate fecha1 = LocalDate.of(1944,01,02);
        LocalDate hoy = LocalDate.now();

        //Saber que ha tiempo a paado entre estas 2 fechas//

        Period tiempoTranscurrido = Period.between(fecha1,hoy);
        System.out.println(
                "Dias: " + tiempoTranscurrido.getDays() + "\n" +
                        "Meses : " + tiempoTranscurrido.getMonths() + "\n" +
                        "Años: " + tiempoTranscurrido.getYears() + "\n"
        );

       long  diasPasados = ChronoUnit.DAYS.between(fecha1,hoy);
       // long  diasPasados = ChronoUnit.MONTHS.between(fecha1,hoy);//
        //long  diasPasados = ChronoUnit.YEARS.between(fecha1,hoy);//

        System.out.println(diasPasados);

        //Horas//
        LocalTime morning = LocalTime.parse("07:00:01");
        System.out.println(morning);
        LocalTime ahora = LocalTime.now();

        System.out.println(ahora);

        long minutosEntreHoras = ChronoUnit.MINUTES.between(morning,ahora);
        System.out.println("Han pasado : " + minutosEntreHoras + " Entre Horas ");


        //FECHAS Y HORAS//

        LocalDateTime ahoraHF = LocalDateTime.now();
        System.out.println(ahoraHF);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fechaHoraformteada = ahoraHF.format(formato);
        System.out.println(fechaHoraformteada);


    }
}
