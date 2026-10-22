import java.util.Scanner;
public class Bee1008 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int numero = tec.nextInt();
        int horas = tec.nextInt();
        double valorHora = tec.nextDouble();

        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }

}
    

