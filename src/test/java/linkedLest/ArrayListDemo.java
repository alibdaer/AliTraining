package linkedLest;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(0,500);
        al.add(1,600);
        al.add(2,10);

        for (int i = 0;i<=al.size();i++){
            System.out.println("the number is : "+al.get(i));
            if(al.get(i) == 10){
                al.remove(i);
                System.out.println("now the number 10 is deleted");
            }

        }
        System.out.println("After find number 10, this the array right now!");
        System.out.println(al);
    }
}
