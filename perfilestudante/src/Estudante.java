public class Estudante {
    // Atributos privados
    private String nome;
    private int anoParaFormatura;
    private double media;

    // Construtor que recebe todos os parâmetros
    public Estudante(String nome, int anoParaFormatura, double media) {
        this.nome = nome;
        this.anoParaFormatura = anoParaFormatura;
        this.media = media;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getAnoParaFormatura() {
        return anoParaFormatura;
    }

    public double getMedia() {
        return media;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoParaFormatura(int anoParaFormatura) {
        this.anoParaFormatura = anoParaFormatura;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    // Método para mostrar informações do estudante
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano para formatura: " + anoParaFormatura);
        System.out.println("Média: " + media);
    }
}
