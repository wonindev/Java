public class CH3_1 {

	public static void main(String[] args) {
		int A, B;
		double result = 0;
		char op;
		boolean check = false;
		
		try {
			A = Integer.parseInt(args[0]);
			op = args[1].charAt(0);
			B = Integer.parseInt(args[2]);

			switch (op) {
			case '+':
				result = A + B;
				break;

			case '-':
				result = A - B;
				break;

			case '/':
				result = (double) A / B;
				break;

			case '%':
				if (B == 0) {
					System.out.println(A + "" + op + "" + B + " = 분모가 0인 오류");
				}
				result = A % B;
				break;

			case 'x':
			case 'X':
				result = A * B;
				break;

			default:
				check = true;
				System.out.println(A + "" + op + "" + B + " = 연산자 오류");
				break;
			}
			
			if (op == '/' & check == false) {
				if (B == 0) {
					System.out.println(A + "" + op + "" + B + " = 분모가 0인 오류");
				} else
					System.out.printf("%d%c%d = %.3f", A, op, B, result);
			}

			else if (check == false) {
				System.out.printf("%d%c%d = %d", A, op, B, (int) result);
			}

		} catch (Exception e) {
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
