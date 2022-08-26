import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int num = 0;


        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
        }

        if (args.length >= 1) {
            num = cal.run(args);
            System.out.print("입력: ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
            }
            System.out.println();

            if (num >= 0) {
                System.out.println("출력커스텀1: " + num);
                System.out.println("출력커스텀2: 정답은 " + num + "입니다");
                System.out.print("출력커스텀3: ");
                for (int i = 0; i < args.length; i++) {
                    System.out.print(args[i]);
                }
                System.out.print(" 의 정답은 " + num + "입니다");
            }

        }


    }
}