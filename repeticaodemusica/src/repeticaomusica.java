import java.util.Scanner;

public class repeticaomusica {
    public static void main(String[] args) {
        boolean repeat = true;

        while (repeat == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tocar a Música");
            System.out.println("Devo repetir a música? (true) ou  (false)?");
            repeat = scanner.nextBoolean();
    
        }

        System.out.println("Encerrando...");
    }
}
