import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
    String pergunta = "Qual a melhor linguagem de programa?";
    String alternativa1 = "1-Javascript";
    String alternativa2 = "2-PHP";
    String alternativa3 = "3-Java";
    int respostaCerta = 3;

    System.out.println(alternativa1);
    System.out.println(alternativa2);
    System.out.println(alternativa3);
    System.out.println("Digite a alternativa correta!(1,2 ou 3)");

    Scanner scanner = new Scanner(System.in);
    int resposta = scanner.nextInt();

    if (resposta == respostaCerta) {
        System.out.println("Parabens, você acertou!");
     } else {
        System.out.println("Que pena, a resposta correta é " + respostaCerta);

    }
    }
}
