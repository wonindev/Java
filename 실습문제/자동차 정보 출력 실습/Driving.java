
interface Driving {
	String drivemode(String brand);

	String gearmode(int vehicle_birth);

}

interface PowerSource {
	String fueltype(String brand);
}

interface MovingPower {
	String drivingpower(String fueltype);
}

interface Feature {
	String howuse();
}
