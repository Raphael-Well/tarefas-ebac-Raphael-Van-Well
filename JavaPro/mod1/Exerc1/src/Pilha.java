import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pilha {
    private int[] elements;
    private int quantityElementsPilha;
    private int capacity;

    public Pilha() {
        this.elements = new int[2];
        this.quantityElementsPilha = 0;
        this.capacity = 2;
    }

    private void resize(int newCapacity) {
        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, quantityElementsPilha);
        elements = newElements;
        capacity = newCapacity;
    }

    public void push(int element){
        if (quantityElementsPilha == capacity) {
            resize(capacity * 2);
        }
        for (int i = quantityElementsPilha - 1; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[0] = element;
        quantityElementsPilha++;
    }

    public int pop(){
        if (quantityElementsPilha == 0){
            throw new EmptyStackException();
        }
        int element = elements[0];
        for(int i = 1; i < quantityElementsPilha; i++){
            elements[i-1]=elements[i];
        }
        quantityElementsPilha--;
        if(quantityElementsPilha > 0 && quantityElementsPilha == capacity/4){
            resize(capacity/2);
        }
        return element;
    }

    public int top(){
        if(quantityElementsPilha == 0){
            throw new EmptyStackException();
        }else{
            return elements[0];
        }
    }

    public int size(){
        return quantityElementsPilha;
    }

    public Boolean isEmpity(){
        return quantityElementsPilha == 0;
    }
}
