import java.util.Scanner;

public class wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        Integer num2 = num;

        System.out.println(num2);
    }
}
