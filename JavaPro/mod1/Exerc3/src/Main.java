public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(new Node(10));
        list.push(new Node(20));
        list.push(new Node(30));


        System.out.print("Lista: ");
        list.printList(); // Saída: Lista: 10 20 30

        list.insert(1, new Node(15));

        System.out.print("Lista após inserção: ");
        list.printList();

        list.remove(2);

        System.out.print("Lista após remoção: ");
        list.printList();

        Node node = list.elementAt(1);
        System.out.println("Elemento na posição 1: " + node.getData());

        System.out.println("Tamanho da lista: " + list.size());

        Node removedNode = list.pop();
        System.out.println("Nó removido: " + removedNode.getData());

        System.out.print("Lista após pop: ");
        list.printList();

        System.out.println("Tamanho da lista: " + list.size());
    }
}
