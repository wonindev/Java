import java.util.InputMismatchException;
import java.util.Scanner;

public class CH3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linecount = 0, n, integercount = 0, doublecount = 0, maxline = 0, maxcount = 0, doublemaxline=0, doublemaxcount=0;
		int integersum = 0;
		double doublesum = 0, n2, doublemax = Double.MIN_VALUE, integermax = Double.MIN_VALUE;
		String line;

		while (sc.hasNext()) {
			line = sc.nextLine();
			Scanner input = new Scanner(line);
			integersum = 0;
			integercount = 0;
			doublecount = 0;
			doublesum = 0;

			while (input.hasNext()) {
				try {
					n = input.nextInt();
					integersum += n;
					integercount++;

				} catch (InputMismatchException e) {
					n2 = input.nextDouble();
					doublesum += n2;
					doublecount++;
				}

			}
			linecount++;

			if (integermax < (double) integersum / integercount) {
				integermax = (double) integersum / integercount;
				maxline = linecount;
				maxcount = integercount;
			}
			
			if(doublemax < doublesum / doublecount) {
				doublemax = doublesum / doublecount;
				doublemaxline = linecount;
				doublemaxcount = doublecount;
				
			}

			if (doublecount > 0 && integercount > 0) {
				System.out.println(linecount + ": 정수(" + integercount + "개)" + (double) integersum / integercount
						+ ", 실수(" + doublecount + "개)" + (double) doublesum / doublecount);
			}

			else if (doublecount <= 0 && integercount > 0) {
				System.out.println(linecount + ": 정수(" + integercount + "개)" + (double) integersum / integercount);
			}
			
			else if(integercount <= 0 && doublecount > 0) {
				System.out.println(linecount + ": 실수(" + doublecount + "개)" + doublesum / doublecount);
			}
			
			
		}

		if (maxcount > 0) {
			System.out.println("정수 평균 최고 : " + maxline + "번줄 " + integermax + " (" + maxcount + "개)");
		}
		
		if(doublemaxcount > 0) {
			System.out.println("실수 평균 최고 : " + doublemaxline + "번줄 " + doublemax + " (" + doublemaxcount + "개)");
		}
		
	}

}
