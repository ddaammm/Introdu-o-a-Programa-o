import java.util.Scanner;
public class Uni2Exe09 {

    public static void main(String[] args) {
        //declaração de variáveis 
        float dolares, cotacao, reais;

        //definir o teclado
        Scanner tec = new Scanner(System.in);

        //entrada de dados
        System.out.println("Informe o valor em dólares:");
        dolares = tec.nextFloat();
        System.out.println("Informe a cotação do dólar:");
        cotacao = tec.nextFloat();

        //conversão de dólares para reais 
        reais = dolares * cotacao;

        //escrever o resultado
        System.out.println("O valor em reais é: " + reais);
        

    }

}
