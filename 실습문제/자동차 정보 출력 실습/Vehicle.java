
public abstract class Vehicle {
	String brand;
	int vehicle_birth;

	public Vehicle(String brand, int vehicle_birth) {
		this.brand = brand;
		this.vehicle_birth = vehicle_birth;
	}

	abstract boolean operate_airbag_backseat(int vehicle_birth);

	abstract boolean full_automation_drivemode(String brand);

	@Override
	public String toString() {
		return String.format("[%d년식 (%s)]", vehicle_birth, brand);
	}

}

class Sedan extends Vehicle {
	int maxspeed;
	int drive_per_fuel;

	public Sedan(String brand, int vehicle_birth, int maxspeed, int drive_per_fuel) {
		super(brand, vehicle_birth);
		this.drive_per_fuel = drive_per_fuel;
	}

	@Override
	boolean operate_airbag_backseat(int vehicle_birth) {
		if (vehicle_birth > 2000)
			return true;
		return false;
	}

	@Override
	boolean full_automation_drivemode(String brand) {
		if (brand.equals("테슬라") || brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니")
				|| brand.equals("페라리"))
			return true;
		return false;
	}

	public String isgoodfuel(int drive_per_fuel) {
		if (drive_per_fuel > 10)
			return "Good";
		return "Bad";
	}

	@Override
	public String toString() {
		return String.format("%s 최고속도: %dkm, 연비: %dkm, 연비상태: %s", super.toString(), maxspeed, drive_per_fuel,
				isgoodfuel(drive_per_fuel));
	}

}

class Notchback extends Sedan {
	int door_count;
	String trunk_position;

	public Notchback(String brand, int vehicle_birth, int maxspeed, int drive_per_fuel, int door_count,
			String trunk_position) {
		super(brand, vehicle_birth, maxspeed, drive_per_fuel);
		this.door_count = door_count;
		this.trunk_position = trunk_position;
	}

	@Override
	boolean operate_airbag_backseat(int vehicle_birth) {

		return super.operate_airbag_backseat(vehicle_birth);
	}

	@Override
	boolean full_automation_drivemode(String brand) {

		return super.full_automation_drivemode(brand);
	}

	public String doorcountisbig(int door_count) {
		if (door_count > 2)
			return "많다.";
		return "적다";
	}

	@Override
	public String toString() {
		return String.format("%s, 문 개수: %d, 문의 개수가 많은가? : %s ,트렁크의 위치: %s, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b ",
				super.toString(), door_count, doorcountisbig(door_count), trunk_position,
				operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

}

class Hatchback extends Sedan {
	public Hatchback(String brand, int vehicle_birth, int maxspeed, int drive_per_fuel) {
		super(brand, vehicle_birth, maxspeed, drive_per_fuel);
		// TODO Auto-generated constructor stub
	}

	int count_trunk_in_golfbag;
	String door_open;
}

class SUV extends Vehicle {
	public SUV(String brand, int vehicle_birth) {
		super(brand, vehicle_birth);
	}

	int drive_per_fuel;
	int humanoccupancy;

	@Override
	boolean operate_airbag_backseat(int vehicle_birth) {

		return false;
	}

	@Override
	boolean full_automation_drivemode(String brand) {

		return true;
	}

}

class Truck extends SUV {
	public Truck(String brand, int vehicle_birth) {
		super(brand, vehicle_birth);
		// TODO Auto-generated constructor stub
	}

	int intake_weight;
	String cargotype;

	public boolean takeOff_cargo(String cargotype) {
		return false;
	}
}

class CrossoOver extends SUV {
	public CrossoOver(String brand, int vehicle_birth) {
		super(brand, vehicle_birth);
		// TODO Auto-generated constructor stub
	}

	String roadtype;
	boolean withfamily;

}
