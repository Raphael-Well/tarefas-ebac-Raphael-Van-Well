public class Main {
    public static void main(String[] args) {
        Fifo f = new Fifo();
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);
        f.enqueue(5);

        System.out.println("Tamanho da fila: " + f.size());
        System.out.println("Elemento no removido: ");
        f.dequeue();
        System.out.println("Tamanho da fila: " + f.size());
        System.out.println("Elemento na frente; " + f.front());
    }
}
