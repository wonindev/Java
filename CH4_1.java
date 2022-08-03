public class CH4_1 {

	public static void main(String[] args) {
		int A, B;
		double result = 0;
		String op;

		try {
			A = Integer.parseInt(args[0]);
			B = Integer.parseInt(args[2]);
			op = args[1];

			switch (op) {
			case "add":
				op = "+";
				result = A + B;
				break;

			case "minus":
				op = "-";
				result = A - B;
				break;

			case "multiply":
				op = "x";
				result = A * B;
				break;

			case "div":
				op = "/";
				if (B == 0) {
					System.out.println(A + "" + op + "" + B + " = 분모가 0인 오류");
					System.exit(0);
				}
				result = (double) A / B;
				break;

			case "mod":
				op = "%";
				if (B == 0) {
					System.out.println(A + "" + op + "" + B + " = 분모가 0인 오류");
				}
				result = A % B;
				break;

			default:
				System.out.println(A + " " + op + " " + B + " = 연산자 오류");
				System.exit(0);
			}

			if (op == "/")
				System.out.println(A + "" + op + "" + B + " = " + result);

			else
				System.out.println(A + "" + op + "" + B + " = " + (int) result);
		} catch (Exception e) {

			switch (args[0]) {
			case "add":
				args[0] = "+";
				break;

			case "minus":
				args[0] = "-";
				break;

			case "multiply":
				args[0] = "x";
				break;

			case "div":
				args[0] = "/";
				break;

			case "mod":
				args[0] = "%";
				break;

			default:
				args[0] = args[0];
				break;
			}
			if (args.length > 1) {
				switch (args[1]) {
				case "add":
					args[1] = "+";
					break;

				case "minus":
					args[1] = "-";
					break;

				case "multiply":
					args[1] = "x";
					break;

				case "div":
					args[1] = "/";
					break;

				case "mod":
					args[1] = "%";
					break;

				default:
					args[1] = args[1];
					break;
				}
			}

			if (args.length == 1) {
				for (int i = 0; i < args.length; i++) {
					System.out.print(args[i]);
				}
				System.out.println(" = 인자 부족");
			}

			else if (args.length == 2) {
				try {
					Integer.parseInt(args[0]);
					Integer.parseInt(args[1]);
					for (int i = 0; i < args.length; i++) {
						System.out.print(args[i] + " ");
					}
					System.out.println("= 연산자 없음");

				} catch (Exception p) {
					for (int i = 0; i < args.length; i++) {
						System.out.print(args[i]);
					}
					System.out.println(" = 인자 부족");
				}
			}

		}

	}

}
