import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {


        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);
        String exp = "";
        String useful = "off";
        boolean flag = false;
        int sum = 0;


        System.out.println("프로그램 종료는 stop를 입력해주세요!");
        System.out.println("음수 화면 출력X 기능을 입해주세요: \"on\", \"off\"");
        useful = sc.next();
        flag = cal.onoff(useful);


        if (args.length == 1) {
            exp = args[0];
        }
        else{
            exp = sc.next();
        }

        sum = cal.run(exp);

        cal.print(exp, sum, flag);

        while (true) {
            useful = sc.next();
            sum=0;
            if (useful.equals("stop")) break;

            if ((useful.equals("on") || useful.equals("off"))) {
                flag = cal.onoff(useful);
                continue;
            } else {
                exp = useful;
            }

            sum = cal.run(exp);
            cal.print(exp, sum, flag);

        }
    }
}



