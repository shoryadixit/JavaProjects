package DSAlab.SecondLAB.SinglyLinkedlistDemo.implementation;

import DSAlab.SecondLAB.SinglyLinkedlistDemo.Myinterfaces.mySinglyLinkedList;

public class MyLinkedList implements mySinglyLinkedList {

    //head reference or start of linked list or reference of first node
    private Node head;

    //tail reference or end of linked list or reference of last node
    private Node tail;

    //store total number of elements in linked list
    private int size;

    //constructor
    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size(){
        return size;
    }

    @Override
    public void addAfterGivenNode(int givenElemnet, int element) {

    }

    @Override
    public void addBeforeGivenNode(int givenElement, int element) {

    }

    @Override
    public int removeFirst() {
        return 0;
    }

    @Override
    public int removeLast() {
        return 0;
    }

    @Override
    public int removeGivenNode(int givenElement) {
        return 0;
    }

    @Override
    public boolean search(int element) {
        return false;
    }

    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()){
            head = node;
            tail = node;
        }
        else{
            node.setNext(head);
            head = node;
        }
        size++;
    }

    //traverse
    public void traverse(){
        if (!isEmpty()) {
            Node temp = head;
            System.out.print("Head");
            while (temp != null){
                System.out.print("-->" + temp.getData());
                //updating temp value to refer next node of sequence
                temp = temp.getNext();
            }
            System.out.print("--> null");
        }
        else{
            System.out.print("Linked List Empty.");
        }
    }

    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    @Override
    public boolean isEmpty(){
        return head == null;
    }

}