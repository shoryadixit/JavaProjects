package DSAlab.Queue.UsinglinkedList.implementation;

import DSAlab.Queue.UsinglinkedList.myInterface.QueueADT;

public class MyQueue <E> implements QueueADT<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public MyQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<>(data);
        if (!isEmpty()){
            rear.setNext(node);
            rear = node;
        }else{
            front = node;
            rear = node;
        }
        size++;
    }

    @Override
    public E dequeue() {
        E response = null;
        if (!isEmpty()){
            response = front.getData();
            front = front.getNext();
            if (front == null){
                rear = null;
            }
            size--;
        }
        return response;
    }

    @Override
    public E peek() {
        return front.getData();
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void traverse(){
        System.out.println("Printing element of Queue");
        System.out.print("Front <--");
        Node<E> temp = front;
        while (temp != null){
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
        System.out.print(" Rear");
    }
}
