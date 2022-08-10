import java.util.Scanner;

public class CH4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.print(money+"원은 ");

		while (true) {
			if (money == 0) break;

			if (money / 50000 > 0) {
				if (money % 50000 == 0) {
					System.out.print("오만원 " + money / 50000 + "장이다.");
					money = money % 50000;
				}

				else {
					System.out.print("오만원 " + money / 50000 + "장, ");
					money = money % 50000;
				}

			}
			
			else if(money / 10000 > 0) {
				if (money % 10000 == 0) {
					System.out.print("만원 " + money / 10000 + "장이다.");
					money = money % 10000;
				}

				else {
					System.out.print("만원 " + money / 10000 + "장, ");
					money = money % 10000;
				}
			}
			else if(money / 5000 > 0) {
				if(money % 5000 == 0) {
					System.out.print("오천원 " + money / 5000 + "장이다.");
					money = money % 5000;
				}
				
				else {
					System.out.print("오천원 " + money / 5000 + "장, ");
					money = money % 5000;
				}
			}
			
			else if(money / 1000 > 0) {
				if (money % 1000 == 0) {
					System.out.print("천원 " + money / 50000 + "장이다.");
					money = money % 1000;
				}

				else {
					System.out.print("천원 " + money / 1000 + "장, ");
					money = money % 1000;
				}
			}
			
			else if(money / 500 > 0) {
				if (money % 500 == 0) {
					System.out.print("오백원 동전 " + money / 500 + "개이다.");
					money = money % 500;
				}

				else {
					System.out.print("오백원 동전 " + money / 500 + "개, ");
					money = money % 500;
				}
			}
			
			else if(money / 100 > 0) {
				if (money % 100 == 0) {
					System.out.print("백원 동전 " + money / 100 + "개이다.");
					money = money % 100;
				}

				else {
					System.out.print("백원 동전 " + money / 100 + "개, ");
					money = money % 100;
				}
			}
			
			else if(money / 50 > 0) {
				if (money % 50 == 0) {
					System.out.print("오십원 동전 " + money / 50 + "개이다.");
					money = money % 50;
				}

				else {
					System.out.print("오십원 동전 " + money / 50 + "개, ");
					money = money % 50;
				}
			}
			
			else if(money / 10 > 0) {
				if (money % 10 == 0) {
					System.out.print("십원 동전 " + money / 10 + "개이다.");
					money = money % 10;
				}

				else {
					System.out.print("십원 동전 " + money / 10 + "개, ");
					money = money % 10;
				}
			}
			
			else if(money / 5 > 0) {
				if (money % 5 == 0) {
					System.out.print("오원 동전 " + money / 5 + "개이다.");
					money = money % 5;
				}

				else {
					System.out.print("오원 동전 " + money / 5 + "개, ");
					money = money % 5;
				}
			}
			
			
			else if(money / 1 > 0) {
				if (money % 1 == 0) {
					System.out.print("일원 동전 " + money / 1 + "개이다.");
					money = money % 1;
				}

				else {
					System.out.print("일원 동전 " + money / 1 + "개, ");
					money = money % 1;
				}
			}
			
		}
		
		

	}

}
