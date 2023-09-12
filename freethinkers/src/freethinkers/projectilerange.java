package freethinkers;

import java.util.Scanner;

public class projectilerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Provide angle of projectile in degrees");
		double angleindegrees = s.nextDouble();
		double angleinequation =2*angleindegrees;
		System.out.println("Angle in equation"+angleinequation);
		double angleinradians = Math.toRadians(angleinequation);
		
		double sineValue = Math.sin(angleinradians);
		System.out.println("Value o sin 2 theta"+sineValue);
	
		
		
		System.out.println("Provide Initial Velocity");
		double initVelocity =s.nextDouble();
		
		calculateProjectileRange(sineValue,initVelocity);

	}
	
	static void calculateProjectileRange(double sineValue,double initVelocity) {
		
	
		//Range of a projectile equation is R=(u^2 * sin 2 theta)/g
		//here value of constant g is 9.8m/s^2(acceleration due to gravity)
		//u is the initial velocity
		double rangeeqn_nominator = (initVelocity*initVelocity*sineValue);
		System.out.println("Top of eqn"+rangeeqn_nominator);
		double rangeeqn_denominator = 9.8;
		double actualRange =rangeeqn_nominator/rangeeqn_denominator;
		System.out.println("Range of projectile in meters "+actualRange);
		
	}

}
