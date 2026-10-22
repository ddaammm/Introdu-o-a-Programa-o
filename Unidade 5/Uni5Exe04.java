import java.util.Scanner;
public class Uni5Exe04 {

    public static void main(String[] args) {
        
        Scanner tec= new Scanner(System.in);

        //inicializar uma variavel para a soma 
        float soma = 0;
    
        //repetir para 100 termos

        for (int i = 1; i <= 100; i++) {
            //somar o termo - o float esta forçando a divisao a ter casas decimais 
            soma += (float) 1 / i;
        }

        //escrever a soma
        System.out.println("Soma = " + soma);
    }

}
