public class Main {
    public static int fatorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fatorial de " + n +": " + fatorial(n));
    }

    //Naõ é possivel calcular o fatorial de um numero acima de 100
}
