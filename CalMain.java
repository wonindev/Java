public class CalMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();


        int num = 0;
        num = cal.run(args);

        if (num >= 0) {
            System.out.println("출력: " + num);
        }
        
    }
}