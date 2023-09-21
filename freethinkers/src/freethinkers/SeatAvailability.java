import java.util.Scanner;

public class Seatavailability
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of seats");
        double totalSeats = s.nextDouble();
        System.out.println("Enter required number");
        double seatsRequired = s.nextDouble();
        
        calcAvail(totalSeats,seatsRequired);
    }
    
    static void calcAvail(double totalSeats, double seatsRequired){
        if(totalSeats < seatsRequired){
            System.out.println("Enter value less than"+totalSeats+"Seats");
        }else{
        double availSeats = totalSeats-seatsRequired;
        System.out.println("Remaining available seats are :"+availSeats);
        }
    }
}