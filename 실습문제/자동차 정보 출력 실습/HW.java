
import java.util.Vector;

public class HW {
	private static final int NOTCHBACK = 0;
	private static final int HATCHBACK = 1;
	private static final int TRUCK = 2;
	private static final int CROSSOVER = 3;

	private static final String BRAND[] = { "테슬라", "포르쉐", "벤츠", "람보르기니", "페라리", "현대", "기아", "제네시스", "쌍용", "르노삼성" };
	private static final String TRUNK_POSITION[] = { "앞", "뒤" };
	private static final String CARGOTYPE[] = { "화학", "방사능", "오염물질", "가스", "목재", "해산물", "건설자재", "팔레트" };
	private static final String ROADTYPE[] = { "포장도로", "비포장도로", "모래밭", "산악길" };
	private static final String COLOR[] = { "빨강", "노랑", "초록", "파랑", "검정", "하양" };

	public static void main(String[] args) {
		Vehicle vehicle[] = new Vehicle[50];
		Vector<Vehicle> vh = new Vector<>();

		for (int i = 0; i < vehicle.length; i++) {
			vehicle[i] = makeVehicle();
			vh.add(vehicle[i]);
		}

		for (int i = 0; i < vehicle.length; i++) {
			System.out.print("[" + i + "] ");
			System.out.print(Vehicle.color(COLOR[Rand.r(0, COLOR.length - 1)]));
			System.out.print(" ");
			vh.get(i).PrintInfo();
			System.out.println();
		}

	}

	public static Vehicle makeVehicle() {
		Vehicle v = null;

		switch (Rand.r(NOTCHBACK, CROSSOVER)) {
		case NOTCHBACK: {
			v = new Notchback(BRAND[Rand.r(0, BRAND.length - 1)], Rand.r(1980, 2022), Rand.r(0, 300), Rand.r(4, 20),
					Rand.r(2, 6), TRUNK_POSITION[Rand.r(0, 1)]);
			break;

		}
		case HATCHBACK: {
			v = new Hatchback(BRAND[Rand.r(0, BRAND.length - 1)], Rand.r(1980, 2022), Rand.r(0, 300), Rand.r(4, 20),
					Rand.r(0, 5), Rand.r(0, 10));
			break;
		}

		case TRUCK: {
			v = new Truck(BRAND[Rand.r(0, BRAND.length - 1)], Rand.r(1980, 2022), Rand.r(4, 20), Rand.r(0, 10),
					Rand.r(1, 30), CARGOTYPE[Rand.r(0, CARGOTYPE.length - 1)]);
			break;
		}
		case CROSSOVER: {
			v = new CrossoOver(BRAND[Rand.r(0, BRAND.length - 1)], Rand.r(1980, 2022), Rand.r(4, 20), Rand.r(0, 10),
					ROADTYPE[Rand.r(0, ROADTYPE.length - 1)], Rand.r(10000000, 100000000));
			break;
		}
		default:
			break;
		}

		return v;
	}

}
