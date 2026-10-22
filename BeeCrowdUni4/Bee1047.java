import java.util.Scanner;

public class Bee1047 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int DuracaoH, DuracaoMin;
        int HI = tec.nextInt();
        int MinI = tec.nextInt();
        int HF = tec.nextInt();
        int MinF = tec.nextInt();

        if (HI == HF && MinI == MinF) {
            DuracaoH = 24;
            DuracaoMin = 0;

        } else if (MinF >= MinI) {
            DuracaoMin = MinF - MinI;

            if (HF >= HI) {
                DuracaoH = HF - HI;
            } else {
                DuracaoH = 24 - (HI - HF);
            }

        } else {
            DuracaoMin = 60 - (MinI - MinF);

            if (HF > HI) {
                DuracaoH = (HF - HI) - 1;
            } else {
                DuracaoH = 24 - (HI - HF) - 1;
            }
        }

        System.out.println("O JOGO DUROU " + DuracaoH + " HORA(S) E " + DuracaoMin + " MINUTO(S)");

    }

}