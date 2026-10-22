import java.util.Scanner;

public class Bee1061 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        tec.next();
        int diaInicio = tec.nextInt();
        int hInicio = tec.nextInt();
        tec.next();
        int minInicio = tec.nextInt();
        tec.next();
        int segInicio = tec.nextInt();

        tec.next();
        int diaFim = tec.nextInt();
        int hFim = tec.nextInt();
        tec.next();
        int minFim = tec.nextInt();
        tec.next();
        int segFim = tec.nextInt();

        int inicio = diaInicio * 86400 + hInicio * 3600 + minInicio * 60 + segInicio;
        int fim = diaFim * 86400 + hFim * 3600 + minFim * 60 + segFim;

        int duracao = fim - inicio;

        int dias = duracao / 86400;
        duracao = duracao % 86400;

        int horas = duracao / 3600;
        duracao = duracao % 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

    }

}