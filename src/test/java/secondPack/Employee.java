package secondPack;

public class Employee {

    int empId;
    String empName;

    Employee(int id, String name){
        this.empId=id;
        this.empName=name;
    }

    Employee(int id){
        this.empId = id;
    }

    public void info(){
        System.out.println("The ID = "+empId+" and the name is : "+empName);
    }

    public static void main(String[] args) {
        Employee ob1 = new Employee(10,"Ali Bdaer");
        Employee ob2 = new Employee(15, "Khaled");
        ob1.info();
        ob2.info();
        Employee ob3 = new Employee(50);
        ob3.info();

        Main m = new Main(27,"Ali Bdaer");
        System.out.println(m);

    }

}
