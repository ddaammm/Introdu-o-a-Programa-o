import java.util.Scanner;
public class Uni4Exe27 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int horaChegada, minutoChegada, horaSaida, minutoSaida;

        System.out.println("Digite a hora de chegada");
        horaChegada = tec.nextInt();
        System.out.println("Digite os minutos de chegada");
        minutoChegada = tec.nextInt();
        System.out.println("Digite a hora de saída");
        horaSaida = tec.nextInt();
        System.out.println("Digite os minutos de saída");
        minutoSaida = tec.nextInt();

        boolean horarioValido = horaChegada >= 0 && horaChegada <= 23
                && minutoChegada >= 0 && minutoChegada <= 59
                && horaSaida >= 0 && horaSaida <= 23
                && minutoSaida >= 0 && minutoSaida <= 59;

        int chegadaEmMinutos = horaChegada * 60 + minutoChegada;
        int saidaEmMinutos = horaSaida * 60 + minutoSaida;

        if (!horarioValido || saidaEmMinutos < chegadaEmMinutos) {
            System.out.println("Dados inválidos");
            return;
        }

        int permanenciaEmMinutos = saidaEmMinutos - chegadaEmMinutos;
        int horasCobradas = permanenciaEmMinutos / 60;
        int minutosRestantes = permanenciaEmMinutos % 60;

        if (permanenciaEmMinutos > 0 && (horasCobradas == 0 || minutosRestantes >= 30)) {
            horasCobradas++;
        }

        double preco;
        if (horasCobradas <= 2) {
            preco = horasCobradas * 5.00;
        } else if (horasCobradas <= 4) {
            preco = 2 * 5.00 + (horasCobradas - 2) * 7.50;
        } else {
            preco = 2 * 5.00 + 2 * 7.50 + (horasCobradas - 4) * 10.00;
        }

        System.out.println("Tempo estacionado = " + horasCobradas + " hora(s)");
        System.out.printf("Preço cobrado = R$%.2f%n", preco);
    }
}
