
public abstract class Vehicle implements Feature, Comparable<Vehicle> {
	String brand;
	int vehicle_birth;

	public Vehicle(String brand, int vehicle_birth) {
		this.brand = brand;
		this.vehicle_birth = vehicle_birth;
	}

	abstract boolean operate_airbag_backseat(int vehicle_birth);

	abstract boolean full_automation_drivemode(String brand);

	public abstract void PrintInfo();
	
	
	
	

	@Override
	public String howuse() {
		if (this instanceof SUV && this instanceof Truck)
			return "운반용";
		return "승용";
	}

	@Override
	public String toString() {
		return String.format("[%d년식 (%s)] ", vehicle_birth, brand);
	}

	@Override
	public int compareTo(Vehicle o) {
		if (brand.equals(o.brand))
			return brand.compareTo(o.brand);
		return brand.compareTo(o.brand);
	}

}

class Sedan extends Vehicle implements Driving {
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
	public String drivemode(String brand) {
		if (brand.equals("테슬라") || brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니")
				|| brand.equals("페라리"))
			return "사륜구동";
		return "이륜구동";
	}

	@Override
	public String gearmode(int vehicle_birth) {
		if (vehicle_birth > 2010)
			return "오토";
		return "스틱";
	}

	@Override
	public String toString() {
		return String.format("%s 기어타입: %s, 최고속도: %dkm, 연비: %dkm, 연비상태: %s", super.toString(), gearmode(vehicle_birth),
				maxspeed, drive_per_fuel, fuel_efficiency(drive_per_fuel));
	}

	@Override
	public void PrintInfo() {
	}

}

class Notchback extends Sedan implements PowerSource, MovingPower {
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
			return "많다";
		return "적다";
	}

	@Override
	public String fueltype(String brand) {
		if (brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니") || brand.equals("페라리")) {
			return "가솔린";
		} else if (brand.equals("테슬라")) {
			return "전기";
		}
		return "디젤";
	}

	@Override
	public String drivingpower(String fueltype) {
		if (fueltype.equals("전기"))
			return "전기모터";
		return "엔진";
	}

	@Override
	public String toString() {
		return String.format(
				"%s 구동력 표현: %s, 연료정보: %s, \n문 개수: %d, 문의 개수가 많은가? : %s, 트렁크의 위치: %s, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b",
				super.toString(), drivemode(brand), fueltype(brand), door_count, doorcountisbig(door_count),
				trunk_position, operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

	public void PrintInfo() {
		System.out.println("<" + howuse() + ">" + this);
	}

}

class Hatchback extends Sedan implements PowerSource, MovingPower {

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
	public String fueltype(String brand) {
		if (brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니") || brand.equals("페라리")) {
			return "가솔린";
		} else if (brand.equals("테슬라")) {
			return "전기";
		}
		return "디젤";
	}

	@Override
	public String drivingpower(String fueltype) {
		if (fueltype.equals("전기"))
			return "전기모터";
		return "엔진";
	}

	@Override
	public String toString() {
		return String.format(
				"%s 구동력 표현: %s, 연료정보: %s,\n트렁크 크기: %s, 트렁크에 들어가는 골프백 최대개수: %d개, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b",
				super.toString(), drivemode(brand), fueltype(brand), trunk_is_big_or_small(trunksize),
				count_trunk_in_golfbag, operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

	public void PrintInfo() {
		System.out.println("<" + howuse() + ">" + this);
	}

}

class SUV extends Vehicle implements Driving {

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
	public String drivemode(String brand) {
		if (brand.equals("테슬라") || brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니")
				|| brand.equals("페라리"))
			return "사륜구동";
		return "이륜구동";
	}

	@Override
	public String gearmode(int vehicle_birth) {
		if (vehicle_birth > 2010)
			return "오토";
		return "스틱";
	}

	@Override
	public String toString() {
		return String.format("%s 기어타입: %s, 연비: %dkm, 탑승인원: %d명 %s ", super.toString(), gearmode(vehicle_birth),
				drive_per_fuel, humannum, limithuman(humannum));
	}

	@Override
	public void PrintInfo() {
		// TODO Auto-generated method stub

	}

}

class Truck extends SUV implements PowerSource, MovingPower {

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
	public String fueltype(String brand) {
		if (brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니") || brand.equals("페라리")) {
			return "가솔린";
		} else if (brand.equals("테슬라")) {
			return "전기";
		}
		return "디젤";
	}

	@Override
	public String drivingpower(String fueltype) {
		if (fueltype.equals("전기"))
			return "전기모터";
		return "엔진";
	}

	@Override
	public String toString() {
		return String.format(
				"%s 구동력 표현: %s 연료정보: %s,\n현재 중량: %d톤, 화물 종류: %s, 화물 종류에 따른 화물 분리가능여부: %b, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b ",
				super.toString(), drivemode(brand), fueltype(brand), now_weight, cargotype, takeOff_cargo(cargotype),
				operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

	public void PrintInfo() {
		System.out.println("{" + howuse() + "}" + this);
	}
}

class CrossoOver extends SUV implements PowerSource, MovingPower {

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
		return carcost / 100;
	}

	@Override
	public String fueltype(String brand) {
		if (brand.equals("벤츠") || brand.equals("포르쉐") || brand.equals("람보르기니") || brand.equals("페라리")) {
			return "가솔린";
		} else if (brand.equals("테슬라")) {
			return "전기";
		}
		return "디젤";
	}

	@Override
	public String drivingpower(String fueltype) {
		if (fueltype.equals("전기"))
			return "전기모터";
		return "엔진";
	}

	@Override
	public String toString() {
		return String.format("%s, 구동력 표현: %s 연료정보: %s,\n 자동차에 적합한 도로: %s, 자동차 수리비: %d원, 뒷자석 에어백이 작동유무: %b, 자율주행모드 여부: %b",
				super.toString(), drivemode(brand), fueltype(brand), roadtype, repairpay(carcost),
				operate_airbag_backseat(vehicle_birth), full_automation_drivemode(brand));
	}

	public void PrintInfo() {
		System.out.println("<" + howuse() + ">" + this);
	}

}
