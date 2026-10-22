import java.util.Scanner;
public class Bee1005 {
    
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        double A, B, MEDIA;

        A = tec.nextDouble();
        B = tec.nextDouble();

        MEDIA = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

   
    }

}
