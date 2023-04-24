import java.util.*;

public class part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Insira o nome e sexo das pessoas separados por virgula:");
        String input = sc.next();

        String[] nomes = input.split(",");

        for (String nome : nomes){
            String[] classsificacao = nome.split("-");
            if(classsificacao[1].equalsIgnoreCase("m")){
                masculino.add(classsificacao[0]);
            } else if (classsificacao[1].equalsIgnoreCase("f")) {
                feminino.add(classsificacao[0]);
            }
        }

        System.out.println(masculino);
        System.out.println(feminino);
    }
}
