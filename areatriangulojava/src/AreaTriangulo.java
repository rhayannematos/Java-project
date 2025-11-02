import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo:");
        int base = scanner.nextInt();

        System.out.println("Digite a altura do triângulo:");
        int altura = scanner.nextInt();

        double area = (base * altura) / 2.0;

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
