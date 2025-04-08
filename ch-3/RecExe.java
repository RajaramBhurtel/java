public class RecExe {
  public static void main(String[] args) {
    int result = fact(5);
    System.out.println(result);
  }
  public static int fact(int start) {

    if (start > 1) {
      return start * fact(start - 1);
    }
      return 1;

  }
}
