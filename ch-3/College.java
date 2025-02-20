public class College{
    static int stdCount = 0;

    static{
        System.out.println("Welcome to EIC College");
    }

    public College( String stdName ){
        stdCount++;
        System.out.println(stdName +" is a new student at EIC");
    }

    public static void display(){
        System.out.println("Total no of students admitted in EIC: " +stdCount);
    }

    public static void main(String args[]){
        for( String name: args ){
            College abc = new College(name);
            display();
        }
    }

}