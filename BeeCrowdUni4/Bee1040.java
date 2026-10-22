import java.util.Scanner;

public class Bee1040 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        float N1 = tec.nextFloat();
        float N2 = tec.nextFloat();
        float N3 = tec.nextFloat();
        float N4 = tec.nextFloat();

        float Media = (N1 * 2f + N2 * 3f + N3 * 4f + N4 * 1f) / 10;

        System.out.printf("Media: %.1f%n", Media);

        if (Media >= 7.0) {
            System.out.println("Aluno aprovado.");

        } else if (Media < 5.0) {
            System.out.println("Aluno reprovado.");

        } else if (Media >= 5 && Media <= 6.9) {
            System.out.println("Aluno em exame.");
            float NExame = tec.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", NExame);
            float MediaFinal = (Media + NExame) / 2;

            if (MediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", MediaFinal);

            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", MediaFinal);
            }
        }

    }

}
