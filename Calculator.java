public class Calculator {
    public int run(String[] args) {
        int sum = 0;

        String temp[] = args[0].split("[+-]");
        String oper[] = args[0].split("[0-9]");

        int num = Integer.parseInt(temp[0]);

        for (int i = 1; i < oper.length; i++) {
            if (oper[i].equals("+")) {
                num += Integer.parseInt(temp[i]);
            }

            else if (oper[i].equals("-")) {
                num -= Integer.parseInt(temp[i]);
            }
        }

        return num;


    }

}
