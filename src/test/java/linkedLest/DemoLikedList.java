package linkedLest;

import java.util.LinkedList;

public class DemoLikedList {

    public static void main(String[] args) {

        int age = 27;

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ali");
        ll.add("Basel");
        ll.add("Jamel");
        ll.add("Bdaer");
        ll.addFirst("My Name is : ");
        ll.addLast(" - and My Age is : "+age);

        System.out.println("Linked List Contain :" + ll);

        Object aa = ll.get(0);
        System.out.println(aa);

        ll.set(1,"aaaaaaaaa");
        ll.set(2,"bbbbbbbbb");
        ll.removeLast();
        ll.remove(3);

        System.out.println(ll);

    }
}
