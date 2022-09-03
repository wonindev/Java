import java.util.*;

public class CH2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		while (true) {
			if (!scanner.hasNext()) break;
			try {
				n = scanner.nextInt();
			}catch (InputMismatchException e) {
				scanner.next();
				j++;
				continue;
			}
			
			if(max < n) max = n;
			if(min > n) min = n;
			sum += n;
			i++;
		
		}
		System.out.println("총 입력 정수 : "+i);
		System.out.println("총  합 : "+sum+", 평균 : "+(double)sum/i);
		System.out.println("가장 큰 수 : "+max);
		System.out.println("가장 작은 수 : "+min);
		System.out.println("실수의 개수 : "+j);

	}

}
