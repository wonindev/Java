public class Calculator {
    public int run(String exp) {
        String temp[] = exp.split("[+-]");
        String oper[] = exp.split("[0-9]+");

        int sum = Integer.parseInt(temp[0]);

        for (int i = 1; i < temp.length; i++) {
            if (oper[i].equals("+")) {
                sum += Integer.parseInt(temp[i]);
            } else if (oper[i].equals("-")) {
                sum -= Integer.parseInt(temp[i]);
            }
        }

        return sum;
    }

    public boolean onoff(String useful) {
        if (useful.equals("on")) {
            System.out.println("기능이 on 되었습니다.");
            return true;
        } else if (useful.equals("off")) {
            System.out.println("기능이 off 되었습니다.");
            return false;
        }

        return false;
    }

    public void print(String exp, int sum, boolean flag) {
        if (flag == true && sum < 0) {
            System.out.println("결과가 음수인 오류입니다.");
        }
        else {
            System.out.println("입력: " + exp);
            System.out.println("출력커스텀1: " + sum);
            System.out.println("출력커스텀2: 정답은 " + sum + "입니다");
            System.out.printf("출력커스텀3: %s 의 정답은 %d 입니다", exp, sum);
            System.out.println();
        }
    }


}
