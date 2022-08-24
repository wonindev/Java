public class Calculator {
    public int run(String[] args){
        int sum = 0;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]){
            case "+":
                sum = a + b;
                break;

            case "-":
                sum = a - b;
                break;

            default:
                break;
        }
        return sum;

    }

}
