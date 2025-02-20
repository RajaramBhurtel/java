class NoConstructor {

  int i;

  // constructor with no parameter
  public NoConstructor() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    NoConstructor obj = new NoConstructor();
    System.out.println("Value of i: " + obj.i);
  }
}