package DSAlab.SecondLAB.SinglyLinkedlistDemo.MainClass;

import DSAlab.SecondLAB.SinglyLinkedlistDemo.implementation.MyLinkedList;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        Scanner sc = new Scanner(System.in);

        linkedList.addFirst(sc.nextInt());
        //linkedList.traverse();
        linkedList.addFirst(sc.nextInt());
        linkedList.addFirst(sc.nextInt());
        //linkedList.traverse();
        linkedList.addLast(30);
        linkedList.addLast(34);
        linkedList.traverse();
        System.out.println();
        System.out.println("Size = " + linkedList.size());
    }
}
