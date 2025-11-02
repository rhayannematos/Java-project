public class Usuario {
    public String username;
    public String password;
    public String email;
    public boolean ativo; // usamos tipo primitivo boolean para evitar null

    // Construtor vazio
    public Usuario() {
        this.ativo = false; // padrão: usuário inativo
    }

    // Construtor com parâmetros
    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.ativo = true; // padrão: usuário ativo
    }

    // Método para verificar se o usuário está ativo
    public boolean isActive() {
        return ativo;
    }

    // Método para ativar o usuário
    public void ativar() {
        this.ativo = true;
    }

    // Método para desativar o usuário
    public void desativar() {
        this.ativo = false;
    }

    // Exemplo de impressão dos dados do usuário
    public void mostrarInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Ativo: " + ativo);
    }
}
