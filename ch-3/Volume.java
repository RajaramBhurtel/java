class Box{
	double width, height, depth, vol;
	void getvolume(){
		System.out.println("I am getvolume method in Class Volume ");
		width = 10;
		height = 20;
		depth = 20;
		vol = width*height*depth;
	}

	void display(){
		   System.out.println("Volume " + vol);
	}
}

public class Volume {

   public static void main(String args[]) {
	  System.out.println("Class Volume ");
      Box box = new Box();
      box.getvolume();
    //   box.display();
   }
}