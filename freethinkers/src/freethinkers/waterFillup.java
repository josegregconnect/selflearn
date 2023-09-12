package freethinkers;

import java.util.Scanner;

/**
 * @author josephgregory
 *
 */
public class waterFillup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter average volume of the drop");
		double avgDropVol = s.nextDouble();
		
		System.out.println("Enter the volume of the container");
		double containerVol = s.nextDouble();
		
		calculateTimeToFill(avgDropVol, containerVol);

	}
	
	static void calculateTimeToFill(double dropVolume,double containerVolume) {
		double timeToFill = containerVolume/dropVolume;
		System.out.println("TIme to fill up in seconds"+timeToFill);
		System.out.println("Time to fill in minutes"+timeToFill/60);
		System.out.println("Time to fill in hours"+timeToFill/3600);
	}

}
