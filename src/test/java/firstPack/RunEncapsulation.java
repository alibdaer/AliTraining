package firstPack;

public class RunEncapsulation {
    public static void main(String[] args) {

        Encapsulation enc = new Encapsulation();

        enc.setName("Ali Bdaer");
        enc.setId(10);
        enc.setAge(26);


        System.out.println("My name is : "+enc.getName());
        System.out.println("My ID is : "+enc.getId());
        System.out.println("My Age is : "+enc.getAge());

    }
}
