import java.util.*;

public class CH1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int birthYear, birthMonth, joinDate;
		String address[] = new String[3];
		String uni;
		String major;
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);
		System.out.println(thisYear);

		System.out.print("이름 : ");
		name = scanner.next();

		System.out.print("생년 : ");
		birthYear = scanner.nextInt();

		System.out.print("생월 : ");
		birthMonth = scanner.nextInt();

		System.out.println("주소");

		System.out.print("시 : ");
		address[0] = scanner.next();

		System.out.print("구 : ");
		address[1] = scanner.next();

		System.out.print("동 : ");
		address[2] = scanner.next();

		System.out.print("대학교 : ");
		uni = scanner.next();

		System.out.print("학과 : ");
		major = scanner.next();

		System.out.print("입학년도 : ");
		joinDate = scanner.nextInt();

		System.out.println(
				name + "(만," + getage(birthYear) + "세) 학생은 "+ uni+" " +major+"에 " 
		+ (thisYear - joinDate + 1) + "학년으로 재학중이다.");
		System.out.println("\"" + address[0]+" " + address[1]+" " + address[2] + "\"" + "에 거주 중이다.");

		scanner.close();

	}

	static int getage(int birthYear) {
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);
		return thisYear - birthYear;
	}

}
