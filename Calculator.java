public class Calculator {
    public int run(String[] args) {
        int sum = 0;
        int cnt = 1;

        if (args.length > 1) {
            sum = Integer.parseInt(args[0]);
            for (int i = 0; i < args.length; i += 2) {
                if (args[cnt].equals("+")) {
                    if (i == args.length - 1) {
                        sum += Integer.parseInt(args[i]);
                    } else {
                        sum += Integer.parseInt(args[i + 2]);
                    }

                } else if (args[cnt].equals("-")) {
                    if (i == args.length - 1) {
                        sum -= Integer.parseInt(args[i]);
                    } else {
                        sum -= Integer.parseInt(args[i + 2]);
                    }
                }
                if (cnt == args.length - 2) break;
                cnt += 2;

            }
        }

        else if (args.length == 1) {
            String arr[] = args[0].split("");
            sum = Integer.parseInt(arr[0]);

            for (int i = 0; i < arr.length; i += 2) {
                if (arr[cnt].equals("+")) {
                    if (i == arr.length - 1) {
                        sum += Integer.parseInt(arr[i]);
                    } else {
                        sum += Integer.parseInt(arr[i + 2]);
                    }

                } else if (arr[cnt].equals("-")) {
                    if (i == arr.length - 1) {
                        sum -= Integer.parseInt(arr[i]);
                    } else {
                        sum -= Integer.parseInt(arr[i + 2]);
                    }
                }
                if (cnt == arr.length - 2) break;
                cnt += 2;
            }

        }

        return sum;


    }

}
