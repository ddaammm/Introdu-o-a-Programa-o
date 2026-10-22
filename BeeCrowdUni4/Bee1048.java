import java.util.Scanner;

public class Bee1048 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double salarioNovo = 0;
        double reajuste = 0;
        int reajustepercentual = 0;
        double salario = tec.nextDouble();

        if (salario > 0 && salario <= 400) {
            salarioNovo = salario * 0.15 + salario;
            reajuste = salarioNovo - salario;
            reajustepercentual = 15;

        } else if (salario > 400 && salario <= 800) {
            salarioNovo = salario * 0.12 + salario;
            reajuste = salarioNovo - salario;
            reajustepercentual = 12;

        } else if (salario > 800 && salario <= 1200) {
            salarioNovo = salario * 0.10 + salario;
            reajuste = salarioNovo - salario;
            reajustepercentual = 10;

        } else if (salario > 1200 && salario <= 2000) {
            salarioNovo = salario * 0.07 + salario;
            reajuste = salarioNovo - salario;
            reajustepercentual = 7;

        } else if (salario > 2000) {
            salarioNovo = salario * 0.04 + salario;
            reajuste = salarioNovo - salario;
            reajustepercentual = 4;

        }

        System.out.printf("Novo salario: %.2f%n", salarioNovo);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + reajustepercentual + " %");

    }

}
