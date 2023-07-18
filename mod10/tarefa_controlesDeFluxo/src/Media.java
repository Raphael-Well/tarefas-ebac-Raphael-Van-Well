import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int soma=0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.printf("Digite a nota %d:", i+1);
            int nota = s.nextInt();
            soma += nota;
        }
        float media;
        media = (float) soma /4;
        mediaResultado(media);
    }

    public static void mediaResultado(float media){
        System.out.println("A média é " + media);
        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
