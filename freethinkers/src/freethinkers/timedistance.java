package freethinkers;

import java.util.Scanner;

public class timedistance {
	public static void main(String args[]) {
		
		System.out.println("Enter average walking speed in km/h" );
		Scanner s = new Scanner(System.in);
		double avgwlkspeed = s.nextDouble();
		
		System.out.println("Enter total distance in km need to be coveered");
		double distToDest = s.nextDouble();
		
		calculateSteps(avgwlkspeed,distToDest);
		
	}
	
	static void calculateSteps(double avgwlkspeed,double distanceDestination) {
		double stepsNeeded = distanceDestination/avgwlkspeed;
		System.out.println("Time in hour needed to cover the distance is "+stepsNeeded);
	}

}

