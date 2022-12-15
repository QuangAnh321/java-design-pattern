package principles.substitutionPrinciple;

public class Bus extends Vehicle {
	int getSpeed() {
		return 1;
	}
	
	int getCubicCapacity() {
		return 1;
	}
	
	String getEmergencyExitLoc() {
		return "Run!";
	}
}
