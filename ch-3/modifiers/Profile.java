import java.util.*;
public class Profile{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        String age = sc.nextLine();
        int ageNum = Integer.parseInt(age);
        System.out.println("Enter Your Gender");
        String gender = sc.nextLine();
        System.out.println("Enter Your College");
        String college = sc.nextLine();
        

        System.out.println("Name:" +name);
        System.out.println("Age:" +ageNum);
        System.out.println("Gender:" +gender);
        System.out.println("College:" +college);

    }
    
}