
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
		return String.format("[%d년식 (%s)] ", vehicle_birth, brand);
	}

}

class Sedan extends Vehicle  {
	int maxspeed;
	int drive_per_fuel;

	public Sedan(String brand, int vehicle_birth, int maxspeed, int drive_per_fuel) {
		super(brand, vehicle_birth);
		this.maxspeed = maxspeed;
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

	public String fuel_efficiency(int drive_per_fuel) {
		if (drive_per_fuel > 10)
			return "Good";
		return "Bad";
	}
	
	

	@Override
	public String toString() {
		return String.format("%s 최고속도: %dkm, 연비: %dkm, 연비상태: %s", super.toString(), maxspeed, drive_per_fuel,
				fuel_efficiency(drive_per_fuel));
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
		return String.format("%s, 문 개수: %d, 문의 개수가 많은가? : %s, 트렁크의 위치: %s, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b",
				super.toString(), door_count, doorcountisbig(door_count), trunk_position,
				operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

}

class Hatchback extends Sedan {

	int trunksize;
	int count_trunk_in_golfbag;

	public Hatchback(String brand, int vehicle_birth, int maxspeed, int drive_per_fuel, int trunksize,
			int count_trunk_in_golfbag) {
		super(brand, vehicle_birth, maxspeed, drive_per_fuel);
		this.trunksize = trunksize;
		this.count_trunk_in_golfbag = count_trunk_in_golfbag;
	}

	@Override
	boolean operate_airbag_backseat(int vehicle_birth) {
		return super.operate_airbag_backseat(vehicle_birth);
	}

	@Override
	boolean full_automation_drivemode(String brand) {
		return super.full_automation_drivemode(brand);
	}

	public String trunk_is_big_or_small(int trunkszie) {
		if (trunksize > 3) {
			return "크다";
		}
		return "작다";
	}

	@Override
	public String toString() {
		return String.format("%s, 트렁크 크기: %s, 트렁크에 들어가는 골프백 최대개수: %d, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b",
				super.toString(), trunk_is_big_or_small(trunksize), count_trunk_in_golfbag,
				operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

}

class SUV extends Vehicle {

	int drive_per_fuel;
	int humannum;

	public SUV(String brand, int vehicle_birth, int drive_per_fuel, int humannum) {
		super(brand, vehicle_birth);
		this.drive_per_fuel = drive_per_fuel;
		this.humannum = humannum;
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

	public String limithuman(int human) {
		if (human > 6) {
			return "최대 수용인원 초과";
		}
		return "최대 수용인원 미달";
	}

	@Override
	public String toString() {
		return String.format("%s 연비: %dkm, 탑승인원: %d명 %s ", super.toString(), drive_per_fuel, humannum,
				limithuman(humannum));
	}

}

class Truck extends SUV {

	int now_weight;
	String cargotype;

	public Truck(String brand, int vehicle_birth, int drive_per_fuel, int humannum, int now_weight, String cargotype) {
		super(brand, vehicle_birth, drive_per_fuel, humannum);
		this.now_weight = now_weight;
		this.cargotype = cargotype;
	}

	@Override
	boolean operate_airbag_backseat(int vehicle_birth) {
		return super.operate_airbag_backseat(vehicle_birth);
	}

	@Override
	boolean full_automation_drivemode(String brand) {
		return super.full_automation_drivemode(brand);
	}

	public boolean takeOff_cargo(String cargotype) {
		if (cargotype.equals("화학") || cargotype.equals("방사능") || cargotype.equals("오염물질") || cargotype.equals("가스"))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s 현재 중량: %d, 화물 종류: %s, 화물 종류에 따른 화물 분리가능여부: %b, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b ",
				super.toString(), now_weight, cargotype, takeOff_cargo(cargotype),
				operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}
}

class CrossoOver extends SUV {

	String roadtype;
	int carcost;

	public CrossoOver(String brand, int vehicle_birth, int drive_per_fuel, int humannum, String roadtype, int carcost) {
		super(brand, vehicle_birth, drive_per_fuel, humannum);
		this.roadtype = roadtype;
		this.carcost = carcost;

	}

	@Override
	boolean operate_airbag_backseat(int vehicle_birth) {
		// TODO Auto-generated method stub
		return super.operate_airbag_backseat(vehicle_birth);
	}

	@Override
	boolean full_automation_drivemode(String brand) {
		// TODO Auto-generated method stub
		return super.full_automation_drivemode(brand);
	}

	public int repairpay(int carcost) {
		return carcost / 10;
	}

	@Override
	public String toString() {
		return String.format("%s 자동차에 적합한 도로: %s, 자동차 수리비: %d, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b", super.toString(),
				roadtype, repairpay(carcost), operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

}
