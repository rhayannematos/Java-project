public class App {
    public static void main(String[] args) {
        // Criando um estudante
        Estudante estudante = new Estudante("Rhayanne", 2026, 9.5);

        // Mostrando os dados
        estudante.mostrarInfo();

        // Alterando o ano de formatura
        estudante.setAnoParaFormatura(2027);
        System.out.println("\nApós alteração do ano:");
        estudante.mostrarInfo();
    }
}
