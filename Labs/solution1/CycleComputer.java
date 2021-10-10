import sheffield.*;

/**
 * CycleComputer.java
 *
 * Reads in a file called timings.txt, which simulates the input from a wheel
 * sensor on a bicycle in one journey. The first entry in the file specifies the
 * number of rows, and each subsequent row represents a time interval measured
 * in seconds.
 *
 * CycleComputer uses this information, combined with knowledge about the wheel
 * diameter, to calculate the instantaneous speed, mean speed, distance travelled
 * and journey time.
 */
public class CycleComputer {
    public static void main(String[] args) {

	// set wheel diameter in m, 665 mm is correct for 26 inch wheel plus tyre
	// this variable is final because we do not need to change it
	final double WHEEL_DIAMETER = 0.665;

	EasyReader inputFile = new EasyReader("timings.txt");
	int numTimes = inputFile.readInt();
	double[] timings = new double[numTimes];

	// read in all the timings, each time interval in seconds
	for (int t = 0; t < numTimes; t++) {
	    timings[t] = inputFile.readDouble();
	    System.out.println(timings[t]);
	}

	// calculate speed, mean speed, distance, and time
	// using static methods
	double circumference = Math.PI * WHEEL_DIAMETER;
	double[] speed = calculateSpeed(timings, circumference);
	double meanSpeed = calculateMeanSpeed(speed);
	double distanceTravelled = circumference * numTimes;
	double journeyTime = calculateJourneyTime(timings);

	// display results
	for (int t = 0; t < numTimes; t++) {
	    System.out.println("speed "+ speed[t]*3.6 +" km/h");
	}
	System.out.println();
	System.out.println("mean speed "+ meanSpeed*3.6 +" km/h");
	System.out.println("distance travelled "+ distanceTravelled/1000.0 +" km");
	System.out.println("journey time "+ journeyTime/60.0 +" min");
    }

    // static methods to calculate speed, mean speed, and journey time
    private static double[] calculateSpeed(double[] timings, double circumference) {
	int numTimes = timings.length;
	double speed[] = new double[numTimes];
	for (int t = 0; t < numTimes; t++) {
	    speed[t] = circumference / timings[t];
	}
	return speed;
    }

    private static double calculateMeanSpeed(double[] speed) {
	int numTimes = speed.length;
	double meanSpeed = 0.0;
	double sumSpeed = 0.0;
	for (int t = 0; t < numTimes; t++) {
	    sumSpeed += speed[t];
	}
	meanSpeed = sumSpeed / (double)numTimes;
	return meanSpeed;
    }

    private static double calculateJourneyTime(double[] timings) {
	int numTimes = timings.length;
	double journeyTime = 0.0;
	for (int t = 0; t < numTimes; t++) {
	    journeyTime += timings[t];
	}
	return journeyTime;
    }
}
