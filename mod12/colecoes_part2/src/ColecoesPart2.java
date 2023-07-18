import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColecoesPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Insira o nome e sexo das pessoas separados por virgula:");
        String input = sc.next();

        List<String> nomes = new ArrayList<>(Arrays.asList(input.split(",")));

        for (String nome : nomes){
            List<String> classsificacao = new ArrayList<>(Arrays.asList(nome.split("-")));
            if(classsificacao.get(1).equalsIgnoreCase("m")){
                masculino.add(classsificacao.get(0));
            } else if (classsificacao.get(1).equalsIgnoreCase("f")) {
                feminino.add(classsificacao.get(0));
            }
        }

        System.out.println(masculino);
        System.out.println(feminino);
    }
}
