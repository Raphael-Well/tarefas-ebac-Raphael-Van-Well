public class Main {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        System.out.println("Tamanho da pilha: " + p.size());
        System.out.println("Elemento no topo: " + p.top());
        System.out.println("Elemento removido: " + p.pop());
        System.out.println("Tamanho da pilha: " + p.size());
        System.out.println("Está vazia?: " + p.isEmpity());
    }
}
