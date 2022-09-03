import java.util.Scanner;

public class CH2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,temp=0;
		while(true) {
			temp=0;
			System.out.print("세 정수 입력 : ");
			if(!sc.hasNext()) break;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a>b) {
				temp = a;
				a = b;
				b = temp;
			}
			
			if(b > c) {
				temp = b;
				b = c;
				c = temp;
			}
			
			if(a>b) {
				temp = a;
				a = b;
				b = temp;
			}
			
			
			
			if(a==c) {
				System.out.println("결과 : "+a+" = "+b+" = "+c);
			}
			
			if(a==b & b<c) {
				System.out.println("결과 : " + a+" = "+b+" < "+c);
			}
			
			if(a<b & b==c) {
				System.out.println("결과 : " +a+" < "+b+" = "+c);
			}
			
			if(a<b & b <c) {
				System.out.println("결과 : " + a+" < "+b+" < "+c);
			}
			
		}

	}

}
