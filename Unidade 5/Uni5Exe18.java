import java.util.Scanner;

public class Uni5Exe18 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Quantas casas foram visitadas?");
        int n = tec.nextInt();
        int cont4 = 0;
        int cont5 = 0;
        int cont9 = 0;
        int cont12 = 0;
        int totalPessoas = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Qual o número do canal?");
            int canal = tec.nextInt();
            System.out.println("Quantas pessoas estavam assistindo?");
            int pessoas = tec.nextInt();

            switch (canal) {
                case 4:
                    cont4 += pessoas;

                    break;

                case 5:
                    cont5 += pessoas;

                    break;

                case 9:
                    cont9 += pessoas;

                    break;

                case 12:
                    cont12 += pessoas;

                    break;
            }

            totalPessoas += pessoas;

        }

        int perc4 = cont4 * 100 / totalPessoas;
        int perc5 = cont5 * 100 / totalPessoas;
        int perc9 = cont9 * 100 / totalPessoas;
        int perc12 = cont12 * 100 / totalPessoas;

        System.out.println("Percentual de audiência do canal 4: " + perc4 + "%");
        System.out.println("Percentual de audiência do canal 5: " + perc5 + "%");
        System.out.println("Percentual de audiência do canal 9: " + perc9 + "%");
        System.out.println("Percentual de audiência do canal 12: " + perc12 + "%");
    }

}
