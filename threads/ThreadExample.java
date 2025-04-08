public class ThreadExample { 
     public static void main(String[] args) { 
        ThreadA t1=new ThreadA(); 
        ThreadB t2=new ThreadB(); 
        ThreadC t3=new ThreadC(); 
        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(t1.getPriority()+1);   
        t3.setPriority(Thread.MAX_PRIORITY); 
        t1.start(); 
        t2.start(); 
        t3.start();

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
     } 
}

class ThreadA extends Thread{ 
     public void run() { 
          for(int i=1;i<=5;i++) { 
               System.out.println("Running thread "+i+" From Class A"); 
               if(i==3) stop(); 
          } 
          System.out.println("Exit from Class A"); 
     }
} 

class ThreadB extends Thread{ 
    public void run() { 
        for(int j=1;j<=5;j++) { 
            System.out.println("Running thread "+j+" From Class B"); 
            if(j==2){
                try { 
                    sleep(1000); //in milliseconds 
                    //sleep must be surrounded with try/catch 
                } catch (Exception e) { 
                    System.out.println(e); 
                } 
            } 
        } 
        System.out.println("Exit from Class B"); 
    } 
} 
 
class ThreadC extends Thread{ 
 public void run() { 
  for(int k=1;k<=5;k++) { 
  System.out.println("Running thread "+k+" From Class C"); 
  } 
  System.out.println("Exit from Class C"); 
 } 
}