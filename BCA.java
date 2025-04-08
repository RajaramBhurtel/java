public class BCA extends Test{
    BCA(){
        super();

        System.out.println("BCA");

    }
    public void display(){
        System.out.println("This is BCA");
        super.display();
        System.out.println(super.name);

    }

    public static void main(String args[]){
        BCA abc = new BCA();
        abc.display();

    }
}

class Test {
    String name = "SABIN";
    Test(){
        System.out.println("Test");
    }
    public void display(){
        System.out.println("This is Test");
    }
}