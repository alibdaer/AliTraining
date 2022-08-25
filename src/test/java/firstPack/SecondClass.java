package firstPack;

import org.testng.annotations.Test;

public class SecondClass extends FirstClass{

    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        first.Ali("Ali Bdaer");

        System.out.println(FirstClass.x);

        String a = "Ali Basel Jamel Bdaer";
        int g = a.length();
        System.out.println(g);

    }

    public void go() {
        System.out.println("Go From Second");
    }

}
