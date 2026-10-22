import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int idade1;
        int idade2;
        int idade3;

        System.out.println("Digite a idade do primeiro");
        idade1 = tec.nextInt();
        System.out.println("Digite a idade do segundo");
        idade2 = tec.nextInt();
        System.out.println("Digite a idade do terceiro");
        idade3 = tec.nextInt();
        if (idade1 == idade2 && idade1 == idade3) {
            System.out.println("TRIGÊMEOS");

        } else {
            if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
                System.out.println("GÊMEOS");

            } else {
                System.out.println("Apenas Irmãos");

            }
        }
    }
}
