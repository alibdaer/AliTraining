package secondPack;

public class tycatch {

    public static void main(String[] args) {

        try{
            int a[] = new int[4];
            a[3] = 30;
            System.out.println("Access elemet : " + a[5]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Exception :" + e);

        }

        System.out.println("After try catch");

    }
}
