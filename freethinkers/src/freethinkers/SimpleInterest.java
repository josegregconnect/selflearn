import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principle");
        Scanner s = new Scanner(System.in);
        String principle = s.nextLine();
        double princDouble =  new Double(principle).doubleValue();
        
        System.out.println("Enter Num Of years");
        String numofyrs = s.nextLine();
        int numofyrsInt = Integer.parseInt(numofyrs);
        
        System.out.println("Enter the rate of interest");
        String rateOfInterest = s.nextLine();
        double rofIntrstdouble = new Double(rateOfInterest).doubleValue();
        
        calcInterest(princDouble,numofyrsInt,rofIntrstdouble);
        
        
    }
    
    public static void calcInterest(double principle,int numofyrs, double rateofInterest){
        
        double simpleInterest = (principle*numofyrs*rateofInterest)/100;
        
        System.out.println("Simple Interst is"+simpleInterest);
    }
}