import java.util.Scanner;

public class Bee1015 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        float x1 = tec.nextFloat();
        float y1 = tec.nextFloat();
        float x2 = tec.nextFloat();
        float y2 = tec.nextFloat();

        float distancia = (float) Math.sqrt((x2 - x1) * (x2 -x1) + (y2 - y1) * (y2 - y1));

        System.out.printf("%.4f%n", distancia);

    }

}
