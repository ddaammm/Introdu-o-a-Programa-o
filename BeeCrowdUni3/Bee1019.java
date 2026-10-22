import java.util.Scanner;
public class Bee1019 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int tempo_segundos;
        tempo_segundos = tec.nextInt();

        int horas = tempo_segundos / 3600;
        int minutos = (tempo_segundos % 3600) / 60;
        int segundos = (tempo_segundos % 3600 % 60);

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

}
