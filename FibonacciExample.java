public class FibonacciExample {
    static int n1=0,n2=1,n3;
    public static void main(String args[]) {
     /* int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);*/
      
      int count =10;
       System.out.println(n1+" "+n2);
       printFibonacci(count-2);
    }
    
    static void printFibonacci(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
}