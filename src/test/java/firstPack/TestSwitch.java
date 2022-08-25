package firstPack;

public class TestSwitch {
    public static void main(String[] args) {

        int x = 10;

        switch (x){
            case 1 :
                System.out.println("case 1 x = " + x);
                break;
            case 2:
                System.out.println("case 2 x = " + x);
                break;
            case 3:
                System.out.println("case 3 x = " + x);
                break;
            case 101:
                System.out.println("case 10 x = " + x);
                break;

            default:
                System.out.println("Value Not Found, and this value by default = 100");

        }

    }
}
