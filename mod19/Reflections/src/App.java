import java.lang.annotation.Annotation;

public class App {
    public static void main(String[] args) {
        Class<Cliente> cliente = Cliente.class;
        Annotation tabelaAnnotation = cliente.getAnnotation(Tabela.class);
        if (tabelaAnnotation != null) {
            String tabelaNome = ((Tabela) tabelaAnnotation).nome();
            System.out.println("O nome da tabela é " + tabelaNome);
        } else {
            System.out.println("A classe não está anotada com @Tabela");
        }

    }
}
