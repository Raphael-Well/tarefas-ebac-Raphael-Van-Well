import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica();
        PessoaJuridica pessoa2 = new PessoaJuridica();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = s.nextLine();
        pessoa1.setName(nome);

        System.out.println("Digite o cpf da pessoa: ");
        String cpf = s.nextLine();
        pessoa1.setCpf(cpf);

        System.out.println("Digite o nome da pessoa juridica: ");
        String nome2 = s.nextLine();
        pessoa2.setName(nome2);

        System.out.println("Digite o cnpj da pessoa: ");
        String cnpj = s.nextLine();
        pessoa2.setCnpj(cnpj);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
