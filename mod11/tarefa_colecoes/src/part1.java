import java.util.*;

public class part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os nomes de pessoas separados por virgula:");
        String input = sc.next();

        List<String> nomesOrdenados = new ArrayList<>(Arrays.asList(input.split(",")));

        Collections.sort(nomesOrdenados);

        System.out.println(nomesOrdenados);


    }
}
