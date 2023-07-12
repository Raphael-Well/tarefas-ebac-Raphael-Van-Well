import java.util.EmptyStackException;

public class Fifo {
    private int[] elements;
    private int quantityElements;
    private int capacity;

    public Fifo(){
        this.elements = new int[2];
        this.quantityElements = 0;
        this.capacity = 2;
    }

    private void resize(int newCapacity){
        int[] newElements = new int[newCapacity];
        System.arraycopy(elements,0,newElements,0,quantityElements);
        elements=newElements;
        capacity=newCapacity;
    }

    public void enqueue(int element){
        if(quantityElements == capacity){
            resize(capacity*2);
        }
        for(int i = 0; i < quantityElements; i++){
            elements[i+1]=elements[i];
        }
        elements[0]=element;
        quantityElements++;
    }

    public void dequeue() {
        if (quantityElements == 0) {
            throw new EmptyStackException();
        }

        elements[quantityElements - 1] = 0;
        quantityElements--;

        if (quantityElements > 0 && quantityElements <= capacity / 4) {
            resize(capacity / 2);
        }
    }

    public int rear(){
        return elements[0];
    }

    public int front(){
        return elements[quantityElements-1];
    }

    public int size(){
        return quantityElements;
    }

    public Boolean isEmpty(){
        return quantityElements == 0;
    }
}
