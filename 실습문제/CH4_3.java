import java.util.Scanner;

public class CH4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double arr[] = new double[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}

		String change = sc.next();

		while (true) {
			if (!sc.hasNext())
				break;
			double n = sc.nextDouble();
			String nowmoney = sc.next();

			if (change.equals("dollar")) {
				switch (nowmoney) {
				case "dollar":
					System.out.println(n + " " + nowmoney + " -> " + n + " " + change);
					break;

				case "euro":
					System.out.println(n + " " + nowmoney + " -> " + n * arr[1] / arr[0] + " " + change);
					break;

				case "won":
					System.out.println(n + " " + nowmoney + " -> " + n*arr[0]  + " " + change);
					break;

				case "yen":
					break;

				default:
					System.out.println("올바르지 않은 통화명입니다.");
					break;
				}
			}

			if (change.equals("euro")) {
				switch (nowmoney) {
				case "dollar":
					break;

				case "euro":
					System.out.println(n + " " + nowmoney + " -> " + n + change);
					break;

				case "won":
					break;

				case "yen":
					break;

				default:
					System.out.println("올바르지 않은 통화명입니다.");
					break;
				}
			}

			if (change == "won") {
				switch (nowmoney) {
				case "dollar":

					break;

				case "euro":
					break;

				case "won":
					System.out.println(n + " " + nowmoney + " -> " + n + change);
					break;

				case "yen":
					break;

				default:
					System.out.println("올바르지 않은 통화명입니다.");
					break;
				}
			}

			if (change == "yen") {
				switch (nowmoney) {
				case "dollar":
					break;

				case "euro":
					break;

				case "won":
					break;

				case "yen":
					System.out.println(n + " " + nowmoney + " -> " + n + change);
					break;

				default:
					System.out.println("올바르지 않은 통화명입니다.");
					break;
				}
			}

		}

	}

}
