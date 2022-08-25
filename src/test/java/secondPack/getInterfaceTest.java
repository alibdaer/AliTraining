package secondPack;

public class getInterfaceTest implements interfaceTest{

    public static void main(String[] args) {

        getInterfaceTest get1 = new getInterfaceTest();
        get1.e1();
        get1.e2();
        System.out.println(get1.ali(500) * 126 );

    }

    @Override
    public void e1() {
        System.out.println("e1");
    }

    @Override
    public void e2() {

        System.out.println("e2");

    }

    public int ali(int a){

        return a;
    }
}
