package secondPack;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Animal sound");
    }

    public int move(int a){

        if(a >= 50){
            System.out.println("the value higher than or equal 50 = "+a);
        }else{
            System.out.println("the value Less than 50 = "+a);
        }

        return a;
    }

    public static void main(String[] args) {
        Animal mm = new Dog();
        mm.sound();
        mm.move(40);
    }
}
