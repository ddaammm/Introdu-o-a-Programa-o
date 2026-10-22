import java.util.Scanner;
public class Uni4Exe14 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int dia, mes, ano;
        
        System.out.println("Digite o dia");
        dia = tec.nextInt();
        System.out.println("Digite o mês");
        mes = tec.nextInt();
        System.out.println("Digite o ano");
        ano = tec.nextInt();

        boolean bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
        int diasNoMes;

        if (mes < 1 || mes > 12) {
            diasNoMes = 0;
        } else if (mes == 2) {
            diasNoMes = bissexto ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasNoMes = 30;
        } else {
            diasNoMes = 31;
        }

        if (dia >= 1 && dia <= diasNoMes) {
            System.out.println("Válida");
        } else {
            System.out.println("Não válida");
        }
    }

}
