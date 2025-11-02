public class classesjava {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
            "testeste1",
            "1234teste1",
            "testestes1@teste.com"
        ); 
        Usuario usuario2 = new Usuario(
            "testeste2",
            "1234teste2",
            "testestes2@teste.com"
    
        );

        System.out.println(usuario1.isActive());
        System.out.println(usuario2);
    }

}