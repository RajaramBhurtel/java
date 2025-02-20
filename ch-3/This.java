class This {
    int instVar;

    This(int a){
        this.instVar = a;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        This obj = new This(8);
        System.out.println("object reference = " + obj);
        System.out.println("object reference = " + obj.instVar);
    }
}