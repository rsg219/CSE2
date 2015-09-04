// Robert Gould
//Lab 1
//Hello World Java Program

public class Cyclometer{
    
    public static void main(String[] args)
    {
        //Raw trip data
        int secsTrip1=480;
        int secsTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9037;
        
        //Constants and distance
        double wheelDiameter=27.0;
        double PI=3.14159;
        int feetPerMile=5280;
        int inchesPerFoot=12;
        double secondsPerMinute=60;
        double distanceTrip1, distanceTrip2, totalDistance;
        
        //Prints out output for time
        System.out.println ("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had "+ countsTrip1+" counts.");
        System.out.println ("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had "+ countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        // Above converts to miles
        totalDistance = distanceTrip1 + distanceTrip2;
        
        //Prints out output for distance
        System.out.println("Trip 1 was " +distanceTrip1+ " miles");
        System.out.println("Trip 2 was " +distanceTrip2+ " miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}