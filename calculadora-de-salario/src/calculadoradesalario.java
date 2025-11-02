import java.util.Scanner;

public class calculadoradesalario {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor da hora");
    System.out.println("Digite o número de horas");
    double valorHora = scanner.nextDouble();
    double numerodeHoras = scanner.nextDouble();
    double salario = calcularSalario(valorHora, numerodeHoras);
    System.out.println(salario);

    }
    public static double calcularSalario(double valorHora, double numerodeHoras) {
        double salario = valorHora * numerodeHoras;
        return salario;
    }

}    

