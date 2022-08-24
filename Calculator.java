public class Calculator {
    public static void main(String[] args) {
        switch (args[1]){
            case "+":
                System.out.println("출력: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
                break;
            case "-":
                System.out.println("출력: " + (Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
                break;

            default:
                break;
        }
    }
}
