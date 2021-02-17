package DSAlab.SecondLAB.SinglyLinkedlistDemo.MainClass;

import DSAlab.SecondLAB.SinglyLinkedlistDemo.implementation.MyLinkedList;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addFirst(100);
        //linkedList.traverse();
       /* linkedList.addLast(200);
        linkedList.addLast(300);
        //linkedList.traverse();
        linkedList.addLast(400);
        linkedList.addLast(500);
*/
        linkedList.traverse();

        System.out.println();
        System.out.println("Size = " + linkedList.size());

       /* linkedList.addAfterGivenNode(500, 600);

        linkedList.traverse();

        System.out.println();
        System.out.println("Size = " + linkedList.size());

        System.out.println(linkedList.first());
        System.out.println(linkedList.last());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.size());
        linkedList.traverse();
        System.out.println();
        System.out.println(linkedList.removeLast());
        linkedList.traverse();
        System.out.println();*/
        System.out.println(linkedList.last());
        linkedList.traverse();
        System.out.println();
        System.out.println(linkedList.size());
        System.out.println(linkedList.last());
        System.out.println(linkedList.removeLast());
        System.out.println();
        linkedList.traverse();
        System.out.println(linkedList.last());
    }
}
